
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGAMUYI PRECIOUS
 */
public class Admin_View extends javax.swing.JFrame {
    Connection con =null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Admin_View() {
        super("Admin_View");
        initComponents();
        jTable1();
    }
     
    
    public void jTable1(){
        
       try{
                                                           Nccf_Connect.getConnection();
                                                    con= DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                                                    String sql ="Select * from admin ";
                                                    pst=con.prepareStatement(sql);
                                                     rs =pst.executeQuery();
                                                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));  
           
       } catch(Exception e){
           
           JOptionPane.showMessageDialog(null, e);
       }
    
    
    }
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\big_Admin_homepage.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 0, 750, 390);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(51, 0, 255));
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Back Arrow_50px.png")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(200, 400, 130, 59);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 220, 34, 14);

        print.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        print.setForeground(new java.awt.Color(0, 51, 255));
        print.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Print_48px.png")); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(400, 400, 117, 60);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\my icons\\Home_48px.png")); // NOI18N
        jMenuItem2.setText("Home");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                                                 setVisible(false);
                                                 Admin_Home  info = new Admin_Home();
                                                 info.setVisible(true);
                                                 this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                                                       setVisible(false);
                                                       Admin_Home info = new Admin_Home();
                                                       info.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
    
                                                      MessageFormat header = new MessageFormat(" Admin Details");
                                                       try{
                                                           
                                                         jTable1.print(JTable.PrintMode.NORMAL, header, null);
                                                           
                                                           
                                                           
                                                       }catch(Exception e){
                                                           JOptionPane.showMessageDialog(null, e);
                                                       }
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
