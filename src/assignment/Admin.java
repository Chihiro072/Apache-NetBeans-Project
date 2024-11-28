/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Admin extends System{
    private String username;
    private String password;
    private String role;
    private String filename;
    private String studentFile;
    private String teacherFile;
    private String studentReport;
    private int id;
    private String data;
    private FileReader fr;
    private BufferedReader br;
    private int maxTeacherId;
    private int maxStudentId;
    
    public Admin() throws FileNotFoundException{
        super();
        this.role = "Student";
        this.filename = "data.txt";
        this.studentFile = "student.txt";
        this.teacherFile = "teacher.txt";
        this.studentReport = "StudentAssessment.txt";
        this.data = null;
        this.fr = new FileReader(filename);
        this.br = new BufferedReader(fr);
        this.maxStudentId = 0;
        this.maxTeacherId = 0;
    }
    
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
 
    @Override
    public String getRole() {
        return role;
    }
 
    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public boolean checkUsername(JTextField usernameTxt) throws IOException {
        String[] fileContent = readFile(filename);
        for (String line : fileContent) {
            String[] parts = line.split(",");
            if (parts.length >= 2 && usernameTxt.getText().equals(parts[1])) {
                return true;
            }
        }
        return false;
    }
    
    public void recordStudentData(String username, String password, JTextField nameTxt, 
            JDateChooser DOBTxt, JTextField nationalityTxt, ButtonGroup genderBtn, 
            JTextField contactTxt, JTextField addressTxt, JComboBox courseCbo, 
            JTextField emergencyTxt) throws IOException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        id = getNewStudentId(filename);
        
        String[] database = {"ST" + id, username, password, "Student"};
        writeFile(database, filename);
        
        String[] studentList = {"ST" + id, nameTxt.getText(), 
                sdf.format(DOBTxt.getDate()), nationalityTxt.getText(), 
                getSelectedGender(genderBtn), 
                contactTxt.getText(), addressTxt.getText(), 
                courseCbo.getSelectedItem().toString(), emergencyTxt.getText()};
        writeFile(studentList, studentFile);
        
        String[] report = {"ST" + id, nameTxt.getText(), "-", "-", 
            "-", "-", "Pending", "0", "-", "-", "-", "-", courseCbo.getSelectedItem().toString()};    
        writeFile(report, studentReport);
    }
    
    private String getSelectedGender(ButtonGroup genderBtn) {
        Enumeration<AbstractButton> buttons = genderBtn.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getActionCommand();
            }
        }
        return null;
    }
    
    public int getNewStudentId(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Student")) {
                    String[] parts = line.split(",");
                    for (String part : parts) {
                        if (part.startsWith("ST")) {
                            String studentIdStr = part.substring(2);
                            int studentId = Integer.parseInt(studentIdStr);
                            if (studentId > maxStudentId) {
                                maxStudentId = studentId;
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxStudentId + 1;   
    }
    
    public void recordLecturerData(String username, String password, JTextField nameTxt, JDateChooser DOBTxt, 
            JTextField nationalityTxt, ButtonGroup genderBtn, JTextField contactTxt, JTextField addressTxt,
            JComboBox degreeCbo, JTextField institutionTxt, JTextField previousTxt, 
            JTextField studyTxt) throws IOException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        id = getNewTeacherId(filename);
        
        String[] database = {"TC" + id, username, password, "Lecturer"};
        writeFile(database, filename);    
        
        String[] lecturerList = {"TC" + id, "Lecturer", nameTxt.getText(), 
                sdf.format(DOBTxt.getDate()), nationalityTxt.getText(), 
                getSelectedGender(genderBtn), contactTxt.getText(), 
                addressTxt.getText(), degreeCbo.getSelectedItem().toString(),
                institutionTxt.getText(), previousTxt.getText(), studyTxt.getText(), "-", "-"};
        writeFile(lecturerList, teacherFile);
    }
    
    public int getNewTeacherId(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Lecturer")) {
                    String[] parts = line.split(",");
                    for (String part : parts) {
                        if (part.startsWith("TC")) {
                            String teacherIdStr = part.substring(2);
                            int teacherId = Integer.parseInt(teacherIdStr);
                            if (teacherId > maxTeacherId) {
                                maxTeacherId = teacherId;
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxTeacherId + 1;   
    }
    
    public boolean hasMissingField(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                if (((JTextField) component).getText().isEmpty()) {
                    return true;
                }
            } 
            else if (component instanceof JPasswordField) {
                if (((JPasswordField) component).getText().isEmpty()) {
                    return true;
                }
            }
            else if (component instanceof JComboBox) {
                if (((JComboBox<?>) component).getSelectedIndex() == 0) {
                    return true;
                }
            } 
        }
        return false;
    }
    
    public boolean hasMissingTextField(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField && component.isVisible()) {
                if (((JTextField) component).getText().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    
    public void clearAllTextFields(Container container) {
        Component[] components = container.getComponents(); // Assuming jPanel1 contains all your text fields
        for (Component component : components) {
            if (component instanceof JTextField textField) {
                textField.setText("");
            }
        }
    }
    public void addStudentIdtoComboBox(String role, JComboBox<String> nameCbo) throws IOException {
        FileReader fr = new FileReader(studentFile);
        BufferedReader br = new BufferedReader(fr);

        while ((data = br.readLine()) != null) {
            String arrangedData[] = data.split(",");
            nameCbo.addItem(arrangedData[0]);
        }
        br.close();
        fr.close();
    }
     
    public void addTeacherIdtoComboBox(String role, JComboBox<String> nameCbo) throws IOException {
        FileReader fr = new FileReader(teacherFile);
        BufferedReader br = new BufferedReader(fr);

        while ((data = br.readLine()) != null) {
            String arrangedData[] = data.split(",");
            if(role.equals(arrangedData[1])){
                nameCbo.addItem(arrangedData[0]);
            }
        }
        br.close();
        fr.close();
    }
    
    public void getStudentInfo(String id, JTextField nameTxt, JDateChooser DOBTxt, 
            JTextField nationalityTxt, JRadioButton maleRdo, JRadioButton femaleRdo, 
            JTextField contactTxt, JTextField addressTxt, JComboBox<String> degreeOrCourseCbo, 
            JTextField institutionOrEmergencyTxt) throws IOException, ParseException{
        
        String[] lines = readFile(studentFile);

        for (String line : lines) {
            String arrangedData[] = line.split(",");
            if (id.equals(arrangedData[0])) {
                nameTxt.setText(arrangedData[1]);
                Date dob = new SimpleDateFormat("MM-dd-yyyy").parse(arrangedData[2]);
                DOBTxt.setDate(dob);
                nationalityTxt.setText(arrangedData[3]);
                if ("Male".equals(arrangedData[4])) {
                    maleRdo.setSelected(true);
                    femaleRdo.setSelected(false);
                } else if ("Female".equals(arrangedData[4])) {
                    femaleRdo.setSelected(true);
                    maleRdo.setSelected(false);
                }
                contactTxt.setText(arrangedData[5]);
                addressTxt.setText(arrangedData[6]);
                degreeOrCourseCbo.setSelectedItem(arrangedData[7]);
                institutionOrEmergencyTxt.setText(arrangedData[8]);
                break;
            }
        }
    }
           
    public void getTeacherInfo(String id, String role, JTextField nameTxt, JDateChooser DOBTxt, 
            JTextField nationalityTxt, JRadioButton maleRdo, JRadioButton femaleRdo, 
            JTextField contactTxt, JTextField addressTxt, JComboBox<String> degreeOrCourseCbo, 
            JTextField institutionOrEmergencyTxt, JTextField previousTxt, 
            JTextField studyTxt) throws IOException, ParseException{

        String[] lines = readFile(teacherFile);
        for (String line : lines) {
            String arrangedData[] = line.split(",");
            if (id.equals(arrangedData[0])) {
                nameTxt.setText(arrangedData[2]);
                Date dob = new SimpleDateFormat("MM-dd-yyyy").parse(arrangedData[3]);
                DOBTxt.setDate(dob);
                nationalityTxt.setText(arrangedData[4]);
                if ("Male".equals(arrangedData[5])) {
                    maleRdo.setSelected(true);
                    femaleRdo.setSelected(false);
                } else if ("Female".equals(arrangedData[5])) {
                    femaleRdo.setSelected(true);
                    maleRdo.setSelected(false);
                }
                contactTxt.setText(arrangedData[6]);
                addressTxt.setText(arrangedData[7]);
                degreeOrCourseCbo.setSelectedItem(arrangedData[8]);
                institutionOrEmergencyTxt.setText(arrangedData[9]);
                previousTxt.setText(arrangedData[10]);
                studyTxt.setText(arrangedData[11]);
                break;
            }
        }
    }

    public void updateStudentInfo(String id, JTextField nameTxt, JDateChooser DOBTxt, 
            JTextField nationalityTxt, JRadioButton maleRdo, JRadioButton femaleRdo, 
            JTextField contactTxt, JTextField addressTxt, JComboBox<String> degreeOrCourseCbo, 
            JTextField institutionOrEmergencyTxt) throws FileNotFoundException, IOException {
        
        String[] lines = readFile(studentFile);
        for (int i = 0; i < lines.length; i++) {
            String[] arrangedData = lines[i].split(",");
            if (arrangedData[0].equals(id)) {
                arrangedData[1] = nameTxt.getText();
                arrangedData[2] = DOBTxt.getDate() != null ? 
                        new SimpleDateFormat("MM-dd-yyyy").format(DOBTxt.getDate()) : "";
                arrangedData[3] = nationalityTxt.getText();
                arrangedData[4] = maleRdo.isSelected() ? "Male" : "Female";
                arrangedData[5] = contactTxt.getText();
                arrangedData[6] = addressTxt.getText();
                arrangedData[7] = degreeOrCourseCbo.getSelectedItem().toString();
                arrangedData[8] = institutionOrEmergencyTxt.getText(); 
                lines[i] = String.join(",", arrangedData);
                break;
            }
        }     
        overwriteFile(lines, "student.txt");
    }

 
    public void updateTeacherInfo(String id, JTextField nameTxt, JDateChooser DOBTxt, 
            JTextField nationalityTxt, JRadioButton maleRdo, JRadioButton femaleRdo, 
            JTextField contactTxt, JTextField addressTxt, JComboBox<String> degreeOrCourseCbo, 
            JTextField institutionOrEmergencyTxt, JTextField previousTxt, 
            JTextField studyTxt) throws FileNotFoundException, IOException {
       
        String[] lines = readFile(teacherFile);
        for (int i = 0; i < lines.length; i++) {
            String[] arrangedData = lines[i].split(",");
            if (arrangedData[0].equals(id)) {
                arrangedData[2] = nameTxt.getText();
                arrangedData[3] = DOBTxt.getDate() != null ? 
                        new SimpleDateFormat("MM-dd-yyyy").format(DOBTxt.getDate()) : "";
                arrangedData[4] = nationalityTxt.getText();
                arrangedData[5] = maleRdo.isSelected() ? "Male" : "Female";
                arrangedData[6] = contactTxt.getText();
                arrangedData[7] = addressTxt.getText();
                arrangedData[8] = degreeOrCourseCbo.getSelectedItem().toString();
                arrangedData[9] = institutionOrEmergencyTxt.getText();
                arrangedData[10] = previousTxt.getText();
                arrangedData[11] = studyTxt.getText();  
                lines[i] = String.join(",", arrangedData);
                break;
            }
        }
        overwriteFile(lines, "teacher.txt");
    }
        
    public void editRole(String id, JComboBox<String> roleCbo, String file, int index) throws IOException {
        String[] lines = readFile(file);
        for (int i = 0; i < lines.length; i++) {
            String[] arrangedData = lines[i].split(",");
            if (arrangedData[0].equals(id)) {
                if ("Lecturer".equals(roleCbo.getSelectedItem())) {
                    arrangedData[index] = "Project Manager";
                } else if ("Project Manager".equals(roleCbo.getSelectedItem())) {
                    arrangedData[index] = "Lecturer";
                }
                lines[i] = String.join(",", arrangedData);
                break;
            }
        }
        overwriteFile(lines, file);
    }
    
    public void displayFeedback(JTable table, String checked) throws IOException {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String[] lines = readFile("Feedback.txt");
        model.setRowCount(0);

        switch (checked) {
            case "All":
                for (String line : lines) {
                    String[] parts = line.split(",");
                    model.addRow(parts);
                }   break;
            case "Identified":
                for (String line : lines) {
                    String[] parts = line.split(",");
                    if(!"Anon".equals(parts[0])){
                        model.addRow(parts);
                    }
                }   break;
            case "Anonymous":
                for (String line : lines) {            
                    String[] parts = line.split(",");
                    if("Anon".equals(parts[0])){
                        model.addRow(parts);
                    }
                }   break;
            default:
                break;
        }
    }
    
    public void getCourse(JComboBox courseCbo) throws IOException{
        courseCbo.removeAllItems();
        courseCbo.addItem("Select a course~");
        String[] lines = readFile("teacher.txt");
        for (int i = 0; i < lines.length; i++){
            String[] arrangedData = lines[i].split(",");
            if(arrangedData[1].equals("Lecturer") && arrangedData[12].equals("Supervisor")){
                if (!isItemInComboBox(courseCbo, arrangedData[11])) {
                    courseCbo.addItem(arrangedData[11]);
                }
            }
        }
    }
    
    public boolean isItemInComboBox(JComboBox comboBox, String item) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getItemAt(i).equals(item)) {
                return true;
            }
        }
        return false;
    }
}
