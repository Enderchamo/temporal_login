/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.login.complement;

import com.login.swing.MyTextField;
import com.login.swing.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;


public class PanelLoginAndRegistrer extends javax.swing.JLayeredPane {

  
    
    public PanelLoginAndRegistrer() {
        initComponents();
        initRegistrer();
        initLogin();
        Login.setVisible(false);
        Register.setVisible(true);
    }
    
    private void initRegistrer(){
    
        Register.setLayout(new MigLayout("wrap","push[center]push","push[]25[]10[]10[]15[]push")); //Distancia de los componentes.
        JLabel label=new JLabel("Crear una cuenta");
        label.setFont(new Font("sansserif",1,30));
        label.setForeground(new Color(128, 128, 128));
        Register.add(label);
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/com/login/icon/patas.png")));
        txtUser.setHint("Nombre");
        Register.add(txtUser, "w 60%");
        MyTextField txtGmail = new MyTextField();
        txtGmail.setPrefixIcon(new ImageIcon(getClass().getResource("/com/login/icon/patas.png")));
        txtGmail.setHint("Gmail");
        Register.add(txtGmail, "w 60%");
        MyTextField txtPassword = new MyTextField();
        txtPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/com/login/icon/patas.png")));
        txtPassword.setHint("Contraseña");
        Register.add(txtPassword, "w 60%");
        Button cmd= new Button();
        cmd.setBackground(new Color (255, 255, 191));
        cmd.setForeground(new Color (89, 140, 163));
        cmd.setText("Crear");
        Register.add(cmd,"w 40%, h 40");
        
        
        
    }
    
    private void initLogin(){
        Login.setLayout(new MigLayout("wrap","push[center]push","push[]25[]10[]10[]10[]push"));
        JLabel label=new JLabel("Iniciar  Sesión");
        label.setFont(new Font("sansserif",1,30));
        label.setForeground(new Color(128, 128, 128));
        Login.add(label);
        MyTextField txtGmail = new MyTextField();
        txtGmail.setPrefixIcon(new ImageIcon(getClass().getResource("/com/login/icon/patas.png")));
        txtGmail.setHint("Gmail");
        Login.add(txtGmail, "w 60%");
        MyTextField txtPassword = new MyTextField();
        txtPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/com/login/icon/patas.png")));
        txtPassword.setHint("Contrasena");
        Login.add(txtPassword, "w 60%");
        JButton cmdForget=new JButton("Olvidaste tu contrasena?");
        cmdForget.setForeground(new Color(100,100,100));
        cmdForget.setFont(new Font("sansserif",1,12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login.add(cmdForget);
        Button cmd= new Button();
        cmd.setBackground(new Color (255, 255, 191));
        cmd.setForeground(new Color (89, 140, 163));
        cmd.setText("Entrar");
        Login.add(cmd,"w 40%, h 40");
        
        
    
    }
    
    public void showRegister(boolean show){ //Controla cual formulario se ve.
        
        if(show){
            Register.setVisible(true);
            Login.setVisible(false);    
            
        }else{
            Register.setVisible(false);
            Login.setVisible(true);    
        }
    
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        Register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(Login, "card3");

        Register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(Register, "card2");
    }// </editor-fold>//GEN-END:initComponents

   
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Register;
    // End of variables declaration//GEN-END:variables
}


 
