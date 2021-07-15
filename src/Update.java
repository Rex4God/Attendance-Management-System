
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
public class Update extends javax.swing.JFrame {
    
                                                    Connection con =null;
                                                    ResultSet rs = null;
                                                    PreparedStatement pst = null;

    public Update() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        word = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        bk = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 80, 80, 30);
        jPanel1.add(Name);
        Name.setBounds(110, 80, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 160, 60, 15);
        jPanel1.add(word);
        word.setBounds(110, 160, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 230, 40, 15);
        jPanel1.add(email);
        email.setBounds(110, 220, 200, 30);
        jPanel1.add(Search);
        Search.setBounds(310, 20, 180, 40);

        search.setForeground(new java.awt.Color(51, 0, 204));
        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Search_40px.png")); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(500, 10, 120, 60);

        Update.setForeground(new java.awt.Color(51, 0, 204));
        Update.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Update_50px.png")); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(90, 290, 123, 59);

        bk.setForeground(new java.awt.Color(51, 0, 204));
        bk.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Back Arrow_50px.png")); // NOI18N
        bk.setText("Back");
        bk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkActionPerformed(evt);
            }
        });
        jPanel1.add(bk);
        bk.setBounds(360, 290, 111, 59);

        delete.setForeground(new java.awt.Color(51, 0, 204));
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Delete_50px.png")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(500, 290, 120, 60);

        jButton2.setForeground(new java.awt.Color(51, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Reset_50px.png")); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 290, 117, 60);

        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\big_Admin_homepage.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 640, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                                        Search.setText(null);
                                                        Name.setText(null);
                                                        word.setText(null);
                                                        email.setText(null);
                                                        
                                                        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkActionPerformed
                                                     setVisible(false);
                                                     Admin_Home info =new Admin_Home();
                                                     info.setVisible(true);
                                                     this.dispose();
                                                     
    }//GEN-LAST:event_bkActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
                                                     if(Name.getText().equals("")){
                                                          
                                                JOptionPane.showMessageDialog(null,"Please input your details \n the fields are empty");
                                                }else{
                                                          
                                                try{
                                                    
                                                   String value1  = Name.getText();
                                                   String value2  = word.getText();
                                                   String value3  = email.getText();
                                                   String value4 = Search.getText();
                                                    
                                                Nccf_Connect.getConnection();
                                                String  sql ="UPDATE admin SET user_name ='"+value1+"',password ='"+value2+"', e_mail ='"+value3+"' WHERE id ='"+value4+"'";
                                                  con =DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                                                  pst = con.prepareStatement(sql);
                                                  pst.execute();
                                                  
                                                  JOptionPane.showMessageDialog(null, "Corp  details successfully Update");
                                               
                                                            
                                                              
                                                          }catch(Exception e){
                                                              
                                                              JOptionPane.showMessageDialog(null, e);
                                                          }
                                                     }
                                                         
    }//GEN-LAST:event_UpdateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
                                                         if(Search.getText().equals("")){
                                                JOptionPane.showMessageDialog(null,"Please input your details \n the fields are empty"); 
                                               
        }else{
                                                  try{
                                                      
                                                    Nccf_Connect.getConnection();
                                                        con = DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                                                        String   sql =  "SELECT  *FROM admin where id = ?";
                                                        pst = con.prepareStatement(sql);
                                                        pst.setString(1,Search.getText());
                                                        rs =pst.executeQuery();
                                                        if(rs.next()){
                                                            
                                                            String rex1 = rs.getString("user_name");
                                                            Name.setText(rex1);
                                                            String rex2 = rs.getString("password");
                                                            word.setText(rex2);
                                                            String rex3 = rs.getString("E_mail");
                                                            email.setText(rex3);
                                                            rs.close();
                                                            pst.close();
                                                            
                                                                    
                                                        }else{
                                                            JOptionPane.showMessageDialog(null," No record of  Admin Found");
                                                        }      
                                                                    
                                                       
                                                  }catch(Exception e){
                                                      JOptionPane.showMessageDialog(null, e);
                                                  }
                                                         }
            
            
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
                                                              try{
                                                   String sql = "DELETE  from  admin WHERE id = ?";
                                                   pst = con.prepareStatement(sql);
                                                   pst.setString(1, Search.getText());
                                                   pst.executeUpdate();
                                                   setVisible(false);
                                                   Admin_View info = new Admin_View();
                                                   info.setVisible(true);
                                                   this.dispose();
                                                }catch(Exception e){
                                                    
                                                  JOptionPane.showMessageDialog(null, e);
                                                }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Search;
    private javax.swing.JButton Update;
    private javax.swing.JButton bk;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables
}
