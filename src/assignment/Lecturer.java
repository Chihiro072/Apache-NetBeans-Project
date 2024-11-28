/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import com.toedter.calendar.JDateChooser;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Lecturer extends System{
    private String id;
    private String smid;
    private String[] safile;
    private String[] tcfile;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public Lecturer(){
        readFile();
    }
    
    public void setid(String id){
        this.id = id;
    }
    
    public void setsmid(String smid){
        this.smid = smid;
    }
    
    private void readFile() {
        try {
            safile = readFile("StudentAssessment.txt");
            tcfile = readFile("teacher.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public String getCurrentDate() {
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public void checkRole(){
        setid(getId());
        for (String line : tcfile) {
            String[] data = line.split(",");
            if(data[0].trim().equals(this.id) && 
                    data[12].trim().equals("Second Marker")){
                setsmid(this.id);
                setRole(data[12].trim());
                setid(data[13].trim());
            }
        }
    }
    
    public void setRoleCombobox(JComboBox<String> combobox){
        combobox.removeAllItems();        
        combobox.addItem("Lecturer");
        combobox.addItem("Project Manager");   
    }
    
    public void showDashboard(JTable table){
        if(this.id.equals("-")){
            return;
        }
        try {
            safile = readFile("StudentAssessment.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
        String[] ColumnName = {"ID", "Name", "Assessment", "Status"};
        table.setModel(new javax.swing.table.
                DefaultTableModel(new Object [][] {}, ColumnName));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (String line : safile) {
            String[] data = line.split(",");
            String[] temp = {data[0], data[1], data[2], data[6]};
            if(data[3].trim().equals(this.id)){
                model.addRow(temp);
            }
        }
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(60);
        table.setModel(model);
    }
    
    public void showAS(JTable table){
        if(this.id.equals("-")){
            return;
        }
        String[] ColumnName = {"ID", "Name", "Assessment", "Presentation Date"};
        table.setModel(new javax.swing.table.
                DefaultTableModel(new Object [][] {}, ColumnName));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (String line : safile) {
            String[] data = line.split(",");
            if(data[8].trim().equals("-")){
                data[8] = "";
            }
            String[] temp = {data[0], data[1], data[2], data[8]}; 
            if(data[3].trim().equals(this.id)){
                model.addRow(temp);
            }
        }
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(60);
        table.setModel(model);
    }
    
    public void chooseRow(JTable table, JLabel label){
        int row = table.getSelectedRow();
        label.setText(table.getModel().getValueAt(row, 0).toString());
    }
    
    public void showSM(JComboBox<String> combobox, 
            JTable table, JLabel label1, JLabel label2, JButton btn){
        String[] ColumnName = {"ID", "Name", "Contact", "Module"};
        table.setModel(new javax.swing.table.
                DefaultTableModel(new Object [][] {}, ColumnName));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String limit = null;
        if(combobox.getSelectedIndex() == 0){
            limit = this.id;
            label1.setVisible(false);
            label2.setVisible(false);
            btn.setVisible(false);
        }
        else if(combobox.getSelectedIndex() == 1){
            limit = "-";
            label1.setVisible(true);
            label2.setVisible(true);
            btn.setVisible(true);
        }
        for (String line : tcfile) {
            String[] data = line.split(",");
            String[] temp = {data[0], data[2], data[6], data[11]};
            if(data[13].trim().equals(limit) && 
                    data[12].trim().equals("Second Marker")){
                model.addRow(temp);
            }
        }
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(80);
        table.setModel(model);
    }
    
    public void sendRequest(JTable table, JLabel label){
        String teacherid = label.getText();
        if(table.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, 
                    "No second marker is available.");
            return;
        }
        else if(teacherid.equals("")){
            JOptionPane.showMessageDialog(null, 
                    "Please select a second marker.");
            return;
        }
        for(int i = 0; i < tcfile.length; i++){
            String[] data = tcfile[i].split(",");
            if(data[0].trim().equals(this.id)){
                if(!data[13].trim().equals("-")){
                    JOptionPane.showMessageDialog(null, 
                            "You had sent request to second marker.");
                    return;
                }
                data[13] = teacherid;
                tcfile[i] = String.join(",", data);
                break;
            }
        }
        try {
            overwriteFile(tcfile, "teacher.txt");
            JOptionPane.showMessageDialog(null, "Request Sent.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void showSR(JTable table){
        String[] ColumnName = {"ID", "Name", "Contact", "Module"};
        table.setModel(new javax.swing.table.
                DefaultTableModel(new Object [][] {}, ColumnName));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (String line : tcfile) {
            String[] data = line.split(",");
            String[] temp = {data[0], data[2], data[6], data[11]};
            if(!data[0].trim().equals(this.id) && 
                    data[13].trim().equals(this.smid)){
                model.addRow(temp);
            }
        }
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(60);
        table.setModel(model);
    }
    
    public void confirmRequest(JTable table, JLabel label){
        String teacherid = label.getText();
        if(table.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No request confirmed.");
            return;
        }
        else if(teacherid.equals("")){
            JOptionPane.showMessageDialog(null, 
                    "Please select a supervisor.");
            return;
        }
        else if(!this.id.equals("-")){
            JOptionPane.showMessageDialog(null, 
                    "You already accepted other request.");
            return;
        }
        for(int i = 0; i < tcfile.length; i++){
            String[] data = tcfile[i].split(",");
            if(data[0].trim().equals(this.smid)){
                data[13] = teacherid;
                tcfile[i] = String.join(",", data);
                break;
            }
        }
        try {
            overwriteFile(tcfile, "teacher.txt");
            setid(teacherid);
            JOptionPane.showMessageDialog(null, "Request Accepted.");
            readFile();
            showSR(table);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void rejectRequest(JTable table, JLabel label){
        String teacherid = label.getText();
        if(table.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No request rejected.");
            return;
        }
        else if(teacherid.equals("")){
            JOptionPane.showMessageDialog(null, "Please select a supervisor.");
            return;
        }
        for(int i = 0; i < tcfile.length; i++){
            String[] data = tcfile[i].split(",");
            if(data[0].trim().equals(teacherid)){
                data[13] = "-";
                tcfile[i] = String.join(",", data);
                break;
            }
        }
        try {
            overwriteFile(tcfile, "teacher.txt");
            JOptionPane.showMessageDialog(null, "Request Rejected.");
            readFile();
            showSR(table);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void showReport(JComboBox<String> combobox){
        combobox.removeAllItems();
        if(this.id.equals("-")){
            return;
        }
        int x = 0;
        if(getRole().equals("Second Marker")){
            x = 1;
        }
        for (String line : safile) {
            String[] data = line.split(",");
            if(data[3].trim().equals(this.id) 
                    && data[10 + x].trim().equals("-")){
                combobox.addItem(data[0]);
            }
        }
    }
    
    public void showGrade(JComboBox<String> combobox){
        if(combobox.getItemCount() == 0 && combobox.isVisible()){
            String [] Grade = {"A+", "A", "B+", "B", "C+", "C", "D", "Fail"};
            for (String item : Grade) {
                combobox.addItem(item);
            }
        }
    }
    
    public void showSubmissionDate(JComboBox<String> combobox, JLabel date){
        if(combobox.getItemCount() == 0){
            return;
        }
        for (String line : safile) {
            String[] data = line.split(",");
            if(combobox.getSelectedItem().toString().equals(data[0].trim())){
                date.setText(data[5]);
            }
        }
    }
    
    public void openReport(JComboBox<String> combobox){
        if(combobox.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, 
                    "No report is needed to be evaluated.");
            return;
        }
        for (String line : safile) {
            String[] data = line.split(",");
            if(combobox.getSelectedItem().toString().equals(data[0].trim())){
                String report = data[4].trim();
                if(report.equals("-")){
                    JOptionPane.showMessageDialog(null, 
                            "Report is not submitted.");
                }
                else{
                    File reportFile = new File(report);
                    try {
                        Desktop.getDesktop().open(reportFile);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, 
                            "File not found.");;
                    }
                }
            }
        }
    }
    
    
    public void submitFeedback(JComboBox<String> SCB, 
            JComboBox<String> GCB, JTextArea FeedbackTextArea){
        String grade = "";
        if(GCB.isVisible()){
            grade = GCB.getSelectedItem().toString();
        }
        String feedback = FeedbackTextArea.getText().replaceAll(",", " ");
        if(SCB.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, 
                    "No report need to be evaluated.");
            return;
        }
        else if(feedback.equals("")){
            JOptionPane.showMessageDialog(null, "Please write a feedback.");
            return;
        }
        String studentid = SCB.getSelectedItem().toString();
        for(int i = 0; i < safile.length; i++){
            String[] data = safile[i].split(",");
            if(data[0].trim().equals(studentid)){
                int x = 0;
                if(getRole().equals("Second Marker")){
                    x = 1;
                    
                }
                data[6] = "Completed";
                if(!grade.equals("")){
                    data[9] = grade;
                }
                data[10 + x] = feedback;
                safile[i] = String.join(",", data);
                break;
            }
        }
        try {
            overwriteFile(safile, "StudentAssessment.txt");
            JOptionPane.showMessageDialog(null, "Feedback Sent.");
            readFile();
            showReport(SCB);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void showPR(JTable table){
       String[] ColumnName = {"ID", "Name", "Assessment", "Status"};
        table.setModel(new javax.swing.table.
                DefaultTableModel(new Object [][] {}, ColumnName));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (String line : safile) {
            String[] data = line.split(",");
            String[] temp = {data[0], data[1], data[2], data[6]};
            if(data[3].trim().equals(this.id) && data[7].trim().equals("1")){
                model.addRow(temp);
            }
        }
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(60);
        table.setModel(model); 
    }
    
    public void compareDate(JDateChooser datechoose){
        Date date = datechoose.getDate();
        Date currentdate = new Date();
        if(date != null){
            if(date.before(currentdate)){
                JOptionPane.showMessageDialog(null, 
                        "Selected Date is before Current Date.");
                datechoose.setDate(null);
            }
        }
    }
    
    public void confirmPR(JTable table, JLabel label, JDateChooser datechoose){
        String studentid = label.getText();
        Date date = datechoose.getDate();
        if(table.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, 
                    "No request is needed to be confirmed.");
            return;
        }
        else if(studentid.equals("")){
            JOptionPane.showMessageDialog(null, "Please select a student.");
            return;
        }
        else if(date == null){
            JOptionPane.showMessageDialog(null, "Please select a date.");
            return;
        }
        for(int i = 0; i < safile.length; i++){
            String[] data = safile[i].split(",");
            if(data[0].trim().equals(studentid)){
                data[6] = "Scheduled";
                data[7] = "0";
                data[8] = dateFormat.format(date);
                safile[i] = String.join(",", data);
                break;
            }
        }
        try {
            overwriteFile(safile, "StudentAssessment.txt");
            JOptionPane.showMessageDialog(null, 
                    "Presentation Request Confirmed.");
            readFile();
            showPR(table);
            label.setText("");
            datechoose.setDate(null);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void showSL(JTable table){
        String[] ColumnName = {"ID", "Name", "Assessment", "Status"};
        table.setModel(new javax.swing.table.
                DefaultTableModel(new Object [][] {}, ColumnName));
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (String line : safile) {
            String[] data = line.split(",");
            String[] temp = {data[0], data[1], data[2], data[6]};
            model.addRow(temp);
        }
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(60);
        table.setModel(model);
    }
}
