
package trans_bus;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import org.xml.sax.Attributes;



public class description extends JFrame {
    
                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
               
    public description() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); 
        jLabel2.setText("our application enables visitors to ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 370, 60));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); 
        jLabel3.setText("book a bus ticket easily and ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); 
        jLabel4.setText("quickly");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton1.setForeground(new java.awt.Color(153, 51, 0));
        jButton1.setText("Return");
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 170, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Screenshot 2022-10-27 170222.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 326, -1));

        pack();
        setVisible(true);
    }                      

       private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {   
       Trans_bus book = new Trans_bus();
       book.show();
       dispose();
       
           
           
    }             
    
    
    
    public static void main(String args[]) {
       
                new description();
            }
       



}

    
    
    
    
    
    
    
    
    
    
    
    

