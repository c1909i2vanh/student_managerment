/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv_swing.view;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.prefs.Preferences;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import qlsv_swing.entity.User;

/**
 *
 * @author GIANG
 */
public class LoginView extends javax.swing.JFrame {

    Preferences preference;
    boolean rememberPreference;

    /**
     * Creates new form TestLoginForm
     */
    public LoginView() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        rememberMe();
        ImageIcon img = new ImageIcon(getClass().getResource("/images/blue_school_24.png"));
      this.setIconImage(img.getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        headerTitle = new javax.swing.JLabel();
        reduceMouse = new javax.swing.JLabel();
        exitMouse = new javax.swing.JLabel();
        headerIcon = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        userLabelIcon = new javax.swing.JLabel();
        passwordLabelIcon = new javax.swing.JLabel();
        userSeparator = new javax.swing.JSeparator();
        passwordSeparator = new javax.swing.JSeparator();
        infoIcon = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        rememberMeLabel = new javax.swing.JLabel();
        rememberMeCBox = new javax.swing.JCheckBox();
        errorField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        header.setBackground(new java.awt.Color(135, 240, 251));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        headerTitle.setBackground(new java.awt.Color(255, 255, 255));
        headerTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        headerTitle.setForeground(new java.awt.Color(255, 255, 255));
        headerTitle.setText("Login Form");

        reduceMouse.setBackground(new java.awt.Color(135, 240, 251));
        reduceMouse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reduceMouse.setForeground(new java.awt.Color(255, 255, 255));
        reduceMouse.setText("  -");
        reduceMouse.setOpaque(true);
        reduceMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reduceMouseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reduceMouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reduceMouseMouseExited(evt);
            }
        });

        exitMouse.setBackground(new java.awt.Color(135, 240, 251));
        exitMouse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitMouse.setForeground(new java.awt.Color(255, 255, 255));
        exitMouse.setText(" X");
        exitMouse.setToolTipText("Exit");
        exitMouse.setOpaque(true);
        exitMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseMouseExited(evt);
            }
        });

        headerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_school_24.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerTitle)
                .addGap(121, 121, 121)
                .addComponent(reduceMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exitMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(headerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exitMouse)
                        .addComponent(reduceMouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(headerTitle)))
                .addGap(3, 3, 3))
        );

        nameField.setText("User");
        nameField.setBorder(null);
        nameField.setPreferredSize(new java.awt.Dimension(69, 21));
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameFieldMouseExited(evt);
            }
        });

        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.setPreferredSize(new java.awt.Dimension(69, 20));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        userLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/connection_user x44.png"))); // NOI18N
        userLabelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLabelIconMouseClicked(evt);
            }
        });

        passwordLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/debloquer x44.png"))); // NOI18N
        passwordLabelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordLabelIconMouseClicked(evt);
            }
        });

        userSeparator.setForeground(new java.awt.Color(240, 240, 240));
        userSeparator.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        passwordSeparator.setForeground(new java.awt.Color(240, 240, 240));
        passwordSeparator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordSeparatorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordSeparatorMouseExited(evt);
            }
        });

        infoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info x20.png"))); // NOI18N
        infoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoIconMouseEntered(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(135, 240, 251));
        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setFocusPainted(false);

        rememberMeLabel.setText("Remember Me");
        rememberMeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rememberMeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rememberMeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rememberMeLabelMouseExited(evt);
            }
        });

        rememberMeCBox.setBackground(new java.awt.Color(255, 255, 255));
        rememberMeCBox.setForeground(new java.awt.Color(0, 204, 204));
        rememberMeCBox.setBorder(null);
        rememberMeCBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rememberMeCBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rememberMeCBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rememberMeCBoxMouseExited(evt);
            }
        });
        rememberMeCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberMeCBoxActionPerformed(evt);
            }
        });

        errorField.setForeground(new java.awt.Color(255, 51, 51));
        errorField.setBorder(null);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabelIcon)
                    .addComponent(passwordLabelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(errorField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                    .addComponent(rememberMeCBox)
                                    .addGap(18, 18, 18)
                                    .addComponent(rememberMeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32))))
                        .addGap(50, 50, 50)
                        .addComponent(infoIcon)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userLabelIcon)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(infoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rememberMeCBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rememberMeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reduceMouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reduceMouseMouseEntered
        reduceMouse.setBackground(new Color(207, 207, 207));
        reduceMouse.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_reduceMouseMouseEntered

    private void reduceMouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reduceMouseMouseExited
        reduceMouse.setBackground(new Color(135, 240, 251));
        reduceMouse.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_reduceMouseMouseExited

    private void exitMouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMouseEntered
        exitMouse.setBackground(new Color(105, 105, 105));
        exitMouse.setForeground(new Color(255, 255, 255));


    }//GEN-LAST:event_exitMouseMouseEntered

    private void exitMouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMouseExited
        exitMouse.setBackground(new Color(135, 240, 251));
        exitMouse.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_exitMouseMouseExited

    private void reduceMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reduceMouseMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_reduceMouseMouseClicked

    private void exitMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseMouseClicked
    int xx;
    int xy;
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void infoIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoIconMouseEntered
        infoIcon.setToolTipText("Enter username and the password");
    }//GEN-LAST:event_infoIconMouseEntered

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed

    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped

    }//GEN-LAST:event_passwordFieldKeyTyped

    private void rememberMeCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberMeCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberMeCBoxActionPerformed

    private void rememberMeCBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMeCBoxMouseEntered
        rememberMeCBox.setBackground(new Color(232, 232, 232));
    }//GEN-LAST:event_rememberMeCBoxMouseEntered

    private void rememberMeCBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMeCBoxMouseClicked
        this.setRememberCBoxIcon();
    }//GEN-LAST:event_rememberMeCBoxMouseClicked

    private void rememberMeCBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMeCBoxMouseExited
        rememberMeCBox.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_rememberMeCBoxMouseExited

    private void rememberMeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMeLabelMouseEntered
        rememberMeCBox.setBackground(new Color(232, 232, 232));

    }//GEN-LAST:event_rememberMeLabelMouseEntered

    private void rememberMeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMeLabelMouseExited
        rememberMeCBox.setBackground(new Color(255, 255, 255));

    }//GEN-LAST:event_rememberMeLabelMouseExited

    private void rememberMeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMeLabelMouseClicked
       
    }//GEN-LAST:event_rememberMeLabelMouseClicked

    private void userLabelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelIconMouseClicked
      nameField.requestFocus();
    }//GEN-LAST:event_userLabelIconMouseClicked

    private void passwordLabelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabelIconMouseClicked
        passwordField.requestFocus();
    }//GEN-LAST:event_passwordLabelIconMouseClicked

    private void nameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseEntered
    
          userSeparator.setForeground(new Color(160,160,160));
    }//GEN-LAST:event_nameFieldMouseEntered

    private void nameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseExited
        userSeparator.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_nameFieldMouseExited

    private void passwordSeparatorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSeparatorMouseEntered
        passwordSeparator.setForeground(new Color(160,160,160));
    }//GEN-LAST:event_passwordSeparatorMouseEntered

    private void passwordSeparatorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSeparatorMouseExited
          passwordSeparator.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_passwordSeparatorMouseExited

    /**
     * @param args the command line arguments
     */
    public void startLogin() {
        this.setVisible(true);
        this.focusField();
        this.viewCustomStyle();
        this.setRememberCBoxIcon();
    }

    public void closeLogin() {
        this.setVisible(false);
    }

    public void focusField() {
        if (nameField.getText().trim().equals("")) {
            nameField.requestFocus();
        } else {
            if (passwordField.getPassword().length == 0) {
                passwordField.requestFocus();
            } else {
                loginBtn.requestFocus();
            }
        }
    }

    public void viewCustomStyle() {
        rememberMeCBox.setOpaque(true);
        rememberMeCBox.setBackground(new Color(255, 255, 255));
    }

    public boolean userNameFieldIsEmpty() {
        return "".equals(nameField.getText().trim()) || nameField.getText() == null;
    }

    public boolean passwordFieldIsEmpty() {

        return passwordField.getPassword().length == 0;
    }

    public void addLoginListener(ActionListener listener) {
        loginBtn.addActionListener(listener);
    }

    public void addEnterKeyTypedListener(KeyListener listener) {
        loginBtn.addKeyListener(listener);
    }

    public void addEnterKeyLoginListener(KeyListener listener) {
        loginBtn.addKeyListener(listener);
    }

    public void addUserFieldKeyTypedListener(KeyListener listener) {
        nameField.addKeyListener(listener);
    }

    public void addPasswordFieldKeyTypedListener(KeyListener listener) {
        passwordField.addKeyListener(listener);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void showError(String message) {
        errorField.setForeground(Color.red);
        errorField.setText(message);
        errorField.setVisible(true);

    }

    public void hideError() {
        errorField.setText(null);
        errorField.setVisible(false);
    }

    public void focusUserNameField() {
        nameField.requestFocus();
    }

    public Boolean getRememberMeCBox() {
        return rememberMeCBox.isSelected();
    }

    public void setRememberCBoxIcon() {
        if (getRememberMeCBox()) {
            rememberMeCBox.setIcon(new ImageIcon(getClass().getResource("/images/checked_ckbox_x24.png")));        
        } else {
            rememberMeCBox.setIcon(new ImageIcon(getClass().getResource("/images/unchecked_ckbox_x24.png")));           
        }
    }

    public void focusPassField() {
        passwordField.requestFocus();
    }

    public void clearPasswordField() {
        passwordField.setText("");
    }

    public void focusLoginBtn() {
        loginBtn.requestFocus();
    }

    public void loginBtnClick() {
        loginBtn.doClick();
    }

    private void rememberMe() {
        preference = Preferences.userNodeForPackage(this.getClass());
        // Put the boolean of the rememberMe preference
        rememberPreference = preference.getBoolean("rememberMe", Boolean.valueOf(""));
        //Check if the check box was selected
        if (rememberPreference) {
            //Replace the textField by the preferemce user and Password who will be stockF
            nameField.setText(preference.get("nameField", ""));
            passwordField.setText(preference.get("passwordField", ""));
            rememberMeCBox.setSelected(true);
            rememberMeCBox.setIcon(new ImageIcon(getClass().getResource("/images/unchecked_ckbox_x24.png")));
        } else {      
            rememberMeCBox.setIcon(new ImageIcon(getClass().getResource("/images/checked_ckbox_x24.png")));

        }
    }

    public User getUser() {
        // if the check box is clicked and the boolean rememberPreference is false
        if (!rememberPreference && rememberMeCBox.isSelected()) {
            //Insert into the preference the name
            preference.put("nameField", nameField.getText());
            preference.put("passwordField", String.valueOf(passwordField.getPassword()));
            preference.putBoolean("rememberMe", true);
        } else {
            //Reset the preference
            preference.put("nameField", "");
            preference.put("passwordField", "");
            preference.putBoolean("rememberMe", false);

        }
        return new User(nameField.getText(), String.copyValueOf(passwordField.getPassword()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField errorField;
    private javax.swing.JLabel exitMouse;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerIcon;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JLabel infoIcon;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabelIcon;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JLabel reduceMouse;
    private javax.swing.JCheckBox rememberMeCBox;
    private javax.swing.JLabel rememberMeLabel;
    private javax.swing.JLabel userLabelIcon;
    private javax.swing.JSeparator userSeparator;
    // End of variables declaration//GEN-END:variables
}
