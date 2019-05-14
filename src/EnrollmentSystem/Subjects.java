/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrollmentSystem;

import static EnrollmentSystem.Main.subjectArray;
import static EnrollmentSystem.Main.remarks;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Subjects extends javax.swing.JFrame {

    ArrayList courseName1stsem1 = new ArrayList();
    ArrayList courseName1stsem2 = new ArrayList();
    ArrayList courseName2ndsem1 = new ArrayList();
    ArrayList courseName2ndsem2 = new ArrayList();

    public Subjects() {
        initComponents();
        this.setTitle("Subjects");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        try{
           Image image = new ImageIcon("bsulogo.png").getImage();
           this.setIconImage(image);
          }catch(Exception e){
              System.out.println("Appilcation icon not found");
          }
        int row = 36;
        yearP.setLayout(new GridLayout(row, 1));
        semP.setLayout(new GridLayout(row, 1));
        nameP.setLayout(new GridLayout(row, 1));
        remP.setLayout(new GridLayout(row, 1));

         addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we)
        { 
            StudentInfo s = new StudentInfo();
            s.setVisible(true);
            dispose();
         }
        });
        
        Cashier cash = new Cashier();
        cash.setVisible(true);
        cash.dispose();
        
        courseName1stsem1.add("General Psychology");
        courseName1stsem1.add("Study and Thinking Skills");
        courseName1stsem1.add("Sining ng Komunikasyong Pang-Akademiko");
        courseName1stsem1.add("College Algebra");
        courseName1stsem1.add("Philippine History and Government");
        courseName1stsem1.add("ICT Fundamentals");
        courseName1stsem1.add("Fundamentals of Programming Language");
        courseName1stsem1.add("Digital and Logic Circuits");
        courseName1stsem1.add("Physical Education I ");
        courseName1stsem1.add("ROTC/LTS/CWTS");

        courseName1stsem2.add("Oral Communication");
        courseName1stsem2.add("Pane Trigonometry");
        courseName1stsem2.add("Art Appreciation");
        courseName1stsem2.add("Pagbasa at Pagsulat Tungo sa Pananaliksik");
        courseName1stsem2.add("Discrete Structure");
        courseName1stsem2.add("Advanced Programming Language");
        courseName1stsem2.add("Data Structure and Algorithm");
        courseName1stsem2.add("Computer Hardware Fundamentals");
        courseName1stsem2.add("Physical Education II ");
        courseName1stsem2.add("ROTC/LTS/CWTS");

        courseName2ndsem1.add("Philosophy of Man");
        courseName2ndsem1.add("Technical Writing for ICT");
        courseName2ndsem1.add("Database Management Systems");
        courseName2ndsem1.add("Object Oriented Programming");
        courseName2ndsem1.add("Multimedia and Web Design");
        courseName2ndsem1.add("Computer System Organization");
        courseName2ndsem1.add("Network and Communications");
        courseName2ndsem1.add("Physical Education III");

        courseName2ndsem2.add("Life and Works of Rizal");
        courseName2ndsem2.add("Human Computer Interaction");
        courseName2ndsem2.add("Systems Analysis and Design");
        courseName2ndsem2.add("Code of Ethics of the ITEE Professionals");
        courseName2ndsem2.add("Operating Principle and Applications");
        courseName2ndsem2.add("Web Application Development");
        courseName2ndsem2.add("Elective I");
        courseName2ndsem2.add("Physical Education IV");

        for (int a = 0; a < 10; a++) {
            String name = courseName1stsem1.get(a) + "";
            JLabel nameL = new JLabel(name);
            nameP.add(nameL);
        }
        for (int a = 0; a < 10; a++) {
            String name2 = courseName1stsem2.get(a) + "";
            JLabel nameL2 = new JLabel(name2);
            nameP.add(nameL2);
        }
        for (int a = 0; a < 8; a++) {
            String name = courseName2ndsem1.get(a) + "";
            JLabel nameL = new JLabel(name);
            nameP.add(nameL);
        }
        for (int a = 0; a < 8; a++) {
            String name2 = courseName2ndsem2.get(a) + "";
            JLabel nameL2 = new JLabel(name2);
            nameP.add(nameL2);
        }
        for (int x = 0; x < row; x++) {
            //nameP.add(new JLabel(subjectArray[Main.marker][0][x]));
            yearP.add(new JLabel(subjectArray[Main.marker][1][x]));
            semP.add(new JLabel(subjectArray[Main.marker][2][x]));
            remP.add(new JLabel(remarks[Main.marker][x]));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        FirstYear2ndSem = new javax.swing.JPanel();
        yearP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        remP = new javax.swing.JPanel();
        semP = new javax.swing.JLayeredPane();
        nameP = new javax.swing.JPanel();
        blackPanelDesign = new javax.swing.JPanel();
        grayPanelDesign = new javax.swing.JPanel();
        subjLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Year - First Semester", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14)))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(770, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(900, 750));
        MainPanel.setLayout(null);

        FirstYear2ndSem.setBackground(new java.awt.Color(255, 255, 255));
        FirstYear2ndSem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18))); // NOI18N
        FirstYear2ndSem.setPreferredSize(new java.awt.Dimension(400, 280));
        FirstYear2ndSem.setLayout(null);

        yearP.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout yearPLayout = new javax.swing.GroupLayout(yearP);
        yearP.setLayout(yearPLayout);
        yearPLayout.setHorizontalGroup(
            yearPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        yearPLayout.setVerticalGroup(
            yearPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FirstYear2ndSem.add(yearP);
        yearP.setBounds(12, 39, 88, 480);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Year Level ");
        FirstYear2ndSem.add(jLabel1);
        jLabel1.setBounds(20, 10, 70, 15);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Semester");
        FirstYear2ndSem.add(jLabel2);
        jLabel2.setBounds(140, 10, 60, 16);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Subject Name");
        FirstYear2ndSem.add(jLabel3);
        jLabel3.setBounds(340, 10, 110, 16);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Remarks");
        FirstYear2ndSem.add(jLabel4);
        jLabel4.setBounds(600, 10, 60, 16);

        remP.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout remPLayout = new javax.swing.GroupLayout(remP);
        remP.setLayout(remPLayout);
        remPLayout.setHorizontalGroup(
            remPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        remPLayout.setVerticalGroup(
            remPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FirstYear2ndSem.add(remP);
        remP.setBounds(610, 40, 70, 480);

        javax.swing.GroupLayout semPLayout = new javax.swing.GroupLayout(semP);
        semP.setLayout(semPLayout);
        semPLayout.setHorizontalGroup(
            semPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        semPLayout.setVerticalGroup(
            semPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FirstYear2ndSem.add(semP);
        semP.setBounds(130, 40, 99, 480);

        nameP.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout namePLayout = new javax.swing.GroupLayout(nameP);
        nameP.setLayout(namePLayout);
        namePLayout.setHorizontalGroup(
            namePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        namePLayout.setVerticalGroup(
            namePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FirstYear2ndSem.add(nameP);
        nameP.setBounds(260, 40, 310, 480);

        MainPanel.add(FirstYear2ndSem);
        FirstYear2ndSem.setBounds(30, 80, 700, 540);

        blackPanelDesign.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.add(blackPanelDesign);
        blackPanelDesign.setBounds(0, 40, 550, 10);

        grayPanelDesign.setBackground(new java.awt.Color(255, 102, 51));
        MainPanel.add(grayPanelDesign);
        grayPanelDesign.setBounds(460, 50, 340, 10);

        subjLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        subjLabel.setText("Subjects");
        MainPanel.add(subjLabel);
        subjLabel.setBounds(20, 10, 96, 31);

        BackBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.setPreferredSize(new java.awt.Dimension(91, 27));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        MainPanel.add(BackBtn);
        BackBtn.setBounds(630, 630, 83, 27);

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        StudentInfo s = new StudentInfo();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel FirstYear2ndSem;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel blackPanelDesign;
    private javax.swing.JPanel grayPanelDesign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel nameP;
    private javax.swing.JPanel remP;
    private javax.swing.JLayeredPane semP;
    private javax.swing.JLabel subjLabel;
    private javax.swing.JPanel yearP;
    // End of variables declaration//GEN-END:variables

}
