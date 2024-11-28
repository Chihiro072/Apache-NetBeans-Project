/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Student extends System{
    private String id;
    private String name;
    private String course;
    private String dob;
    private String gender;
    private String nation;
    private String contact;
    private String emergency;
    private String address;
    private String assessment;
    private String tcid;
    private String report;
    private String submissiondate;
    private String presentationrequest;
    private String presentationdate;
    private String grade;
    private String feedback1;
    private String feedback2;
    private String[] stfile;
    private String[] safile;
    private String[] tcfile;
    private File uploadfile;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public Student(){
        readFile();
        setDetails();
    }
    
    public String getName(){
        return name;
    }
    
    public String getCourse(){
        return course;
    }
    
    public String getDOB(){
        return dob;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getNation(){
        return nation;
    }
    
    public String getContact(){
        return contact;
    }
    
    public String getEmergency(){
        return emergency;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getAssessment(){
        return assessment;
    }
    
    public String getTCID(){
        return tcid;
    }
    
    public String getReport(){
        return report;
    }
    
    public String getSubmissionDate(){
        return submissiondate;
    }
    
    public String getPresentationDate(){
        return presentationdate;
    }
    
    public String getGrade(){
        return grade;
    }
    
    public String getFeedback1(){
        return feedback1;
    }
    
    public String getFeedback2(){
        return feedback2;
    }
    
    public void setid(String id){
        this.id = id;
    }
    
    private void readFile() {
        try {
            stfile = readFile("student.txt");
            safile = readFile("StudentAssessment.txt");
            tcfile = readFile("teacher.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void setDetails(){
        for (String line : stfile) {
            String[] data = line.split(",");
            if(data[0].trim().equals(this.id)){
                name = data[1].trim();
                dob = data[2].trim();
                nation = data[3].trim();
                gender = data[4].trim();
                contact = data[5].trim();
                address = data[6].trim();
                course = data[7].trim();
                emergency = data[8].trim();
            }
        }
        for (String line : safile) {
            String[] data = line.split(",");
            if(data[0].trim().equals(this.id)){
                assessment = data[2].trim();
                tcid = data[3].trim();
                if(data[4].trim().equals("-")){
                    report = data[4].trim();
                }
                else{
                    File Report = new File(data[4].trim());
                    report = Report.getName();
                }
                submissiondate = data[5].trim();
                presentationrequest = data[7].trim();
                presentationdate = data[8].trim();
                grade = data[9].trim();
                feedback1 = data[10].trim();
                feedback2 = data[11].trim();
            }
        }
    }
    
    public String getCurrentDate() {
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public void getFile(JLabel reportText){
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            uploadfile = fileChooser.getSelectedFile();
            reportText.setText(uploadfile.getName());
        }
        else{
            JOptionPane.showMessageDialog(null, "No file uploaded.");
        }
    }
    
    public void submitReport(){
        if(uploadfile == null){
            JOptionPane.showMessageDialog(null, "Please upload a file.");
            return;
        } 
        for(int i = 0; i < safile.length; i++){
            String[] data = safile[i].split(",");
            if(data[0].trim().equals(this.id)){
                data[4] = uploadfile.getAbsolutePath();
                data[5] = getCurrentDate();
                safile[i] = String.join(",", data);
                break;
            }
        }
        try {
            overwriteFile(safile, "studentassessment.txt");
            JOptionPane.showMessageDialog(null, "Report Submitted.");
            readFile();
            setDetails();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void getContact(JLabel contact){
        if(this.tcid.equals("-")){
            return;
        }
        for (String line : tcfile) {
            String[] data = line.split(",");
            if(data[0].trim().equals(this.tcid)){
                contact.setText(data[6].trim());
            }
        }
    }
    
    public void sendPresentationRequest(){
        if(this.tcid.equals("-")){
            return;
        }
        else if(this.report.equals("-")){
            JOptionPane.showMessageDialog(null, "Report is not submitted.");
            return;
        }
        else if(this.presentationrequest.equals("1")){
            JOptionPane.showMessageDialog(null, "You have already sent a request.");
            return;
        }
        for(int i = 0; i < safile.length; i++){
            String[] data = safile[i].split(",");
            if(data[0].trim().equals(this.id)){
                data[7] = "1";
                safile[i] = String.join(",", data);
                break;
            }
        }
        try {
            overwriteFile(safile, "studentassessment.txt");
            JOptionPane.showMessageDialog(null, "Request Sent.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
    
    public void setResultComboBox(JComboBox<String> combobox){
        combobox.setVisible(false);
        combobox.removeAllItems();
        combobox.addItem("Grade");
        if(!getFeedback1().equals("-")){
            combobox.addItem("Supervisor's Feedback");
        }
        if(!getFeedback2().equals("-")){
            combobox.addItem("Second Marker's Feedback");
        }
        if(combobox.getItemCount() > 1){
            combobox.setVisible(true);
        }
    }
    
    public void setResultFeedback(JComboBox<String> combobox, JLabel teacherid, JTextArea feedback){
        if(combobox.getSelectedItem() == "Supervisor's Feedback"){
            teacherid.setText(this.tcid);
            feedback.setText(this.feedback1);
        }
        else{
            for (String line : tcfile) {
                String[] data = line.split(",");
                if(data[13].trim().equals(this.tcid)){
                    teacherid.setText(data[0].trim());
                }
            }
            feedback.setText(this.feedback2);
        }
    }
    
    public void sendFeedback(JTextArea feedbackText, JCheckBox anonymous){
        String feedback = feedbackText.getText();
        String studentid = this.id;
        String studentname = this.name;
        if(feedback.equals("")){
            JOptionPane.showMessageDialog(null, "Please write a feedback.");
            return;
        }
        else if (anonymous.isSelected()) {
            studentid = "Anon";
            studentname = "Anonymous";
        }
        String[] feedbackrow = {studentid, studentname, getCurrentDate(), feedback};
        try {
            writeFile(feedbackrow, "feedback.txt");
            JOptionPane.showMessageDialog(null, "Feedback Sent.");
            feedbackText.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
}
