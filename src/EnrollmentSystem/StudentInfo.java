
package EnrollmentSystem;

import static EnrollmentSystem.Form.Age;
import static EnrollmentSystem.Form.IrregReg;
import static EnrollmentSystem.Form.Scholar;
import static EnrollmentSystem.Form.YearLev;
import static EnrollmentSystem.Form.Semester;
import static EnrollmentSystem.Form.Address;
import static EnrollmentSystem.Form.Gender;
import static EnrollmentSystem.Form.Contact;
import static EnrollmentSystem.Form.StudLastName;
import static EnrollmentSystem.Form.StudFirstName;
import static EnrollmentSystem.Form.StudMiddle;
import static EnrollmentSystem.Form.StudFullName;
import static EnrollmentSystem.Form.Birthday;
import static EnrollmentSystem.Form.GuardContact;
import static EnrollmentSystem.Form.GuardFullName;
import static EnrollmentSystem.Form.Occupation;
import static EnrollmentSystem.Form.Section;
import static EnrollmentSystem.Form.StudNumber;
import static EnrollmentSystem.Main.viewStudRecords;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
/**
 *
 * @author carlj
 */
public class StudentInfo extends javax.swing.JFrame {
    String name="";
    String studNo="";
    int marker=0;
    public static String path="";
    public static int view=0;
    JButton changePicBtn =  new JButton();
    String month = "";
    String day = "";
    String year = "";
    String full = "";
    int donemark=0;
    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
    private static PreparedStatement pst;
    public StudentInfo() {
        initComponents();
        this.setLocationRelativeTo(null);    
        this.setResizable(false);
        this.setTitle("Student Information");
        try{
           Image image = new ImageIcon("bsulogo.png").getImage();
           this.setIconImage(image);
          }catch(Exception e){
              System.out.println("Appilcation icon not found");
          }
        
        sectionLabel.setText("Student Number: "+ Form.StudNumber.get(Main.marker));
        nameLabel.setText("Name: "+ Form.StudFullName.get(Main.marker));
        scholarLabel.setText("Scholarship: "+ Form.Scholar.get(Main.marker));
        statLabel.setText("Status: "+ Form.IrregReg.get(Main.marker));
        yearLabel.setText("Year Level: "+ Form.YearLev.get(Main.marker));
        numberLabel.setText("Year Level: "+ Form.Contact.get(Main.marker));
        genderLabel.setText("Gender: "+ Form.Gender.get(Main.marker));
        ageLabel.setText("Age: "+ Form.Age.get(Main.marker));
        addressLabel.setText("Address: "+ Form.Address.get(Main.marker));
        semLabel.setText("Semester: "+Form.Semester.get(Main.marker));
        sectionLabel.setText("Section: "+Form.Section.get(Main.marker));
        studNumLabel.setText("Student Number: "+Form.StudNumber.get(Main.marker));
        birthLabel.setText("Birthday: "+Form.Birthday.get(Main.marker));
       
        scholarCombo.setVisible(false);
        genderCombo.setVisible(false);
        numberTxtField.setVisible(false);
        ageTxtField.setVisible(false);
        addressTxtField.setVisible(false);
        lastNameTxtField.setVisible(false);
        firstNameTxtField.setVisible(false);
        middleTxtField.setVisible(false);
        MonthSpin.setVisible(false);
        DaySpin.setVisible(false);
        YearSpin.setVisible(false);
        
        changePicBtn.setText("Change");
        changePicBtn.setFont(new Font("Century Gothic",Font.PLAIN,11));
        changePicBtn.setBackground(new Color(255,255,255));
        changePicBtn.setBounds(90, 100, 80, 30);
        backPanel.add(changePicBtn);
        
        changePicBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
            file.addChoosableFileFilter(filter);
            int result = file.showSaveDialog(null);
            
                if(result == JFileChooser.APPROVE_OPTION)
                {
                File selectedFile = file.getSelectedFile();
                path = selectedFile.getAbsolutePath();
                Form.icon.set(Main.marker, path);
                try
                        {
                            String query = "UPDATE student_records SET icon=? WHERE studentNumber=?";
                            pst =con.prepareStatement(query);
                            
                            pst.setString(1, Form.icon.get(Main.marker).toString());
                            pst.setString(2, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                        }
                        catch(Exception er)
                        {
                            System.out.println("update db choose icon error: "+er);
                        }
                pictureLabel.setIcon(ResizeImage(Form.icon.get(Main.marker)));
                
                //pathIcon[Main.marker] = new String();
                
                //icon[Main.marker]= new ImageIcon(pathIcon[Main.marker]);
                //pictureLabel.setIcon(icon[Main.marker]);
                }
            }

            private Icon ResizeImage(String ImagePath) {
               
                ImageIcon MyImage = new ImageIcon(ImagePath);
                Image img = MyImage.getImage();
                Image newImg = img.getScaledInstance(pictureLabel.getWidth(), pictureLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                //icon[Main.marker] = new ImageIcon(newImg);
                return image;
            }

            
        });
        
        
      pictureLabel.setIcon(new ImageIcon(Form.icon.get(Main.marker)));
      
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
          st = con.createStatement();
      }
      catch(Exception e)
      {
          System.out.println("DB connect error: "+e);
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

        backPanel = new javax.swing.JPanel();
        studInfoLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        blackPanelDesign = new javax.swing.JPanel();
        grayPanelDesign = new javax.swing.JPanel();
        removePicBtn = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        evaluateBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JToggleButton();
        delBtn = new javax.swing.JToggleButton();
        cashBtn = new javax.swing.JButton();
        encodeBtn = new javax.swing.JButton();
        personalPanel = new javax.swing.JPanel();
        currLabel = new javax.swing.JLabel();
        sectionLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        collegeLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        semLabel = new javax.swing.JLabel();
        statLabel = new javax.swing.JLabel();
        schoolYearLabel = new javax.swing.JLabel();
        scholarLabel = new javax.swing.JLabel();
        scholarCombo = new javax.swing.JComboBox<>();
        studNumLabel = new javax.swing.JLabel();
        firstNameTxtField = new javax.swing.JTextField();
        middleTxtField = new javax.swing.JTextField();
        lastNameTxtField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        genderLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        numberTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        addressTxtField = new javax.swing.JTextField();
        birthLabel = new javax.swing.JLabel();
        DaySpin = new javax.swing.JSpinner();
        MonthSpin = new javax.swing.JSpinner();
        YearSpin = new javax.swing.JSpinner();
        backLogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backPanel.setLayout(null);

        studInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        studInfoLabel.setText("Student Information");
        backPanel.add(studInfoLabel);
        studInfoLabel.setBounds(10, 10, 270, 50);

        pictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/def.jpg"))); // NOI18N
        pictureLabel.setToolTipText("Your Photo!");
        pictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backPanel.add(pictureLabel);
        pictureLabel.setBounds(10, 90, 80, 80);

        blackPanelDesign.setBackground(new java.awt.Color(0, 0, 0));
        backPanel.add(blackPanelDesign);
        blackPanelDesign.setBounds(0, 50, 580, 10);

        grayPanelDesign.setBackground(new java.awt.Color(255, 102, 51));
        backPanel.add(grayPanelDesign);
        grayPanelDesign.setBounds(420, 60, 330, 10);

        removePicBtn.setBackground(new java.awt.Color(255, 255, 255));
        removePicBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        removePicBtn.setText("Remove");
        removePicBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removePicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePicBtnActionPerformed(evt);
            }
        });
        backPanel.add(removePicBtn);
        removePicBtn.setBounds(90, 130, 80, 30);

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        leftPanel.setOpaque(false);
        leftPanel.setLayout(null);

        evaluateBtn.setBackground(new java.awt.Color(255, 255, 255));
        evaluateBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        evaluateBtn.setText("Evaluate");
        evaluateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evaluateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluateBtnActionPerformed(evt);
            }
        });
        leftPanel.add(evaluateBtn);
        evaluateBtn.setBounds(10, 90, 140, 30);

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        editBtn.setText("Edit Profile");
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        leftPanel.add(editBtn);
        editBtn.setBounds(10, 10, 140, 30);

        delBtn.setBackground(new java.awt.Color(255, 255, 255));
        delBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        delBtn.setText("Hide Profile");
        delBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        leftPanel.add(delBtn);
        delBtn.setBounds(10, 50, 140, 30);

        cashBtn.setBackground(new java.awt.Color(255, 255, 255));
        cashBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cashBtn.setText("Balance");
        cashBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashBtnActionPerformed(evt);
            }
        });
        leftPanel.add(cashBtn);
        cashBtn.setBounds(10, 170, 140, 30);

        encodeBtn.setBackground(new java.awt.Color(255, 255, 255));
        encodeBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        encodeBtn.setText("Show Subjects");
        encodeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeBtnActionPerformed(evt);
            }
        });
        leftPanel.add(encodeBtn);
        encodeBtn.setBounds(10, 130, 140, 30);

        backPanel.add(leftPanel);
        leftPanel.setBounds(10, 180, 160, 357);

        personalPanel.setBackground(new java.awt.Color(255, 255, 255));
        personalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N
        personalPanel.setOpaque(false);
        personalPanel.setLayout(null);

        currLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        currLabel.setText("Curriculum: ACT 2015");
        personalPanel.add(currLabel);
        currLabel.setBounds(20, 140, 150, 20);

        sectionLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sectionLabel.setText("Section:");
        personalPanel.add(sectionLabel);
        sectionLabel.setBounds(20, 80, 240, 20);

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameLabel.setText("Name:");
        personalPanel.add(nameLabel);
        nameLabel.setBounds(20, 50, 510, 20);

        collegeLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        collegeLabel.setText("College: College of Information and Communication Technology");
        personalPanel.add(collegeLabel);
        collegeLabel.setBounds(20, 110, 490, 20);

        yearLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        yearLabel.setText("Year Level:");
        personalPanel.add(yearLabel);
        yearLabel.setBounds(360, 170, 150, 20);

        semLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        semLabel.setText("Semester:");
        personalPanel.add(semLabel);
        semLabel.setBounds(20, 170, 210, 20);

        statLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        statLabel.setText("Status:");
        personalPanel.add(statLabel);
        statLabel.setBounds(360, 200, 120, 20);

        schoolYearLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        schoolYearLabel.setText("School Year: 2016-2017");
        personalPanel.add(schoolYearLabel);
        schoolYearLabel.setBounds(360, 140, 330, 20);

        scholarLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        scholarLabel.setText("Scholarship:");
        personalPanel.add(scholarLabel);
        scholarLabel.setBounds(20, 200, 280, 20);

        scholarCombo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        scholarCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Governor's Shcolar", "Vice-Governor's Scholar", "Scholar ng Bayan", "Scholar ng BSU" }));
        scholarCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personalPanel.add(scholarCombo);
        scholarCombo.setBounds(110, 200, 230, 20);

        studNumLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        studNumLabel.setText(" Student Number: ");
        personalPanel.add(studNumLabel);
        studNumLabel.setBounds(17, 20, 290, 20);

        firstNameTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        firstNameTxtField.setOpaque(false);
        personalPanel.add(firstNameTxtField);
        firstNameTxtField.setBounds(230, 50, 140, 25);

        middleTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        middleTxtField.setOpaque(false);
        personalPanel.add(middleTxtField);
        middleTxtField.setBounds(380, 50, 140, 25);

        lastNameTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lastNameTxtField.setOpaque(false);
        personalPanel.add(lastNameTxtField);
        lastNameTxtField.setBounds(80, 50, 140, 25);

        backPanel.add(personalPanel);
        personalPanel.setBounds(190, 90, 540, 240);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Additional Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        genderLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        genderLabel.setText("Gender: ");
        jPanel1.add(genderLabel);
        genderLabel.setBounds(10, 90, 160, 19);

        numberLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        numberLabel.setText("Number:");
        jPanel1.add(numberLabel);
        numberLabel.setBounds(10, 60, 400, 19);

        ageLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ageLabel.setText("Age:");
        jPanel1.add(ageLabel);
        ageLabel.setBounds(10, 120, 100, 19);

        addressLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addressLabel.setText("Address:");
        jPanel1.add(addressLabel);
        addressLabel.setBounds(10, 150, 490, 25);

        genderCombo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Male", "Female" }));
        genderCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(genderCombo);
        genderCombo.setBounds(80, 90, 120, 22);

        numberTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        numberTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberTxtFieldKeyTyped(evt);
            }
        });
        jPanel1.add(numberTxtField);
        numberTxtField.setBounds(80, 60, 280, 25);

        ageTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ageTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtFieldActionPerformed(evt);
            }
        });
        ageTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageTxtFieldKeyTyped(evt);
            }
        });
        jPanel1.add(ageTxtField);
        ageTxtField.setBounds(50, 120, 100, 25);

        addressTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(addressTxtField);
        addressTxtField.setBounds(70, 150, 450, 25);

        birthLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        birthLabel.setText("Birthday:");
        jPanel1.add(birthLabel);
        birthLabel.setBounds(10, 30, 370, 19);

        DaySpin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        DaySpin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        DaySpin.setToolTipText("Day of your Birthday.");
        jPanel1.add(DaySpin);
        DaySpin.setBounds(210, 30, 68, 25);

        MonthSpin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MonthSpin.setModel(new javax.swing.SpinnerListModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        MonthSpin.setToolTipText("Month of your Birthday.");
        MonthSpin.setDoubleBuffered(true);
        MonthSpin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                MonthSpinAncestorRemoved(evt);
            }
        });
        jPanel1.add(MonthSpin);
        MonthSpin.setBounds(80, 30, 120, 25);

        YearSpin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        YearSpin.setModel(new javax.swing.SpinnerListModel(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"}));
        YearSpin.setToolTipText("Year of Birthday.");
        jPanel1.add(YearSpin);
        YearSpin.setBounds(290, 30, 71, 25);

        backPanel.add(jPanel1);
        jPanel1.setBounds(190, 340, 540, 200);

        backLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/studDetBackBsuRedLogo.png"))); // NOI18N
        backPanel.add(backLogoLabel);
        backLogoLabel.setBounds(210, 40, 500, 510);

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removePicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePicBtnActionPerformed
      Form.icon.set(Main.marker, "C:\\Users\\carlj\\Documents\\NetBeansProjects\\HCI_PROJECT_ENROLLMENT\\src\\EnrollmentSystem\\def.jpg");
      try
                        {
                            String query = "UPDATE student_records SET icon=? WHERE studentNumber=?";
                            pst =con.prepareStatement(query);
                            
                            pst.setString(1, Form.icon.get(Main.marker).toString());
                            pst.setString(2, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                        }
                        catch(Exception e)
                        {
                            System.out.println("update db icon remove error: "+e);
                        }
       pictureLabel.setIcon(new ImageIcon("C:\\Users\\carlj\\Documents\\NetBeansProjects\\HCI_PROJECT_ENROLLMENT\\src\\EnrollmentSystem\\def.jpg"));
    }//GEN-LAST:event_removePicBtnActionPerformed

    private void numberTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberTxtFieldKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c>'9' && c!= '\b' )
        {
            evt.consume();
        }
    }//GEN-LAST:event_numberTxtFieldKeyTyped

    private void ageTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTxtFieldKeyTyped
         char c = evt.getKeyChar();
        if(c < '0' || c>'9' && c!= '\b' )
        {
            evt.consume();
        }
    }//GEN-LAST:event_ageTxtFieldKeyTyped

    private void evaluateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluateBtnActionPerformed
//        if(GradeForm.gradeMarker[Main.marker][GradeForm.year][GradeForm.sem]==1)
//        {
//        Evaluation eval = new Evaluation();
//        eval.setVisible(true);
//        dispose();
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Input Grade First");
//        }
if(Form.IrregReg.get(Main.marker).equals("Graduated")&&Form.Semester.get(Main.marker).equals("Graduated"))
{
    int gradAns=JOptionPane.showConfirmDialog(null,"This student is already a Graduate\nWant to see his/her Diploma?", "Student Status",JOptionPane.YES_NO_OPTION);
    if(gradAns==0)
    {
            Diploma d = new Diploma();
            d.setVisible(true);
    }
}
else
if(Main.studBalance[Main.marker]>0.0)
{
    JOptionPane.showMessageDialog(null,"This student currently have P "+Main.studBalance[Main.marker]+" of unsettled balance.\nPlease settle it as soon as possible.", "Balance", JOptionPane.WARNING_MESSAGE);
}
else
if(Form.YearLev.get(Main.marker).equals("1st Year")&&Form.Semester.get(Main.marker).equals("1st Semester")&&Form.IrregReg.get(Main.marker).equals("Regular"))
{   
//                for(int x=0; x<36; x++)
//                {
//                    Main.remarks[Main.marker][x]="";
//                }
                Evaluation e = new Evaluation();
                e.setVisible(true);
                dispose();
}
else
{
JOptionPane.showMessageDialog(null, "You need to encode grade first\n(if encoding is already made just skip)", "Encode Grade", JOptionPane.INFORMATION_MESSAGE);
               GradeInput in = new GradeInput();
               in.setVisible(true);
               dispose();
}
    }//GEN-LAST:event_evaluateBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
                JLabel jPassword = new JLabel("Password");
                String pass="";
                int errMark=0;
                 String ObjButtons[] = {"Yes","No"};
                int PromptResult = JOptionPane.showOptionDialog(null,"Hide Student Profile for now?\n(This profile will show again next time you open the program)","Hide",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION)
                {
                JPasswordField password = new JPasswordField();
                password.setEchoChar('•');
                Object[] ob = {jPassword, password};
                int result = JOptionPane.showConfirmDialog(null, ob, "Please input password", JOptionPane.OK_CANCEL_OPTION);
 
                if (result == JOptionPane.OK_OPTION) 
                {
                pass = password.getText();
                }
                if (result == JOptionPane.CANCEL_OPTION) 
                {
                    errMark=1;
                }
                if(pass.equals(Login.password.get(Login.logmark)))
                {
               
                    
                     StudFullName.remove(Main.marker);
                     StudNumber.remove(Main.marker);
                     Scholar.remove(Main.marker);
                     Semester.remove(Main.marker);
                     Contact.remove(Main.marker);
                     Birthday.remove(Main.marker);
                     Address.remove(Main.marker);
                     Gender.remove(Main.marker);
                     //GuardFullName.remove(Main.marker);
                     //GuardContact.remove(Main.marker);
                     //Occupation.remove(Main.marker);
                     IrregReg.remove(Main.marker);
                     YearLev.remove(Main.marker);
                     Age.remove(Main.marker);
                     StudFirstName.remove(Main.marker);
                     StudLastName.remove(Main.marker);
                     StudMiddle.remove(Main.marker);
                     Section.remove(Main.marker); 
                     this.dispose();
                     
                     viewStudRecords();
                }
                
                else if(!pass.equals(Login.password.get(Login.logmark))&&errMark==0)
                {
                    JOptionPane.showMessageDialog(null, "Password error", "Password", JOptionPane.WARNING_MESSAGE);
                }
                }
    }//GEN-LAST:event_delBtnActionPerformed

    private void MonthSpinAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MonthSpinAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthSpinAncestorRemoved

    private void ageTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtFieldActionPerformed

    private void cashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashBtnActionPerformed
           if(Main.studBalance[Main.marker]>0.0)
           {
               int x =JOptionPane.showConfirmDialog(null,"Pay P "+Main.studBalance[Main.marker]+" to continue for evaluation?", "Balance", JOptionPane.YES_NO_OPTION);
               if(x==0)
               {
                   JOptionPane.showMessageDialog(null, "Thanks! all balance has been settled", "Balance",JOptionPane.INFORMATION_MESSAGE);
                   Main.studBalance[Main.marker]=0.0;
               }
           }
          else
           {
            JOptionPane.showMessageDialog(null,"This student doesn't have any outstanding balance.", "Balance", JOptionPane.INFORMATION_MESSAGE);
           }
    }//GEN-LAST:event_cashBtnActionPerformed

    private void encodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeBtnActionPerformed
       Subjects sub = new Subjects();
       sub.setVisible(true);
       dispose();
    }//GEN-LAST:event_encodeBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
      JLabel jPassword = new JLabel("Password");
        String pass="";
        int errMark=0;
        JPasswordField password = new JPasswordField();
        password.setEchoChar('•');
        int mark2=0;
        Object[] ob = {jPassword, password};
        if(donemark==0)
        {
            int result = JOptionPane.showConfirmDialog(null, ob, "Please input password", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION)
            {
                pass = password.getText();
            }
            if (result == JOptionPane.CANCEL_OPTION)
            {
                errMark=1;
                editBtn.setSelected(false);
            }
        }
        else
        {
            pass= (String) Login.password.get(Login.logmark);
        }
        if(pass.equals(Login.password.get(Login.logmark)))
        {
            donemark=1;
            mark2=1;
            if(editBtn.isSelected())
            {
                evaluateBtn.setEnabled(false);
                delBtn.setEnabled(false);
                encodeBtn.setEnabled(false);
                cashBtn.setEnabled(false);
                String temp = scholarLabel.getText();
                scholarLabel.setText("Scholarship: ");
                editBtn.setText("Done");
                String scolarTemp = scholarLabel.getText();
                String scolarTemp2 = temp.replace("Scholarship: ","");
                scholarCombo.setSelectedItem(scolarTemp2);
                scholarCombo.setVisible(true);

                String temp2 = yearLabel.getText();
                yearLabel.setText("Year Level: ");
                editBtn.setText("Done");
                String yearTemp = yearLabel.getText();
                String yearTemp2 = temp2.replace("Year Level: ","");
                //yearCombo.setVisible(true);
                yearLabel.setText("Year Level: "+Form.YearLev.get(Main.marker)+"");

                String temp3 = statLabel.getText();
                statLabel.setText("Status: ");
                editBtn.setText("Done");
                String statTemp = statLabel.getText();
                String statTemp2 = temp3.replace("Status: ","");
                //statCombo.setVisible(true);
                statLabel.setText("Status: "+Form.IrregReg.get(Main.marker)+"");

                String temp4 = genderLabel.getText();
                genderLabel.setText("Gender: ");
                editBtn.setText("Done");
                String genderTemp = genderLabel.getText();
                String genderTemp2 = temp4.replace("Gender: ","");
                genderCombo.setSelectedItem(genderTemp2);
                genderCombo.setVisible(true);

                String temp5 = numberLabel.getText();
                numberLabel.setText("Number: ");
                editBtn.setText("Done");
                String numberTemp = numberLabel.getText();
                String numberTemp2 = temp5.replace("Year Level: ","");
                numberTemp2 = numberTemp2.replace("Number: ","");
                numberTxtField.setText(numberTemp2);
                numberTxtField.setVisible(true);

                String temp6 = ageLabel.getText();
                ageLabel.setText("Age: ");
                editBtn.setText("Done");
                String ageTemp = ageLabel.getText();
                String ageTemp2 = temp6.replace("Age: ","");
                ageTxtField.setText(ageTemp2);
                ageTxtField.setVisible(true);

                String temp7 = addressLabel.getText();
                addressLabel.setText("Address: ");
                editBtn.setText("Done");
                String addressTemp = addressLabel.getText();
                String addressTemp2 = temp7.replace("Address: ","");
                addressTxtField.setText(addressTemp2);
                addressTxtField.setVisible(true);

                String temp8 = semLabel.getText();
                //semLabel.setText("Semester: ");
                editBtn.setText("Done");
                String semTemp = semLabel.getText();
                String semTemp2 = temp8.replace("Semester: ","");
                //semCombo.setVisible(true);
                semLabel.setText("Semester: "+Form.Semester.get(Main.marker)+"");

                String temp9 = nameLabel.getText();
                nameLabel.setText("Name: ");
                editBtn.setText("Done");
                lastNameTxtField.setText(Form.StudLastName.get(Main.marker)+"");
                lastNameTxtField.setVisible(true);

                firstNameTxtField.setText(Form.StudFirstName.get(Main.marker)+"");
                firstNameTxtField.setVisible(true);

                middleTxtField.setText(Form.StudMiddle.get(Main.marker)+"");
                middleTxtField.setVisible(true);

                MonthSpin.setVisible(true);
                DaySpin.setVisible(true);
                YearSpin.setVisible(true);
                birthLabel.setText("Birthday: ");

                String birth = Form.Birthday.get(Main.marker)+" ";
                int len = birth.length();
                int ctr=0;
                for(int v=0; v<len; v++)
                {
                    if(birth.charAt(v)==' '||birth.charAt(v)==',')
                    {
                        ctr++;
                    }
                    else
                    {
                        if(ctr==0)
                        {
                            month+=birth.charAt(v);
                        }
                        else if(ctr==1)
                        {
                            day+=birth.charAt(v);
                        }
                        else if(ctr==3)
                        {
                            year+=birth.charAt(v);
                        }
                    }
                }
                ((DefaultEditor) MonthSpin.getEditor()).getTextField().setText(month);
                ((DefaultEditor) DaySpin.getEditor()).getTextField().setText(day);
                ((DefaultEditor) YearSpin.getEditor()).getTextField().setText(year);
            }
            else
            {
                int x = JOptionPane.showConfirmDialog(null, "Save?", "Edit Profile", JOptionPane.YES_NO_OPTION);
                if(x==0)
                {
                    //-----------
                     donemark=0;
                    evaluateBtn.setEnabled(false);
                    delBtn.setEnabled(false);
                    encodeBtn.setEnabled(false);
                    cashBtn.setEnabled(false);
                    String selected = scholarCombo.getSelectedItem()+"";
                    if(selected.equals("<Select>"))
                    {
                        selected="";
                    }
                    else
                    {
                    }

                    String selected4 = genderCombo.getSelectedItem()+"";
                    if(selected4.equals("<Select>"))
                    {
                        genderLabel.setForeground(Color.RED);
                        if(marker==0)
                        {
                            marker=1;
                        }
                    }
                    else
                    {
                        genderLabel.setForeground(Color.black);
                    }
                    //---------
                    String selected5 = numberTxtField.getText();
                    if(selected5.equals(""))
                    {
                        numberLabel.setForeground(Color.RED);
                        if(marker==0)
                        {
                            marker=1;
                        }
                    }
                    else
                    {
                        numberLabel.setForeground(Color.black);
                    }
                    //---------
                    String selected6 = ageTxtField.getText();
                    if(selected6.equals(""))
                    {
                        ageLabel.setForeground(Color.RED);
                        if(marker==0)
                        {
                            marker=1;
                        }
                    }
                    else
                    {
                        ageLabel.setForeground(Color.black);
                    }
                    //---------
                    String selected7 = addressTxtField.getText();
                    if(selected7.equals(""))
                    {
                        addressLabel.setForeground(Color.RED);
                        if(marker==0)
                        {
                            marker=1;
                        }
                    }
                    else
                    {
                        addressLabel.setForeground(Color.black);
                    }
                    //---------
                    //---------
                    if(lastNameTxtField.getText().equals(""))
                    {
                        nameLabel.setForeground(Color.RED);
                        if(marker==0)
                        {
                            marker=1;
                        }
                    }
                    else if(firstNameTxtField.getText().equals(""))
                    {
                        nameLabel.setForeground(Color.RED);
                        if(marker==0)
                        {
                            marker=1;
                        }
                    }
                    else
                    {
                        nameLabel.setForeground(Color.BLACK);
                    }
                    //---------
                    if(marker==1)
                    {
                        JOptionPane.showMessageDialog(null, "Please fill up all the needed information", "Invalid", JOptionPane.WARNING_MESSAGE);
                        editBtn.setSelected(true);
                        editBtn.setText("Done");
                        evaluateBtn.setEnabled(false);
                        delBtn.setEnabled(false);
                        encodeBtn.setEnabled(false);
                        cashBtn.setEnabled(false);
                        donemark=1;
                        scholarCombo.setVisible(true);
                        genderCombo.setVisible(true);
                        numberTxtField.setVisible(true);
                        ageTxtField.setVisible(true);
                        addressTxtField.setVisible(true);
                        lastNameTxtField.setVisible(true);
                        firstNameTxtField.setVisible(true);
                        middleTxtField.setVisible(true);
                        MonthSpin.setVisible(true);
                        DaySpin.setVisible(true);
                        YearSpin.setVisible(true);
                    }
                    else
                    {
                        evaluateBtn.setEnabled(true);
                        delBtn.setEnabled(true);
                        encodeBtn.setEnabled(true);
                        cashBtn.setEnabled(true);
                        editBtn.setText("Edit Profile");
                        scholarCombo.setVisible(false);
                        //                   yearCombo.setVisible(false);
                        //                   statCombo.setVisible(false);
                        genderCombo.setVisible(false);
                        numberTxtField.setVisible(false);
                        ageTxtField.setVisible(false);
                        addressTxtField.setVisible(false);
                        //                   semCombo.setVisible(false);
                        lastNameTxtField.setVisible(false);
                        firstNameTxtField.setVisible(false);
                        middleTxtField.setVisible(false);
                        MonthSpin.setVisible(false);
                        DaySpin.setVisible(false);
                        YearSpin.setVisible(false);

                        String l=lastNameTxtField.getText().trim();
                        String f=firstNameTxtField.getText().trim();
                        String m=middleTxtField.getText().trim();
                        int mark = 0;

                        String lastName = "";
                        String firstName = "";
                        String middleName = "";

                        String midCopy="";
                        if(m.equals(""))
                        {
                            middleName="*";
                        }
                        else
                        {
                            if(m.equals(StudMiddle.get(Main.marker)))
                            {
                                mark=1;
                                midCopy = m;
                            }

                            if(m.contains("."))
                            {
                                String toUp =m.toUpperCase();
                                int len = toUp.length();
                                String midName = toUp.charAt(0)+"";
                                for(int q=0; q<len; q++)
                                {
                                    try
                                    {
                                        if(toUp.charAt(q)=='.')
                                        {
                                            midName += toUp.charAt(q+1);
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
                                for(int w=0; w<len; w++)
                                {
                                    if(toUp.charAt(w)==' ')
                                    {
                                        mid+=toUp.charAt(w+1);
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
                            for(int e=0; e<len; e++)
                            {
                                if(lastName.charAt(e)==' ')
                                {
                                    String rep = " "+lastName.charAt(e+1);
                                    String repp = rep.toUpperCase();
                                    String temp = lastName.replace(rep,repp);
                                    lastName = temp;
                                }
                            }
                        }
                        if(firstName.contains(" "))
                        {
                            int len = firstName.length();
                            for(int r=0; r<len; r++)
                            {
                                if(firstName.charAt(r)==' ')
                                {
                                    String rep = " "+firstName.charAt(r+1);
                                    String repp = rep.toUpperCase();
                                    String temp = firstName.replace(rep,repp);
                                    firstName = temp;
                                }
                            }
                        }
                        String name="";
                        if(mark==0)
                        {
                            name = lastName+", "+firstName+", "+middleName;
                        }
                        else
                        {
                            name = lastName+", "+firstName+", "+midCopy;
                        }

                        String monthN = ((DefaultEditor) MonthSpin.getEditor()).getTextField().getText();
                        String dayN = ((DefaultEditor) DaySpin.getEditor()).getTextField().getText();
                        String yearN =  ((DefaultEditor) YearSpin.getEditor()).getTextField().getText();

                        String birthday =  monthN+" "+dayN+", "+yearN;

                        scholarLabel.setText("Scholarship: "+selected);
                        //                   yearLabel.setText("Year Level: "+selected2);
                        //                   statLabel.setText("Status: "+selected3);
                        genderLabel.setText("Gender: "+selected4);
                        numberLabel.setText("Number: "+selected5);
                        ageLabel.setText("Age: "+selected6);
                        addressLabel.setText("Address: "+selected7);
                        //                   semLabel.setText("Semester: "+selected8);
                        nameLabel.setText("Name: "+name);
                        birthLabel.setText("Birthday: "+birthday);

                        Address.set(Main.marker, selected7);
                        Gender.set(Main.marker, selected4);
                        Contact.set(Main.marker, selected5);
                        Scholar.set(Main.marker, selected);
                        Age.set(Main.marker, selected6);
                        try
                        {
                            String query = "UPDATE student_records SET address=?,gender=?,contact=?,scholar=?,age=? WHERE studentNumber=?";
                            pst = con.prepareStatement(query);
                            
                            pst.setString(1, selected7);
                            pst.setString(2, selected4);
                            pst.setString(3, selected5);
                            pst.setString(4, selected);
                            pst.setString(5, selected6);
                            pst.setString(6, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                            System.out.println("Update 1 success");
                        }
                        catch(Exception e)
                        {
                            System.out.println("edit add gen con schol error: "+e.getMessage());
                        }
                        //                   YearLev.set(Main.marker, selected2);
                        if(YearLev.get(Main.marker).equals("2nd Year"))
                        {
                            String copy = Section.get(Main.marker).toString();
                            Section.set(Main.marker, copy.replaceFirst("1", "2"));
                            sectionLabel.setText("Section: "+ Section.get(Main.marker));
                        }
                        else
                        {
                            String copy = Section.get(Main.marker).toString();
                            Section.set(Main.marker, copy.replaceFirst("2", "1"));
                            sectionLabel.setText("Section: "+ Section.get(Main.marker));
                        }
                        try
                        {
                            String query = "UPDATE student_records SET section=? WHERE studentNumber=?";
                            pst= con.prepareStatement(query);
                            
                            pst.setString(1, Section.get(Main.marker)+"");
                            pst.setString(2, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                            
                            System.out.println("Update 2 success");
                        }
                        catch(Exception e)
                        {
                            System.out.println("DB edit sec error: "+e);
                        }
                        //                   IrregReg.set(Main.marker, selected3);
                        
                        //                   Semester.set(Main.marker, selected8);
                        if(Section.get(Main.marker).toString().charAt(4)=='1' && Semester.get(Main.marker).toString().charAt(0)=='1')
                        {
                            //showBtn.setEnabled(false);
                        }
                        else
                        {
                            //showBtn.setEnabled(true);
                        }
                        StudLastName.set(Main.marker, lastName);
                        StudFirstName.set(Main.marker, firstName);
                        Birthday.set(Main.marker, birthday);
                        try
                        {
                            String query = "UPDATE student_records SET lastName=?,firstName=?,bday=? WHERE studentNumber=?";
                            pst =con.prepareStatement(query);
                            
                            pst.setString(1, lastName);
                            pst.setString(2, firstName);
                            pst.setString(3, birthday);
                            pst.setString(4, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                        }
                        catch(Exception e)
                        {
                            System.out.println("update db lastN firstN error: "+e.getMessage());
                        }
                        month = "";
                        day = "";
                        year = "";

                        if(mark==0)
                        {
                            StudMiddle.set(Main.marker, middleName);
                            try
                        {
                            String query = "UPDATE student_records SET middleName=? WHERE studentNumber=?";
                            pst =con.prepareStatement(query);
                            
                            pst.setString(1, middleName);
                            pst.setString(2, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                        }
                        catch(Exception e)
                        {
                            System.out.println("update db midN error: "+e.getMessage());
                        }
                        }
                        else
                        {
                            StudMiddle.set(Main.marker, midCopy);
                             try
                        {
                            String query = "UPDATE student_records SET middleName=? WHERE studentNumber=?";
                            pst =con.prepareStatement(query);
                            
                            pst.setString(1, midCopy);
                            pst.setString(2, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                        }
                        catch(Exception e)
                        {
                            System.out.println("update db midN error: "+e.getMessage());
                        }
                        }
                        StudFullName.set(Main.marker, name);
try
                        {
                            String query = "UPDATE student_records SET fullname=? WHERE studentNumber=?";
                            pst =con.prepareStatement(query);
                            
                            pst.setString(1, name);
                            pst.setString(2, StudNumber.get(Main.marker)+"");
                            
                            pst.executeUpdate();
                        }
                        catch(Exception e)
                        {
                            System.out.println("update db fullN error: "+e.getMessage());
                        }
                        viewStudRecords();
                    }

                }
                else
                {
                    donemark=1;
                    editBtn.setSelected(true);
                }
                marker=0;
            }
        }
        else if(!pass.equals(Login.password.get(Login.logmark))&&errMark==0)
        {
            JOptionPane.showMessageDialog(null, "Password error", "Password", JOptionPane.WARNING_MESSAGE);
            editBtn.setSelected(false);
        }
    }//GEN-LAST:event_editBtnActionPerformed
    private void changePicBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner DaySpin;
    private javax.swing.JSpinner MonthSpin;
    private javax.swing.JSpinner YearSpin;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel backLogoLabel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JPanel blackPanelDesign;
    private javax.swing.JButton cashBtn;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JLabel currLabel;
    private javax.swing.JToggleButton delBtn;
    private javax.swing.JToggleButton editBtn;
    private javax.swing.JButton encodeBtn;
    private javax.swing.JButton evaluateBtn;
    private javax.swing.JTextField firstNameTxtField;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel grayPanelDesign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTxtField;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField middleTxtField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTxtField;
    private javax.swing.JPanel personalPanel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton removePicBtn;
    private javax.swing.JComboBox<String> scholarCombo;
    private javax.swing.JLabel scholarLabel;
    private javax.swing.JLabel schoolYearLabel;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JLabel semLabel;
    public static javax.swing.JLabel statLabel;
    private javax.swing.JLabel studInfoLabel;
    private javax.swing.JLabel studNumLabel;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
