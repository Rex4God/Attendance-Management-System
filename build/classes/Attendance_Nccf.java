
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGAMUYI PRECIOUS
 */
public class Attendance_Nccf extends javax.swing.JFrame {

                                                      Connection con = null;
                                                      PreparedStatement pst = null;
                                                      ResultSet rs =null;
    public Attendance_Nccf() {
        super("Attendance_Nccf");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Serial = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Adr = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel14 = new javax.swing.JLabel();
        TIME = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        no = new javax.swing.JTextField();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jComboBox5 = new javax.swing.JComboBox<>();
        Sub = new javax.swing.JButton();
        rst = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Unit = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Update = new javax.swing.JMenuItem();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\image.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(7, 0, 100, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\download (2).jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(800, 0, 100, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("NIGERIA CHRISTIAN CORPER'S FELLOWSHIP GOMBE STATE CHAPTER");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 20, 660, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SERIAL NUMBER:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 150, 110, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAME:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 200, 80, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SEX:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 250, 60, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BATCH:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 290, 60, 14);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UNITS:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 340, 60, 14);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PHONE NUMBER:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 420, 120, 14);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATE OF BIRTH:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 470, 110, 14);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ATTENDANCE  STATUS:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 510, 140, 20);
        jPanel1.add(Serial);
        Serial.setBounds(190, 140, 210, 30);
        jPanel1.add(name);
        name.setBounds(190, 190, 210, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Gender:", "Female", "Male", " " }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(190, 240, 210, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Batch:", "A1", "A2", "B1", "B2", "C1", "C2", "Senior Friend" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(190, 290, 210, 30);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ADDRESS:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 380, 90, 14);
        jPanel1.add(Adr);
        Adr.setBounds(190, 370, 210, 30);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DATE:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(460, 144, 50, 20);
        jPanel1.add(dateChooserCombo1);
        dateChooserCombo1.setBounds(510, 140, 220, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TIME:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(460, 200, 40, 14);
        jPanel1.add(TIME);
        TIME.setBounds(510, 190, 220, 30);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DAYS:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(460, 250, 40, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select  Days Of  Service:", "Sunday", "Tuesday", "Thursday", " ", " " }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(510, 250, 220, 30);

        no.setForeground(new java.awt.Color(51, 0, 255));
        jPanel1.add(no);
        no.setBounds(190, 410, 210, 30);
        jPanel1.add(dateChooserCombo2);
        dateChooserCombo2.setBounds(190, 460, 220, 30);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Attendance Status:", "P--Present", "A--Absent", "L--Late", "T--Travel", "S--Sick" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(190, 510, 220, 30);

        Sub.setForeground(new java.awt.Color(51, 0, 255));
        Sub.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Submit Progress_50px.png")); // NOI18N
        Sub.setText("SUBMIT");
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });
        jPanel1.add(Sub);
        Sub.setBounds(465, 480, 130, 60);

        rst.setForeground(new java.awt.Color(51, 0, 255));
        rst.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Reset_50px.png")); // NOI18N
        rst.setText("RESET");
        rst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstActionPerformed(evt);
            }
        });
        jPanel1.add(rst);
        rst.setBounds(610, 480, 130, 60);

        Back.setForeground(new java.awt.Color(51, 0, 255));
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Back Arrow_50px.png")); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(770, 480, 115, 60);
        jPanel1.add(Unit);
        Unit.setBounds(190, 330, 210, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("MEMBERSHIP  ATTENDANCE     REGISTER");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(210, 60, 410, 20);

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\Home.jpg")); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 0, 730, 570);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\Home.jpg")); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(718, 0, 870, 570);

        jMenu1.setText("File");

        Update.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        Update.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Update_50px.png")); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jMenu1.add(Update);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActionPerformed
                                                      if(Serial.getText().equals("")){
                                               JOptionPane.showMessageDialog(null, "Please fill the field");    
                                                      }else{
                                                try{
                                                                
                                               Nccf_Connect.getConnection();
                                               con= DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                        
                                         String sql ="INSERT INTO attendance(serial_number,name,sex,batch,units,address,phone_number,Dob,attendance_status,date,time,days)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                                              pst=con.prepareStatement(sql);
                                              pst.setString(1,Serial.getText());
                                             pst.setString(2,name.getText());
                                              pst.setString(3,(String)jComboBox1.getSelectedItem());
                                              pst.setString(4,(String)jComboBox2.getSelectedItem());
                                              pst.setString(5,Unit.getText());
                                             pst.setString(6,Adr.getText());
                                            pst.setString(7,no.getText());
                                            pst.setString(8,(String)dateChooserCombo2.getText());
                                           pst.setString(9,(String)jComboBox5.getSelectedItem());
                                            pst.setString(10,(String)dateChooserCombo1.getText());
                                              pst.setString(11,TIME.getText());
                                               pst.setString(12,(String)jComboBox4.getSelectedItem());
                                               
                                               
                                               pst.executeUpdate();
                                               
                                               JOptionPane.showMessageDialog(null,"Membership attendance successfully Added");
                                              
                                              
                                                             }catch(Exception  e){
                                                                 JOptionPane.showMessageDialog(null, e);
                                                             
                                                             }
                                                      }
    }//GEN-LAST:event_SubActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
                                                       setVisible(false);
                                                       Admin_Home rex =new Admin_Home();
                                                       rex.setVisible(true);
                                                       this.dispose();
        
    }//GEN-LAST:event_BackActionPerformed

    private void rstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstActionPerformed
                                                           Serial.setText(null);
                                                           name.setText(null);
                                                           Unit.setText(null);
                                                           Adr.setText(null);
                                                           no.setText(null);
                                                           TIME.setText(null);
    }//GEN-LAST:event_rstActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
                                                      setVisible(false);
                                                      Attendance_Update rex = new Attendance_Update();
                                                      rex.setVisible(true);
                                                      this.dispose();
    }//GEN-LAST:event_UpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Attendance_Nccf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_Nccf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_Nccf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_Nccf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance_Nccf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adr;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Serial;
    private javax.swing.JButton Sub;
    private javax.swing.JTextField TIME;
    private javax.swing.JTextField Unit;
    private javax.swing.JMenuItem Update;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField no;
    private javax.swing.JButton rst;
    // End of variables declaration//GEN-END:variables
}
