package EnrollmentSystem;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
 //public static ArrayList AddFaculty = new ArrayList();
 public static ArrayList password = new ArrayList();
 public static ArrayList ID = new ArrayList();
 public static ArrayList name = new ArrayList();
 public static ArrayList Fname = new ArrayList();
 public static ArrayList Lname = new ArrayList();
 public static ArrayList Mname = new ArrayList();
 public static int logmark=0;
 public static int facMarker =0;
 public static int terCtr=0;
    public Login() {
        initComponents();
        setsIcon();
        idlbl.requestFocus();
        
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we)
        { 
             String ObjButtons[] = {"Yes","No"};
             int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
         if(PromptResult==JOptionPane.YES_OPTION)
          {
            System.exit(0);
          }
         }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idlbl = new javax.swing.JLabel();
        loginID = new javax.swing.JTextField();
        passlbl = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        registerbtn = new javax.swing.JButton();
        loginPW = new javax.swing.JPasswordField();
        bglbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Enrollment System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idlbl.setBackground(new java.awt.Color(255, 255, 255));
        idlbl.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        idlbl.setForeground(new java.awt.Color(153, 153, 153));
        idlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idlbl.setText("ID Number*");
        idlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idlbl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idlblFocusGained(evt);
            }
        });
        getContentPane().add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 30));

        loginID.setColumns(34);
        loginID.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        loginID.setToolTipText("Enter your ID Number here");
        loginID.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        loginID.setCaretColor(new java.awt.Color(255, 255, 255));
        loginID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginID.setSelectionColor(new java.awt.Color(153, 153, 153));
        loginID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginIDFocusLost(evt);
            }
        });
        loginID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIDActionPerformed(evt);
            }
        });
        loginID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginIDKeyTyped(evt);
            }
        });
        getContentPane().add(loginID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 280, 30));

        passlbl.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passlbl.setForeground(new java.awt.Color(153, 153, 153));
        passlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passlbl.setText("Password* ");
        passlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(passlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, 30));

        login.setBackground(new java.awt.Color(0, 102, 255));
        login.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setMnemonic('l');
        login.setText("LOGIN");
        login.setToolTipText("Click to proceed");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setEnabled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginKeyTyped(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 120, -1));

        registerbtn.setBackground(new java.awt.Color(0, 102, 255));
        registerbtn.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        registerbtn.setForeground(new java.awt.Color(255, 255, 255));
        registerbtn.setMnemonic('r');
        registerbtn.setText("REGISTER");
        registerbtn.setToolTipText("Click to create a new account");
        registerbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        loginPW.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        loginPW.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loginPW.setToolTipText("Type your password here");
        loginPW.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        loginPW.setSelectionColor(new java.awt.Color(153, 153, 153));
        loginPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginPWFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginPWFocusLost(evt);
            }
        });
        loginPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPWActionPerformed(evt);
            }
        });
        loginPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPWKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginPWKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginPWKeyTyped(evt);
            }
        });
        getContentPane().add(loginPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 280, 30));

        bglbl.setBackground(new java.awt.Color(0, 0, 0));
        bglbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/sadsada.jpg"))); // NOI18N
        bglbl.setAutoscrolls(true);
        getContentPane().add(bglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIDActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        HCI reg =  new HCI();
        
        dispose();
        reg.show();
    }//GEN-LAST:event_registerbtnActionPerformed

    private void loginIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginIDKeyTyped
        complete();
        cell1KeyTyped(evt);
    }//GEN-LAST:event_loginIDKeyTyped

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        int marker=0;
        idlbl.setVisible(true);
        passlbl.setVisible(true);
        for(int v=0; v<ID.size(); v++)
        {
            if(ID.get(v).equals(loginID.getText()))
            {
                facMarker=v;
                break;
            }
        }
        for(int x=0;x<name.size();x++)
        {
            if(loginPW.getText().equals(password.get(x))&&loginID.getText().equals(ID.get(x)))
            {
                marker=1;
            }
        }
        
        if(marker==1)
        {
            
            JOptionPane.showMessageDialog(null,"Successfully Logged","",JOptionPane.INFORMATION_MESSAGE);
            String get = loginID.getText();
            for(int c=0; c<ID.size(); c++)
            {
                if(ID.get(c).equals(get))
                {
                    logmark=c;
                    break;
                }
            }
            loginID.setText("");
            loginPW.setText("");
            Main m = new Main();
            m.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Account does not exists","",JOptionPane.INFORMATION_MESSAGE);
            terCtr++;
            loginID.setText("");
            loginPW.setText("");
            login.setEnabled(false);

        }
         if(terCtr==3)
        {
          JOptionPane.showMessageDialog(null,"Three times trying to log in with wrong\npassword will terminate the program...","Terminate",JOptionPane.WARNING_MESSAGE); 
          System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginIDKeyPressed
        complete();
        Enter(evt);
        idlbl.setVisible(false);
    }//GEN-LAST:event_loginIDKeyPressed

    private void loginIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginIDKeyReleased
        complete();
        if(loginID.getText().equals(""))
        {
            idlbl.setVisible(true);
        }
    }//GEN-LAST:event_loginIDKeyReleased

    private void loginPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPWActionPerformed

    private void loginPWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPWKeyReleased
        complete();
        if(loginPW.getText().equals(""))
        {
            passlbl.setVisible(true);
        }
    }//GEN-LAST:event_loginPWKeyReleased

    private void loginPWKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPWKeyTyped
        complete();
    }//GEN-LAST:event_loginPWKeyTyped

    private void loginPWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPWKeyPressed
        complete();
        Enter(evt);
        passlbl.setVisible(false);
    }//GEN-LAST:event_loginPWKeyPressed

    private void loginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_loginKeyTyped

    private void loginIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIDFocusGained
        loginID.setBackground(new java.awt.Color(0,102,255));
    }//GEN-LAST:event_loginIDFocusGained

    private void idlblFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idlblFocusGained

    }//GEN-LAST:event_idlblFocusGained

    private void loginIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIDFocusLost
        loginID.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_loginIDFocusLost

    private void loginPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPWFocusGained
        loginPW.setBackground(new java.awt.Color(0,102,255));
    }//GEN-LAST:event_loginPWFocusGained

    private void loginPWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPWFocusLost
        loginPW.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_loginPWFocusLost
void complete()
{
    if(loginID.getText().length()!=0&&loginPW.getText().length()!=0)
    {
        login.setEnabled(true);
    }
    else
        login.setEnabled(false);
}
private void cell1KeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        if(Character.isAlphabetic(c))
       {
           evt.consume();
           getToolkit().beep();
       }
    }
private void Enter(java.awt.event.KeyEvent evt) {                                   
        int c = evt.getKeyCode();
        if(c==KeyEvent.VK_ENTER)
        {
            login.doClick();
        }
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
         
            public void run() {
                try
                {
                    Thread.sleep(2700);
                }
                catch(Exception e)
                {
                }
               new Login().setVisible(true);
                
            }
        });      
    }
    private void setsIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsulogo.png")));
         
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bglbl;
    private javax.swing.JLabel idlbl;
    private javax.swing.JButton login;
    private javax.swing.JTextField loginID;
    private javax.swing.JPasswordField loginPW;
    private javax.swing.JLabel passlbl;
    private javax.swing.JButton registerbtn;
    // End of variables declaration//GEN-END:variables
}
