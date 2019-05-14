/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrollmentSystem;

import static EnrollmentSystem.Evaluation.CourseCode1stsem1;
import static EnrollmentSystem.Evaluation.CourseCode1stsem2;
import static EnrollmentSystem.Evaluation.CourseCode2ndsem1;
import static EnrollmentSystem.Evaluation.CourseCode2ndsem2;
import static EnrollmentSystem.Evaluation.CourseName1stsem1;
import static EnrollmentSystem.Evaluation.CourseName1stsem2;
import static EnrollmentSystem.Evaluation.CourseName2ndsem1;
import static EnrollmentSystem.Evaluation.CourseName2ndsem2;
import static EnrollmentSystem.Evaluation.NoUnits1stsem1;
import static EnrollmentSystem.Evaluation.NoUnits1stsem2;
import static EnrollmentSystem.Evaluation.NoUnits2ndsem1;
import static EnrollmentSystem.Evaluation.NoUnits2ndsem2;
import static EnrollmentSystem.Evaluation.Prereq1stsem1;
import static EnrollmentSystem.Evaluation.Prereq1stsem2;
import static EnrollmentSystem.Evaluation.Prereq2ndsem1;
import static EnrollmentSystem.Evaluation.Prereq2ndsem2;
import static EnrollmentSystem.Evaluation.codeI;
import static EnrollmentSystem.Evaluation.reg;
import static EnrollmentSystem.Form.IrregReg;
import static EnrollmentSystem.Form.Scholar;
import static EnrollmentSystem.Form.StudFullName;
import static EnrollmentSystem.Form.StudNumber;
import static EnrollmentSystem.Form.YearLev;
import static EnrollmentSystem.Main.marker;
import static EnrollmentSystem.Main.viewStudRecords;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author carlj
 */
public class EvalForm extends javax.swing.JFrame {

    ArrayList courseCode = new ArrayList();
    ArrayList courseName = new ArrayList();
    ArrayList courseUnit = new ArrayList();
    ArrayList coursePre = new ArrayList();
    public static int rowCopy = 0;
    public static int units = 0;
    public EvalForm() {
        initComponents();
        this.setTitle("Evaluation Slip");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        try{
           Image image = new ImageIcon("bsulogo.png").getImage();
           this.setIconImage(image);
          }catch(Exception e){
              System.out.println("Appilcation icon not found");
          }
         units=0;
         rowCopy=0;
        studNumLabel.setText("Student Number: "+StudNumber.get(marker));
        nameLabel.setText("Name: "+StudFullName.get(marker));
        scholarLabel.setText("Scholarship: "+Scholar.get(marker));
        statLabel.setText("Status: "+IrregReg.get(marker));
        yearLabel.setText("Year Level: "+YearLev.get(marker));
        semLabel.setText("Semester: "+Form.Semester.get(marker));
        genderLabel.setText("Gender: "+Form.Gender.get(marker));
        secLabel.setText("Section: "+Form.Section.get(marker));
        
        assesedLabel.setText("Evaluated by: "+Login.name.get(Login.logmark));
        
        if(reg==1)
        {
            courseCode=CourseCode1stsem1;
            courseName=CourseName1stsem1;
            courseUnit=NoUnits1stsem1;
            coursePre=Prereq1stsem1;
            
        }
        else if(reg==2)
        {
            courseCode=CourseCode1stsem2;
            courseName=CourseName1stsem2;
            courseUnit=NoUnits1stsem2;
            coursePre=Prereq1stsem2;
          
        }
        else if(reg==3)
        {
            courseCode=CourseCode2ndsem1;
            courseName=CourseName2ndsem1;
            courseUnit=NoUnits2ndsem1;
            coursePre=Prereq2ndsem1;
            
        }
        else if(reg==4)
        {
            courseCode=CourseCode2ndsem2;
            courseName=CourseName2ndsem2;
            courseUnit=NoUnits2ndsem2;
            coursePre=Prereq2ndsem2;
            
        }
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                rowCopy=0;
        units=0;
        courseName.clear();
        courseCode.clear();
        courseUnit.clear();
        codeI.clear();
                Evaluation eval = new Evaluation();
            eval.setVisible(true);
            dispose();
               
            }
        });
        
        JLabel title1 = new JLabel("Course Code");
        JLabel title2 = new JLabel("Course Name");
        JLabel title3 = new JLabel("Unit/s");
        
        title1.setFont(new Font("Century Gothic",Font.BOLD,15));
        title2.setFont(new Font("Century Gothic",Font.BOLD,15));
        title3.setFont(new Font("Century Gothic",Font.BOLD,15));
        if(Form.IrregReg.get(Main.marker).equals("Irregular"))
        {
        int row = Evaluation.codeI.size();
        rowCopy=row;
        subPanel2.setLayout(new GridLayout(row+1,3));
        subPanel.setLayout(new GridLayout(row+1,2));
        subPanel.add(title1);
        subPanel.add(title2);
        subPanel2.add(new JLabel(""));
        subPanel2.add(title3);
        subPanel2.add(new JLabel(""));
            
       int size1 = Evaluation.subjT1stsem1.getRowCount();
       int stop =0;
        for(int x=0; x<size1; x++)
        {
            for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT1stsem1.getValueAt(x, 1)))
                {
                  subPanel.add(new JLabel((String) Evaluation.subjT1stsem1.getValueAt(x, 1)));
                  subPanel.add(new JLabel((String) Evaluation.subjT1stsem1.getValueAt(x, 2)));
                  subPanel2.add(new JLabel(""));
                  subPanel2.add(new JLabel(Evaluation.subjT1stsem1.getValueAt(x, 3)+""));
                  subPanel2.add(new JLabel(""));
                  stop=x;
                  units+=  (int)Evaluation.subjT1stsem1.getValueAt(x, 3);
                 Main.remarks[Main.marker][stop]="*";
                  stop++;
                }
            }
        }
        int stop2 =0;
        int size2 = Evaluation.subjT1stsem2.getRowCount();
        for(int x=0; x<size2; x++)
        {
           for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT1stsem2.getValueAt(x, 1)))
                {
                  subPanel.add(new JLabel((String) Evaluation.subjT1stsem2.getValueAt(x, 1)));
                  subPanel.add(new JLabel((String) Evaluation.subjT1stsem2.getValueAt(x, 2)));
                  subPanel2.add(new JLabel(""));
                  subPanel2.add(new JLabel(Evaluation.subjT1stsem2.getValueAt(x, 3)+""));
                  subPanel2.add(new JLabel(""));
                  stop2=10+x;
                  units+=  (int)Evaluation.subjT1stsem2.getValueAt(x, 3);
                  Main.remarks[Main.marker][stop2]="*";
                  stop2++;
                }
            }
        }
        int stop3 =0;
        int size3 = Evaluation.subjT2ndsem1.getRowCount();
        for(int x=0; x<size3; x++)
        {
           for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT2ndsem1.getValueAt(x, 1)))
                {
                  subPanel.add(new JLabel((String) Evaluation.subjT2ndsem1.getValueAt(x, 1)));
                  subPanel.add(new JLabel((String) Evaluation.subjT2ndsem1.getValueAt(x, 2)));
                  subPanel2.add(new JLabel(""));
                  subPanel2.add(new JLabel(Evaluation.subjT2ndsem1.getValueAt(x, 3)+""));
                  subPanel2.add(new JLabel(""));
                  stop3=20+x;
                  units+=  (int)Evaluation.subjT2ndsem1.getValueAt(x, 3);
                  Main.remarks[Main.marker][stop3]="*";
                  stop3++;
                }
            }
        }
        int stop4 =0;
        int size4 = Evaluation.subjT2ndsem2.getRowCount();
        for(int x=0; x<size4; x++)
        {
          for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT2ndsem2.getValueAt(x, 1)))
                {
                  subPanel.add(new JLabel((String) Evaluation.subjT2ndsem2.getValueAt(x, 1)));
                  subPanel.add(new JLabel((String) Evaluation.subjT2ndsem2.getValueAt(x, 2)));
                  subPanel2.add(new JLabel(""));
                  subPanel2.add(new JLabel(Evaluation.subjT2ndsem2.getValueAt(x, 3)+""));
                  subPanel2.add(new JLabel(""));
                  stop4=28+x;
                  units+=  (int)Evaluation.subjT2ndsem2.getValueAt(x, 3);
                  Main.remarks[Main.marker][stop4]="*";
                  stop4++;
                }
            }
        }
        }
        else
        {
        int row = courseCode.size();
        rowCopy=row;
        subPanel2.setLayout(new GridLayout(row+1,3));
        subPanel.setLayout(new GridLayout(row+1,2));
        subPanel.add(title1);
        subPanel.add(title2);
        subPanel2.add(new JLabel(""));
        subPanel2.add(title3);
        subPanel2.add(new JLabel(""));
        for(int x=0; x<row; x++)
        {
            subPanel.add(new JLabel((String) courseCode.get(x)));
            subPanel.add(new JLabel((String) courseName.get(x)));
            subPanel2.add(new JLabel(""));
            subPanel2.add(new JLabel(courseUnit.get(x)+""));
           // int s = Integer.parseInt(string)courseUnit.get(x);
            units +=(int)courseUnit.get(x);
            subPanel2.add(new JLabel(""));
            
        }
        }
        
        totSub.setText(rowCopy+"");
        tot.setText(units+"");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        repPhLabel = new javax.swing.JLabel();
        BSULabel = new javax.swing.JLabel();
        cityMalLabel = new javax.swing.JLabel();
        assLabel = new javax.swing.JLabel();
        logoBSU = new javax.swing.JLabel();
        genInfoPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        studNumLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        collegeLabel = new javax.swing.JLabel();
        semLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        schoolYearLabel = new javax.swing.JLabel();
        curriLabel = new javax.swing.JLabel();
        scholarLabel = new javax.swing.JLabel();
        statLabel = new javax.swing.JLabel();
        secLabel = new javax.swing.JLabel();
        titlePanelStudGen = new javax.swing.JPanel();
        studLabel = new javax.swing.JLabel();
        subjectPanel = new javax.swing.JPanel();
        titlePanelEnrolledSubj = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        enLabel = new javax.swing.JLabel();
        subPanel = new javax.swing.JPanel();
        subPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totSub = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        backgroundLogoLabel = new javax.swing.JLabel();
        assesedLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        proceedBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 248, 190));
        jPanel1.setLayout(null);

        repPhLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        repPhLabel.setText("Republic of the Philippines");
        jPanel1.add(repPhLabel);
        repPhLabel.setBounds(219, 29, 155, 16);

        BSULabel.setFont(new java.awt.Font("Cloister Black", 0, 22)); // NOI18N
        BSULabel.setText("Bulacan State University");
        jPanel1.add(BSULabel);
        BSULabel.setBounds(190, 40, 241, 38);

        cityMalLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cityMalLabel.setText("City of Malolos");
        jPanel1.add(cityMalLabel);
        cityMalLabel.setBounds(250, 70, 155, 16);

        assLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        assLabel.setText("EVALUATION SLIP");
        jPanel1.add(assLabel);
        assLabel.setBounds(200, 100, 183, 26);

        logoBSU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/bsulogoSmall.png"))); // NOI18N
        jPanel1.add(logoBSU);
        logoBSU.setBounds(50, 20, 70, 80);

        genInfoPanel.setBackground(new java.awt.Color(245, 248, 190));
        genInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        genInfoPanel.setOpaque(false);
        genInfoPanel.setLayout(null);

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        nameLabel.setText("Name: Nierra, Bernie, W.");
        genInfoPanel.add(nameLabel);
        nameLabel.setBounds(10, 30, 270, 16);

        studNumLabel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        studNumLabel.setText("Student Num: 123456");
        genInfoPanel.add(studNumLabel);
        studNumLabel.setBounds(10, 10, 270, 16);

        genderLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        genderLabel.setText("Gender: Unknown");
        genInfoPanel.add(genderLabel);
        genderLabel.setBounds(410, 10, 140, 14);

        ageLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ageLabel.setText("Age: 18");
        genInfoPanel.add(ageLabel);
        ageLabel.setBounds(410, 30, 110, 14);

        collegeLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        collegeLabel.setText("College: College of Information And Communication Technology");
        genInfoPanel.add(collegeLabel);
        collegeLabel.setBounds(10, 50, 400, 16);

        semLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        semLabel.setText("Semester: ");
        genInfoPanel.add(semLabel);
        semLabel.setBounds(10, 70, 290, 16);

        yearLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        yearLabel.setText("Year Level: Always 1st");
        genInfoPanel.add(yearLabel);
        yearLabel.setBounds(410, 70, 230, 16);

        schoolYearLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        schoolYearLabel.setText("School Year: 2016-2017");
        genInfoPanel.add(schoolYearLabel);
        schoolYearLabel.setBounds(10, 90, 300, 14);

        curriLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        curriLabel.setText("Curriculum: ACT 2015");
        genInfoPanel.add(curriLabel);
        curriLabel.setBounds(410, 90, 230, 16);

        scholarLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        scholarLabel.setText("Scholarship:");
        genInfoPanel.add(scholarLabel);
        scholarLabel.setBounds(10, 110, 300, 16);

        statLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        statLabel.setText("Status: Irregular");
        genInfoPanel.add(statLabel);
        statLabel.setBounds(410, 110, 220, 16);

        secLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        secLabel.setText("Section:");
        genInfoPanel.add(secLabel);
        secLabel.setBounds(410, 50, 140, 20);

        jPanel1.add(genInfoPanel);
        genInfoPanel.setBounds(10, 180, 560, 130);

        titlePanelStudGen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        studLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studLabel.setText("STUDENT GENERAL INFORMATION");
        titlePanelStudGen.add(studLabel);

        jPanel1.add(titlePanelStudGen);
        titlePanelStudGen.setBounds(10, 150, 560, 30);

        subjectPanel.setBackground(new java.awt.Color(245, 248, 190));
        subjectPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        subjectPanel.setOpaque(false);
        subjectPanel.setLayout(null);

        titlePanelEnrolledSubj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        titlePanelEnrolledSubj.add(jLabel8);

        enLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enLabel.setText("ENROLLED SUBJECT(S)");
        titlePanelEnrolledSubj.add(enLabel);

        subjectPanel.add(titlePanelEnrolledSubj);
        titlePanelEnrolledSubj.setBounds(0, 0, 560, 30);

        subPanel.setOpaque(false);
        subjectPanel.add(subPanel);
        subPanel.setBounds(20, 30, 360, 250);

        subPanel2.setOpaque(false);
        subjectPanel.add(subPanel2);
        subPanel2.setBounds(380, 30, 180, 250);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Total Units(s):");
        subjectPanel.add(jLabel1);
        jLabel1.setBounds(390, 280, 90, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Total Subject(s):");
        subjectPanel.add(jLabel2);
        jLabel2.setBounds(240, 280, 100, 14);

        totSub.setText("jLabel3");
        subjectPanel.add(totSub);
        totSub.setBounds(340, 280, 34, 14);

        tot.setText("jLabel3");
        subjectPanel.add(tot);
        tot.setBounds(480, 280, 34, 14);

        jPanel1.add(subjectPanel);
        subjectPanel.setBounds(10, 320, 560, 300);

        backgroundLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/bulsuRed.png"))); // NOI18N
        jPanel1.add(backgroundLogoLabel);
        backgroundLogoLabel.setBounds(40, 140, 480, 480);

        assesedLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        assesedLabel.setText("Evaluated by:");
        jPanel1.add(assesedLabel);
        assesedLabel.setBounds(10, 640, 340, 15);

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cancelBtn.setText("Back");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn);
        cancelBtn.setBounds(460, 630, 110, 30);

        proceedBtn.setBackground(new java.awt.Color(255, 255, 255));
        proceedBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        proceedBtn.setText("Proceed");
        proceedBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        jPanel1.add(proceedBtn);
        proceedBtn.setBounds(340, 630, 110, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
            AssesmentPaper ass = new AssesmentPaper();
            ass.setVisible(true);
            dispose();
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        Evaluation eval = new Evaluation();
        courseName.clear();
        courseCode.clear();
        courseUnit.clear();
        codeI.clear();
        rowCopy=0;
        units=0;
        eval.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EvalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BSULabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel assLabel;
    private javax.swing.JLabel assesedLabel;
    private javax.swing.JLabel backgroundLogoLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel cityMalLabel;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JLabel curriLabel;
    private javax.swing.JLabel enLabel;
    private javax.swing.JPanel genInfoPanel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoBSU;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JLabel repPhLabel;
    private javax.swing.JLabel scholarLabel;
    private javax.swing.JLabel schoolYearLabel;
    private javax.swing.JLabel secLabel;
    private javax.swing.JLabel semLabel;
    private javax.swing.JLabel statLabel;
    private javax.swing.JLabel studLabel;
    private javax.swing.JLabel studNumLabel;
    private javax.swing.JPanel subPanel;
    private javax.swing.JPanel subPanel2;
    private javax.swing.JPanel subjectPanel;
    private javax.swing.JPanel titlePanelEnrolledSubj;
    private javax.swing.JPanel titlePanelStudGen;
    private javax.swing.JLabel tot;
    private javax.swing.JLabel totSub;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
