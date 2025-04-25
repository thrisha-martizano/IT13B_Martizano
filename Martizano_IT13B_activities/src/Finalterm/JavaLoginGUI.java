/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finalterm;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class JavaLoginGUI {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Login");
        
        JTextField jTextFieldUsername = new JTextField();
        JPasswordField jPasswordPassword = new JPasswordField();
        JLabel jLabelUsername = new JLabel("Username");
        JLabel jLabelPassword = new JLabel("Password");
        JButton jButtonLogin = new JButton("Login");
        
        jLabelUsername.setForeground(Color.black);
        jLabelPassword.setForeground(Color.black);
        jButtonLogin.setBackground(Color.blue);
        jButtonLogin.setForeground(Color.white);
        
        jFrame.setLayout(new GridLayout(3,2));
        jFrame.getContentPane().add(jLabelUsername);
        jFrame.getContentPane().add(jTextFieldUsername);
        jFrame.getContentPane().add(jLabelPassword);
        jFrame.getContentPane().add(jPasswordPassword);
        jFrame.getContentPane().add(jButtonLogin);
                
        jFrame.setBounds(600, 300, 400, 250);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jButtonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = jTextFieldUsername.getText().trim();
                String password = new String(jPasswordPassword.getPassword()).trim();

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "Please enter both username and password.");
                } else {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\W10\\Desktop\\javaloginGUI.txt.", true))) {
                        writer.write(username + "," + password);
                        writer.newLine();
                        JOptionPane.showMessageDialog(jFrame, "Login Successfully!");
                        jTextFieldUsername.setText("");
                        jPasswordPassword.setText("");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(jFrame, "Wrong credentials " + ex.getMessage());
                    }
                }
            }
        });
 
    }
    
}
