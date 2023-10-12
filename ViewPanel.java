/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import MODEL.Patient;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author apple
 */
public class ViewPanel extends javax.swing.JPanel {
     private Patient patient;
     private javax.swing.JLabel DOBLabel = new javax.swing.JLabel();

    /**
     * Creates new form ViewPanel
     */
    public ViewPanel(Patient patient) {
        initComponents();
         this.patient = patient;
        displayPatientData();
    }
    
    
    
    
    private void displayPatientData() {
        if (patient != null) {
            fnameTextField.setText(patient.getFname());
            lnameTextField.setText( patient.getLname());
            ageTextField.setText(patient.getAgeText());
            emailTextField.setText( patient.getEmail());
            msgTextField.setText( patient.getMsg());   
            
            
//            genderLabel.setText(patient.getGenderLabel());
            patientTypeComboBox.setSelectedItem(patient.getPatientTypeComboBox());
            
            
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        msgLabel = new javax.swing.JLabel();
        msgTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        patientTypeLabel = new javax.swing.JLabel();
        patientTypeComboBox = new javax.swing.JComboBox<>();
        imageLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(255, 151, 38));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 637));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 25)); // NOI18N
        titleLabel.setText("View Patient  Form");

        fnameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        fnameLabel.setText("First Name");

        fnameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        fnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTextFieldActionPerformed(evt);
            }
        });
        fnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameTextFieldKeyReleased(evt);
            }
        });

        lnameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lnameLabel.setText("Last Name");

        lnameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTextFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ageLabel.setText("Age");

        ageTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyPressed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        emailLabel.setText("Email");

        emailTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyPressed(evt);
            }
        });

        msgLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        msgLabel.setText("Message");

        msgTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        msgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTextFieldActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        genderLabel.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        patientTypeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        patientTypeLabel.setText("Patient type");

        patientTypeComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        patientTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type ", "Adult", "Child", "Senior Citizen", " " }));

        imageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        imageLabel.setText("Upload Image");

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setText("Browse File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageLabel)
                            .addComponent(emailLabel)
                            .addComponent(lnameLabel)
                            .addComponent(msgLabel)
                            .addComponent(genderLabel)
                            .addComponent(fnameLabel)
                            .addComponent(patientTypeLabel)
                            .addComponent(imageLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2)
                                .addComponent(fnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(patientTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lnameTextField)
                                .addComponent(msgTextField)
                                .addComponent(jRadioButton2)
                                .addComponent(emailTextField)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(91, 91, 91)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fnameLabel)
                    .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(msgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel)
                    .addComponent(jRadioButton1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void ageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyPressed
        // TODO add your handling code here:

        String age = ageTextField.getText();
        int length = age.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar()>='0' && evt.getKeyChar()>'3'){
            if(length<3){
                ageTextField.setEditable(true);

            }
            else {
                ageTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_ageTextFieldKeyPressed

    private void emailTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldKeyPressed

    private void msgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgTextFieldActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog (null);

        if (showOpenDialogue == JFileChooser. APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);

            ImageIcon icon = new ImageIcon(selectedImagePath);
            Image image = icon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);

            imageLabel.setIcon(new ImageIcon(image));

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTextFieldKeyReleased

    private void fnameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTextFieldKeyPressed

    private void fnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JTextField msgTextField;
    private javax.swing.JComboBox<String> patientTypeComboBox;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
