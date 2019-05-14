
package EnrollmentSystem;

import static EnrollmentSystem.EvalForm.rowCopy;
import static EnrollmentSystem.EvalForm.units;
import static EnrollmentSystem.Evaluation.CourseCode1stsem1;
import static EnrollmentSystem.Evaluation.CourseCode1stsem2;
import static EnrollmentSystem.Evaluation.CourseCode2ndsem1;
import static EnrollmentSystem.Evaluation.CourseName1stsem1;
import static EnrollmentSystem.Evaluation.CourseName1stsem2;
import static EnrollmentSystem.Evaluation.CourseName2ndsem1;
import static EnrollmentSystem.Evaluation.CourseName2ndsem2;
import static EnrollmentSystem.Evaluation.NoUnits1stsem1;
import static EnrollmentSystem.Evaluation.NoUnits1stsem2;
import static EnrollmentSystem.Evaluation.NoUnits2ndsem1;
import static EnrollmentSystem.Evaluation.codeI;
import static EnrollmentSystem.Evaluation.markerIrreg;
import static EnrollmentSystem.Evaluation.reg;
import static EnrollmentSystem.Form.IrregReg;
import static EnrollmentSystem.Form.Scholar;
import static EnrollmentSystem.Form.Section;
import static EnrollmentSystem.Form.StudFullName;
import static EnrollmentSystem.Form.StudNumber;
import static EnrollmentSystem.Form.YearLev;
import static EnrollmentSystem.Main.marker;
import static EnrollmentSystem.Main.viewStudRecords;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JLabel;


public class AssesmentPaper extends javax.swing.JFrame {

    public static ArrayList courseName = new ArrayList();
    ArrayList courseCode = new ArrayList();
    ArrayList <Integer> courseUnit = new ArrayList();
    ArrayList courseSec = new ArrayList();
    DecimalFormat format = new DecimalFormat("0.00");
    public static int totalUnits=0;
    public static double first=0.0;
    public static double second=0.0;
    public static double total=0.0;
    public static ArrayList cpy = new ArrayList();
    public static double scholarPrice =0;
    JLabel scholLabel = new JLabel();
    
    public AssesmentPaper() {
        initComponents();
        this.setTitle("Assesment");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        studNumLabel.setText("Student Number: "+StudNumber.get(marker));
        nameLabel.setText("Name: "+StudFullName.get(marker));
        scholarLabel.setText("Scholarship: "+Scholar.get(marker));
        statLabel.setText("Status: "+IrregReg.get(marker));
        yearLabel.setText("Year Level: "+YearLev.get(marker));
        semLabel.setText("Semester: "+Form.Semester.get(marker));
        genderLabel.setText("Gender: "+Form.Gender.get(marker));
        secLabel.setText("Section: "+Form.Section.get(marker));
        assesedLabel.setText("Assesed by: "+Login.name.get(Login.logmark));
       
        panel.add(scholLabel);
        scholLabel.setBounds(250,13, 250, 13);
        
        if(Form.Scholar.get(Main.marker).equals("Governor's Shcolar"))
        {
           scholLabel.setText("(GS) - P 3500");
           scholarPrice =3500.0;
        }
        else if(Form.Scholar.get(Main.marker).equals("Vice-Governor's Scholar"))
        {
           scholLabel.setText("(VGS) - P 2500");
           scholarPrice =2500.0;
        }
        else if(Form.Scholar.get(Main.marker).equals("Scholar ng Bayan"))
        {
           scholLabel.setText("(SNB) - P 1800");
           scholarPrice =1800.0;
        }
        else if(Form.Scholar.get(Main.marker).equals("Scholar ng BSU"))
        {
           scholLabel.setText("(BSU) - P 3000");
           scholarPrice =3000.0;
        }
        else
        {
           scholLabel.setText("");
           scholarPrice =0.0;
        }
        if(reg==1)
        {
            courseName=CourseName1stsem1;
            courseCode=CourseCode1stsem1;
            courseUnit=NoUnits1stsem1;
        }
        else if(reg==2)
        {
            courseName=CourseName1stsem2;
            courseCode=CourseCode1stsem2;
            courseUnit=NoUnits1stsem2;
        }
        else if(reg==3)
        {
            courseName=CourseName2ndsem1;
            courseCode=CourseCode2ndsem1;
            courseUnit=NoUnits2ndsem1;
        }
        else if(reg==4)
        {
            courseName=CourseName2ndsem2;
            courseCode=CourseCode2ndsem1;
            courseUnit=NoUnits2ndsem1;
        }
        
        if(markerIrreg==1)
        {
            int row = Evaluation.codeI.size();
            subP.setLayout(new GridLayout(row,1));
            nameP.setLayout(new GridLayout(row,1));
            noP.setLayout(new GridLayout(row,1));
            secP.setLayout(new GridLayout(row,1));
        for(int y=0; y<row; y++)
        {
            courseSec.add(Section.get(Main.marker));
        }
        
        int size1 = Evaluation.subjT1stsem1.getRowCount();
        for(int x=0; x<size1; x++)
        {
            for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT1stsem1.getValueAt(x, 1)))
                {
                  subP.add(new JLabel((String) Evaluation.subjT1stsem1.getValueAt(x, 1)));
                  cpy.add((String) Evaluation.subjT1stsem1.getValueAt(x, 1));
                  nameP.add(new JLabel((String) Evaluation.subjT1stsem1.getValueAt(x, 2)));
                  noP.add(new JLabel(Evaluation.subjT1stsem1.getValueAt(x, 3)+""));
                  totalUnits += (int) Evaluation.subjT1stsem1.getValueAt(x, 3);
                }
            }
        }
        int size2 = Evaluation.subjT1stsem2.getRowCount();
        for(int x=0; x<size2; x++)
        {
           for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT1stsem2.getValueAt(x, 1)))
                {
                  subP.add(new JLabel((String) Evaluation.subjT1stsem2.getValueAt(x, 1)));
                  cpy.add((String) Evaluation.subjT1stsem1.getValueAt(x, 1));
                  nameP.add(new JLabel((String) Evaluation.subjT1stsem2.getValueAt(x, 2)));
                  noP.add(new JLabel(Evaluation.subjT1stsem2.getValueAt(x, 3)+""));
                  totalUnits += (int) Evaluation.subjT1stsem2.getValueAt(x, 3);
                }
            }
        }
        
         int size3 = Evaluation.subjT2ndsem1.getRowCount();
        for(int x=0; x<size3; x++)
        {
           for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT2ndsem1.getValueAt(x, 1)))
                {
                  subP.add(new JLabel((String) Evaluation.subjT2ndsem1.getValueAt(x, 1)));
                  cpy.add((String) Evaluation.subjT1stsem1.getValueAt(x, 1));
                  nameP.add(new JLabel((String) Evaluation.subjT2ndsem1.getValueAt(x, 2)));
                  noP.add(new JLabel(Evaluation.subjT2ndsem1.getValueAt(x, 3)+""));
                  totalUnits += (int) Evaluation.subjT2ndsem1.getValueAt(x, 3);
                }
            }
        }
        
         int size4 = Evaluation.subjT2ndsem2.getRowCount();
        for(int x=0; x<size4; x++)
        {
          for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               if(Evaluation.codeI.get(y).equals(Evaluation.subjT2ndsem2.getValueAt(x, 1)))
                {
                  subP.add(new JLabel((String) Evaluation.subjT2ndsem2.getValueAt(x, 1)));
                  cpy.add((String) Evaluation.subjT1stsem1.getValueAt(x, 1));
                  nameP.add(new JLabel((String) Evaluation.subjT2ndsem2.getValueAt(x, 2)));
                  noP.add(new JLabel(Evaluation.subjT2ndsem2.getValueAt(x, 3)+""));
                  totalUnits += (int) Evaluation.subjT2ndsem2.getValueAt(x, 3);
                }
            }
        }
        
        for(int y=0; y<Evaluation.codeI.size(); y++)
            {
               secP.add(new JLabel((String) courseSec.get(y)));
            }
        }//if
        else
        {
        int row = courseName.size();
        subP.setLayout(new GridLayout(row+1,1));
        nameP.setLayout(new GridLayout(row+1,1));
        noP.setLayout(new GridLayout(row+1,1));
        secP.setLayout(new GridLayout(row+1,1));
        for(int y=0; y<row; y++)
        {
            courseSec.add(Section.get(Main.marker));
        }
        for(int x=0; x<row; x++)
        {
            subP.add(new JLabel((String) courseCode.get(x)));
            nameP.add(new JLabel((String) courseName.get(x)));
            noP.add(new JLabel(courseUnit.get(x)+""));
            totalUnits+=courseUnit.get(x);
            secP.add(new JLabel((String) courseSec.get(x)));
        }
        }
        
        tot.setText(totalUnits+"");
        String copy=tot.getText();
        feeP.setLayout(new GridLayout(14,1));
        feeP.add(new JLabel("Registration Fee"));
        feeP.add(new JLabel("Library Fee"));
        feeP.add(new JLabel("Medical Dental Fee"));
        feeP.add(new JLabel("School Paper"));
        feeP.add(new JLabel("SCUAA Fee"));
        feeP.add(new JLabel("Student Government"));
        feeP.add(new JLabel("Socio Cultural Fee"));
        feeP.add(new JLabel("Athletic Fee"));
        feeP.add(new JLabel("Guidance Fee"));
        feeP.add(new JLabel("Security Fee"));
        feeP.add(new JLabel("Publication Fee"));
        feeP.add(new JLabel("Tuition Fee Regular"+"("+copy+"@200)"));
        feeP.add(new JLabel("PTA"));
        feeP.add(new JLabel("College Paper-CICT"));
        
        
        int mul= totalUnits*200;
        String mulCopy=mul+"";
        int mes=67+117+54+28+133+28+67+133+41+41+41+100+30;
        priceP.setLayout(new GridLayout(14,1));
        priceP.add(new JLabel("67.00"));
        priceP.add(new JLabel("117.00"));
        priceP.add(new JLabel("54.00"));
        priceP.add(new JLabel("28.00"));
        priceP.add(new JLabel("133.00"));
        priceP.add(new JLabel("28.00"));
        priceP.add(new JLabel("67.00"));
        priceP.add(new JLabel("133.00"));
        priceP.add(new JLabel("41.00"));
        priceP.add(new JLabel("41.00"));
        priceP.add(new JLabel("41.00"));
        priceP.add(new JLabel(mulCopy+".00"));
        priceP.add(new JLabel("100.00"));
        priceP.add(new JLabel("30.00"));
        
        total = mul+mes;
        total = total-scholarPrice;
        first=total*.60;
        second=total-first;
        if(Form.Scholar.get(Main.marker).equals(""))
        {
            totalLabel.setText(format.format(total));
        }
        else
        {
        totalLabel.setText(format.format(total)+" w/scholar");
        }
        firstLabel.setText(format.format(first));
        secondLabel.setText(format.format(second));
        totSubject.setText(copy);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                rowCopy=0;
                units=0;
                totalUnits=0;
                first=0.0;
                second=0.0;
                total=0.0;
            EvalForm eval = new EvalForm();
            eval.setVisible(true);
            dispose();
               
            }
        });
        Form.rems.set(Main.marker, "Assessed");
        totSubject.setText(EvalForm.rowCopy+"");
        viewStudRecords();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        cityMalLabel = new javax.swing.JLabel();
        BSULabel = new javax.swing.JLabel();
        repPhLabel = new javax.swing.JLabel();
        logoBSU = new javax.swing.JLabel();
        assLabel = new javax.swing.JLabel();
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
        subP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        secP = new javax.swing.JPanel();
        nameP = new javax.swing.JPanel();
        noP = new javax.swing.JPanel();
        totalP = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        totSubject = new javax.swing.JLabel();
        feePanel = new javax.swing.JPanel();
        titlePanelAssesedFees = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        assesdLabel = new javax.swing.JLabel();
        feeP = new javax.swing.JPanel();
        priceP = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        secondLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        assesedLabel = new javax.swing.JLabel();
        backgroundLogoLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        proceedBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(990, 730));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(245, 248, 190));
        backPanel.setLayout(null);
        backPanel.add(logoLabel);
        logoLabel.setBounds(10, 11, 0, 107);

        cityMalLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cityMalLabel.setText("City of Malolos");
        backPanel.add(cityMalLabel);
        cityMalLabel.setBounds(450, 50, 155, 16);

        BSULabel.setFont(new java.awt.Font("Cloister Black", 0, 22)); // NOI18N
        BSULabel.setText("Bulacan State University");
        backPanel.add(BSULabel);
        BSULabel.setBounds(390, 20, 241, 38);

        repPhLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        repPhLabel.setText("Republic of the Philippines");
        backPanel.add(repPhLabel);
        repPhLabel.setBounds(420, 10, 155, 16);

        logoBSU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/bsulogoSmall.png"))); // NOI18N
        backPanel.add(logoBSU);
        logoBSU.setBounds(280, 10, 70, 80);

        assLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        assLabel.setText("ASSESMENT FORM");
        backPanel.add(assLabel);
        assLabel.setBounds(400, 80, 188, 26);

        genInfoPanel.setBackground(new java.awt.Color(245, 248, 190));
        genInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        genInfoPanel.setOpaque(false);
        genInfoPanel.setLayout(null);

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        nameLabel.setText("Name: Nierra, Bernie, W.");
        genInfoPanel.add(nameLabel);
        nameLabel.setBounds(50, 30, 270, 16);

        studNumLabel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        studNumLabel.setText("Student Num: 123456");
        genInfoPanel.add(studNumLabel);
        studNumLabel.setBounds(50, 10, 270, 16);

        genderLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        genderLabel.setText("Gender: Unknown");
        genInfoPanel.add(genderLabel);
        genderLabel.setBounds(700, 10, 140, 14);

        ageLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ageLabel.setText("Age: 18");
        genInfoPanel.add(ageLabel);
        ageLabel.setBounds(700, 30, 110, 20);

        collegeLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        collegeLabel.setText("College: College of Information And Communication Technology");
        genInfoPanel.add(collegeLabel);
        collegeLabel.setBounds(50, 50, 470, 16);

        semLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        semLabel.setText("Semester: ");
        genInfoPanel.add(semLabel);
        semLabel.setBounds(50, 70, 290, 16);

        yearLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        yearLabel.setText("Year Level: Always 1st");
        genInfoPanel.add(yearLabel);
        yearLabel.setBounds(700, 70, 230, 16);

        schoolYearLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        schoolYearLabel.setText("School Year: 2016-2017");
        genInfoPanel.add(schoolYearLabel);
        schoolYearLabel.setBounds(50, 90, 300, 14);

        curriLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        curriLabel.setText("Curriculum: ACT 2015");
        genInfoPanel.add(curriLabel);
        curriLabel.setBounds(700, 90, 230, 16);

        scholarLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        scholarLabel.setText("Scholarship:");
        genInfoPanel.add(scholarLabel);
        scholarLabel.setBounds(50, 110, 300, 16);

        statLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        statLabel.setText("Status: Irregular");
        genInfoPanel.add(statLabel);
        statLabel.setBounds(700, 110, 220, 16);

        secLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        secLabel.setText("Section:");
        genInfoPanel.add(secLabel);
        secLabel.setBounds(700, 50, 140, 20);

        backPanel.add(genInfoPanel);
        genInfoPanel.setBounds(10, 140, 970, 130);

        titlePanelStudGen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        studLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studLabel.setText("STUDENT GENERAL INFORMATION");
        titlePanelStudGen.add(studLabel);

        backPanel.add(titlePanelStudGen);
        titlePanelStudGen.setBounds(10, 110, 970, 30);

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
        titlePanelEnrolledSubj.setBounds(0, 0, 480, 30);

        subP.setOpaque(false);
        subjectPanel.add(subP);
        subP.setBounds(10, 80, 80, 230);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Section");
        subjectPanel.add(jLabel1);
        jLabel1.setBounds(400, 40, 80, 16);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Course Code");
        subjectPanel.add(jLabel2);
        jLabel2.setBounds(10, 40, 80, 16);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        subjectPanel.add(jLabel3);
        jLabel3.setBounds(170, 40, 80, 16);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("No. of Units");
        subjectPanel.add(jLabel4);
        jLabel4.setBounds(300, 40, 80, 16);

        secP.setOpaque(false);
        subjectPanel.add(secP);
        secP.setBounds(370, 70, 100, 230);

        nameP.setOpaque(false);
        subjectPanel.add(nameP);
        nameP.setBounds(90, 80, 210, 230);

        noP.setOpaque(false);
        subjectPanel.add(noP);
        noP.setBounds(320, 70, 40, 230);

        totalP.setOpaque(false);
        totalP.setLayout(null);
        totalP.add(jSeparator1);
        jSeparator1.setBounds(20, 8, 150, 2);

        jLabel12.setText("Total Unit(s):");
        totalP.add(jLabel12);
        jLabel12.setBounds(30, 20, 70, 14);

        tot.setText("jLabel6");
        totalP.add(tot);
        tot.setBounds(100, 20, 60, 14);

        subjectPanel.add(totalP);
        totalP.setBounds(240, 310, 190, 50);
        subjectPanel.add(jSeparator3);
        jSeparator3.setBounds(10, 60, 440, 2);
        subjectPanel.add(jSeparator4);
        jSeparator4.setBounds(50, 318, 170, 10);

        jLabel5.setText("Total Subject(s):");
        subjectPanel.add(jLabel5);
        jLabel5.setBounds(50, 330, 90, 14);

        totSubject.setText("jLabel6");
        subjectPanel.add(totSubject);
        totSubject.setBounds(150, 330, 34, 14);

        backPanel.add(subjectPanel);
        subjectPanel.setBounds(500, 280, 480, 360);

        feePanel.setBackground(new java.awt.Color(245, 248, 190));
        feePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        feePanel.setOpaque(false);
        feePanel.setLayout(null);

        titlePanelAssesedFees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        titlePanelAssesedFees.add(jLabel10);

        assesdLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        assesdLabel.setText("ASSESED FEES");
        titlePanelAssesedFees.add(assesdLabel);

        feePanel.add(titlePanelAssesedFees);
        titlePanelAssesedFees.setBounds(0, 0, 480, 30);

        feeP.setOpaque(false);
        feePanel.add(feeP);
        feeP.setBounds(10, 40, 360, 250);

        priceP.setOpaque(false);
        feePanel.add(priceP);
        priceP.setBounds(390, 40, 80, 250);

        panel.setOpaque(false);
        panel.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Second Payment: ");
        panel.add(jLabel6);
        jLabel6.setBounds(10, 30, 110, 20);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("First Payment: ");
        panel.add(jLabel9);
        jLabel9.setBounds(10, 10, 81, 20);

        firstLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstLabel.setText("First Payment: ");
        panel.add(firstLabel);
        firstLabel.setBounds(100, 10, 80, 20);
        panel.add(jSeparator2);
        jSeparator2.setBounds(10, 0, 430, 2);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Scholar:");
        panel.add(jLabel7);
        jLabel7.setBounds(200, 13, 90, 16);

        secondLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        secondLabel.setText("First Payment: ");
        panel.add(secondLabel);
        secondLabel.setBounds(120, 30, 80, 20);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setText("Total Payment:");
        panel.add(jLabel11);
        jLabel11.setBounds(200, 33, 90, 16);

        totalLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        totalLabel.setText("First Payment: ");
        panel.add(totalLabel);
        totalLabel.setBounds(293, 33, 150, 16);

        feePanel.add(panel);
        panel.setBounds(10, 300, 450, 60);

        backPanel.add(feePanel);
        feePanel.setBounds(10, 280, 480, 360);

        assesedLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        assesedLabel.setText("Assesed by:");
        backPanel.add(assesedLabel);
        assesedLabel.setBounds(10, 660, 480, 15);

        backgroundLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/bulsuRed.png"))); // NOI18N
        backPanel.add(backgroundLogoLabel);
        backgroundLogoLabel.setBounds(240, 160, 500, 501);

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cancelBtn.setText("Back");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        backPanel.add(cancelBtn);
        cancelBtn.setBounds(850, 660, 110, 30);

        proceedBtn.setBackground(new java.awt.Color(255, 255, 255));
        proceedBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        proceedBtn.setText("Proceed");
        proceedBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        backPanel.add(proceedBtn);
        proceedBtn.setBounds(730, 660, 110, 30);

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        Cashier cash = new Cashier();
        cash.setVisible(true);
        dispose();
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        rowCopy=0;
        units=0;
        totalUnits=0;
        first=0.0;
        second=0.0;
        total=0.0;
        EvalForm eval = new EvalForm();
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
            java.util.logging.Logger.getLogger(AssesmentPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssesmentPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssesmentPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssesmentPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssesmentPaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BSULabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel assLabel;
    private javax.swing.JLabel assesdLabel;
    private javax.swing.JLabel assesedLabel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel backgroundLogoLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel cityMalLabel;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JLabel curriLabel;
    private javax.swing.JLabel enLabel;
    private javax.swing.JPanel feeP;
    private javax.swing.JPanel feePanel;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JPanel genInfoPanel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logoBSU;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel nameP;
    private javax.swing.JPanel noP;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel priceP;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JLabel repPhLabel;
    private javax.swing.JLabel scholarLabel;
    private javax.swing.JLabel schoolYearLabel;
    private javax.swing.JLabel secLabel;
    private javax.swing.JPanel secP;
    private javax.swing.JLabel secondLabel;
    private javax.swing.JLabel semLabel;
    private javax.swing.JLabel statLabel;
    private javax.swing.JLabel studLabel;
    private javax.swing.JLabel studNumLabel;
    private javax.swing.JPanel subP;
    private javax.swing.JPanel subjectPanel;
    private javax.swing.JPanel titlePanelAssesedFees;
    private javax.swing.JPanel titlePanelEnrolledSubj;
    private javax.swing.JPanel titlePanelStudGen;
    private javax.swing.JLabel tot;
    private javax.swing.JLabel totSubject;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JPanel totalP;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
