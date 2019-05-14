/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrollmentSystem;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static EnrollmentSystem.Form.StudLastName;
import static EnrollmentSystem.Form.StudFirstName;
import static EnrollmentSystem.Form.StudNumber;
import static EnrollmentSystem.Form.Section;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.sql.*;
/**
 *
 * @author carlj
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public static int studCtr=0;
    public static String subjectArray[][][];
    public static Double studBalance[]  = new Double[10000];
    public static String remarks[][];
    public static boolean ss=true;
    public static int number=1700000;
    int searchMark=0;
    int sea=0;
    boolean seaB=false;
    boolean seaC=false;
    public static int marker=0;
    int studentNum = 170000;
    public static int counter=0;
    ButtonGroup group = new ButtonGroup();
    public static int m1=0;
    public static int m2=0;
    public static int m3=0;
    public static int m4=0;
    public static String codes[] = new String[36];
    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
    private static PreparedStatement pst;
    public static int studnumctr=0;
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Enrollment System");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       try{
           Image image = new ImageIcon("bsulogo.png").getImage();
           this.setIconImage(image);
          }catch(Exception e){
              System.out.println("Appilcation icon not found");
          }
        facNumLabel.setText((String)Login.ID.get(Login.logmark));
        facNameLabel.setText((String)Login.name.get(Login.logmark));
        codes[0]="Psych 113";
        codes[1]="Eng 113";
        codes[2]="Fil 113";
        codes[3]="Math 113";
        codes[4]="Soc Sci 113";
        codes[5]="ACT 113";
        codes[6]="ACT 133";
        codes[7]="ACT 153";
        codes[8]=("PE 112");
        codes[9]=("NSTP I");
        codes[10]=("Eng 123");
        codes[11]=("Math 123");
        codes[12]=("Hum 123");
        codes[13]=("Fil 123");
        codes[14]=("ACT 103");
        codes[15]=("ACT 123");
        codes[16]=("ACT 143");
        codes[17]=("ACT 163");
        codes[18]=("PE 122");
        codes[19]="NSTP 2";
        codes[20]=("Philo 213");
        codes[21]="Eng 213";
        codes[22]="ACT 213";
        codes[23]="ACT 233";
        codes[24]="ACT 253";
        codes[25]="ACT 273";
        codes[26]="ACT 293";
        codes[27]="PE 212";
        codes[28]="Soc Sci 223";
        codes[29]="ACT 203";
        codes[30]="ACT 223";
        codes[31]="ACT 243";
        codes[32]="ACT 263";
        codes[33]="ACT 283A";
        codes[34]="ACT 283B";
        codes[35]="PE 222";
        subjectArray = new String[10000][4][36];
        remarks = new String[10000][36];
        group.add(idRadio);
        group.add(firstRadio);
        group.add(lastRadio);
        group.add(sectionRadio);
        group.clearSelection();
        
        
        for(int x=0; x<10000; x++)
        {
            studBalance[x]= 0.0;
            for(int y=0; y<36; y++)
            {
                remarks[x][y]="";
            }
        }
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
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
            st = con.createStatement();
            
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
         
         try
         {
             String query = "SELECT * FROM `student_records`";
             rs = st.executeQuery(query);
             while(rs.next())
             {
                 Form.StudNumber.add(rs.getString("studentNumber"));
                 Form.StudLastName.add(rs.getString("lastName"));
                 Form.StudFirstName.add(rs.getString("firstName"));
                 Form.StudMiddle.add(rs.getString("middleName"));
                 Form.Section.add(rs.getString("section"));
                 Form.rems.add("");
                 Form.Address.add(rs.getString("address"));
                 Form.Age.add(rs.getString("age"));
                 Form.Gender.add(rs.getString("gender"));
                 Form.Contact.add(rs.getString("contact"));
                 Form.Birthday.add(rs.getString("bday"));
                 Form.Scholar.add(rs.getString("scholar"));
                 Form.IrregReg.add(rs.getString("irregreg"));
                 Form.StudFullName.add(rs.getString("fullname"));
                 Form.YearLev.add(rs.getString("yearlev"));
                 Form.Semester.add(rs.getString("sem"));
                 Form.icon.add(rs.getString("icon"));
                 
                 studnumctr++;
             }
             
         }
         catch(Exception e)
         {
             System.out.println("DB Viewing Error: "+e);
         }
         System.out.println("asdasdasdasd");
        number = number+studnumctr;
        studnumctr=0;
        
        viewStudRecords();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        backPanel = new javax.swing.JPanel();
        facPanel = new javax.swing.JPanel();
        facNumLabel = new javax.swing.JLabel();
        facNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        facViewBtn = new javax.swing.JButton();
        facLogBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studRecTable = new javax.swing.JTable();
        searchTxtField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        cictLogo = new javax.swing.JLabel();
        bsuLabel = new javax.swing.JLabel();
        sesLabel = new javax.swing.JLabel();
        blackDesignPanel = new javax.swing.JPanel();
        orangePanel = new javax.swing.JPanel();
        idRadio = new javax.swing.JRadioButton();
        lastRadio = new javax.swing.JRadioButton();
        firstRadio = new javax.swing.JRadioButton();
        sectionRadio = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        recordMenu = new javax.swing.JMenu();
        addMenuItem = new javax.swing.JMenuItem();
        viewMenuItem = new javax.swing.JMenuItem();
        otherMenu = new javax.swing.JMenu();
        otherMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setLayout(null);

        facPanel.setBackground(new java.awt.Color(255, 255, 255));
        facPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N
        facPanel.setLayout(null);

        facNumLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facNumLabel.setText("Id");
        facPanel.add(facNumLabel);
        facNumLabel.setBounds(94, 24, 330, 20);

        facNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facNameLabel.setText("Name");
        facPanel.add(facNameLabel);
        facNameLabel.setBounds(124, 51, 300, 19);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Faculty Name:");
        facPanel.add(jLabel1);
        jLabel1.setBounds(20, 49, 98, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Faculty ID:");
        facPanel.add(jLabel2);
        jLabel2.setBounds(20, 24, 90, 20);

        facViewBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        facViewBtn.setText("View Profile");
        facViewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facViewBtnActionPerformed(evt);
            }
        });
        facPanel.add(facViewBtn);
        facViewBtn.setBounds(380, 24, 100, 23);

        facLogBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        facLogBtn.setText("Log Out");
        facLogBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facLogBtnActionPerformed(evt);
            }
        });
        facPanel.add(facLogBtn);
        facLogBtn.setBounds(380, 49, 100, 23);

        backPanel.add(facPanel);
        facPanel.setBounds(20, 140, 510, 90);

        studRecTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        studRecTable.getTableHeader().setReorderingAllowed(false);
        studRecTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studRecTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studRecTable);

        backPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 780, 402);

        searchTxtField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        searchTxtField.setForeground(new java.awt.Color(102, 102, 102));
        searchTxtField.setText("Search");
        searchTxtField.setToolTipText("Search students using their Last Name, First Name, Student ID, or by Section");
        searchTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTxtFieldFocusLost(evt);
            }
        });
        searchTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTxtFieldMouseClicked(evt);
            }
        });
        searchTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTxtFieldKeyPressed(evt);
            }
        });
        backPanel.add(searchTxtField);
        searchTxtField.setBounds(540, 160, 200, 30);

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/search.png"))); // NOI18N
        searchBtn.setToolTipText("Search students using their Last Name, First Name, Student ID, or by Section");
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        backPanel.add(searchBtn);
        searchBtn.setBounds(740, 160, 50, 30);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/bsulogo.png"))); // NOI18N
        logoLabel.setToolTipText("Bulacan State University");
        backPanel.add(logoLabel);
        logoLabel.setBounds(20, 10, 100, 100);

        cictLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/cictlogo.png"))); // NOI18N
        cictLogo.setToolTipText("College of Information and Communication Technology");
        backPanel.add(cictLogo);
        cictLogo.setBounds(700, 10, 100, 100);

        bsuLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        bsuLabel.setText("Bulacan State University");
        backPanel.add(bsuLabel);
        bsuLabel.setBounds(270, 20, 290, 45);

        sesLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        sesLabel.setText("Student Enrollment System");
        sesLabel.setToolTipText("");
        backPanel.add(sesLabel);
        sesLabel.setBounds(290, 70, 230, 23);

        blackDesignPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout blackDesignPanelLayout = new javax.swing.GroupLayout(blackDesignPanel);
        blackDesignPanel.setLayout(blackDesignPanelLayout);
        blackDesignPanelLayout.setHorizontalGroup(
            blackDesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        blackDesignPanelLayout.setVerticalGroup(
            blackDesignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        backPanel.add(blackDesignPanel);
        blackDesignPanel.setBounds(0, 120, 560, 10);

        orangePanel.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        orangePanelLayout.setVerticalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        backPanel.add(orangePanel);
        orangePanel.setBounds(470, 130, 350, 10);

        idRadio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        idRadio.setSelected(true);
        idRadio.setText("ID");
        idRadio.setToolTipText("Search by ID");
        idRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idRadio.setOpaque(false);
        idRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRadioActionPerformed(evt);
            }
        });
        backPanel.add(idRadio);
        idRadio.setBounds(540, 190, 40, 23);

        lastRadio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lastRadio.setText("Last Name");
        lastRadio.setToolTipText("Search by Last Name");
        lastRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastRadio.setOpaque(false);
        backPanel.add(lastRadio);
        lastRadio.setBounds(540, 210, 90, 23);

        firstRadio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        firstRadio.setText("First Name");
        firstRadio.setToolTipText("Search by First Name");
        firstRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        firstRadio.setOpaque(false);
        firstRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstRadioActionPerformed(evt);
            }
        });
        backPanel.add(firstRadio);
        firstRadio.setBounds(630, 190, 81, 23);

        sectionRadio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        sectionRadio.setText("Year & Section");
        sectionRadio.setToolTipText("Search by Year & Section");
        sectionRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sectionRadio.setOpaque(false);
        backPanel.add(sectionRadio);
        sectionRadio.setBounds(630, 210, 110, 23);

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 650));

        recordMenu.setText("Records");
        recordMenu.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        addMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        addMenuItem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        addMenuItem.setText("Add Student");
        addMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemActionPerformed(evt);
            }
        });
        recordMenu.add(addMenuItem);

        viewMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        viewMenuItem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        viewMenuItem.setText("View All");
        viewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMenuItemActionPerformed(evt);
            }
        });
        recordMenu.add(viewMenuItem);

        jMenuBar1.add(recordMenu);

        otherMenu.setText("Others");
        otherMenu.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        otherMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherMenuActionPerformed(evt);
            }
        });

        otherMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        otherMenuItem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        otherMenuItem.setText("About Us");
        otherMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherMenuItemActionPerformed(evt);
            }
        });
        otherMenu.add(otherMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem1.setText("Log Out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        otherMenu.add(jMenuItem1);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        exitMenuItem.setText("Exit Program");
        exitMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuItemMouseClicked(evt);
            }
        });
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        otherMenu.add(exitMenuItem);

        jMenuBar1.add(otherMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTxtFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTxtFieldMouseClicked
     searchTxtField.setForeground(Color.black);
     if(searchMark==0)
     {
     searchTxtField.setText("");
     searchMark=1;
     }
    }//GEN-LAST:event_searchTxtFieldMouseClicked

    private void searchTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtFieldKeyPressed
       searchTxtField.setForeground(Color.black);
     if(searchMark==0)
     {
     searchTxtField.setText("");
     searchMark=1;
     }
    }//GEN-LAST:event_searchTxtFieldKeyPressed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        String ObjButtons[] = {"Yes","No"};
                int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void exitMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuItemMouseClicked

    }//GEN-LAST:event_exitMenuItemMouseClicked

    private void otherMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherMenuItemActionPerformed
        AboutUs about = new AboutUs();
        about.setVisible(true);
    }//GEN-LAST:event_otherMenuItemActionPerformed

    private void addMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemActionPerformed
       Form form = new Form();
       form.setVisible(true);
    }//GEN-LAST:event_addMenuItemActionPerformed

    private void studRecTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studRecTableMouseClicked
        try{
            if(evt.getClickCount() == 2 && !evt.isConsumed())
            {
                if(seaB==true)
                {
                    marker=sea;
                    StudentInfo det1 = new StudentInfo();
                    det1.setVisible(true);
                }
                else if(seaC==true)
                {
                int index = studRecTable.getSelectedRow();
                Object name = studRecTable.getModel().getValueAt(index, 0).toString();
                 for(int x=0; x<Form.StudNumber.size(); x++)
                {
                    if(Form.StudNumber.get(x).equals(name))
                    {
                     marker=x;
                    StudentInfo det1 = new StudentInfo();
                    det1.setVisible(true);
                    break;
                    }
                }
                }
                else
                {
                int index = studRecTable.getSelectedRow();
                Object name = studRecTable.getModel().getValueAt(index, 0).toString();
                name = Form.StudNumber.get(index);
                 for(int x=0; x<Form.StudNumber.size(); x++)
                {
                    if(Form.StudNumber.get(x).equals(name))
                    {
                        marker=x;
                    StudentInfo det1 = new StudentInfo();
                    det1.setVisible(true);
                    break;
                    }
                }
                }
                
                
            }
        }catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_studRecTableMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
      String search = searchTxtField.getText();
      String search2 = search.toLowerCase().trim();
    if(search.equals(null))
    {
        viewStudRecords();
    }
    else
    {
        String col[] = new String[]{"Student Number","Last Name","First Name","Middle Initial","Course & Section"};
        DefaultTableModel model = new DefaultTableModel(col,0){
        @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        Object rowData[] = new Object[5];
        int mark=0;
        int marker=0;
        if(idRadio.isSelected()||firstRadio.isSelected()||lastRadio.isSelected()||sectionRadio.isSelected())
        {
            marker=1;
        }
        if(marker==0)
        {
            JOptionPane.showMessageDialog(null, "Please choose what category you want to search.", "Choose",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(marker==1)
        {
        if(idRadio.isSelected())
        {
        if(StudNumber.contains(search2))
        {
            int index = StudNumber.indexOf(search);
            sea=index;
            seaB=true;
            rowData[0] = Form.StudNumber.get(index);
            rowData[1] = Form.StudLastName.get(index);
            rowData[2] = Form.StudFirstName.get(index);
            rowData[3] = Form.StudMiddle.get(index);
            rowData[4] = Form.Section.get(index);
            model.addRow(rowData);
            mark=1;
        }
        }
        if(lastRadio.isSelected())
        {
        for(int c=0; c<StudNumber.size(); c++)
        {
            String temp = StudLastName.get(c)+"";
            String temp2 = temp.toLowerCase();
            
            if(temp2.equals(search2))
            {
                seaC=true;
              rowData[0] = Form.StudNumber.get(c);
              rowData[1] = Form.StudLastName.get(c);
              rowData[2] = Form.StudFirstName.get(c);
              rowData[3] = Form.StudMiddle.get(c);
              rowData[4] = Form.Section.get(c);
              model.addRow(rowData);
              mark=1;
            }
        }
        }
        if(firstRadio.isSelected())
        {
        for(int c=0; c<StudNumber.size(); c++)
        {
            String temp = StudFirstName.get(c)+"";
            String temp2 = temp.toLowerCase();
            
            if(temp2.equals(search2))
            {
                seaC=true;
              rowData[0] = Form.StudNumber.get(c);
              rowData[1] = Form.StudLastName.get(c);
              rowData[2] = Form.StudFirstName.get(c);
              rowData[3] = Form.StudMiddle.get(c);
              rowData[4] = Form.Section.get(c);
              model.addRow(rowData);
              mark=1;
            }
        }
        }
        if(sectionRadio.isSelected())
        {
        for(int c=0; c<StudNumber.size(); c++)
        {
            String temp = Section.get(c)+"";
            String temp2 = temp.toLowerCase();
            
            if(temp2.equals(search2))
            {
              seaC=true;
              rowData[0] = Form.StudNumber.get(c);
              rowData[1] = Form.StudLastName.get(c);
              rowData[2] = Form.StudFirstName.get(c);
              rowData[3] = Form.StudMiddle.get(c);
              rowData[4] = Form.Section.get(c);
              model.addRow(rowData);
              mark=1;
            }
        }
        }
         if(mark==0)
         {
             JOptionPane.showMessageDialog(null, "The Record you've searched is non-existent","Search",JOptionPane.WARNING_MESSAGE);
             searchTxtField.setText("Search");
             seaB=false;
             seaC=false;
             searchTxtField.setForeground(new Color(102,102,102));
             searchMark=0;
         }
        group.clearSelection();
        studRecTable.setModel(model);
        searchTxtField.setText("Search");
        searchTxtField.setForeground(new Color(102,102,102));
        searchMark=0;
    }
    }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void viewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuItemActionPerformed
      viewStudRecords();
      seaB=false;
      seaC=false;
    }//GEN-LAST:event_viewMenuItemActionPerformed

    private void searchTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTxtFieldFocusLost
      String txt = searchTxtField.getText();
      if(txt.equals(""))
      {
       searchTxtField.setText("Search");
       searchTxtField.setForeground(new Color(102,102,102));
       searchMark=0;
      }
      else
      {
          
      }
    }//GEN-LAST:event_searchTxtFieldFocusLost

    private void idRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRadioActionPerformed

    private void firstRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstRadioActionPerformed

    private void otherMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherMenuActionPerformed
      
    }//GEN-LAST:event_otherMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int x=JOptionPane.showConfirmDialog(null,"Log out?", "Log out",JOptionPane.YES_NO_OPTION);
       if(x==0)
       {
           Login l = new Login();
           l.setVisible(true);
           dispose();
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void facLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facLogBtnActionPerformed
      int x=JOptionPane.showConfirmDialog(null,"Log out?", "Log out",JOptionPane.YES_NO_OPTION);
       if(x==0)
       {
           Login l = new Login();
           l.setVisible(true);
           dispose();
       }
    }//GEN-LAST:event_facLogBtnActionPerformed

    private void facViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facViewBtnActionPerformed
       EditFacProfile e = new EditFacProfile();
       e.setVisible(true);
    }//GEN-LAST:event_facViewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

     public static void viewStudRecords()
    {
       String col[] = new String[]{"Student Number","Last Name","First Name","Middle Initial","Course & Section", "Remarks"};
        DefaultTableModel model = new DefaultTableModel(col,0){
        @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        Object rowData[] = new Object[6];
        
        for(int x=0; x<Form.StudFirstName.size(); x++)
        {
            rowData[0] = Form.StudNumber.get(x);
            rowData[1] = Form.StudLastName.get(x);
            rowData[2] = Form.StudFirstName.get(x);
            rowData[3] = Form.StudMiddle.get(x);
            rowData[4] = Form.Section.get(x);
            rowData[5] = Form.rems.get(x);
            System.out.println("remark: "+Form.rems.get(x));
            model.addRow(rowData);
        }
        studRecTable.setModel(model);
        System.out.println(model.getRowCount());   
//            rowData[5] = Form.rems.get(x);
//            System.out.println("remark: "+Form.rems.get(x));
            
        
       // studRecTable.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addMenuItem;
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel blackDesignPanel;
    private javax.swing.JLabel bsuLabel;
    private javax.swing.JLabel cictLogo;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JButton facLogBtn;
    private javax.swing.JLabel facNameLabel;
    public static javax.swing.JLabel facNumLabel;
    private javax.swing.JPanel facPanel;
    private javax.swing.JButton facViewBtn;
    private javax.swing.JRadioButton firstRadio;
    private javax.swing.JRadioButton idRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lastRadio;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel orangePanel;
    private javax.swing.JMenu otherMenu;
    private javax.swing.JMenuItem otherMenuItem;
    private javax.swing.JMenu recordMenu;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JRadioButton sectionRadio;
    private javax.swing.JLabel sesLabel;
    public static javax.swing.JTable studRecTable;
    private javax.swing.JMenuItem viewMenuItem;
    // End of variables declaration//GEN-END:variables


}
