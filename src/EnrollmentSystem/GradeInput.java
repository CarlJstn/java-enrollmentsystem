package EnrollmentSystem;

import static EnrollmentSystem.Form.IrregReg;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class GradeInput extends javax.swing.JFrame implements ActionListener{

    JLabel label[] = new JLabel[36];
    public static double studGrades[][] = new double[10000][36];
    public static JComboBox combo[] = new JComboBox[36];
    int markerT=0;
    public static String gradess[] = new String[]{"<Select Grade>","1.0","1.25","1.50","1.75","2.0","2.25","2.50","2.75","3.0","INC","5.0","DRP"};
    public GradeInput() {
        initComponents();
        this.setTitle("Add Grade");
        this.setLocationRelativeTo(null);
        try{
           Image image = new ImageIcon("bsulogo.png").getImage();
           this.setIconImage(image);
          }catch(Exception e){
              System.out.println("Appilcation icon not found");
          }
//        Evaluation e = new Evaluation();
//        e.setVisible(true);
//        e.dispose();
            addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we)
        { 
            StudentInfo s = new StudentInfo();
            s.setVisible(true);
            dispose();
         }
        });
        //StudentInfo s = new StudentInfo();
        //s.dispose();
        label[0] = new JLabel("General Psychology");
        label[1] = new JLabel("Study and Thinking Skills");
        label[2] = new JLabel("Sining ng Komunikasyong Pang-Akademiko");
        label[3] = new JLabel("College Algebra");
        label[4] = new JLabel("Philippine History and Government");
        label[5] = new JLabel("ICT Fundamentals");
        label[6] = new JLabel("Fundamentals of Programming Language");
        label[7] = new JLabel("Digital and Logic Circuits");
        label[8] = new JLabel("Physical Education I ");
        label[9] = new JLabel("ROTC/LTS/CWTS");
        label[10] = new JLabel("Oral Communication");
        label[11] = new JLabel("Pane Trigonometry");
        label[12] = new JLabel("Art Appreciation");
        label[13] = new JLabel("Pagbasa at Pagsulat Tungo sa Pananaliksik");
        label[14] = new JLabel("Discrete Structure");
        label[15] = new JLabel("Advanced Programming Language");
        label[16] = new JLabel("Data Structure and Algorithm");
        label[17] = new JLabel("Computer Hardware Fundamentals");
        label[18] = new JLabel("Physical Education II ");
        label[19] = new JLabel("ROTC/LTS/CWTS");
        label[20] = new JLabel("Philosophy of Man");
        label[21] = new JLabel("Technical Writing for ICT");
        label[22] = new JLabel("Database Management Systems");
        label[23] = new JLabel("Object Oriented Programming");
        label[24] = new JLabel("Multimedia and Web Design");
        label[25] = new JLabel("Computer System Organization");
        label[26] = new JLabel("Network and Communications");
        label[27] = new JLabel("Physical Education III");
        label[28] = new JLabel("Life and Works of Rizal");
        label[29] = new JLabel("Human Computer Interaction");
        label[30] = new JLabel("Systems Analysis and Design");
        label[31] = new JLabel("Code of Ethics of the ITEE Professionals");
        label[32] = new JLabel("Operating Principle and Applications");
        label[33] = new JLabel("Web Application Development");
        label[34] = new JLabel("Elective I");
        label[35] = new JLabel("Physical Education IV ");
        
        for(int x=0; x<36; x++)
        {
            combo[x]= new JComboBox();            
            for(int y=0; y<13; y++)
            {
            combo[x].addItem(gradess[y]);
            }
            combo[x].addActionListener(this);
        }
        
        for(int c=0; c<10; c++)
        {
            namePanel.add(label[c]);
            gradePanel.add(combo[c]);
        }
        for(int c=10; c<20; c++)
        {
            namePanel2.add(label[c]);
            gradePanel2.add(combo[c]);
        }
        for(int c=20; c<28; c++)
        {
            namePanel3.add(label[c]);
            gradePanel3.add(combo[c]);
        }
        for(int c=28; c<36; c++)
        {
            namePanel4.add(label[c]);
            gradePanel4.add(combo[c]);
        }
        for(int c=0; c<10; c++)
        {
            codePanel.add(new JLabel(Main.codes[c]));
        }
        for(int c=10; c<20; c++)
        {
            codePanel2.add(new JLabel(Main.codes[c]));
        }
        for(int c=20; c<28; c++)
        {
            codePanel3.add(new JLabel(Main.codes[c]));
        }
        for(int c=28; c<36; c++)
        {
            codePanel4.add(new JLabel(Main.codes[c]));
        }
        codePanel.setLayout(new GridLayout(10,1));
        namePanel.setLayout(new GridLayout(10,1));
        gradePanel.setLayout(new GridLayout(10,1));
        codePanel2.setLayout(new GridLayout(10,1));
        namePanel2.setLayout(new GridLayout(10,1));
        gradePanel2.setLayout(new GridLayout(10,1));
        codePanel3.setLayout(new GridLayout(8,1));
        namePanel3.setLayout(new GridLayout(8,1));
        gradePanel3.setLayout(new GridLayout(8,1));
        codePanel4.setLayout(new GridLayout(8,1));
        namePanel4.setLayout(new GridLayout(8,1));
        gradePanel4.setLayout(new GridLayout(8,1));
        
        int year = 0;
        int sem = 0;
        int mark =0;
        if(Form.YearLev.get(Main.marker).equals("1st Year"))
        {
            year = 0;
        }
        else
        {
            year = 1;
        }
        if(Form.Semester.get(Main.marker).equals("1st Semester"))
        {
            sem = 0;
        }
        else
        {
            sem = 1;
        }
        
        for(int x=0; x<36; x++)
        {
            if(studGrades[Main.marker][x]==0.0)
            {
                combo[x].setSelectedIndex(0);
            }
            else if(studGrades[Main.marker][x]==1.0)
            {
                combo[x].setSelectedIndex(1);
            }
            else if(studGrades[Main.marker][x]==1.25)
            {
                combo[x].setSelectedIndex(2);
            }
            else if(studGrades[Main.marker][x]==1.50)
            {
                combo[x].setSelectedIndex(3);
            }
            else if(studGrades[Main.marker][x]==1.75)
            {
                combo[x].setSelectedIndex(4);
            }
            else if(studGrades[Main.marker][x]==2.0)
            {
                combo[x].setSelectedIndex(5);
            }
            else if(studGrades[Main.marker][x]==2.25)
            {
                combo[x].setSelectedIndex(6);
            }
              else if(studGrades[Main.marker][x]==2.50)
            {
                combo[x].setSelectedIndex(7);
            }
            else if(studGrades[Main.marker][x]==2.75)
            {
                combo[x].setSelectedIndex(8);
            }
            else if(studGrades[Main.marker][x]==3.0)
            {
                combo[x].setSelectedIndex(9);
            }
            else if(studGrades[Main.marker][x]==4.0)
            {
                combo[x].setSelectedIndex(10);
            }
            else if(studGrades[Main.marker][x]==5.0)
            {
                combo[x].setSelectedIndex(11);
            }
            else if(studGrades[Main.marker][x]==6.0)
            {
                combo[x].setSelectedIndex(12);
            }
            
        }
         if(Form.IrregReg.get(Main.marker).equals("Regular"))
       {
        if(year==0&&sem==0)
        {
            for(int x=10; x<36; x++)
            {
                combo[x].setEnabled(false);
            }
        }
        if(year==0&&sem==1)
        {
            
            for(int x=10; x<36; x++)
            {
                combo[x].setEnabled(false);
            }
        }
        if(year==1&&sem==0)
        {
            
            for(int x=20; x<36; x++)
            {
                combo[x].setEnabled(false);
            }
        }
        if(year==1&&sem==1)
        {
            
            for(int x=28; x<36; x++)
            {
                combo[x].setEnabled(false);
            }
        }
        if(Form.YearLev.get(Main.marker).toString().equals("Graduating") && Form.Semester.get(Main.marker).toString().equals("Graduating"))
        {
            for(int x=0; x<36; x++)
            {
                combo[x].setEnabled(true);
                markerT=1;
            }
            
        }
       
       }
         if(Form.IrregReg.get(Main.marker).toString().equals("Irregular"))
        {
       int mark1=0; 
       int mark2=0;
            if(studGrades[Main.marker][3]==0.0 || studGrades[Main.marker][3]==5.0 || studGrades[Main.marker][3]==6.0)
            {
                combo[14].setEnabled(false);
                combo[14].setSelectedIndex(0);
            }
            else
            {
                combo[14].setEnabled(true);
            }
            if(studGrades[Main.marker][6]==0.0 || studGrades[Main.marker][6]==5.0 || studGrades[Main.marker][6]==6.0)
            {
                combo[15].setEnabled(false);
                combo[16].setEnabled(false);
                combo[15].setSelectedIndex(0);
                combo[16].setSelectedIndex(0);
            }
            else
            {
                combo[15].setEnabled(true);
                combo[16].setEnabled(true);
            }
            if(studGrades[Main.marker][7]==0.0 || studGrades[Main.marker][7]==5.0 || studGrades[Main.marker][7]==6.0)
            {
                combo[17].setEnabled(false);
                combo[25].setEnabled(false);
                combo[17].setSelectedIndex(0);
                combo[25].setSelectedIndex(0);
            }
            else
            {
                combo[17].setEnabled(true);
                combo[25].setEnabled(true);
            }
            if(studGrades[Main.marker][9]==0.0 || studGrades[Main.marker][9]==5.0 || studGrades[Main.marker][9]==6.0)
            {
                combo[19].setEnabled(false);
                combo[19].setSelectedIndex(0);
            }
            else
            {
                combo[19].setEnabled(true);
            }
            if(studGrades[Main.marker][15]==0.0 || studGrades[Main.marker][15]==5.0 || studGrades[Main.marker][15]==6.0)
            {
                mark1=0;
            }
            else
            {
                mark1=1;
            }
            if(studGrades[Main.marker][16]==0.0 || studGrades[Main.marker][16]==5.0 || studGrades[Main.marker][16]==6.0)
            {
                mark2=0;
            }
            else
            {
                mark2=1;
            }
            if(mark1==1 && mark2==1)
            {
                combo[22].setEnabled(true);
                combo[23].setEnabled(true);
            }
            else
            {
                combo[22].setEnabled(false);
                combo[23].setEnabled(false);
                combo[22].setSelectedIndex(0);
                combo[23].setSelectedIndex(0);
            }
            
            if(studGrades[Main.marker][5]==0.0 || studGrades[Main.marker][5]==5.0 || studGrades[Main.marker][5]==6.0)
            {
                combo[24].setEnabled(false);
                combo[24].setSelectedIndex(0);
            }
            else
            {
                combo[24].setEnabled(true);
            }
            if(studGrades[Main.marker][17]==0.0 || studGrades[Main.marker][17]==5.0 || studGrades[Main.marker][17]==6.0)
            {
                combo[26].setEnabled(false);
                combo[26].setSelectedIndex(0);
            }
            else
            {
                combo[26].setEnabled(true);
            }
            if(studGrades[Main.marker][25]==0.0 || studGrades[Main.marker][25]==5.0 || studGrades[Main.marker][25]==6.0)
            {
                combo[29].setEnabled(false);
                combo[29].setSelectedIndex(0);
            }
            else
            {
                combo[29].setEnabled(true);
            }
            int mark3=0;
            int mark4=0;
            if(studGrades[Main.marker][22]==0.0 || studGrades[Main.marker][22]==5.0 || studGrades[Main.marker][22]==6.0)
            {
                mark3=0;
            }
            else
            {
                mark3=1;
            }
            if(studGrades[Main.marker][23]==0.0 || studGrades[Main.marker][23]==5.0 || studGrades[Main.marker][23]==6.0)
            {
                mark4=0;
            }
            else
            {
                mark4=1;
            }
            if(mark3==1 && mark4==1)
            {
                combo[30].setEnabled(true);
                System.out.println("tama");
            }
            else
            {
                combo[30].setEnabled(false);
                combo[30].setSelectedIndex(0);
                System.out.println("male");
            }
            if(studGrades[Main.marker][26]==0.0 || studGrades[Main.marker][26]==5.0 || studGrades[Main.marker][26]==6.0)
            {
                combo[32].setEnabled(false);
                combo[32].setSelectedIndex(0);
            }
            else
            {
                combo[32].setEnabled(true);
            }
            if(studGrades[Main.marker][24]==0.0 || studGrades[Main.marker][24]==5.0 || studGrades[Main.marker][24]==6.0)
            {
                combo[33].setEnabled(false);
                combo[33].setSelectedIndex(0);
            }
            else
            {
                combo[33].setEnabled(true);
            }
        }  
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studInfoLabel = new javax.swing.JLabel();
        blackPanelDesign = new javax.swing.JPanel();
        grayPanelDesign = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codePanel = new javax.swing.JPanel();
        namePanel = new javax.swing.JPanel();
        gradePanel = new javax.swing.JPanel();
        encodeBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        namePanel2 = new javax.swing.JPanel();
        gradePanel2 = new javax.swing.JPanel();
        codePanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        namePanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        codePanel3 = new javax.swing.JPanel();
        gradePanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        codePanel4 = new javax.swing.JPanel();
        namePanel4 = new javax.swing.JPanel();
        gradePanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        studInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        studInfoLabel.setText("Grades");
        jPanel1.add(studInfoLabel);
        studInfoLabel.setBounds(10, 0, 220, 50);

        blackPanelDesign.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(blackPanelDesign);
        blackPanelDesign.setBounds(0, 40, 820, 10);

        grayPanelDesign.setBackground(new java.awt.Color(255, 102, 51));
        jPanel1.add(grayPanelDesign);
        grayPanelDesign.setBounds(670, 50, 340, 10);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Subect Code");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 80, 90, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Subject Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 80, 160, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Grades");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 80, 60, 30);

        codePanel.setOpaque(false);

        javax.swing.GroupLayout codePanelLayout = new javax.swing.GroupLayout(codePanel);
        codePanel.setLayout(codePanelLayout);
        codePanelLayout.setHorizontalGroup(
            codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        codePanelLayout.setVerticalGroup(
            codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(codePanel);
        codePanel.setBounds(10, 120, 90, 230);

        namePanel.setOpaque(false);

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(namePanel);
        namePanel.setBounds(110, 120, 230, 230);

        gradePanel.setOpaque(false);

        javax.swing.GroupLayout gradePanelLayout = new javax.swing.GroupLayout(gradePanel);
        gradePanel.setLayout(gradePanelLayout);
        gradePanelLayout.setHorizontalGroup(
            gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        gradePanelLayout.setVerticalGroup(
            gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(gradePanel);
        gradePanel.setBounds(350, 120, 140, 230);

        encodeBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        encodeBtn.setText("Encode");
        encodeBtn.setToolTipText("");
        encodeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(encodeBtn);
        encodeBtn.setBounds(900, 640, 100, 25);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Subect Code");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 80, 90, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("1st Year - 2nd Semester");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 350, 170, 19);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(500, 100, 5, 525);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 620, 1010, 5);

        namePanel2.setOpaque(false);

        javax.swing.GroupLayout namePanel2Layout = new javax.swing.GroupLayout(namePanel2);
        namePanel2.setLayout(namePanel2Layout);
        namePanel2Layout.setHorizontalGroup(
            namePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        namePanel2Layout.setVerticalGroup(
            namePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(namePanel2);
        namePanel2.setBounds(110, 370, 230, 240);

        gradePanel2.setOpaque(false);

        javax.swing.GroupLayout gradePanel2Layout = new javax.swing.GroupLayout(gradePanel2);
        gradePanel2.setLayout(gradePanel2Layout);
        gradePanel2Layout.setHorizontalGroup(
            gradePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        gradePanel2Layout.setVerticalGroup(
            gradePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(gradePanel2);
        gradePanel2.setBounds(350, 370, 140, 240);

        codePanel2.setOpaque(false);

        javax.swing.GroupLayout codePanel2Layout = new javax.swing.GroupLayout(codePanel2);
        codePanel2.setLayout(codePanel2Layout);
        codePanel2Layout.setHorizontalGroup(
            codePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        codePanel2Layout.setVerticalGroup(
            codePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(codePanel2);
        codePanel2.setBounds(10, 370, 90, 240);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("1st Year - 1st Semester");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 60, 160, 19);

        namePanel3.setOpaque(false);

        javax.swing.GroupLayout namePanel3Layout = new javax.swing.GroupLayout(namePanel3);
        namePanel3.setLayout(namePanel3Layout);
        namePanel3Layout.setHorizontalGroup(
            namePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        namePanel3Layout.setVerticalGroup(
            namePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(namePanel3);
        namePanel3.setBounds(620, 120, 230, 230);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("2nd Year - 1st Semester");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(520, 60, 160, 19);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Subect Code");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(520, 80, 90, 30);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Subject Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(680, 80, 160, 30);

        codePanel3.setOpaque(false);

        javax.swing.GroupLayout codePanel3Layout = new javax.swing.GroupLayout(codePanel3);
        codePanel3.setLayout(codePanel3Layout);
        codePanel3Layout.setHorizontalGroup(
            codePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        codePanel3Layout.setVerticalGroup(
            codePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(codePanel3);
        codePanel3.setBounds(520, 120, 90, 230);

        gradePanel3.setOpaque(false);

        javax.swing.GroupLayout gradePanel3Layout = new javax.swing.GroupLayout(gradePanel3);
        gradePanel3.setLayout(gradePanel3Layout);
        gradePanel3Layout.setHorizontalGroup(
            gradePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        gradePanel3Layout.setVerticalGroup(
            gradePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(gradePanel3);
        gradePanel3.setBounds(860, 120, 140, 230);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Grades");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(910, 80, 60, 30);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("2nd Year - 2nd Semester");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(520, 350, 170, 19);

        codePanel4.setOpaque(false);

        javax.swing.GroupLayout codePanel4Layout = new javax.swing.GroupLayout(codePanel4);
        codePanel4.setLayout(codePanel4Layout);
        codePanel4Layout.setHorizontalGroup(
            codePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        codePanel4Layout.setVerticalGroup(
            codePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(codePanel4);
        codePanel4.setBounds(520, 370, 90, 240);

        namePanel4.setOpaque(false);

        javax.swing.GroupLayout namePanel4Layout = new javax.swing.GroupLayout(namePanel4);
        namePanel4.setLayout(namePanel4Layout);
        namePanel4Layout.setHorizontalGroup(
            namePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        namePanel4Layout.setVerticalGroup(
            namePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(namePanel4);
        namePanel4.setBounds(620, 370, 230, 240);

        gradePanel4.setOpaque(false);

        javax.swing.GroupLayout gradePanel4Layout = new javax.swing.GroupLayout(gradePanel4);
        gradePanel4.setLayout(gradePanel4Layout);
        gradePanel4Layout.setHorizontalGroup(
            gradePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        gradePanel4Layout.setVerticalGroup(
            gradePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(gradePanel4);
        gradePanel4.setBounds(860, 370, 140, 240);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeBtnActionPerformed
        int year = 0;
        int sem = 0;
        int mark =0;
        int markF =0;
        if(markerT==0)
        {
        if(Form.YearLev.get(Main.marker).equals("1st Year"))
        {
            year = 0;
        }
        else
        {
            year = 1;
        }
        if(Form.Semester.get(Main.marker).equals("1st Semester"))
        {
            sem = 0;
        }
        else
        {
            sem = 1;
        }
        System.out.println(year+" - "+sem);
        
        if(Form.IrregReg.get(Main.marker).equals("Regular"))
        {
            if(year==0 && sem==0)
            {
                mark=0;
                for(int x=0; x<36; x++)
                {
                    if(combo[x].getSelectedIndex()==0)
                    {
                        studGrades[Main.marker][x]=0;
                        mark=1;
                    }
                    else if(combo[x].getSelectedIndex()==10)
                    {
                        studGrades[Main.marker][x]=4;
                        Main.remarks[Main.marker][x]="*";
                    }
                    else if(combo[x].getSelectedIndex()==11)
                    {
                        studGrades[Main.marker][x]=5;
                    }
                    else if(combo[x].getSelectedIndex()==12)
                    {
                        studGrades[Main.marker][x]=6;
                    }
                    else
                    {
                        double num = Double.parseDouble((String) combo[x].getSelectedItem());
                        studGrades[Main.marker][x] = num;
                        Main.remarks[Main.marker][x]="*";
                    }
                }
            }
            else if(year==0&&sem==1)
            {
                mark=0;
                for(int x=0; x<36; x++)
                {
                    if(combo[x].getSelectedIndex()==0)
                    {
                        studGrades[Main.marker][x]=0;
                        mark=1;
                    }
                    else if(combo[x].getSelectedIndex()==10)
                    {
                        studGrades[Main.marker][x]=4;
                        Main.remarks[Main.marker][x]="*";
                    }
                    else if(combo[x].getSelectedIndex()==11)
                    {
                        studGrades[Main.marker][x]=5;
                    }
                    else if(combo[x].getSelectedIndex()==12)
                    {
                        studGrades[Main.marker][x]=6;
                    }
                    else
                    {
                        double num = Double.parseDouble((String) combo[x].getSelectedItem());
                        studGrades[Main.marker][x] = num;
                        Main.remarks[Main.marker][x]="*";
                    }
                }  
            }
                else if(year==1&&sem==0)
                {
                mark=0;
                for(int x=0; x<36; x++)
                {
                    if(combo[x].getSelectedIndex()==0)
                    {
                        studGrades[Main.marker][x]=0;
                        mark=1;
                    }
                    else if(combo[x].getSelectedIndex()==10)
                    {
                        studGrades[Main.marker][x]=4;
                        Main.remarks[Main.marker][x]="*";
                    }
                    else if(combo[x].getSelectedIndex()==11)
                    {
                        studGrades[Main.marker][x]=5;
                    }
                    else if(combo[x].getSelectedIndex()==12)
                    {
                        studGrades[Main.marker][x]=6;
                    }
                    else
                    {
                        double num = Double.parseDouble((String) combo[x].getSelectedItem());
                        studGrades[Main.marker][x] = num;
                        Main.remarks[Main.marker][x]="*";
                    }
                }
                }
            else if(year==1&&sem==1)
                {
                mark=0;
                for(int x=0; x<36; x++)
                {
                    if(combo[x].getSelectedIndex()==0)
                    {
                        studGrades[Main.marker][x]=0;
                        mark=1;
                    }
                    else if(combo[x].getSelectedIndex()==10)
                    {
                        studGrades[Main.marker][x]=4;
                        Main.remarks[Main.marker][x]="*";
                    }
                    else if(combo[x].getSelectedIndex()==11)
                    {
                        studGrades[Main.marker][x]=5;
                    }
                    else if(combo[x].getSelectedIndex()==12)
                    {
                        studGrades[Main.marker][x]=6;
                    }
                    else
                    {
                        double num = Double.parseDouble((String) combo[x].getSelectedItem());
                        studGrades[Main.marker][x] = num;
                        Main.remarks[Main.marker][x]="*";
                    }
                }
                }
            
            if(year==0&&sem==1)
            {
                for(int x=0; x<10; x++)
                {
                    if(combo[x].getSelectedIndex()==0 || combo[x].getSelectedIndex()==11 || combo[x].getSelectedIndex()==12)
                    {
                        mark=1;
                        break;
                    }
                    else
                    {
                        mark=0;
                    }
                }
            }
            else if(year==1&&sem==0)
            {
                for(int x=0; x<20; x++)
                {
                    if(combo[x].getSelectedIndex()==0 || combo[x].getSelectedIndex()==11 || combo[x].getSelectedIndex()==12)
                    {
                        mark=1;
                        break;
                    }
                    else
                    {
                        mark=0;
                    }
                }
            }
            else if(year==1&&sem==1)
            {
                for(int x=0; x<28; x++)
                {
                    if(combo[x].getSelectedIndex()==0 || combo[x].getSelectedIndex()==11 || combo[x].getSelectedIndex()==12)
                    {
                        mark=1;
                        break;
                    }
                    else
                    {
                        mark=0;
                    }
                }
            }
            
            
            int marking=0;
            for(int x=0; x<36; x++)
            {
                if(combo[x].getSelectedIndex()==11 || combo[x].getSelectedIndex()==12)
                {
                    Main.remarks[Main.marker][x]="";
                    marking=1;
                }
            }
            
            if(marking==1)
            {
                IrregReg.set(Main.marker, "Irregular");
            }
            
             if(mark==1)
             {
               JOptionPane.showMessageDialog(null, "Some grades are missing but the other\nencoded grades will still be save");
             }
             else
             {
                Evaluation e = new Evaluation();
                e.setVisible(true);
                dispose();
             }
            
        }
        else
        {
            int ma=0;
            if(year==0 && sem==0)
            {
                for(int x=0; x<10; x++)
                {
                    if(combo[x].getSelectedIndex()==0 || combo[x].getSelectedIndex()==11 || combo[x].getSelectedIndex()==12)
                    {
                        ma=1;
                        break;
                    }
                    else
                    {
                        ma=0;
                    }
                }
            }
            else if(year==0 && sem==1)
            {
                for(int x=0; x<20; x++)
                {
                    if(combo[x].getSelectedIndex()==0 || combo[x].getSelectedIndex()==11 || combo[x].getSelectedIndex()==12)
                    {
                        ma=1;
                        break;
                    }
                    else
                    {
                        ma=0;
                    }
                }
            }
            else if(year==1 && sem==0)
            {
                for(int x=0; x<28; x++)
                {
                    if(combo[x].getSelectedIndex()==0 || combo[x].getSelectedIndex()==11 || combo[x].getSelectedIndex()==12)
                    {
                        ma=1;
                        break;
                    }
                    else
                    {
                        ma=0;
                    }
                }
            }
            
            if(ma==0)
            {
                Form.IrregReg.set(Main.marker, "Regular");
                if(year==0 && sem==0)
                {
                    Form.Semester.set(Main.marker, "2nd Semester");
                }
                else if(year==0 && sem==1)
                {
                    Form.YearLev.set(Main.marker, "2nd Year");
                    Form.Semester.set(Main.marker, "1st Semester");
                }
                else if(year==1 && sem==0)
                {
                    Form.Semester.set(Main.marker, "2nd Semester");
                }
            }
            int markk=0;
                for(int x=0; x<36; x++)
                {
                    if(combo[x].getSelectedIndex()==0)
                    {
                        studGrades[Main.marker][x]=0;
                    }
                    else if(combo[x].getSelectedIndex()==10)
                    {
                        studGrades[Main.marker][x]=4;
                        Main.remarks[Main.marker][x]="*";
                        markk=1;
                    }
                    else if(combo[x].getSelectedIndex()==11)
                    {
                        studGrades[Main.marker][x]=5;
                    }
                    else if(combo[x].getSelectedIndex()==12)
                    {
                        studGrades[Main.marker][x]=6;
                    }
                    else
                    {
                        double num = Double.parseDouble((String) combo[x].getSelectedItem());
                        studGrades[Main.marker][x] = num;
                        Main.remarks[Main.marker][x]="*";
                        markk=1;
                    }
                    System.out.println(Main.remarks[Main.marker][x]);
                }
                
                if(markk==1)
                {
                    Evaluation e = new Evaluation();
                e.setVisible(true);
                dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Some grades are missing but the other\nencoded grades will still be save");
                }
        }//ifirreg
        
        
//        
        }
        else if(markerT==1)
{
        if(Form.YearLev.get(Main.marker).toString().equals("Graduating") && Form.Semester.get(Main.marker).toString().equals("Graduating"))
        {
            for(int x=0; x<36; x++)
            {
                if(combo[x].getSelectedIndex()!=0&&combo[x].getSelectedIndex()!=10&&combo[x].getSelectedIndex()!=11&&combo[x].getSelectedIndex()!=12)
                {
                    markF++;
                   
                }
                
            }
            
        }
        if(markF==36)
        {
            for(int v=28; v<36; v++)
            {
                String temp = (String) combo[v].getSelectedItem();
                Double tempD = Double.parseDouble(temp);
                studGrades[Main.marker][v]= tempD;
            }
            Diploma d = new Diploma();
            d.setVisible(true);
            dispose();
            Form.IrregReg.set(Main.marker,"Graduated");
            Form.Semester.set(Main.marker,"Graduated");
        }
        else
        {
            markF=0;
            JOptionPane.showMessageDialog(null,"Need to finished and passed all subjects", "Graduate", JOptionPane.YES_NO_OPTION);
        }
        
      
}
    }//GEN-LAST:event_encodeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blackPanelDesign;
    private javax.swing.JPanel codePanel;
    private javax.swing.JPanel codePanel2;
    private javax.swing.JPanel codePanel3;
    private javax.swing.JPanel codePanel4;
    private javax.swing.JButton encodeBtn;
    private javax.swing.JPanel gradePanel;
    private javax.swing.JPanel gradePanel2;
    private javax.swing.JPanel gradePanel3;
    private javax.swing.JPanel gradePanel4;
    private javax.swing.JPanel grayPanelDesign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel namePanel;
    private javax.swing.JPanel namePanel2;
    private javax.swing.JPanel namePanel3;
    private javax.swing.JPanel namePanel4;
    private javax.swing.JLabel studInfoLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(Form.IrregReg.get(Main.marker).toString().equals("Irregular"))
        {
        if(ae.getSource().equals(combo[3]))
        {
            if(combo[3].getSelectedIndex()==0 || combo[3].getSelectedIndex()==11 || combo[3].getSelectedIndex()==12)
            {
                combo[14].setEnabled(false);
                combo[14].setSelectedIndex(0);
            }
            else
            {
                combo[14].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[6]))
        {
            if(combo[6].getSelectedIndex()==0 || combo[6].getSelectedIndex()==11 || combo[6].getSelectedIndex()==12)
            {
                combo[15].setEnabled(false);
                combo[16].setEnabled(false);
                combo[15].setSelectedIndex(0);
                combo[16].setSelectedIndex(0);
            }
            else
            {
                combo[15].setEnabled(true);
                combo[16].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[7]))
        {
            if(combo[7].getSelectedIndex()==0 || combo[7].getSelectedIndex()==11 || combo[7].getSelectedIndex()==12)
            {
                combo[17].setEnabled(false);
                combo[25].setEnabled(false);
                combo[17].setSelectedIndex(0);
                combo[25].setSelectedIndex(0);
            }
            else
            {
                combo[17].setEnabled(true);
                combo[25].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[9]))
        {
            if(combo[9].getSelectedIndex()==0 || combo[9].getSelectedIndex()==11 || combo[9].getSelectedIndex()==12)
            {
                combo[19].setEnabled(false);
                combo[19].setSelectedIndex(0);
            }
            else
            {
                combo[19].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[15]) || ae.getSource().equals(combo[16]))
        {
            int mark1=0,mark2=0;
            if(combo[15].getSelectedIndex()==0 || combo[15].getSelectedIndex()==11 || combo[15].getSelectedIndex()==12)
            {
                mark1=0;
            }
            else
            {
                mark1=1;
            }
            if(combo[16].getSelectedIndex()==0 || combo[16].getSelectedIndex()==11 || combo[16].getSelectedIndex()==12)
            {
                mark2=0;
            }
            else
            {
                mark2=1;
            }
            
            if(mark1==1 && mark2==1)
            {
                combo[22].setEnabled(true);
                combo[23].setEnabled(true);
                
            }
            else
            {
                combo[22].setEnabled(false);
                combo[23].setEnabled(false);
                combo[22].setSelectedIndex(0);
                combo[23].setSelectedIndex(0);
            }
        }
        if(ae.getSource().equals(combo[5]))
        {
            if(combo[5].getSelectedIndex()==0 || combo[5].getSelectedIndex()==11 || combo[5].getSelectedIndex()==12)
            {
                combo[24].setEnabled(false);
                combo[24].setSelectedIndex(0);
            }
            else
            {
                combo[24].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[17]))
        {
            if(combo[17].getSelectedIndex()==0 || combo[17].getSelectedIndex()==11 || combo[17].getSelectedIndex()==12)
            {
                combo[26].setEnabled(false);
                combo[26].setSelectedIndex(0);
            }
            else
            {
                combo[26].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[25]))
        {
            if(combo[25].getSelectedIndex()==0 || combo[25].getSelectedIndex()==11 || combo[25].getSelectedIndex()==12)
            {
                combo[29].setEnabled(false);
                combo[29].setSelectedIndex(0);
            }
            else
            {
                combo[29].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[23]) || ae.getSource().equals(combo[22]))
        {
            int mark1=0, mark2=0;
            if(combo[23].getSelectedIndex()==0 || combo[23].getSelectedIndex()==11 || combo[23].getSelectedIndex()==12)
            {
                mark1=0;
            }
            else
            {
                mark1=1;
            }
            if(combo[22].getSelectedIndex()==0 || combo[22].getSelectedIndex()==11 || combo[22].getSelectedIndex()==12)
            {
                mark2=0;
            }
            else
            {
                mark2=1;
            }
            if(mark1==1 && mark2==1)
            {
                combo[30].setEnabled(true);
            }
            else
            {
                combo[30].setEnabled(false);
                combo[30].setSelectedIndex(0);
            }
        }
        if(ae.getSource().equals(combo[26]))
        {
            if(combo[26].getSelectedIndex()==0 || combo[26].getSelectedIndex()==11 || combo[26].getSelectedIndex()==12)
            {
                combo[32].setEnabled(false);
                combo[32].setSelectedIndex(0);
            }
            else
            {
                combo[32].setEnabled(true);
            }
        }
        if(ae.getSource().equals(combo[24]))
        {
            if(combo[24].getSelectedIndex()==0 || combo[24].getSelectedIndex()==11 || combo[24].getSelectedIndex()==12)
            {
                combo[33].setEnabled(false);
                combo[33].setSelectedIndex(0);
            }
            else
            {
                combo[33].setEnabled(true);
            }
        }
        
        
    }
    }
}
