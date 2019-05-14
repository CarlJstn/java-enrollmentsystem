
package EnrollmentSystem;

import static EnrollmentSystem.Form.IrregReg;
import static EnrollmentSystem.Form.Scholar;
import static EnrollmentSystem.Form.StudFullName;
import static EnrollmentSystem.Form.StudNumber;
import static EnrollmentSystem.Form.YearLev;
import static EnrollmentSystem.GradeInput.combo;
import static EnrollmentSystem.GradeInput.studGrades;
import static EnrollmentSystem.Main.marker;
import static EnrollmentSystem.Main.viewStudRecords;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class Evaluation extends javax.swing.JFrame {
  
    
    int r=0;
        ArrayList courseCode1stsem1 = new ArrayList();
        ArrayList courseName1stsem1 = new ArrayList();
        ArrayList <Integer>noUnits1stsem1 = new ArrayList();
        ArrayList prereq1stsem1 = new ArrayList();
        
        ArrayList courseCode1stsem2 = new ArrayList();
        ArrayList courseName1stsem2 = new ArrayList();
        ArrayList <Integer>noUnits1stsem2 = new ArrayList();
        ArrayList prereq1stsem2 = new ArrayList();
        
        ArrayList courseCode2ndsem1 = new ArrayList();
        ArrayList courseName2ndsem1 = new ArrayList();
        ArrayList <Integer>noUnits2ndsem1 = new ArrayList();
        ArrayList prereq2ndsem1 = new ArrayList();
        
        ArrayList courseCode2ndsem2 = new ArrayList();
        ArrayList courseName2ndsem2 = new ArrayList();
        ArrayList <Integer>noUnits2ndsem2 = new ArrayList();
        ArrayList prereq2ndsem2 = new ArrayList();
        
        
        public static ArrayList CourseCode1stsem1 = new ArrayList();
        public static ArrayList CourseName1stsem1 = new ArrayList();
        public static ArrayList <Integer>NoUnits1stsem1 = new ArrayList();
        public static ArrayList Prereq1stsem1 = new ArrayList();
        
        public static ArrayList CourseCode1stsem2 = new ArrayList();
        public static ArrayList CourseName1stsem2 = new ArrayList();
        public static ArrayList <Integer>NoUnits1stsem2 = new ArrayList();
        public static ArrayList Prereq1stsem2 = new ArrayList();
        
        public static ArrayList CourseCode2ndsem1 = new ArrayList();
        public static ArrayList CourseName2ndsem1 = new ArrayList();
        public static ArrayList <Integer>NoUnits2ndsem1 = new ArrayList();
        public static ArrayList Prereq2ndsem1 = new ArrayList();
        
        public static ArrayList CourseCode2ndsem2 = new ArrayList();
        public static ArrayList CourseName2ndsem2 = new ArrayList();
        public static ArrayList <Integer>NoUnits2ndsem2 = new ArrayList();
        public static ArrayList Prereq2ndsem2 = new ArrayList();
        
       
        ArrayList ask = new ArrayList();
        
        boolean check1=true;
        boolean check2=true;
        boolean check3=true;
        boolean check4=true;
        public static int reg=0;
        int regmark=0;
        String tag="";
        int counter=0;
        int unit=0;
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
         
        public static ArrayList codeI = new ArrayList();
        public static int markerIrreg =0;
    public Evaluation() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        Main.m1=0;
        Main.m2=0;
        Main.m3=0;
        Main.m4=0;
        
        EvalForm e = new EvalForm();
        e.setVisible(true);
        e.dispose();
        
        studNoLabel.setText("Student Number: "+StudNumber.get(marker));
        studNameLabel.setText("Name: "+StudFullName.get(marker));
        scholarLabel.setText("Scholarship: "+Scholar.get(marker));
        statlabel.setText("Status: "+IrregReg.get(marker));
        yearLabel.setText("Year Level: "+YearLev.get(marker));
        semLabel.setText("Semester: "+Form.Semester.get(marker));
        secLabel.setText("Section: "+Form.Section.get(marker));
        
        evalLabel.setText("Evaluated by: "+Login.name.get(Login.logmark));
        
       if(IrregReg.get(marker).equals("Regular"))
       {
           regmark=1;
           if(YearLev.get(marker).equals("1st Year"))
            {
                if(Form.Semester.get(marker).equals("1st Semester"))
                {
                    reg=1;
                    check1=true;
                    check2=false;
                    check3=false;
                    check4=false;
                    totalLabel.setText("Total Units: 26");
                    subjT1stsem2.setEnabled(false);
                    subjT2ndsem2.setEnabled(false);
                    subjT2ndsem1.setEnabled(false);
                    
                    subjT1stsem2.setBackground(new Color(0,102,102));
                    subjT2ndsem2.setBackground(new Color(0,102,102));
                    subjT2ndsem1.setBackground(new Color(0,102,102));
                }
                else
                {
                    reg=2;
                    check1=true;
                    check2=true;
                    check3=false;
                    check4=false;
                    totalLabel.setText("Total Units: 26");
                    subjT1stsem1.setEnabled(false);
                    subjT2ndsem2.setEnabled(false);
                    subjT2ndsem1.setEnabled(false);
                    subjT1stsem1.setBackground(new Color(0,102,102));
                    subjT2ndsem2.setBackground(new Color(0,102,102));
                    subjT2ndsem1.setBackground(new Color(0,102,102));
                }
            }
           else
           {
               if(Form.Semester.get(marker).equals("1st Semester"))
                {
                    reg=3;
                    check1=true;
                    check2=true;
                    check3=true;
                    check4=false;
                    totalLabel.setText("Total Units: 23");
                    subjT1stsem1.setEnabled(false);
                    subjT1stsem2.setEnabled(false);
                    subjT2ndsem2.setEnabled(false);
                    
                    subjT1stsem1.setBackground(new Color(0,102,102));
                    subjT1stsem2.setBackground(new Color(0,102,102));
                    subjT2ndsem2.setBackground(new Color(0,102,102));
                }
                else
                {
                    reg=4;
                    check1=true;
                    check2=true;
                    check3=true;
                    check4=true;
                    totalLabel.setText("Total Units: 23");
                    subjT1stsem1.setEnabled(false);
                    subjT1stsem2.setEnabled(false);
                    subjT2ndsem1.setEnabled(false);
                    
                    subjT1stsem1.setBackground(new Color(0,102,102));
                    subjT1stsem2.setBackground(new Color(0,102,102));
                    subjT2ndsem1.setBackground(new Color(0,102,102));
                }
           }
           
       }
       else
       {
            check1=false;
            check2=false;
            check3=false;
            check4=false;
           regmark=2;
//           if(YearLev.get(marker).equals("1st Year"))
//            {
//                if(Form.Semester.get(marker).equals("1st Semester"))
//                {
//                    subjT1stsem2.setEnabled(false);
//                    subjT2ndsem2.setEnabled(false);
//                    subjT2ndsem1.setEnabled(false);
//                }
//                else
//                {
//                    subjT1stsem1.setEnabled(false);
//                    subjT2ndsem2.setEnabled(false);
//                    subjT2ndsem1.setEnabled(false);
//                }
//            }
//           else
//           {
//               if(Form.Semester.get(marker).equals("1st Semester"))
//                {
//                    
//                    subjT1stsem1.setEnabled(false);
//                    subjT1stsem2.setEnabled(false);
//                    subjT2ndsem2.setEnabled(false);
//                }
//                else
//                {
//                    subjT1stsem1.setEnabled(false);
//                    subjT1stsem2.setEnabled(false);
//                    subjT2ndsem1.setEnabled(false);
//                }
//           }
       }
        
        
        
        //1st year 1st sem
        courseCode1stsem1.add("Psych 113");
        courseCode1stsem1.add("Eng 113");
        courseCode1stsem1.add("Fil 113");
        courseCode1stsem1.add("Math 113");
        courseCode1stsem1.add("Soc Sci 113");
        courseCode1stsem1.add("ACT 113");
        courseCode1stsem1.add("ACT 133");
        courseCode1stsem1.add("ACT 153");
        courseCode1stsem1.add("PE 112");
        courseCode1stsem1.add("NSTP I");
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
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(3);
        noUnits1stsem1.add(2);
        noUnits1stsem1.add(0);
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        prereq1stsem1.add("none");
        //1st year 1st sem
        
        //1st year 2nd sem
        courseCode1stsem2.add("Eng 123");
        courseCode1stsem2.add("Math 123");
        courseCode1stsem2.add("Hum 123");
        courseCode1stsem2.add("Fil 123");
        courseCode1stsem2.add("ACT 103");
        courseCode1stsem2.add("ACT 123");
        courseCode1stsem2.add("ACT 143");
        courseCode1stsem2.add("ACT 163");
        courseCode1stsem2.add("PE 122");
        courseCode1stsem2.add("NSTP 2");
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
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(3);
        noUnits1stsem2.add(2);
        noUnits1stsem2.add(0);
        prereq1stsem2.add("none");
        prereq1stsem2.add("none");
        prereq1stsem2.add("none");
        prereq1stsem2.add("none");
        prereq1stsem2.add("Math 113");
        prereq1stsem2.add("ACT 133");
        prereq1stsem2.add("ACT 133");
        prereq1stsem2.add("ACT 153");
        prereq1stsem2.add("none");
        prereq1stsem2.add("NSTP 1");
        //1st year 2nd sem
        //2nd year 1st sem
        courseCode2ndsem1.add("Philo 213");
        courseCode2ndsem1.add("Eng 213");
        courseCode2ndsem1.add("ACT 213");
        courseCode2ndsem1.add("ACT 233");
        courseCode2ndsem1.add("ACT 253");
        courseCode2ndsem1.add("ACT 273");
        courseCode2ndsem1.add("ACT 293");
        courseCode2ndsem1.add("PE 212");
        courseName2ndsem1.add("Philosophy of Man");
        courseName2ndsem1.add("Technical Writing for ICT");
        courseName2ndsem1.add("Database Management Systems");
        courseName2ndsem1.add("Object Oriented Programming");
        courseName2ndsem1.add("Multimedia and Web Design");
        courseName2ndsem1.add("Computer System Organization");
        courseName2ndsem1.add("Network and Communications");
        courseName2ndsem1.add("Physical Education III");
        noUnits2ndsem1.add(3);
        noUnits2ndsem1.add(3);
        noUnits2ndsem1.add(3);
        noUnits2ndsem1.add(3);
        noUnits2ndsem1.add(3);
        noUnits2ndsem1.add(3);
        noUnits2ndsem1.add(3);
        noUnits2ndsem1.add(2);
        prereq2ndsem1.add("none");
        prereq2ndsem1.add("none");
        prereq2ndsem1.add("ACT 123, ACT 143 ");
        prereq2ndsem1.add("ACT 123, ACT 143");
        prereq2ndsem1.add("ACT 113 ");
        prereq2ndsem1.add("ACT 153 ");
        prereq2ndsem1.add("ACT 163 ");
        prereq2ndsem1.add("none");
        //2nd year 1st sem
        
        //2nd year 1st sem
        courseCode2ndsem2.add("Soc Sci 223");
        courseCode2ndsem2.add("ACT 203");
        courseCode2ndsem2.add("ACT 223");
        courseCode2ndsem2.add("ACT 243");
        courseCode2ndsem2.add("ACT 263");
        courseCode2ndsem2.add("ACT 283A");
        courseCode2ndsem2.add("ACT 283B");
        courseCode2ndsem2.add("PE 222");
        courseName2ndsem2.add("Life and Works of Rizal");
        courseName2ndsem2.add("Human Computer Interaction");
        courseName2ndsem2.add("Systems Analysis and Design");
        courseName2ndsem2.add("Code of Ethics of the ITEE Professionals");
        courseName2ndsem2.add("Operating Principle and Applications");
        courseName2ndsem2.add("Web Application Development");
        courseName2ndsem2.add("Elective I");
        courseName2ndsem2.add("Physical Education IV");
        noUnits2ndsem2.add(3);
        noUnits2ndsem2.add(3);
        noUnits2ndsem2.add(3);
        noUnits2ndsem2.add(3);
        noUnits2ndsem2.add(3);
        noUnits2ndsem2.add(3);
        noUnits2ndsem2.add(3);
        noUnits2ndsem2.add(2);
        prereq2ndsem2.add("none");
        prereq2ndsem2.add("ACT 273");
        prereq2ndsem2.add("ACT 233, ACT 213");
        prereq2ndsem2.add("none");
        prereq2ndsem2.add("ACT 293");
        prereq2ndsem2.add("ACT 253");
        prereq2ndsem2.add("none");
        prereq2ndsem2.add("none");
        //2nd year 1st sem
        
        tableP1stsem1.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"First Year\n " +
"1st Semester", TitledBorder.CENTER, TitledBorder.CENTER, new Font("Century Gothic",Font.BOLD,15), Color.black));
        
        
        tableP1stsem2.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"First Year\n " +
"2nd Semester", TitledBorder.CENTER, TitledBorder.CENTER, new Font("Century Gothic",Font.BOLD,15), Color.black));
        
        tableP2ndsem2.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Second Year\n " +
"2nd Semester", TitledBorder.CENTER, TitledBorder.CENTER, new Font("Century Gothic",Font.BOLD,15), Color.black));
        
        tableP2ndsem1.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Second Year\n " +
"1st Semester", TitledBorder.CENTER, TitledBorder.CENTER, new Font("Century Gothic",Font.BOLD,15), Color.black));
       
        //Scroll.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Associate in Computer Technology CHECKLIST OF SUBJECTS", TitledBorder.CENTER, TitledBorder.CENTER, new Font("Century Gothic",Font.BOLD,15), Color.black));
       
        infoP.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Student Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Century Gothic",Font.PLAIN,15), Color.black));
        Scroll.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"CHECKLIST OF SUBJECTS", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Century Gothic",Font.PLAIN,15), Color.black));
       
        subjT1stsem1.setSelectionBackground(Color.blue);
        subjT1stsem2.setSelectionBackground(Color.blue);
        subjT2ndsem1.setSelectionBackground(Color.blue);
        subjT2ndsem2.setSelectionBackground(Color.blue);
        
        
        
        CourseCode1stsem1 = courseCode1stsem1;
        CourseName1stsem1 = courseName1stsem1;
        NoUnits1stsem1 = noUnits1stsem1;
        Prereq1stsem1 = prereq1stsem1;
        
        CourseCode1stsem2 = courseCode1stsem2;
        CourseName1stsem2 = courseName1stsem2;
        NoUnits1stsem2 = noUnits1stsem2;
        Prereq1stsem2 = prereq1stsem2;
        
        CourseCode2ndsem1 = courseCode2ndsem1;
        CourseName2ndsem1 = courseName2ndsem1;
        NoUnits2ndsem1 = noUnits2ndsem1;
        Prereq2ndsem1 = prereq2ndsem1;
        
        CourseCode2ndsem2 = courseCode2ndsem2;
        CourseName2ndsem2 = courseName2ndsem2;
        NoUnits2ndsem2 = noUnits2ndsem2;
        Prereq2ndsem2 = prereq2ndsem2;
        
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                StudentInfo eval = new StudentInfo();
            eval.setVisible(true);
            dispose();
               
            }
        });
      
        
        
            viewRecords1stsem1();
            viewRecords1stsem2();
            viewRecords2ndsem1();
            viewRecords2ndsem2();
    }
    
    void viewRecords1stsem1()
    {
        DefaultTableModel model = (DefaultTableModel) subjT1stsem1.getModel();
        Object rowData[] = new Object[6];
        int v=0;
        for(int x=0; x<courseCode1stsem1.size(); x++)
        {
            
            rowData[1] = courseCode1stsem1.get(x);
            rowData[2] = courseName1stsem1.get(x);
            rowData[3] = noUnits1stsem1.get(x);
            rowData[4] = prereq1stsem1.get(x);
           
            if(Main.remarks[Main.marker][v].equals("*"))
            {
                rowData[5]= "Taken";
                rowData[0] = false;
            }
            else
            {
                rowData[0] = check1;
                rowData[5]= "Not Taken";
            }
            
            v++;
            System.out.println(x+" "+Main.remarks[Main.marker][x]);
            model.addRow(rowData);
        }
        
        subjT1stsem1.setModel(model);
    }
    void viewRecords1stsem2()
    {
        DefaultTableModel model = (DefaultTableModel) subjT1stsem2.getModel();
        Object rowData[] = new Object[6];
        int v=10;
        for(int x=0; x<courseCode1stsem2.size(); x++)
        {
            
            rowData[1] = courseCode1stsem2.get(x);
            rowData[2] = courseName1stsem2.get(x);
            rowData[3] = noUnits1stsem2.get(x);
            rowData[4] = prereq1stsem2.get(x);
            
            if(Main.remarks[Main.marker][v].equals("*"))
            {
                rowData[5]= "Taken";
                rowData[0] = false;
            }
            else
            {
                rowData[0] = check2;
                rowData[5]= "Not Taken";
            }
            v++;
            
            model.addRow(rowData);
        }
        subjT1stsem2.setModel(model);
    }
    void viewRecords2ndsem1()
    {
        DefaultTableModel model = (DefaultTableModel) subjT2ndsem1.getModel();
        Object rowData[] = new Object[6];
        int v=20;
        for(int x=0; x<courseCode2ndsem1.size(); x++)
        {
            
            rowData[1] = courseCode2ndsem1.get(x);
            rowData[2] = courseName2ndsem1.get(x);
            rowData[3] = noUnits2ndsem1.get(x);
            rowData[4] = prereq2ndsem1.get(x);
            if(Main.remarks[Main.marker][v].equals("*"))
            {
                rowData[5]= "Taken";
                rowData[0] = false;
            }
            else
            {
                rowData[0] = check3;
                rowData[5]= "Not Taken";
            }
            v++;
            model.addRow(rowData);
        }
        subjT2ndsem1.setModel(model);
    }
    void viewRecords2ndsem2()
    {
        DefaultTableModel model = (DefaultTableModel) subjT2ndsem2.getModel();
        Object rowData[] = new Object[6];
        int v=28;
        for(int x=0; x<courseCode2ndsem2.size(); x++)
        {
            
            rowData[1] = courseCode2ndsem2.get(x);
            rowData[2] = courseName2ndsem2.get(x);
            rowData[3] = noUnits2ndsem2.get(x);
            rowData[4] = prereq2ndsem2.get(x);
            if(Main.remarks[Main.marker][v].equals("*"))
            {
                rowData[5]= "Taken";
                rowData[0] = false;
            }
            else
            {
                rowData[0] = check4;
                rowData[5]= "Not Taken";
            }
            v++;
            model.addRow(rowData);
        }
        subjT2ndsem2.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whiteP = new javax.swing.JPanel();
        Scroll = new javax.swing.JScrollPane();
        subjP = new javax.swing.JPanel();
        tableP1stsem1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjT1stsem1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tableP1stsem2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        subjT1stsem2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tableP2ndsem1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        subjT2ndsem1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tableP2ndsem2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        subjT2ndsem2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        studInfoLabel = new javax.swing.JLabel();
        blackPanelDesign = new javax.swing.JPanel();
        grayPanelDesign = new javax.swing.JPanel();
        infoP = new javax.swing.JPanel();
        imgP = new javax.swing.JPanel();
        studNoLabel = new javax.swing.JLabel();
        studNameLabel = new javax.swing.JLabel();
        collegeLabel = new javax.swing.JLabel();
        secLabel = new javax.swing.JLabel();
        schoolYearLabel1 = new javax.swing.JLabel();
        scholarLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        currLabel = new javax.swing.JLabel();
        statlabel = new javax.swing.JLabel();
        semLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        evalLabel = new javax.swing.JLabel();
        backLogoLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Evaluation");
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(670, 680));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        whiteP.setBackground(new java.awt.Color(255, 255, 255));
        whiteP.setPreferredSize(new java.awt.Dimension(800, 700));
        whiteP.setLayout(null);

        Scroll.setBackground(new java.awt.Color(255, 255, 255));
        Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scroll.setOpaque(false);

        subjP.setBackground(new java.awt.Color(255, 255, 255));

        tableP1stsem1.setBackground(new java.awt.Color(255, 255, 255));
        tableP1stsem1.setOpaque(false);

        subjT1stsem1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Course Code", "Discriptive Title", "Total Units", "Pre-Requisite ", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subjT1stsem1.setToolTipText("");
        subjT1stsem1.getTableHeader().setReorderingAllowed(false);
        subjT1stsem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subjT1stsem1MouseReleased(evt);
            }
        });
        subjT1stsem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjT1stsem1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjT1stsem1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(subjT1stsem1);
        if (subjT1stsem1.getColumnModel().getColumnCount() > 0) {
            subjT1stsem1.getColumnModel().getColumn(0).setMaxWidth(20);
            subjT1stsem1.getColumnModel().getColumn(1).setMinWidth(90);
            subjT1stsem1.getColumnModel().getColumn(1).setPreferredWidth(90);
            subjT1stsem1.getColumnModel().getColumn(1).setMaxWidth(100);
            subjT1stsem1.getColumnModel().getColumn(2).setMinWidth(200);
            subjT1stsem1.getColumnModel().getColumn(2).setPreferredWidth(300);
            subjT1stsem1.getColumnModel().getColumn(2).setMaxWidth(200);
            subjT1stsem1.getColumnModel().getColumn(3).setMinWidth(90);
            subjT1stsem1.getColumnModel().getColumn(3).setMaxWidth(90);
            subjT1stsem1.getColumnModel().getColumn(4).setMinWidth(90);
            subjT1stsem1.getColumnModel().getColumn(4).setMaxWidth(90);
            subjT1stsem1.getColumnModel().getColumn(5).setMinWidth(90);
            subjT1stsem1.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setText("Total");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setText("26");

        javax.swing.GroupLayout tableP1stsem1Layout = new javax.swing.GroupLayout(tableP1stsem1);
        tableP1stsem1.setLayout(tableP1stsem1Layout);
        tableP1stsem1Layout.setHorizontalGroup(
            tableP1stsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP1stsem1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tableP1stsem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        tableP1stsem1Layout.setVerticalGroup(
            tableP1stsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP1stsem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableP1stsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tableP1stsem2.setBackground(new java.awt.Color(255, 255, 255));
        tableP1stsem2.setOpaque(false);

        subjT1stsem2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Course Code", "Discriptive Title", "Total Units", "Pre-Requisite ", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subjT1stsem2.setToolTipText("");
        subjT1stsem2.getTableHeader().setReorderingAllowed(false);
        subjT1stsem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subjT1stsem2MouseReleased(evt);
            }
        });
        subjT1stsem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjT1stsem2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjT1stsem2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(subjT1stsem2);
        if (subjT1stsem2.getColumnModel().getColumnCount() > 0) {
            subjT1stsem2.getColumnModel().getColumn(0).setMaxWidth(20);
            subjT1stsem2.getColumnModel().getColumn(1).setMinWidth(90);
            subjT1stsem2.getColumnModel().getColumn(1).setPreferredWidth(90);
            subjT1stsem2.getColumnModel().getColumn(1).setMaxWidth(100);
            subjT1stsem2.getColumnModel().getColumn(2).setMinWidth(200);
            subjT1stsem2.getColumnModel().getColumn(2).setPreferredWidth(300);
            subjT1stsem2.getColumnModel().getColumn(2).setMaxWidth(200);
            subjT1stsem2.getColumnModel().getColumn(3).setMinWidth(90);
            subjT1stsem2.getColumnModel().getColumn(3).setMaxWidth(90);
            subjT1stsem2.getColumnModel().getColumn(4).setMinWidth(90);
            subjT1stsem2.getColumnModel().getColumn(4).setMaxWidth(90);
            subjT1stsem2.getColumnModel().getColumn(5).setMinWidth(90);
            subjT1stsem2.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setText("Total");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setText("26");

        javax.swing.GroupLayout tableP1stsem2Layout = new javax.swing.GroupLayout(tableP1stsem2);
        tableP1stsem2.setLayout(tableP1stsem2Layout);
        tableP1stsem2Layout.setHorizontalGroup(
            tableP1stsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP1stsem2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tableP1stsem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        tableP1stsem2Layout.setVerticalGroup(
            tableP1stsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP1stsem2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tableP1stsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        tableP2ndsem1.setBackground(new java.awt.Color(255, 255, 255));
        tableP2ndsem1.setOpaque(false);
        tableP2ndsem1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tableP2ndsem1MouseMoved(evt);
            }
        });

        subjT2ndsem1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Course Code", "Discriptive Title", "Total Units", "Pre-Requisite ", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subjT2ndsem1.setToolTipText("");
        subjT2ndsem1.getTableHeader().setReorderingAllowed(false);
        subjT2ndsem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subjT2ndsem1MouseReleased(evt);
            }
        });
        subjT2ndsem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjT2ndsem1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjT2ndsem1KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(subjT2ndsem1);
        if (subjT2ndsem1.getColumnModel().getColumnCount() > 0) {
            subjT2ndsem1.getColumnModel().getColumn(0).setMaxWidth(20);
            subjT2ndsem1.getColumnModel().getColumn(1).setMinWidth(90);
            subjT2ndsem1.getColumnModel().getColumn(1).setPreferredWidth(90);
            subjT2ndsem1.getColumnModel().getColumn(1).setMaxWidth(100);
            subjT2ndsem1.getColumnModel().getColumn(2).setMinWidth(200);
            subjT2ndsem1.getColumnModel().getColumn(2).setPreferredWidth(300);
            subjT2ndsem1.getColumnModel().getColumn(2).setMaxWidth(200);
            subjT2ndsem1.getColumnModel().getColumn(3).setMinWidth(90);
            subjT2ndsem1.getColumnModel().getColumn(3).setMaxWidth(90);
            subjT2ndsem1.getColumnModel().getColumn(4).setMinWidth(90);
            subjT2ndsem1.getColumnModel().getColumn(4).setMaxWidth(90);
            subjT2ndsem1.getColumnModel().getColumn(5).setMinWidth(90);
            subjT2ndsem1.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setText("Total");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setText("23");

        javax.swing.GroupLayout tableP2ndsem1Layout = new javax.swing.GroupLayout(tableP2ndsem1);
        tableP2ndsem1.setLayout(tableP2ndsem1Layout);
        tableP2ndsem1Layout.setHorizontalGroup(
            tableP2ndsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP2ndsem1Layout.createSequentialGroup()
                .addGroup(tableP2ndsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableP2ndsem1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(tableP2ndsem1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tableP2ndsem1Layout.setVerticalGroup(
            tableP2ndsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP2ndsem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableP2ndsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableP2ndsem2.setBackground(new java.awt.Color(255, 255, 255));
        tableP2ndsem2.setOpaque(false);

        subjT2ndsem2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Course Code", "Discriptive Title", "Total Units", "Pre-Requisite ", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subjT2ndsem2.setToolTipText("");
        subjT2ndsem2.getTableHeader().setReorderingAllowed(false);
        subjT2ndsem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subjT2ndsem2MouseReleased(evt);
            }
        });
        subjT2ndsem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjT2ndsem2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjT2ndsem2KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(subjT2ndsem2);
        if (subjT2ndsem2.getColumnModel().getColumnCount() > 0) {
            subjT2ndsem2.getColumnModel().getColumn(0).setMaxWidth(20);
            subjT2ndsem2.getColumnModel().getColumn(1).setMinWidth(90);
            subjT2ndsem2.getColumnModel().getColumn(1).setPreferredWidth(90);
            subjT2ndsem2.getColumnModel().getColumn(1).setMaxWidth(100);
            subjT2ndsem2.getColumnModel().getColumn(2).setMinWidth(200);
            subjT2ndsem2.getColumnModel().getColumn(2).setPreferredWidth(300);
            subjT2ndsem2.getColumnModel().getColumn(2).setMaxWidth(200);
            subjT2ndsem2.getColumnModel().getColumn(3).setMinWidth(90);
            subjT2ndsem2.getColumnModel().getColumn(3).setMaxWidth(90);
            subjT2ndsem2.getColumnModel().getColumn(4).setMinWidth(90);
            subjT2ndsem2.getColumnModel().getColumn(4).setMaxWidth(90);
            subjT2ndsem2.getColumnModel().getColumn(5).setMinWidth(90);
            subjT2ndsem2.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel10.setText("23");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel11.setText("Total");

        javax.swing.GroupLayout tableP2ndsem2Layout = new javax.swing.GroupLayout(tableP2ndsem2);
        tableP2ndsem2.setLayout(tableP2ndsem2Layout);
        tableP2ndsem2Layout.setHorizontalGroup(
            tableP2ndsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP2ndsem2Layout.createSequentialGroup()
                .addGroup(tableP2ndsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableP2ndsem2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(tableP2ndsem2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tableP2ndsem2Layout.setVerticalGroup(
            tableP2ndsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableP2ndsem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableP2ndsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout subjPLayout = new javax.swing.GroupLayout(subjP);
        subjP.setLayout(subjPLayout);
        subjPLayout.setHorizontalGroup(
            subjPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subjPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableP1stsem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableP2ndsem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableP2ndsem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableP1stsem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        subjPLayout.setVerticalGroup(
            subjPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableP1stsem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableP1stsem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableP2ndsem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableP2ndsem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Scroll.setViewportView(subjP);

        whiteP.add(Scroll);
        Scroll.setBounds(20, 280, 614, 270);

        studInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        studInfoLabel.setText("Evaluate Student");
        whiteP.add(studInfoLabel);
        studInfoLabel.setBounds(10, 0, 220, 50);

        blackPanelDesign.setBackground(new java.awt.Color(0, 0, 0));
        whiteP.add(blackPanelDesign);
        blackPanelDesign.setBounds(0, 40, 500, 10);

        grayPanelDesign.setBackground(new java.awt.Color(255, 102, 51));
        whiteP.add(grayPanelDesign);
        grayPanelDesign.setBounds(420, 50, 250, 10);

        infoP.setBackground(new java.awt.Color(255, 255, 255));
        infoP.setOpaque(false);
        infoP.setLayout(null);

        imgP.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout imgPLayout = new javax.swing.GroupLayout(imgP);
        imgP.setLayout(imgPLayout);
        imgPLayout.setHorizontalGroup(
            imgPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imgPLayout.setVerticalGroup(
            imgPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        infoP.add(imgP);
        imgP.setBounds(18, 41, 100, 100);

        studNoLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        studNoLabel.setText("Student  Number: ");
        infoP.add(studNoLabel);
        studNoLabel.setBounds(140, 40, 230, 19);

        studNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        studNameLabel.setText("Name: ");
        infoP.add(studNameLabel);
        studNameLabel.setBounds(140, 60, 230, 19);

        collegeLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        collegeLabel.setText("College: College of Information and Communication Technology");
        infoP.add(collegeLabel);
        collegeLabel.setBounds(140, 100, 450, 19);

        secLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        secLabel.setText("Section:");
        infoP.add(secLabel);
        secLabel.setBounds(140, 80, 220, 20);

        schoolYearLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        schoolYearLabel1.setText("School Year: 2016-2017");
        infoP.add(schoolYearLabel1);
        schoolYearLabel1.setBounds(140, 140, 270, 19);

        scholarLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        scholarLabel.setText("Scholarship:");
        infoP.add(scholarLabel);
        scholarLabel.setBounds(140, 160, 250, 19);

        yearLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        yearLabel.setText("Year Level: Always 1st");
        infoP.add(yearLabel);
        yearLabel.setBounds(420, 120, 160, 19);

        currLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        currLabel.setText("Curriculum: ACT 2015");
        infoP.add(currLabel);
        currLabel.setBounds(420, 140, 150, 19);

        statlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        statlabel.setText("Status: Irregular");
        infoP.add(statlabel);
        statlabel.setBounds(420, 160, 150, 19);

        semLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        semLabel.setText("Semester:");
        infoP.add(semLabel);
        semLabel.setBounds(140, 120, 220, 20);

        whiteP.add(infoP);
        infoP.setBounds(20, 70, 610, 200);

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        whiteP.add(cancelBtn);
        cancelBtn.setBounds(520, 600, 110, 30);

        showBtn.setBackground(new java.awt.Color(255, 255, 255));
        showBtn.setText("Show Slip");
        showBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        whiteP.add(showBtn);
        showBtn.setBounds(380, 600, 110, 30);

        evalLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        evalLabel.setText("Evaluator Name: ");
        whiteP.add(evalLabel);
        evalLabel.setBounds(20, 560, 360, 20);

        backLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/studDetBackBsuRedLogo.png"))); // NOI18N
        whiteP.add(backLogoLabel);
        backLogoLabel.setBounds(160, 60, 500, 510);

        totalLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        totalLabel.setText("Total Units: 0");
        whiteP.add(totalLabel);
        totalLabel.setBounds(490, 560, 140, 19);

        getContentPane().add(whiteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjT2ndsem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjT2ndsem2MouseReleased
        if(regmark==1)
        {
            if(check4==true)
            {
                if(subjT2ndsem2.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode2ndsem2.size(); x++)
                {
                    subjT2ndsem2.setValueAt(true, x, 0);
                }
            }
            }
        }
        else if(regmark==2)
        {
            if(evt.getButton() == MouseEvent.BUTTON1)
            {
            int index = subjT2ndsem2.getSelectedRow();
            int colindex = subjT2ndsem2.getSelectedColumn();
            boolean check = (boolean) subjT2ndsem2.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==true)
                {
                    int copy = (int) subjT2ndsem2.getModel().getValueAt(index, 3);
                    String rem = (String) subjT2ndsem2.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT2ndsem2.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                        unit+=copy;
                        totalLabel.setText("Total Units: "+unit);
                        if(index==1)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][25]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==2)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][22]+"";
                            String cpy2 = studGrades[Main.marker][23]+"";
                            int mark1=0;
                            int mark2=0;
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                mark1=1;
                            }
                            if(cpy2.equals("6.0") || cpy2.equals("5.0") || cpy2.equals("0.0"))
                            {
                                mark2=1;
                            }
                            
                            if(mark1==1 || mark2==1)
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==4)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][26]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==5)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][24]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(unit>27)
                        {
                            subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            unit-=copy;
                            totalLabel.setText("Total Units: "+unit);
                        }
                    }
                }
                else if(check==false)
                {
                    int copy = (int) subjT2ndsem2.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
                
                
                
                
                
            }
            
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT2ndsem2MouseReleased

    private void subjT2ndsem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjT2ndsem1MouseReleased
     if(regmark==1)
        {
            if(check3==true)
            {
                if(subjT2ndsem1.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode2ndsem1.size(); x++)
                {
                    subjT2ndsem1.setValueAt(true, x, 0);
                }
            }
            }
            
        }
        else if(regmark==2)
        {
            if(evt.getButton() == MouseEvent.BUTTON1)
            {
            int index = subjT2ndsem1.getSelectedRow();
            int colindex = subjT2ndsem1.getSelectedColumn();
            boolean check = (boolean) subjT2ndsem1.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==true)
                {
                    int copy = (int) subjT2ndsem1.getModel().getValueAt(index, 3);
                    String rem = (String) subjT2ndsem1.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT2ndsem1.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                    unit+=copy;
                    totalLabel.setText("Total Units: "+unit);
                    if(index==2)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][15]+"";
                            String cpy2 = studGrades[Main.marker][16]+"";
                            int mark1=0;
                            int mark2=0;
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                mark1=1;
                            }
                            if(cpy2.equals("6.0") || cpy2.equals("5.0") || cpy2.equals("0.0"))
                            {
                                mark2=1;
                            }
                            
                            if(mark1==1 || mark2==1)
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==3)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][15]+"";
                            String cpy2 = studGrades[Main.marker][16]+"";
                            int mark1=0;
                            int mark2=0;
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                mark1=1;
                            }
                            if(cpy2.equals("6.0") || cpy2.equals("5.0") || cpy2.equals("0.0"))
                            {
                                mark2=1;
                            }
                            
                            if(mark1==1 || mark2==1)
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==4)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][5]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==5)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][7]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==6)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][17]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                    if(unit>27)
                    {
                        subjT2ndsem1.getModel().setValueAt(false, index, 0);
                        unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                    }
                    }
                }
                else if(check==false)
                {
                    int copy = (int) subjT2ndsem1.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
            }
            
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT2ndsem1MouseReleased

    private void subjT1stsem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjT1stsem2MouseReleased
        if(regmark==1)
        {
            if(check2==true)
            {
                if(subjT1stsem2.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode1stsem2.size(); x++)
                {
                    subjT1stsem2.setValueAt(true, x, 0);
                }
            }
            }
            
        }
        else if(regmark==2)
        {
            if(evt.getButton() == MouseEvent.BUTTON1)
            {
            int index = subjT1stsem2.getSelectedRow();
            int colindex = subjT1stsem2.getSelectedColumn();
            boolean check = (boolean) subjT1stsem2.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==true)
                {
                    int copy = (int) subjT1stsem2.getModel().getValueAt(index, 3);
                    String rem = (String) subjT1stsem2.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT1stsem2.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                        unit+=copy;
                        totalLabel.setText("Total Units: "+unit);
                        //
                        if(index==4)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][3]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==5)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][6]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==6)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][6]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==7)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][7]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==9)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][9]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        
                        
                        //
                    if(unit>27)
                    {
                        subjT1stsem2.getModel().setValueAt(false, index, 0);
                        unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                    }
                    }
                }
                else if(check==false)
                {
                    int copy = (int) subjT1stsem2.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
            }
            
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT1stsem2MouseReleased

    private void tableP2ndsem1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableP2ndsem1MouseMoved
        
    }//GEN-LAST:event_tableP2ndsem1MouseMoved

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
       
        int n1=0,n2=0,n3=0,n4=0;
        for(int x=0; x<courseName1stsem1.size(); x++)
        {
            if((boolean) subjT1stsem1.getModel().getValueAt(x, 0) == true)
            {
                n1=1;
                break;
            }
            else
            {
                n1=0;
            }
        }
        for(int x=0; x<courseName1stsem2.size(); x++)
        {
            if((boolean) subjT1stsem2.getModel().getValueAt(x, 0) == true)
            {
                n2=1;
                break;
            }
            else
            {
                n2=0;
            }
        }
        for(int x=0; x<courseName2ndsem1.size(); x++)
        {
            if((boolean) subjT2ndsem1.getModel().getValueAt(x, 0) == true)
            {
                n3=1;
                break;
            }
            else
            {
                n3=0;
            }
        }
        for(int x=0; x<courseName2ndsem2.size(); x++)
        {
            if((boolean) subjT2ndsem2.getModel().getValueAt(x, 0) == true)
            {
                n4=1;
                break;
            }
            else
            {
                n4=0;
            }
        }
        
        
        if(n1==1 || n2==1 || n3==1 || n4==1)
        {
        int size1 = subjT1stsem1.getRowCount();
        for(int x=0; x<size1; x++)
        {
           if(subjT1stsem1.getModel().getValueAt(x, 0).equals(true))
           {
               Object temp = subjT1stsem1.getModel().getValueAt(x, 1);
               codeI.add(temp);
           }
        }
        
        int size2 = subjT1stsem2.getRowCount();
        for(int x=0; x<size2; x++)
        {
           if(subjT1stsem2.getModel().getValueAt(x, 0).equals(true))
           {
               Object temp = subjT1stsem2.getModel().getValueAt(x, 1);
               codeI.add(temp);
           }
        }
        
         int size3 = subjT2ndsem1.getRowCount();
        for(int x=0; x<size3; x++)
        {
           if(subjT2ndsem1.getModel().getValueAt(x, 0).equals(true))
           {
               Object temp = subjT2ndsem1.getModel().getValueAt(x, 1);
               codeI.add(temp);
           }
        }
        
         int size4 = subjT2ndsem2.getRowCount();
        for(int x=0; x<size4; x++)
        {
           if(subjT2ndsem2.getModel().getValueAt(x, 0).equals(true))
           {
               Object temp = subjT2ndsem2.getModel().getValueAt(x, 1);
               codeI.add(temp);
           }
        }
        
        if(Form.IrregReg.get(Main.marker).equals("Irregular"))
        {
            markerIrreg=1;
        }
        else
        {
            markerIrreg=0;
        }
        Form.rems.set(Main.marker, "Evaluated");
        viewStudRecords();
        EvalForm eval = new EvalForm();
        eval.setVisible(true);
        dispose();
        }//ifn1
        else
        {
//           subjT1stsem1.setBackground(Color.red);
//                subjT1stsem2.setBackground(Color.red);
//                subjT2ndsem1.setBackground(Color.red);
//                subjT2ndsem2.setBackground(Color.red);
        }
        
    }//GEN-LAST:event_showBtnActionPerformed

    private void subjT1stsem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjT1stsem1MouseReleased
        if(regmark==1)
        {
            if(check1==true)
            {
                if(subjT1stsem1.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode1stsem1.size(); x++)
                {
                    subjT1stsem1.setValueAt(true, x, 0);
                }
            }
            }
            
        }
        else if(regmark==2)
        {
            if(evt.getButton() == MouseEvent.BUTTON1)
            {
            int index = subjT1stsem1.getSelectedRow();
            int colindex = subjT1stsem1.getSelectedColumn();
            boolean check = (boolean) subjT1stsem1.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==true)
                {
                    int copy = (int) subjT1stsem1.getModel().getValueAt(index, 3);
                    String rem = (String) subjT1stsem1.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT1stsem1.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                    unit+=copy;
                    totalLabel.setText("Total Units: "+unit);
                    if(unit>27)
                    {
                        subjT1stsem1.getModel().setValueAt(false, index, 0);
                        unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                    }
                    }
                }
                else if(check==false)
                {
                    int copy = (int) subjT1stsem1.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
            }
            
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT1stsem1MouseReleased

    private void subjT1stsem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT1stsem1KeyReleased
        if(regmark==1)
        {
            if(check1==true)
            {
                if(subjT1stsem1.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode1stsem1.size(); x++)
                {
                    subjT1stsem1.setValueAt(true, x, 0);
                }
            }
            }
            
        }
    }//GEN-LAST:event_subjT1stsem1KeyReleased

    private void subjT1stsem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT1stsem1KeyPressed
        if(regmark==1)
        {
            if(check1==true)
            {
               
                if(subjT1stsem1.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode1stsem1.size(); x++)
                {
                    subjT1stsem1.setValueAt(true, x, 0);
                }
            }
            }
        }
        else if(regmark==2)
        {
            if(evt.getKeyCode()==KeyEvent.VK_SPACE || evt.getKeyCode()==KeyEvent.VK_SPACE)
            {
            int index = subjT1stsem1.getSelectedRow();
            int colindex = subjT1stsem1.getSelectedColumn();
            boolean check = (boolean) subjT1stsem1.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==false)
                {
                    int copy = (int) subjT1stsem1.getModel().getValueAt(index, 3);
                    String rem = (String) subjT1stsem1.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT1stsem1.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                    unit+=copy;
                    totalLabel.setText("Total Units: "+unit);
                    if(unit>27)
                    {
                        subjT1stsem1.getModel().setValueAt(false, index, 0);
                        unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                    }
                    }
                }
                else if(check==true)
                {
                    int copy = (int) subjT1stsem1.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
            }
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT1stsem1KeyPressed

    private void subjT1stsem2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT1stsem2KeyReleased
        if(regmark==1)
        {
            if(check2==true)
            {
                if(subjT1stsem2.equals(evt.getSource()))
                {
                    for(int x = 0; x<courseCode1stsem2.size(); x++)
                    {
                        subjT1stsem2.setValueAt(true, x, 0);
                    }
                }
            }
        }
    }//GEN-LAST:event_subjT1stsem2KeyReleased

    private void subjT1stsem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT1stsem2KeyPressed
        if(regmark==1)
        {
            if(check2==true)
            {
                if(subjT1stsem2.equals(evt.getSource()))
                {
                for(int x = 0; x<courseCode1stsem2.size(); x++)
                {
                    subjT1stsem2.setValueAt(true, x, 0);
                }
                }
            }
        }
         else if(regmark==2)
        {
            if(evt.getKeyCode()==KeyEvent.VK_SPACE || evt.getKeyCode()==KeyEvent.VK_SPACE)
            {
            int index = subjT1stsem2.getSelectedRow();
            int colindex = subjT1stsem2.getSelectedColumn();
            boolean check = (boolean) subjT1stsem2.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==false)
                {
                    int copy = (int) subjT1stsem2.getModel().getValueAt(index, 3);
                    String rem = (String) subjT1stsem2.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT1stsem2.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                    unit+=copy;
                    totalLabel.setText("Total Units: "+unit);
                    if(index==4)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][3]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==5)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][6]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==6)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][6]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==7)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][7]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==9)
                        {
                            unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][9]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT1stsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                    if(unit>27)
                    {
                        subjT1stsem2.getModel().setValueAt(false, index, 0);
                        unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                    }
                    }
                }
                else if(check==true)
                {
                    int copy = (int) subjT1stsem2.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
            }
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT1stsem2KeyPressed

    private void subjT2ndsem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT2ndsem1KeyReleased
        if(regmark==1)
        {
            if(check3==true)
            {
                if(subjT2ndsem1.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode2ndsem1.size(); x++)
                {
                    subjT2ndsem1.setValueAt(true, x, 0);
                }
            }
            }
        }
    }//GEN-LAST:event_subjT2ndsem1KeyReleased

    private void subjT2ndsem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT2ndsem1KeyPressed
         if(regmark==1)
        {
            if(check3==true)
            {
                if(subjT2ndsem1.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode2ndsem1.size(); x++)
                {
                    subjT2ndsem1.setValueAt(true, x, 0);
                }
            }
            }
        }
          else if(regmark==2)
        {
            if(evt.getKeyCode()==KeyEvent.VK_SPACE || evt.getKeyCode()==KeyEvent.VK_SPACE)
            {
            int index = subjT2ndsem1.getSelectedRow();
            int colindex = subjT2ndsem1.getSelectedColumn();
            boolean check = (boolean) subjT2ndsem1.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==false)
                {
                    int copy = (int) subjT2ndsem1.getModel().getValueAt(index, 3);
                    String rem = (String) subjT2ndsem1.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT2ndsem1.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                    unit+=copy;
                    totalLabel.setText("Total Units: "+unit);
                    if(index==2)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][15]+"";
                            String cpy2 = studGrades[Main.marker][16]+"";
                            int mark1=0;
                            int mark2=0;
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                mark1=1;
                            }
                            if(cpy2.equals("6.0") || cpy2.equals("5.0") || cpy2.equals("0.0"))
                            {
                                mark2=1;
                            }
                            
                            if(mark1==1 || mark2==1)
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==3)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][15]+"";
                            String cpy2 = studGrades[Main.marker][16]+"";
                            int mark1=0;
                            int mark2=0;
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                mark1=1;
                            }
                            if(cpy2.equals("6.0") || cpy2.equals("5.0") || cpy2.equals("0.0"))
                            {
                                mark2=1;
                            }
                            
                            if(mark1==1 || mark2==1)
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==4)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][5]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==5)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][7]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==6)
                        {
                            unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][17]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem1.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                    if(unit>27)
                    {
                        subjT2ndsem1.getModel().setValueAt(false, index, 0);
                        unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                    }
                    }
                }
                else if(check==true)
                {
                    int copy = (int) subjT2ndsem1.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
            }
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT2ndsem1KeyPressed

    private void subjT2ndsem2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT2ndsem2KeyReleased
         if(regmark==1)
        {
            if(check4==true)
            {
                if(subjT2ndsem2.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode2ndsem2.size(); x++)
                {
                    subjT2ndsem2.setValueAt(true, x, 0);
                }
            }
            }
        }
         
    }//GEN-LAST:event_subjT2ndsem2KeyReleased

    private void subjT2ndsem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjT2ndsem2KeyPressed
         if(regmark==1)
        {
            if(check4==true)
            {
                if(subjT2ndsem2.equals(evt.getSource()))
            {
                for(int x = 0; x<courseCode2ndsem2.size(); x++)
                {
                    subjT2ndsem2.setValueAt(true, x, 0);
                }
            }
            }
        }
         else if(regmark==2)
        {
            if(evt.getKeyCode()==KeyEvent.VK_SPACE || evt.getKeyCode()==KeyEvent.VK_SPACE)
            {
            int index = subjT2ndsem2.getSelectedRow();
            int colindex = subjT2ndsem2.getSelectedColumn();
            boolean check = (boolean) subjT2ndsem2.getModel().getValueAt(index, 0);
            if(colindex==0)
            {
                if(check==false)
                {
                    int copy = (int) subjT2ndsem2.getModel().getValueAt(index, 3);
                    String rem = (String) subjT2ndsem2.getModel().getValueAt(index, 5);
                    if(rem.equals("Taken"))
                    {
                        subjT2ndsem2.getModel().setValueAt(false, index, 0);
                    }
                    else
                    {
                    unit+=copy;
                    totalLabel.setText("Total Units: "+unit);
                    if(index==1)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][25]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==2)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][22]+"";
                            String cpy2 = studGrades[Main.marker][23]+"";
                            int mark1=0;
                            int mark2=0;
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                mark1=1;
                            }
                            if(cpy2.equals("6.0") || cpy2.equals("5.0") || cpy2.equals("0.0"))
                            {
                                mark2=1;
                            }
                            
                            if(mark1==1 || mark2==1)
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==4)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][26]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                        if(index==5)
                        {
                            unit-=copy;
                                totalLabel.setText("Total Units: "+unit);
                            String cpy = studGrades[Main.marker][24]+"";
                            if(cpy.equals("6.0") || cpy.equals("5.0") || cpy.equals("0.0"))
                            {
                                subjT2ndsem2.getModel().setValueAt(false, index, 0);
                            }
                            else
                            {
                                unit+=copy;
                                totalLabel.setText("Total Units: "+unit);
                            }
                        }
                    if(unit>27)
                    {
                        subjT2ndsem2.getModel().setValueAt(false, index, 0);
                        unit-=copy;
                        totalLabel.setText("Total Units: "+unit);
                    }
                    }
                }
                else if(check==true)
                {
                    int copy = (int) subjT2ndsem2.getModel().getValueAt(index, 3);
                    unit-=copy;
                    totalLabel.setText("Total Units: "+unit);
                }
            }
            System.out.println(check);
            }
        }
    }//GEN-LAST:event_subjT2ndsem2KeyPressed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        for(int x=0; x<36; x++)
        {
            Main.remarks[Main.marker][x]="";
        }

        StudentInfo info = new StudentInfo();
        info.setVisible(true);
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
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel backLogoLabel;
    private javax.swing.JPanel blackPanelDesign;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JLabel currLabel;
    private javax.swing.JLabel evalLabel;
    private javax.swing.JPanel grayPanelDesign;
    private javax.swing.JPanel imgP;
    private javax.swing.JPanel infoP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel scholarLabel;
    private javax.swing.JLabel schoolYearLabel1;
    private javax.swing.JLabel secLabel;
    private javax.swing.JLabel semLabel;
    private javax.swing.JButton showBtn;
    private javax.swing.JLabel statlabel;
    private javax.swing.JLabel studInfoLabel;
    private javax.swing.JLabel studNameLabel;
    private javax.swing.JLabel studNoLabel;
    private javax.swing.JPanel subjP;
    public static javax.swing.JTable subjT1stsem1;
    public static javax.swing.JTable subjT1stsem2;
    public static javax.swing.JTable subjT2ndsem1;
    public static javax.swing.JTable subjT2ndsem2;
    private javax.swing.JPanel tableP1stsem1;
    private javax.swing.JPanel tableP1stsem2;
    private javax.swing.JPanel tableP2ndsem1;
    private javax.swing.JPanel tableP2ndsem2;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JPanel whiteP;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
