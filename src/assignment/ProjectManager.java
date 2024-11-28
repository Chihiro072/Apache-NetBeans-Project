/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package assignment;

import java.io.IOException;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;


/**
 *
 * @author User
 */
public class ProjectManager extends System{
    private String projectID;
    private String title;
    private String type;
    private Set<JTable> populatedTables = new HashSet<>();
    private String[] assessmentTypes = {"Internship", "Investigation Report", "CP1", "CP2", "RMCP", "FYP"};


    public ProjectManager() {

    }

    // Getters and Setters
    @Override
    public String toString() {
        return "Project ID: " + projectID + ", Title: " + title + ", Type: " + type;
    }
    
    
    public void showList(String filePath,JTable table){
        if (populatedTables.contains(table)) {
            return;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "File not found: " , filePath);
            return;
        }

         try{
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            String[] tableLines = readFile("StudentAssessment.txt");
            
            for(String line: tableLines){
                
                String[] dataRow = line.split(",");
                String project = "Unassigned";
                String id = dataRow[0];
                String course = dataRow[12];
                String name = dataRow[1];
                if(!"-".equals(dataRow[2])){
                    project = dataRow[2];
                }    
                    model.addRow(new Object[]{id, name, course, project});
                
            }
            populatedTables.add(table);
        }
            catch(Exception ex) {
                 Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "Error reading file", ex);
        }
    }  

     public void showList1(String filePath, JTable table) {
        if (populatedTables.contains(table)) {
            return;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "File not found: {0}", filePath);
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] tableLines = br.lines().toArray();

            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] dataRow = line.split(",");

                if (dataRow.length == 13) {
                    String id = dataRow[0];
                    String name = dataRow[1];
                    String assessmenttype = dataRow[2];
                    String lecturerID = dataRow[3];
                    String course = dataRow[12];
                    
                    if ("-".equals(lecturerID)) {
                        model.addRow(new Object[]{id, name, course, assessmenttype,lecturerID});
                    }
                } else {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.WARNING, "Invalid row length: {0}", line);
                }
            }
            populatedTables.add(table);
        } catch (Exception ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "Error reading file", ex);
        }
    }
    
    public void showLec(String filePath,JTable table) {
        if (populatedTables.contains(table)) {
            return;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "File not found: " , filePath);
            return;
        }

         try{
            BufferedReader br =new BufferedReader(new FileReader(file));
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            Object[] tableLines =br.lines().toArray();
            
            for(int i = 0; i  < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                String role = "Unassigned";
                if (dataRow.length == 14) {
                    String id = dataRow[0];
                    String name = dataRow[2];
                    String department = dataRow[11];
                    if(!"-".equals(dataRow[12])){
                        role = dataRow[12];
                    }
                        
                    model.addRow(new Object[]{id, name, department, role});
                }               
            }
            populatedTables.add(table);
        }
            catch(Exception ex) {
             Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "Error reading file", ex);
        }
 }
    public void showStatus(String filePath,JTable table) {
        if (populatedTables.contains(table)) {
            return;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "File not found: " , filePath);
            return;
        }

         try{
            BufferedReader br =new BufferedReader(new FileReader(file));
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            Object[] tableLines =br.lines().toArray();
            
            for(int i = 0; i  < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                
                if (dataRow.length >= 12) {
                        String id = dataRow[0];
                        String name = dataRow[1];
                        String assessment = dataRow[2];
                        String status = dataRow[6];
                        
                        model.addRow(new Object[]{id, name, assessment, status});
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid line format: " + line);
                    }
            }
            populatedTables.add(table);
        }
            catch(Exception ex) {
                 Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, "Error reading file", ex);
        }
    }
    
    public void allotButtonActionPerformed(String filePath,JTable table, JComboBox<String> comboBox) {
        String selectedAssessmentType = (String) comboBox.getSelectedItem();

        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String studentID = table.getValueAt(selectedRow, 0).toString();
            
            List<String> fileContent = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    fileContent.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < fileContent.size(); i++) {
                String[] parts = fileContent.get(i).split(",");
                if (parts[0].equals(studentID)) {
                    parts[2] = selectedAssessmentType;
                    fileContent.set(i, String.join(",", parts));
                    break;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (String line : fileContent) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void assignLec(String filePath,JTable table,JComboBox<String> comboBox) {
        String selectedRole = (String) comboBox.getSelectedItem(); 
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String lecturerID = table.getValueAt(selectedRow, 0).toString();
            String lecturerName = table.getValueAt(selectedRow, 1).toString();
            String lecturerDept = table.getValueAt(selectedRow, 2).toString();

            // Read existing assignments
            File file = new File(filePath);
            List<String> assignments = new ArrayList<>();
            boolean lecturerFound = false;

            if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data[0].equals(lecturerID)) {
                        data[12] = selectedRole;
                        line = String.join(",", data);
                        lecturerFound = true;
                    }
                    assignments.add(line);
                    }  
                } catch (IOException ex) {
                    Logger.getLogger(ProjectManagerUI.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error reading file!");
                    return;
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for (String assignment : assignments) {
                    bw.write(assignment);
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(null, "Supervisor and Second Marker assigned successfully!");
            } catch (IOException ex) {
                Logger.getLogger(ProjectManagerUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error writing to file!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a lecturer to assign!");
        }
    } 
    
    
    public void assignlecTostudent(String filePath, JTable table, JTable lecturerTable) {
        int selectedStudentRow = table.getSelectedRow();
        int selectedLecturerRow = lecturerTable.getSelectedRow();
        String studentCourse = table.getValueAt(table.getSelectedRow(), 2).toString();
        String lecturerDept = lecturerTable.getValueAt(lecturerTable.getSelectedRow(), 2).toString();
        if (selectedStudentRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a student.");
            return;
        }

        if (selectedLecturerRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a lecturer.");
            return;
        }
        
        if (!studentCourse.equals(lecturerDept)){
            JOptionPane.showMessageDialog(null, "Please make sure the courses and department matches");
            return;
        }

        if (!"Supervisor".equals(lecturerTable.getValueAt(lecturerTable.getSelectedRow(), 3).toString())){
            JOptionPane.showMessageDialog(null, "Please make sure the the teacher selected is a supervisor");
            return;
        }
        String studentID = table.getValueAt(selectedStudentRow, 0).toString();
        String lecturerID = lecturerTable.getValueAt(selectedLecturerRow, 0).toString();
        List<String> fileContent = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < fileContent.size(); i++) {
            String[] parts = fileContent.get(i).split(",");
            if (parts[0].equals(studentID)) {
                parts[3] = lecturerID;
                fileContent.set(i, String.join(",", parts));
                break;
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : fileContent) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        DefaultTableModel studentModel = (DefaultTableModel) table.getModel();
        studentModel.setValueAt(lecturerID, selectedStudentRow, 2);
        JOptionPane.showMessageDialog(null, "Lecturer assigned successfully.");
        studentModel.removeRow(selectedStudentRow);
    }

    
    public void setRole(JComboBox<String> combobox, JFrame parentFrame, boolean isPM) {
        combobox.removeAllItems();
        combobox.addItem("Project Manager");
        combobox.addItem("Lecturer");
        combobox.setSelectedIndex(0);
    }
    
    public void comboBoxType (JComboBox<String> combobox){
        combobox.removeAllItems();
        combobox.addItem("Internship");
        combobox.addItem("Investigation Report");
        combobox.addItem("CP1");
        combobox.addItem("CP2");
        combobox.addItem("RMCP");
        combobox.addItem("FYP");
        combobox.setSelectedIndex(0);
    }
    
    public void studentTMouseClicked(JTable studentT, JTextField jTextFieldID, JTextField jTextFieldNAME, JTextField jTextFieldCOURSE) {
       int selectedRow = studentT.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) studentT.getModel();
       jTextFieldID.setText(model.getValueAt(selectedRow, 0).toString());
       jTextFieldNAME.setText(model.getValueAt(selectedRow, 1).toString());
       jTextFieldCOURSE.setText(model.getValueAt(selectedRow, 2).toString());
    }
    
    public void assessmentTMouseClicked(JTable table, JTextField jTextFieldID2, JTextField jTextFieldName2, JTextField jTextFieldAsseT2) {
       int selectedRow = table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       jTextFieldID2.setText(model.getValueAt(selectedRow, 0).toString());
       jTextFieldName2.setText(model.getValueAt(selectedRow, 1).toString());
       jTextFieldAsseT2.setText(model.getValueAt(selectedRow, 2).toString());
    }
}






