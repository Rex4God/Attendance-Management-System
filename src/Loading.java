
import java.sql.Connection;
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
public class Loading extends javax.swing.JFrame  implements Runnable {
    Connection con = null;
     int s = 0;
    Thread th; 

    /**
     * Creates new form Loading
     */
    public Loading() {
        super ("Loading");
        initComponents();
        th = new Thread((Runnable)this);
    }
    public void SetUpLoad(){
                  setVisible(false);
                    th.start();  
}
            public void run(){
    try{
        for(int i =1; i < 200;i++){
        
        s=s+1;
        
        int M = jProgressBar1.getMaximum();
        int p = jProgressBar1.getValue();
              if(p<M){
            
          jProgressBar1.setValue(jProgressBar1.getValue()+1);
           
           
            
        }else{
            i =201;
           setVisible(false);
           Admin_Home info = new Admin_Home();
           info.setVisible(true);   
        }Thread.sleep(50);
        
        
        
        
    }
        }catch(Exception  e ){
        JOptionPane.showMessageDialog(null, e);
    }
            }        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\image.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\download (2).jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 10, 100, 110);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("NIGERIA CHRISTIAN CORPER'S FELLOWSHIP ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 20, 360, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("GOMBE STATE CHAPTER");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 40, 200, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\image.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 110, 97, 110);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\download (2).jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 110, 101, 110);

        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setOpaque(false);
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(190, 240, 190, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please wait..........");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 270, 160, 15);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\Nccf Management System\\big_Admin_homepage.jpg")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-10, -85, 610, 910);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
