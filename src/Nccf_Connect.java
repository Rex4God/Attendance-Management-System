
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;





/*
 * @author AGAMUYI PRECIOUS
 */
public class Nccf_Connect {
    
                                                      public static Connection getConnection(){
                                                          Connection con = null;
                                                          
                                                          try{
                                                              
                                                            try{
                                                                
                                                      Class.forName("com.mysql.jdbc.Driver");
                                                     con =DriverManager.getConnection("jdbc:mysql://localhost/nccf management system","root","");
                                                                 
                                                                
                                                            }  catch(Exception e){
                                                                JOptionPane.showMessageDialog(null, e);                                                            }
                                                            
                                                    
                                                          }catch(Exception e){
                                                              JOptionPane.showMessageDialog(null,e);
                                                          }
                                                           return con;
    }
}
