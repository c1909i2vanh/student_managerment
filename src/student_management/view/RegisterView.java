/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import student_management.controller.RegisterController;
import student_management.entities.User;

/**
 *
 * @author GIANG
 */
public class RegisterView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView1
     */
    public RegisterView() {
        initComponents();

        // this.setLocationRelativeTo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        MainPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        headerRegister = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        exitMouse = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        errorUsernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        errorPasswordField = new javax.swing.JTextField();
        confirmPassword = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        errorConfirmPassField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        errorEmailField = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        registerAuthenticationPanel = new javax.swing.JPanel();
        headerRegister1 = new javax.swing.JPanel();
        headerLabel1 = new javax.swing.JLabel();
        exitMouse1 = new javax.swing.JButton();
        errorVerifyCode = new javax.swing.JTextField();
        verifyLabel = new javax.swing.JLabel();
        confirmVerifyBtn = new javax.swing.JButton();
        verifyField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel1.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        MainPanel1.setForeground(new java.awt.Color(0, 153, 153));

        mainPanel.setLayout(new java.awt.CardLayout());

        registerPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerRegister.setBackground(new java.awt.Color(153, 255, 255));
        headerRegister.setForeground(new java.awt.Color(204, 204, 204));
        headerRegister.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerRegisterheaderMouseDragged(evt);
            }
        });
        headerRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerRegisterheaderMousePressed(evt);
            }
        });

        headerLabel.setBackground(new java.awt.Color(255, 255, 255));
        headerLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        headerLabel.setText("Register");

        exitMouse.setBackground(new java.awt.Color(153, 255, 255));
        exitMouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_32px.png"))); // NOI18N
        exitMouse.setBorder(null);
        exitMouse.setBorderPainted(false);
        exitMouse.setContentAreaFilled(false);
        exitMouse.setFocusPainted(false);
        exitMouse.setOpaque(true);
        exitMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseMouseExited(evt);
            }
        });
        exitMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerRegisterLayout = new javax.swing.GroupLayout(headerRegister);
        headerRegister.setLayout(headerRegisterLayout);
        headerRegisterLayout.setHorizontalGroup(
            headerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerRegisterLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(exitMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerRegisterLayout.setVerticalGroup(
            headerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel)
            .addComponent(exitMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usernameLabel.setText("Username");

        errorUsernameField.setEditable(false);
        errorUsernameField.setBackground(new java.awt.Color(255, 255, 255));
        errorUsernameField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        errorUsernameField.setForeground(new java.awt.Color(255, 0, 0));
        errorUsernameField.setBorder(null);
        errorUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorUsernameFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        passwordLabel.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        errorPasswordField.setEditable(false);
        errorPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        errorPasswordField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        errorPasswordField.setForeground(new java.awt.Color(255, 0, 0));
        errorPasswordField.setBorder(null);
        errorPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorPasswordFieldActionPerformed(evt);
            }
        });

        confirmPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        confirmPassword.setText("Confirm Password");

        errorConfirmPassField.setEditable(false);
        errorConfirmPassField.setBackground(new java.awt.Color(255, 255, 255));
        errorConfirmPassField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        errorConfirmPassField.setForeground(new java.awt.Color(255, 0, 0));
        errorConfirmPassField.setBorder(null);
        errorConfirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorConfirmPassFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailLabel.setText("Email");

        errorEmailField.setEditable(false);
        errorEmailField.setBackground(new java.awt.Color(255, 255, 255));
        errorEmailField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        errorEmailField.setForeground(new java.awt.Color(255, 0, 0));
        errorEmailField.setBorder(null);
        errorEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorEmailFieldActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(102, 102, 102));
        registerBtn.setText("Register");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.setFocusPainted(false);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(102, 102, 102));
        ClearBtn.setText("Clear");
        ClearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearBtn.setFocusPainted(false);
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorPasswordField)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorUsernameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorConfirmPassField)
                            .addComponent(errorEmailField))
                        .addContainerGap())
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addComponent(confirmPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(headerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorConfirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(ClearBtn))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        mainPanel.add(registerPanel, "card4");

        registerAuthenticationPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerRegister1.setBackground(new java.awt.Color(153, 255, 255));
        headerRegister1.setForeground(new java.awt.Color(204, 204, 204));
        headerRegister1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerRegister1headerMouseDragged(evt);
            }
        });
        headerRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerRegister1headerMousePressed(evt);
            }
        });

        headerLabel1.setBackground(new java.awt.Color(255, 255, 255));
        headerLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        headerLabel1.setText("Register Authentication");

        exitMouse1.setBackground(new java.awt.Color(153, 255, 255));
        exitMouse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_32px.png"))); // NOI18N
        exitMouse1.setBorder(null);
        exitMouse1.setBorderPainted(false);
        exitMouse1.setContentAreaFilled(false);
        exitMouse1.setFocusPainted(false);
        exitMouse1.setOpaque(true);
        exitMouse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouse1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouse1MouseExited(evt);
            }
        });
        exitMouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMouse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerRegister1Layout = new javax.swing.GroupLayout(headerRegister1);
        headerRegister1.setLayout(headerRegister1Layout);
        headerRegister1Layout.setHorizontalGroup(
            headerRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerRegister1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(headerLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(exitMouse1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerRegister1Layout.setVerticalGroup(
            headerRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel1)
            .addComponent(exitMouse1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        errorVerifyCode.setEditable(false);
        errorVerifyCode.setBackground(new java.awt.Color(255, 255, 255));
        errorVerifyCode.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        errorVerifyCode.setForeground(new java.awt.Color(255, 0, 0));
        errorVerifyCode.setBorder(null);
        errorVerifyCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorVerifyCodeActionPerformed(evt);
            }
        });

        verifyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        verifyLabel.setText("Verify Code");

        confirmVerifyBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        confirmVerifyBtn.setForeground(new java.awt.Color(102, 102, 102));
        confirmVerifyBtn.setText("Confirm");
        confirmVerifyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmVerifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmVerifyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerAuthenticationPanelLayout = new javax.swing.GroupLayout(registerAuthenticationPanel);
        registerAuthenticationPanel.setLayout(registerAuthenticationPanelLayout);
        registerAuthenticationPanelLayout.setHorizontalGroup(
            registerAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registerAuthenticationPanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(confirmVerifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerAuthenticationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verifyField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(registerAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerAuthenticationPanelLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(registerAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(errorVerifyCode)
                        .addGroup(registerAuthenticationPanelLayout.createSequentialGroup()
                            .addComponent(verifyLabel)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(26, 26, 26)))
        );
        registerAuthenticationPanelLayout.setVerticalGroup(
            registerAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerAuthenticationPanelLayout.createSequentialGroup()
                .addComponent(headerRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(verifyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(confirmVerifyBtn)
                .addGap(84, 84, 84))
            .addGroup(registerAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerAuthenticationPanelLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(verifyLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(errorVerifyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );

        mainPanel.add(registerAuthenticationPanel, "card4");

        javax.swing.GroupLayout MainPanel1Layout = new javax.swing.GroupLayout(MainPanel1);
        MainPanel1.setLayout(MainPanel1Layout);
        MainPanel1Layout.setHorizontalGroup(
            MainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanel1Layout.setVerticalGroup(
            MainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void errorEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorEmailFieldActionPerformed

    private void errorConfirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorConfirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorConfirmPassFieldActionPerformed

    private void errorPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorPasswordFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void headerRegisterheaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerRegisterheaderMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerRegisterheaderMousePressed

    private void headerRegisterheaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerRegisterheaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
        headerRegister.setCursor(new Cursor(13));
    }//GEN-LAST:event_headerRegisterheaderMouseDragged

    private void exitMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseActionPerformed

    private void exitMouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMouseExited
        exitMouse.setBackground(new Color(153, 255, 255));
    }//GEN-LAST:event_exitMouseMouseExited

    private void exitMouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMouseEntered
        exitMouse.setBackground(new Color(228, 38, 69));
    }//GEN-LAST:event_exitMouseMouseEntered

    private void errorUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorUsernameFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void exitMouse1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouse1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouse1MouseEntered

    private void exitMouse1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouse1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouse1MouseExited

    private void exitMouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMouse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouse1ActionPerformed

    private void headerRegister1headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerRegister1headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
        headerRegister1.setCursor(new Cursor(13));
    }//GEN-LAST:event_headerRegister1headerMouseDragged

    private void headerRegister1headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerRegister1headerMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerRegister1headerMousePressed

    private void errorVerifyCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorVerifyCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorVerifyCodeActionPerformed

    private void confirmVerifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmVerifyBtnActionPerformed

    }//GEN-LAST:event_confirmVerifyBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed

    }//GEN-LAST:event_registerBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed
    int xx;
    int xy;

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JPanel MainPanel1;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JButton confirmVerifyBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField errorConfirmPassField;
    private javax.swing.JTextField errorEmailField;
    private javax.swing.JTextField errorPasswordField;
    private javax.swing.JTextField errorUsernameField;
    private javax.swing.JTextField errorVerifyCode;
    private javax.swing.JButton exitMouse;
    private javax.swing.JButton exitMouse1;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabel1;
    private javax.swing.JPanel headerRegister;
    private javax.swing.JPanel headerRegister1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel registerAuthenticationPanel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField verifyField;
    private javax.swing.JLabel verifyLabel;
    // End of variables declaration//GEN-END:variables

    public void addExitMouseListener(ActionListener listener) {
        exitMouse.addActionListener(listener);
        exitMouse1.addActionListener(listener);
    }

    public void addRegisterListener(ActionListener listener) {
        registerBtn.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        ClearBtn.addActionListener(listener);
    }

    public void addConFirmListener(ActionListener listener) {
        confirmVerifyBtn.addActionListener(listener);
    }

    public void startLogin(Component component) {
        this.setVisible(true);
        this.setLocationRelativeTo(component);

    }

    public Component setViewPosition(Component component) {
        return component;
    }

    public void showAuthenView() {
        registerAuthenticationPanel.setVisible(true);
    }

    public void hideAuthenView() {
        registerAuthenticationPanel.setVisible(false);
    }

    public void showRegisterView() {
        registerPanel.setVisible(true);

    }

    public void hideRegisterView() {
        registerPanel.setVisible(false);
    }

    public void close() {
        this.setVisible(false);

    }

    public String getUserField() {
        return usernameField.getText();
    }

    public String getEmailField() {
        return emailField.getText();

    }

    public String getConfirmPassField() {
        return String.valueOf(confirmPassField.getPassword());
    }

    public String getPasswordField() {
        return String.valueOf(passwordField.getPassword());
    }

    public String getVerifyCodeField() {
        return verifyField.getText();
    }

    public void showErrorConfirmPass(String errorConfirmPass) {
        errorConfirmPassField.setText(errorConfirmPass);

    }

    public void showErrorPassword(String errorPassword) {
        errorPasswordField.setText(errorPassword);
    }

    public void showErrorUserName(String errorUser) {
        errorUsernameField.setText(errorUser);
    }

    public void showErrorEmail(String errorEmail) {
        errorEmailField.setText(errorEmail);
    }

    public void disableConfirmBtn() {
        confirmVerifyBtn.setEnabled(false);
    }

    public void enableConfirmBtn() {
        confirmVerifyBtn.setEnabled(true);
    }

    public void showErrorAuthentication(String error) {
        errorVerifyCode.setText(error);

    }

    public void clearRegisterView() {
        usernameField.setText("");
        passwordField.setText("");
        confirmPassField.setText("");
        emailField.setText("");
        errorUsernameField.setText("");
        errorPasswordField.setText("");
        errorConfirmPassField.setText("");
        errorEmailField.setText("");

    }

    public Boolean checkVerifyCode(User user) {
        int code = 0;
        try {
            code = Integer.parseInt(verifyField.getText());
        } catch (NumberFormatException e) {
            return false;
        }
        return (user.getEmail().equals(emailField.getText()) && code == user.getVerifyCode());

    }

    public boolean validateEmail(String email) {
        String regexEmail = "^\\w+([+.-]\\w+)*@\\w+([.-]\\w+)*[.]\\w+([.-]\\w+)*$";
        Pattern p = Pattern.compile(regexEmail);
        Matcher matcher = p.matcher(email);
        
        return matcher.matches();
    }

    public boolean validateVerifyCode(String code) {
        String regexCode = "^[0-9]{6}$";
        Pattern p = Pattern.compile(regexCode);
        Matcher matcher = p.matcher(code);

        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        String regexPassword = "^(?=.*[A-Z])(?=.*\\d)(?=.*[a-z])[A-Za-z0-9]{8,16}$";
        Pattern p = Pattern.compile(regexPassword);
        Matcher matcher = p.matcher(password);

        return matcher.matches();
    }

    public boolean validateUserName(String username) {
        String regexName = "^[a-zA-Z0-9]{8,20}$";
        Pattern p = Pattern.compile(regexName);
        Matcher matcher = p.matcher(username);

        return matcher.matches();
    }

}
