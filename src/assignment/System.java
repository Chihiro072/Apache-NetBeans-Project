/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class System extends User{
    private static String id;
    private static String username;
    private String password;
    private static String role;
    private String filename;
    private boolean isPasswordVisible;
    private ImageIcon hideIcon;
    private ImageIcon showIcon;
    private String data;

    public System(){
        filename = "data.txt";
        isPasswordVisible = false;
        hideIcon = new ImageIcon("hide20.png");
        showIcon = new ImageIcon("show20.png");
        data = null;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public void setScaledImage(String imagePath, JLabel label) {
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
    
    public void newPanel(JPanel body, JPanel newFrame){
        body.removeAll();
        body.repaint();
        body.revalidate();
        body.add(newFrame);
        body.repaint();
        body.revalidate();
    }

    
    private String[] findUser(String username, String password) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((data = br.readLine()) != null) {
                String[] parts = data.split(",");
                if (parts.length >= 3 && (username.equalsIgnoreCase(parts[0]) || 
                        username.equalsIgnoreCase(parts[1])) && 
                        password.equals(parts[2])) {
                    return parts;
                }
                
            }
        }
        return null;
    }

    public String authenticateUser(JTextField usernameTxt, JPasswordField passwordTxt) 
            throws FileNotFoundException, IOException {
        String[] userData = findUser(usernameTxt.getText().toLowerCase(), passwordTxt.getText());
        if (userData != null && userData.length >= 3) {
            setUsername(userData[1]);
            setId(userData[0]);
            setRole(userData[3]);
            return userData[3];
        }
        return null;
    }

    public void togglePasswordVisibility(JPasswordField passwordTxt, JLabel eyeIcn) {
        isPasswordVisible = !isPasswordVisible;
        char echoChar = isPasswordVisible ? '\u0000' : '*'; 
        passwordTxt.setEchoChar(echoChar);
        eyeIcn.setIcon(isPasswordVisible ? showIcon : hideIcon);
    }
    
    public void refresh(Container container){
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            } 
            else if (component instanceof JPasswordField) {
                ((JPasswordField) component).setText("");
            } 
            else if (component instanceof JComboBox) {
                JComboBox<?> comboBox = (JComboBox<?>) component;
                if (comboBox.getItemCount() > 0) {
                    comboBox.setSelectedIndex(0);
                } 
                else {
                    comboBox.setSelectedItem(null);
                }
            } 
            else if (component instanceof JDateChooser) {
                ((JDateChooser) component).setDate(null);
            } 
            else if (component instanceof Container) {
                refresh((Container) component);
            } 
        }       
    }            
    
    public void writeFile(String[] contentList, String filename) throws IOException {
        try (FileWriter fw = new FileWriter(filename, true)) { 
            for (int i = 0; i < contentList.length; i++) {
                fw.write(contentList[i]);
                if (i < contentList.length - 1) { 
                    fw.write(","); 
                } else {
                    fw.write("\n");
                }
            }
        }
    }
    
    public void overwriteFile(String[] contentList, String filename) throws IOException{
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(filename, false))) {
            for (String line : contentList) {
                fw.write(line);
                fw.newLine();
            }
        }
    }


    public String[] readFile(String filename) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines.toArray(String[]::new);
    }  
    
    @Override
    public boolean isInputValid(JTextField usernameTxt, JPasswordField passwordTxt, JComboBox roleCbo){
        return !(usernameTxt.getText().isEmpty() || 
                passwordTxt.getText().isEmpty() || 
                roleCbo.getSelectedIndex() == 0);
    }
    
    @Override
    public boolean checkPasswordMatch(JPasswordField passwordTxt, JPasswordField verifyTxt) {
        return String.valueOf(passwordTxt.getPassword()).equals(String.valueOf(verifyTxt.getPassword()));
    }
}
