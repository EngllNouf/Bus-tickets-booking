package trans_bus;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;



public class Trans_bus extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JPanel jPanel2;
    private JPanel jPanel4;
    
    public Trans_bus() {
        
        initComponents();
          setLocationRelativeTo(null);
    }

                        
    private void initComponents() {

        jPanel2 = new JPanel();
        jPanel4 = new JPanel();
        jButton3 = new JButton();
        jLabel1 = new JLabel();
        jButton2 = new JButton();
        jLabel4 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        jLabel6 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel2.setLayout(new AbsoluteLayout());
        getContentPane().add(jPanel2, new AbsoluteConstraints(83, 585, -1, -1));
  
       
        jPanel4.setLayout(null);

        jButton3.setIcon(new ImageIcon("C:\\Users\\User\\Pictures\\بدا الحجز.jpg")); 
        
        
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(120, 310, 120, 75);

        jLabel1.setFont(new java.awt.Font("Urdu Typesetting", 1, 36)); 
        jLabel1.setText("Services");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(120, -20, 150, 80);

        jButton2.setIcon(new ImageIcon("C:\\Users\\User\\Pictures\\معلومات.jpg")); 
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(120, 50, 120, 110);

        jLabel4.setFont(new Font("Tahoma", 1, 12)); 
        jLabel4.setText("Application");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(150, 390, 69, 15);

        jLabel3.setFont(new Font("Tahoma", 1, 12)); 
        jLabel3.setText("Reservation");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(160, 160, 60, 15);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\معلومات.jpg")); // NOI18N
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(120, 180, 120, 109);

        jLabel2.setFont(new Font("Sylfaen", 1, 12)); 
        jLabel2.setText("Tracks");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(150, 290, 63, 16);

        jLabel6.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Screenshot 2022-10-27 170222.png")); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, -20, 1050, 620);

        getContentPane().add(jPanel4, new AbsoluteConstraints(-20, 0, 340, 580));

        pack();
        setVisible(true);
    }                     

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
       Booking book = new Booking();
       book.show();
       dispose();
    }                                        

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
       diection die = new diection();
       die.show();
       dispose();
    }                                        

    private void jButton3ActionPerformed(ActionEvent evt) {                                         
       description des = new description();
       des.show();
       dispose();
    }                                        

 
    public static void main(String args[]) {
      

     
    
                new Trans_bus();
            }
       
    
          
}
 