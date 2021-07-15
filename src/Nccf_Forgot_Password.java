
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
public class Nccf_Forgot_Password extends javax.swing.JFrame {

    
    Connection conn =null;
    ResultSet rs =null;
    PreparedStatement pst = null;
    public Nccf_Forgot_Password() {
        super("Nccf_Forgot_Password");
        initComponents();
    }
    public void Search(){
        if(user.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please input your details\n the fields are empty");
        }else{
                                                  
                                                  try{
                                                      Nccf_Connect.getConnection();
                                                   conn= DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                                                      
                                                      String rex = user.getText();
                                                     String sql ="select *from admin where user_name = '"+rex+"'";
                                                      pst =conn.prepareStatement(sql);
                                                      rs =pst.executeQuery();
                                                      if(rs.next()){
                                                          E_mail.setText(rs.getString(4));
                                                          Q.setText(rs.getString(5));
                                                          
                                                          rs.close();
                                                          pst.close();
                                                          
                                                      }
                                                      else{
                                                          JOptionPane.showMessageDialog(null," incorrect username");
                                                      }
                                                      
                                                  }catch(Exception e){
                                                      JOptionPane.showMessageDialog(null, e);
                                                  }
        }
       
    }
    
    
    
                                                       public void Retrieve(){
                                                           
                                                           try{
                                                               Nccf_Connect.getConnection();
                                                        conn= DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                                                        String rex = user.getText();
                                                        String rex1 =ans.getText();
                                                        String sql ="select *from admin where Answer = '"+rex1+"'";
                                                        pst =conn.prepareStatement(sql);
                                                        rs=pst.executeQuery();
                                                        if(rs.next()){
                                                            pass.setText(rs.getString(3));
                                                            
                                                        }
                                                         }catch(Exception e){
                                                               JOptionPane.showMessageDialog(null, e);
                                                           }
                                                       }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        E_mail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Q = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        srch = new javax.swing.JButton();
        Retrieve = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Login = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 80, 15);
        jPanel1.add(user);
        user.setBounds(170, 30, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 60, 15);
        jPanel1.add(E_mail);
        E_mail.setBounds(170, 90, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Security Question:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 140, 15);
        jPanel1.add(Q);
        Q.setBounds(170, 150, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Answer:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 210, 70, 15);
        jPanel1.add(ans);
        ans.setBounds(170, 200, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your Password:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 260, 100, 15);
        jPanel1.add(pass);
        pass.setBounds(170, 250, 200, 30);

        srch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        srch.setForeground(new java.awt.Color(51, 0, 255));
        srch.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Search_50px.png")); // NOI18N
        srch.setText("Search");
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        jPanel1.add(srch);
        srch.setBounds(400, 20, 130, 60);

        Retrieve.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Retrieve.setForeground(new java.awt.Color(51, 0, 255));
        Retrieve.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Data Recovery_50px.png")); // NOI18N
        Retrieve.setText("Retrieve");
        Retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrieveActionPerformed(evt);
            }
        });
        jPanel1.add(Retrieve);
        Retrieve.setBounds(400, 140, 140, 59);

        Back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 0, 255));
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Back Arrow_50px.png")); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(400, 240, 140, 59);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\big_Admin_homepage.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, -145, 580, 980);

        jMenu2.setText("File");

        Login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Login_50px.png")); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jMenu2.add(Login);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
                                                     setVisible(false);
                                                     Login info =new Login();
                                                     info.setVisible(true);
                                                     this.dispose();
    }//GEN-LAST:event_LoginActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
                                                       setVisible(false);
                                                     Login info =new Login();
                                                     info.setVisible(true);
                                                     this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
                                                    Search();
    }//GEN-LAST:event_srchActionPerformed

    private void RetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrieveActionPerformed
                                                        Retrieve();
    }//GEN-LAST:event_RetrieveActionPerformed

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
            java.util.logging.Logger.getLogger(Nccf_Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nccf_Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nccf_Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nccf_Forgot_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nccf_Forgot_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField E_mail;
    private javax.swing.JMenuItem Login;
    private javax.swing.JTextField Q;
    private javax.swing.JButton Retrieve;
    private javax.swing.JTextField ans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pass;
    private javax.swing.JButton srch;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
