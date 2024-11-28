/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package assignment;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 *
 * @author bryan
 */
public abstract class User {
    protected JTextField usernameTxt;
    protected JPasswordField passwordTxt;
    protected JComboBox roleCbo;
    protected JPasswordField verifyTxt;

    public abstract boolean isInputValid(JTextField usernameTxt, JPasswordField passwordTxt, JComboBox roleCbo);

    public abstract boolean checkPasswordMatch(JPasswordField passwordTxt, JPasswordField verifyTxt);
}
