
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class New_Admin extends javax.swing.JFrame {

       Connection con =null;
       ResultSet rs = null;
       PreparedStatement pst = null;
       
       
    
    public New_Admin() {
        super("New_Admin");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        E_mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Question = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        Sub = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("UserName:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 90, 15);
        jPanel1.add(user);
        user.setBounds(150, 30, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 80, 15);
        jPanel1.add(pass);
        pass.setBounds(150, 80, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("E-mail:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 140, 50, 15);
        jPanel1.add(E_mail);
        E_mail.setBounds(150, 140, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Security Question:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 190, 110, 15);

        Question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select security question:", "What is your fathers name?", "What is your school name?", "What is the name of your mother?", "What is your bestfriend name?" }));
        jPanel1.add(Question);
        Question.setBounds(150, 190, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Answer:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 260, 90, 15);
        jPanel1.add(ans);
        ans.setBounds(150, 250, 220, 30);

        Sub.setForeground(new java.awt.Color(51, 0, 255));
        Sub.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Submit Progress_50px.png")); // NOI18N
        Sub.setText("Submit");
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });
        jPanel1.add(Sub);
        Sub.setBounds(80, 300, 121, 60);

        Back.setForeground(new java.awt.Color(51, 0, 255));
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Back Arrow_50px.png")); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(220, 300, 120, 59);

        Reset.setForeground(new java.awt.Color(51, 0, 255));
        Reset.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Reset_50px.png")); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset);
        Reset.setBounds(350, 300, 120, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\New_Admin.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 486, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
                                setVisible(false);
                                Admin_Home info = new Admin_Home();
                                info.setVisible(true);
                                this.dispose();
                                       
    }//GEN-LAST:event_BackActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
                                                    user.setText(null);
                                                    pass.setText(null);
                                                    E_mail.setText(null);
                                                    ans.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActionPerformed
                                             
                               if(user.getText().equals("")){
                                                     JOptionPane.showMessageDialog(null, "Please input your details\n                                                              the fields are empty");
                                                 }else{
                                   try{
                                                   Nccf_Connect.getConnection();
                                                   con= DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                                                 String sql ="INSERT INTO admin(user_name,password,E_mail,Sec_Q,Answer)VALUES(?,?,?,?,?)" ; 
                                                pst= con.prepareStatement(sql);
                                                pst.setString(1,user.getText());
                                                pst.setString(2,pass.getText());
                                                pst.setString(3,E_mail. getText());
                                                pst.setString(4,(String)Question.getSelectedItem());
                                                pst.setString(5,ans.getText());
                                                
                                                pst.executeUpdate();
                                                
                                                JOptionPane.showMessageDialog(null,"Corp  Admin successfully added");
                                       
                                       
                                       
                                       
                                       
                                       
                                       
                                       
                                       
                                       
                                                           }catch(Exception e){
                                                               JOptionPane.showMessageDialog(null, e);
                                                           }
                               }
    }//GEN-LAST:event_SubActionPerformed

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
            java.util.logging.Logger.getLogger(New_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField E_mail;
    private javax.swing.JComboBox<String> Question;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Sub;
    private javax.swing.JTextField ans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
