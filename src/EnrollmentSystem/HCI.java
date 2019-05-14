package EnrollmentSystem;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class HCI extends javax.swing.JFrame {

    /**
     * Creates new form HCI
     */
 int complete[]= new int[6];
 int completed=0;
 
 public static int pwctr=0;
 public HCI() {
        //System.out.println(Login.AddFaculty);
        initComponents();
        setsIcon();
        
         addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we)
        { 
            Login s = new Login();
            s.setVisible(true);
            dispose();
         }
        });
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        facultyNum = new javax.swing.JTextField();
        facultyFname = new javax.swing.JTextField();
        facultyLname = new javax.swing.JTextField();
        facultyPw1 = new javax.swing.JPasswordField();
        facultyPw = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        facultyMname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        add.setBackground(new java.awt.Color(51, 255, 0));
        add.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        add.setText("Register");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(330, 360, 130, 33);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Enter Faculty ID : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(76, 110, 114, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Enter First Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 150, 115, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Enter Last Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 190, 115, 30);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Enter Middle Initial :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(53, 230, 140, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Enter Password : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 270, 110, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Re-Enter Password : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 310, 133, 30);

        facultyNum.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facultyNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        facultyNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                facultyNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                facultyNumFocusLost(evt);
            }
        });
        facultyNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyNumActionPerformed(evt);
            }
        });
        facultyNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facultyNumKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facultyNumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                facultyNumKeyTyped(evt);
            }
        });
        jPanel1.add(facultyNum);
        facultyNum.setBounds(210, 110, 250, 30);

        facultyFname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facultyFname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        facultyFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                facultyFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                facultyFnameFocusLost(evt);
            }
        });
        facultyFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyFnameActionPerformed(evt);
            }
        });
        facultyFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facultyFnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facultyFnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                facultyFnameKeyTyped(evt);
            }
        });
        jPanel1.add(facultyFname);
        facultyFname.setBounds(210, 150, 250, 30);

        facultyLname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facultyLname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        facultyLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                facultyLnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                facultyLnameFocusLost(evt);
            }
        });
        facultyLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyLnameActionPerformed(evt);
            }
        });
        facultyLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facultyLnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facultyLnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                facultyLnameKeyTyped(evt);
            }
        });
        jPanel1.add(facultyLname);
        facultyLname.setBounds(210, 190, 250, 30);

        facultyPw1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facultyPw1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        facultyPw1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                facultyPw1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                facultyPw1FocusLost(evt);
            }
        });
        facultyPw1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facultyPw1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facultyPw1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                facultyPw1KeyTyped(evt);
            }
        });
        jPanel1.add(facultyPw1);
        facultyPw1.setBounds(210, 310, 250, 30);

        facultyPw.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facultyPw.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        facultyPw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                facultyPwFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                facultyPwFocusLost(evt);
            }
        });
        facultyPw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facultyPwKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facultyPwKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                facultyPwKeyTyped(evt);
            }
        });
        jPanel1.add(facultyPw);
        facultyPw.setBounds(210, 270, 250, 30);

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(220, 360, 90, 33);

        facultyMname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facultyMname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        facultyMname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                facultyMnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                facultyMnameFocusLost(evt);
            }
        });
        facultyMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyMnameActionPerformed(evt);
            }
        });
        facultyMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facultyMnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facultyMnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                facultyMnameKeyTyped(evt);
            }
        });
        jPanel1.add(facultyMname);
        facultyMname.setBounds(210, 230, 250, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/dsfs.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 500, 400);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void cell1KeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        if(Character.isAlphabetic(c))
       {
           evt.consume();
           getToolkit().beep();
       }
    }
    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped


        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void facultyMnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyMnameKeyTyped
        complete();
    }//GEN-LAST:event_facultyMnameKeyTyped

    private void facultyMnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyMnameKeyReleased
        complete();
    }//GEN-LAST:event_facultyMnameKeyReleased

    private void facultyMnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyMnameKeyPressed
        Enter(evt);
    }//GEN-LAST:event_facultyMnameKeyPressed

    private void facultyMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyMnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyMnameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        Login log = new Login();
        log.show();
    }//GEN-LAST:event_backActionPerformed

    private void facultyPwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyPwKeyTyped
        complete();
    }//GEN-LAST:event_facultyPwKeyTyped

    private void facultyPwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyPwKeyReleased
        complete();
    }//GEN-LAST:event_facultyPwKeyReleased

    private void facultyPwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyPwKeyPressed
        Enter(evt);
    }//GEN-LAST:event_facultyPwKeyPressed

    private void facultyPw1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyPw1KeyTyped
        complete();
    }//GEN-LAST:event_facultyPw1KeyTyped

    private void facultyPw1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyPw1KeyReleased
        complete();
    }//GEN-LAST:event_facultyPw1KeyReleased

    private void facultyPw1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyPw1KeyPressed
        Enter(evt);
    }//GEN-LAST:event_facultyPw1KeyPressed

    private void facultyLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyLnameKeyTyped
        complete();
    }//GEN-LAST:event_facultyLnameKeyTyped

    private void facultyLnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyLnameKeyReleased
        complete();
    }//GEN-LAST:event_facultyLnameKeyReleased

    private void facultyLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyLnameKeyPressed
        Enter(evt);
    }//GEN-LAST:event_facultyLnameKeyPressed

    private void facultyLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyLnameActionPerformed

    private void facultyFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyFnameKeyTyped
        complete();
    }//GEN-LAST:event_facultyFnameKeyTyped

    private void facultyFnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyFnameKeyReleased
        complete();
    }//GEN-LAST:event_facultyFnameKeyReleased

    private void facultyFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyFnameKeyPressed
        Enter(evt);
    }//GEN-LAST:event_facultyFnameKeyPressed

    private void facultyFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyFnameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String num = facultyNum.getText();
        String fname= facultyFname.getText();
        String lname = facultyLname.getText();
        String mname = facultyMname.getText();
        String pw = facultyPw.getText();
        String pw1 = facultyPw1.getText();
        if(num.equals("")||fname.equals("")||lname.equals("")||pw.equals("")||facultyPw.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Must Complete The Form","",JOptionPane.INFORMATION_MESSAGE);

        }
        else
        {
            if(facultyPw1.getText().equals(facultyPw.getText()))
            {
                int ctr=0;
                for(int x=0;x<Login.ID.size();x++)
                {
                    if(facultyNum.getText().equals(Login.ID.get(x)))
                    ctr=1;
                }

                if(ctr==1)
                {
                    ctr=0;
                    //Login.AddFaculty.add(num);
                    JOptionPane.showMessageDialog(null,"Already Used ID","",JOptionPane.INFORMATION_MESSAGE);
                    facultyNum.setText("");
                    facultyNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, new java.awt.Color(255, 0, 0)));
                }
                else
                {

                    
                     String l= lname.trim();
                     String f= fname.trim();
                     String m= mname.trim();
        
        String lastName = ""; 
        String firstName = ""; 
        String middleName = "";
        if(m.equals(""))
        {
            middleName="*";
        }
        else
        {
        if(m.contains("."))
        {
          String toUp =m.toUpperCase();
          int len = toUp.length();
          String midName = toUp.charAt(0)+"";
           for(int x=0; x<len; x++)
           {
               try
               {
               if(toUp.charAt(x)=='.')
               {
                   midName += toUp.charAt(x+1);
               }
               }
               catch(Exception e)
               {
                   
               }
           }
           midName.replaceAll(" ", "");
           midName+=".";
           middleName = midName;
        }
        else if(m.contains(" "))
        {
            
            String toUp = m.toUpperCase();
            int len = toUp.length();
            String mid = toUp.charAt(0)+"";
            for(int x=0; x<len; x++)
            {
                if(toUp.charAt(x)==' ')
                {
                    mid+=toUp.charAt(x+1);
                }
            }
            mid+=".";
            mid.replaceAll(" ", "");
            middleName = mid;
        }
        
        else
        {
             char startM;
             int lenM=0;
             String upM = m.toUpperCase();
             startM = upM.charAt(0);
             lenM = m.length();
             String lastM = m.substring(1, lenM);
             middleName = startM+". "; 
        }
        }
        char startL;
        char startF;
        //char startM;
        
        int lenL=0;
        int lenF=0;
        //int lenM=0;
        
        String upL = l.toUpperCase();
        startL = upL.charAt(0);
        
        String upF = f.toUpperCase();
        startF = upF.charAt(0);
        
        //String upM = m.toUpperCase();
        //startM = upM.charAt(0);
      
        String lowL = l.toLowerCase();
        String lowF = f.toLowerCase();
        String lowM = m.toLowerCase();
        
        lenL = l.length();
        lenF = f.length();
        //lenM = m.length();
        
        String lastL = lowL.substring(1, lenL);
        String lastF = lowF.substring(1, lenF);
        //String lastM = m.substring(1, lenM);
        
        lastName = startL+lastL; 
        firstName = startF+lastF; 
        //middleName = startM+". "; 
        
        if(lastName.contains(" "))
        {
            int len = lastName.length();
            for(int x=0; x<len; x++)
            {
                if(lastName.charAt(x)==' ')
                {
                   String rep = " "+lastName.charAt(x+1);
                   String repp = rep.toUpperCase();
                   String temp = lastName.replace(rep,repp);
                   lastName = temp;
                }
            }
        }
            if(firstName.contains(" "))
        {
            int len = firstName.length();
            for(int x=0; x<len; x++)
            {
                if(firstName.charAt(x)==' ')
                {
                   String rep = " "+firstName.charAt(x+1);
                   String repp = rep.toUpperCase();
                   String temp = firstName.replace(rep,repp);
                   firstName = temp;
                }
            }
        }
                    ctr=0;
                    facultyNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
                    Login.ID.add(num);
                    Login.password.add(pw);
                    //Login.AddFaculty.add(num);
                    //Login.AddFaculty.add(lastName+", "+firstName+", "+middleName);
                    Login.Fname.add(firstName);
                    Login.Lname.add(lastName);
                    Login.Mname.add(middleName);
                    //Login.AddFaculty.add(pw);
                    Login.name.add(lastName+", "+firstName+", "+middleName);
                    JOptionPane.showMessageDialog(null,"Added","",JOptionPane.INFORMATION_MESSAGE);
                    pwctr++;
                    facultyNum.setText("");
                    facultyPw.setText("");
                    facultyFname.setText("");
                    facultyLname.setText("");
                    facultyPw1.setText("");
                    facultyPw.setText("");
                    Login s=new Login();
                    s.setVisible(true);
                    dispose();
                }

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Password Doesn't Match","",JOptionPane.INFORMATION_MESSAGE);
                facultyPw1.setText("");
                facultyPw.setText("");

            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void facultyFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyFnameFocusGained
        facultyFname.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_facultyFnameFocusGained

    private void facultyFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyFnameFocusLost
        facultyFname.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facultyFnameFocusLost

    private void facultyLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyLnameFocusGained
        facultyLname.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_facultyLnameFocusGained

    private void facultyLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyLnameFocusLost
        facultyLname.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facultyLnameFocusLost

    private void facultyMnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyMnameFocusGained
        facultyMname.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_facultyMnameFocusGained

    private void facultyMnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyMnameFocusLost
        facultyMname.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facultyMnameFocusLost

    private void facultyPwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyPwFocusGained
       facultyPw.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_facultyPwFocusGained

    private void facultyPwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyPwFocusLost
        facultyPw.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facultyPwFocusLost

    private void facultyPw1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyPw1FocusGained
        facultyPw1.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_facultyPw1FocusGained

    private void facultyPw1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyPw1FocusLost
        facultyPw1.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facultyPw1FocusLost

    private void facultyNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyNumKeyTyped
        cell1KeyTyped(evt);
        complete();
    }//GEN-LAST:event_facultyNumKeyTyped

    private void facultyNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyNumKeyReleased
        complete();
    }//GEN-LAST:event_facultyNumKeyReleased

    private void facultyNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyNumKeyPressed
        Enter(evt);
    }//GEN-LAST:event_facultyNumKeyPressed

    private void facultyNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyNumActionPerformed

    private void facultyNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyNumFocusLost
        facultyNum.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facultyNumFocusLost

    private void facultyNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_facultyNumFocusGained
        facultyNum.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_facultyNumFocusGained
void complete()
{
    if(facultyNum.getText().length()!=0&&facultyFname.getText().length()!=0&&facultyLname.getText().length()!=0&&
                        facultyPw.getText().length()!=0&&facultyPw1.getText().length()!=0&&facultyPw.getText().length()!=0)
                {
                add.setEnabled(true);
                }
    else
    {
        add.setEnabled(false);
    }
}
private void Enter(java.awt.event.KeyEvent evt) {                                   
        int c = evt.getKeyCode();
        if(c==KeyEvent.VK_ENTER)
        {
            add.doClick();
        }
    }
    
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
            java.util.logging.Logger.getLogger(HCI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HCI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HCI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HCI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HCI().setVisible(true);
            }
        });
    }
    private void setsIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bsulogo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTextField facultyFname;
    private javax.swing.JTextField facultyLname;
    private javax.swing.JTextField facultyMname;
    private javax.swing.JTextField facultyNum;
    private javax.swing.JPasswordField facultyPw;
    private javax.swing.JPasswordField facultyPw1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}

