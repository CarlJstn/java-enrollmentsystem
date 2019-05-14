/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrollmentSystem;

import static EnrollmentSystem.AssesmentPaper.courseName;
import static EnrollmentSystem.AssesmentPaper.first;
import static EnrollmentSystem.AssesmentPaper.scholarPrice;
import static EnrollmentSystem.AssesmentPaper.second;
import static EnrollmentSystem.AssesmentPaper.total;
import static EnrollmentSystem.AssesmentPaper.totalUnits;
import static EnrollmentSystem.EvalForm.rowCopy;
import static EnrollmentSystem.EvalForm.units;
import static EnrollmentSystem.Evaluation.CourseName1stsem2;
import static EnrollmentSystem.Evaluation.CourseName2ndsem1;
import static EnrollmentSystem.Evaluation.CourseName2ndsem2;
import static EnrollmentSystem.Evaluation.NoUnits1stsem1;
import static EnrollmentSystem.Evaluation.NoUnits1stsem2;
import static EnrollmentSystem.Evaluation.NoUnits2ndsem1;
import static EnrollmentSystem.Evaluation.NoUnits2ndsem2;
import static EnrollmentSystem.Evaluation.codeI;
import static EnrollmentSystem.Evaluation.reg;
import static EnrollmentSystem.Form.Semester;
import static EnrollmentSystem.Form.YearLev;
import static EnrollmentSystem.Main.subjectArray;
import static EnrollmentSystem.Main.viewStudRecords;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Cashier extends javax.swing.JFrame {

    DecimalFormat format = new DecimalFormat("0.00");

    public static int ctr[] = new int[100000];

    ArrayList subs = new ArrayList();
    ArrayList yearList = new ArrayList();
    ArrayList semList = new ArrayList();
    ArrayList remList = new ArrayList();
    ButtonGroup group = new ButtonGroup();
    ButtonGroup group2 = new ButtonGroup();
    public static String meth = "";
    public static double total = 0;
    public static double scholarPayment = 0;
    public static double payment = 0;
    public static double change = 0;
    public Cashier() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Payment");
        //this.setResizable(false);
        try {
            Image image = new ImageIcon("bsulogo.png").getImage();
            this.setIconImage(image);
        } catch (Exception e) {
            System.out.println("Appilcation icon not found");
        }
        totalField.setCaretColor(Color.BLACK);
        group.add(cashRadio);
        group.add(installRadio);
        group.add(promiRadio);

        for (int y = 0; y < 10; y++) {

            yearList.add("1st Year");
            semList.add("1st Semester");
        }

        for (int y = 0; y < 10; y++) {

            yearList.add("1st Year");
            semList.add("2nd Semester");

        }

        for (int y = 0; y < 8; y++) {

            yearList.add("2nd Year");
            semList.add("1st Semester");

        }

        for (int y = 0; y < 8; y++) {

            yearList.add("2nd Year");
            semList.add("2nd Semester");

        }

        //int q=ctr[Main.marker];
        //totalField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //totalField.setOpaque(false);
        //totalField.setEditable(false);
        firstLabel.setText(format.format(AssesmentPaper.first));
        secondLabel.setText(format.format(AssesmentPaper.second));
        if (Form.Scholar.get(Main.marker).equals("")) {
            totalLabel1.setText(format.format(AssesmentPaper.total));
        } else {
            totalLabel1.setText(format.format(AssesmentPaper.total) + " w/scholar");
        }

        if (Form.Scholar.get(Main.marker).equals("Governor's Shcolar")) {
            scholarLabel.setText("(GS) - P 3500");
        } else if (Form.Scholar.get(Main.marker).equals("Vice-Governor's Scholar")) {
            scholarLabel.setText("(VGS) - P 2500");
        } else if (Form.Scholar.get(Main.marker).equals("Scholar ng Bayan")) {
            scholarLabel.setText("(SNB) - P 1800");
        } else if (Form.Scholar.get(Main.marker).equals("Scholar ng BSU")) {
            scholarLabel.setText("(BSU) - P 3000");
        } else {
            scholarLabel.setText("");
        }
        if (reg == 1) {
            subs = courseName;

        } else if (reg == 2) {
            subs = CourseName1stsem2;

        } else if (reg == 3) {
            subs = CourseName2ndsem1;

        } else if (reg == 4) {
            subs = CourseName2ndsem2;

        }

        if (Evaluation.markerIrreg == 1) {

            int size1 = Evaluation.subjT1stsem1.getRowCount();
            for (int x = 0; x < size1; x++) {
                for (int y = 0; y < Evaluation.codeI.size(); y++) {
                    if (Evaluation.codeI.get(y).equals(Evaluation.subjT1stsem1.getValueAt(x, 1))) {
                        subs.add(Evaluation.subjT1stsem1.getValueAt(x, 2));
                    }
                }
            }
            int size2 = Evaluation.subjT1stsem2.getRowCount();
            for (int x = 0; x < size2; x++) {
                for (int y = 0; y < Evaluation.codeI.size(); y++) {
                    if (Evaluation.codeI.get(y).equals(Evaluation.subjT1stsem2.getValueAt(x, 1))) {
                        subs.add(Evaluation.subjT1stsem2.getValueAt(x, 2));
                    }
                }
            }

            int size3 = Evaluation.subjT2ndsem1.getRowCount();
            for (int x = 0; x < size3; x++) {
                for (int y = 0; y < Evaluation.codeI.size(); y++) {
                    if (Evaluation.codeI.get(y).equals(Evaluation.subjT2ndsem1.getValueAt(x, 1))) {
                        subs.add(Evaluation.subjT2ndsem1.getValueAt(x, 2));
                    }
                }
            }

            int size4 = Evaluation.subjT2ndsem2.getRowCount();
            for (int x = 0; x < size4; x++) {
                for (int y = 0; y < Evaluation.codeI.size(); y++) {
                    if (Evaluation.codeI.get(y).equals(Evaluation.subjT2ndsem2.getValueAt(x, 1))) {
                        subs.add(Evaluation.subjT2ndsem2.getValueAt(x, 2));
                    }
                }
            }

        }//if
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {

                int x = JOptionPane.showConfirmDialog(null, "Are you sure to exit?", "EXIT", JOptionPane.YES_NO_OPTION);
                if (x == 0) {
                    AssesmentPaper.totalUnits = 0;
                    AssesmentPaper.first = 0.0;
                    AssesmentPaper.second = 0.0;
                    AssesmentPaper.total = 0.0;
                    for(int q=0; q<36; q++)
                    {
                    NoUnits2ndsem1.set(x, 0);
                    NoUnits2ndsem2.set(x, 0);
                    NoUnits1stsem1.set(x, 0);
                    NoUnits1stsem2.set(x, 0);
                    }
                    
                    rowCopy=0;
                    units=0;
                    totalUnits=0;
                    first=0.0;
                    second=0.0;
                    total=0.0;
                }

                dispose();

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        backPanel = new javax.swing.JPanel();
        studInfoLabel = new javax.swing.JLabel();
        blackPanelDesign = new javax.swing.JPanel();
        grayPanelDesign = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        twentyLabel = new javax.swing.JLabel();
        fiftyLabel = new javax.swing.JLabel();
        oneHunLabel = new javax.swing.JLabel();
        twoHunLabel = new javax.swing.JLabel();
        fiveHunLabel = new javax.swing.JLabel();
        oneThouLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        proceedBtn = new javax.swing.JButton();
        totP = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        totalLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        scholarLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        secondLabel = new javax.swing.JLabel();
        cashRadio = new javax.swing.JRadioButton();
        installRadio = new javax.swing.JRadioButton();
        promiRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setLayout(null);

        studInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        studInfoLabel.setText("Payment");
        backPanel.add(studInfoLabel);
        studInfoLabel.setBounds(10, 0, 220, 50);

        blackPanelDesign.setBackground(new java.awt.Color(0, 0, 0));
        backPanel.add(blackPanelDesign);
        blackPanelDesign.setBounds(0, 40, 550, 10);

        grayPanelDesign.setBackground(new java.awt.Color(255, 102, 51));
        backPanel.add(grayPanelDesign);
        grayPanelDesign.setBounds(460, 50, 340, 10);

        totalLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        totalLabel.setText("Total:  P");
        backPanel.add(totalLabel);
        totalLabel.setBounds(570, 400, 90, 30);

        twentyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/20.png"))); // NOI18N
        twentyLabel.setToolTipText("");
        twentyLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twentyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyLabelMouseClicked(evt);
            }
        });
        backPanel.add(twentyLabel);
        twentyLabel.setBounds(10, 90, 120, 290);

        fiftyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/50.png"))); // NOI18N
        fiftyLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fiftyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiftyLabelMouseClicked(evt);
            }
        });
        backPanel.add(fiftyLabel);
        fiftyLabel.setBounds(140, 90, 120, 290);

        oneHunLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/100.png"))); // NOI18N
        oneHunLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneHunLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneHunLabelMouseClicked(evt);
            }
        });
        backPanel.add(oneHunLabel);
        oneHunLabel.setBounds(270, 90, 120, 290);

        twoHunLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/200.png"))); // NOI18N
        twoHunLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twoHunLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoHunLabelMouseClicked(evt);
            }
        });
        backPanel.add(twoHunLabel);
        twoHunLabel.setBounds(400, 90, 118, 290);

        fiveHunLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/500.png"))); // NOI18N
        fiveHunLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fiveHunLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveHunLabelMouseClicked(evt);
            }
        });
        backPanel.add(fiveHunLabel);
        fiveHunLabel.setBounds(530, 90, 120, 290);

        oneThouLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/1000.png"))); // NOI18N
        oneThouLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneThouLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneThouLabelMouseClicked(evt);
            }
        });
        backPanel.add(oneThouLabel);
        oneThouLabel.setBounds(660, 90, 110, 290);

        totalField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        totalField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        totalField.setText("0");
        totalField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalFieldMouseClicked(evt);
            }
        });
        totalField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalFieldKeyTyped(evt);
            }
        });
        backPanel.add(totalField);
        totalField.setBounds(650, 400, 120, 30);

        proceedBtn.setBackground(new java.awt.Color(255, 255, 255));
        proceedBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        proceedBtn.setText("OKAY");
        proceedBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        backPanel.add(proceedBtn);
        proceedBtn.setBounds(640, 470, 110, 27);

        totP.setOpaque(false);
        totP.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Second Payment: ");
        totP.add(jLabel6);
        jLabel6.setBounds(10, 30, 110, 20);

        totalLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        totalLabel1.setText("First Payment: ");
        totP.add(totalLabel1);
        totalLabel1.setBounds(110, 80, 120, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("First Payment: ");
        totP.add(jLabel9);
        jLabel9.setBounds(10, 10, 81, 20);

        firstLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstLabel.setText("First Payment: ");
        totP.add(firstLabel);
        firstLabel.setBounds(100, 10, 110, 20);
        totP.add(jSeparator2);
        jSeparator2.setBounds(10, 0, 430, 2);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Scholar:");
        totP.add(jLabel7);
        jLabel7.setBounds(10, 50, 90, 30);

        scholarLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        totP.add(scholarLabel);
        scholarLabel.setBounds(60, 50, 160, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Total Payment:");
        totP.add(jLabel8);
        jLabel8.setBounds(10, 80, 90, 30);

        secondLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        secondLabel.setText("First Payment: ");
        totP.add(secondLabel);
        secondLabel.setBounds(120, 30, 110, 20);

        backPanel.add(totP);
        totP.setBounds(10, 400, 240, 110);

        cashRadio.setText("Cash");
        cashRadio.setToolTipText("Pay with full price");
        cashRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cashRadio.setOpaque(false);
        backPanel.add(cashRadio);
        cashRadio.setBounds(270, 400, 90, 23);

        installRadio.setText("Installment");
        installRadio.setToolTipText("Pay only the first payment");
        installRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        installRadio.setOpaque(false);
        installRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                installRadioItemStateChanged(evt);
            }
        });
        backPanel.add(installRadio);
        installRadio.setBounds(270, 420, 120, 23);

        promiRadio.setText("Promisory");
        promiRadio.setToolTipText("Pay at least P 1000");
        promiRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        promiRadio.setOpaque(false);
        promiRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                promiRadioItemStateChanged(evt);
            }
        });
        backPanel.add(promiRadio);
        promiRadio.setBounds(270, 440, 140, 23);

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twentyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyLabelMouseClicked
        String get = totalField.getText();
        if (get.equals("")) {
            get = "0";
        }
        double tot = Double.parseDouble(get);
        tot += 20;
        total = tot;
        totalField.setText(format.format(total));
    }//GEN-LAST:event_twentyLabelMouseClicked

    private void fiftyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiftyLabelMouseClicked
        String get = totalField.getText();
        if (get.equals("")) {
            get = "0";
        }
        double tot = Double.parseDouble(get);
        tot += 50;
        total = tot;
        totalField.setText(format.format(total));
    }//GEN-LAST:event_fiftyLabelMouseClicked

    private void oneHunLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneHunLabelMouseClicked
        String get = totalField.getText();
        if (get.equals("")) {
            get = "0";
        }
        double tot = Double.parseDouble(get);
        tot += 100;
        total = tot;
        totalField.setText(format.format(total));
    }//GEN-LAST:event_oneHunLabelMouseClicked

    private void twoHunLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoHunLabelMouseClicked
        String get = totalField.getText();
        if (get.equals("")) {
            get = "0";
        }
        double tot = Double.parseDouble(get);
        tot += 200;
        total = tot;
        totalField.setText(format.format(total));
    }//GEN-LAST:event_twoHunLabelMouseClicked

    private void fiveHunLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveHunLabelMouseClicked
        String get = totalField.getText();
        if (get.equals("")) {
            get = "0";
        }
        double tot = Double.parseDouble(get);
        tot += 500;
        total = tot;
        totalField.setText(format.format(total));
    }//GEN-LAST:event_fiveHunLabelMouseClicked

    private void oneThouLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneThouLabelMouseClicked
        String get = totalField.getText();
        if (get.equals("")) {
            get = "0";
        }
        double tot = Double.parseDouble(get);
        tot += 1000;
        total = tot;
        totalField.setText(format.format(total));
    }//GEN-LAST:event_oneThouLabelMouseClicked

    private void totalFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalFieldKeyTyped

        char c = evt.getKeyChar();
        if (c < '0' || c > '9' && c != '\b') {
            evt.consume();
        }

    }//GEN-LAST:event_totalFieldKeyTyped

    private void totalFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalFieldMouseClicked
        //totalField.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK,1));
        //totalField.setOpaque(true);
        totalField.setEditable(true);
    }//GEN-LAST:event_totalFieldMouseClicked

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        if (cashRadio.isSelected()) {
            if (AssesmentPaper.first + second >= total) {
                JOptionPane.showMessageDialog(null, "Student Payment is not Enough!", "ATTENTION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Form.rems.set(Main.marker, "Enrolled");
                scholarPayment = AssesmentPaper.first+AssesmentPaper.second;
                meth="Cash";
                payment=total;
                change = total - (AssesmentPaper.first+second);
                JOptionPane.showMessageDialog(null, "Transaction successful\nYou are now officially enrolled", "ATTENTION", JOptionPane.INFORMATION_MESSAGE);
                Main.studBalance[Main.marker] = 0.0;
                System.out.println(Main.studBalance[Main.marker]);
                for (int x = 0; x < 36; x++) {
                    //subjectArray[Main.marker][0][x]=subs.get(x)+"";
                    subjectArray[Main.marker][1][x] = yearList.get(x) + "";
                    subjectArray[Main.marker][2][x] = semList.get(x) + "";

                    //q++;
                }
                if (Evaluation.markerIrreg == 1) {
                    for (int x = 0; x < AssesmentPaper.cpy.size(); x++) {
                        for (int y = 0; y < 10; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT1stsem1.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 10; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT1stsem2.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 8; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT2ndsem1.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 8; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT2ndsem2.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }

                    }
                    totalUnits = 0;
                    first = 0.0;
                    second = 0.0;
                    total = 0.0;
                    dispose();
                    codeI.clear();
                    AssesmentPaper.totalUnits = 0;
                } else {
                    if (reg == 1) {

                        for (int x = 0; x < 10; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 2) {

                        for (int x = 10; x < 20; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 3) {

                        for (int x = 20; x < 28; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 4) {

                        for (int x = 28; x < 36; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    }
                    //for(int x=0; x<subs.size(); x++)
                    //{
                    //ctr[Main.marker]++;
                    //}
                    totalUnits = 0;
                    first = 0.0;
                    second = 0.0;
                    total = 0.0;
                    dispose();
                    codeI.clear();
                    AssesmentPaper.totalUnits = 0;
                }

                if (Form.YearLev.get(Main.marker).toString().equals("1st Year") && Semester.get(Main.marker).toString().equals("1st Semester")) {
                    Semester.set(Main.marker, "2nd Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("1st Year") && Semester.get(Main.marker).toString().equals("2nd Semester")) {
                    YearLev.set(Main.marker, "2nd Year");
                    Semester.set(Main.marker, "1st Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("2nd Year") && Semester.get(Main.marker).toString().equals("1st Semester")) {
                    Semester.set(Main.marker, "2nd Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("2nd Year") && Semester.get(Main.marker).toString().equals("2nd Semester")) {
                    Semester.set(Main.marker, "Graduating");
                    YearLev.set(Main.marker, "Graduating");
                }
                Reciept r = new Reciept();
            r.setVisible(true);
            dispose();
            }
            
        } else if (installRadio.isSelected()) {

            if (AssesmentPaper.first >= total) {
                JOptionPane.showMessageDialog(null, "Student Payment is not Enough!", "ATTENTION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Form.rems.set(Main.marker, "Enrolled");
                scholarPayment = AssesmentPaper.first+AssesmentPaper.second;
                meth="Installment";
                payment=total;
                change = total - AssesmentPaper.first;
                JOptionPane.showMessageDialog(null, "Transaction successful\nYou are now officially enrolled", "ATTENTION", JOptionPane.INFORMATION_MESSAGE);
                Main.studBalance[Main.marker] = second;
                System.out.println(Main.studBalance[Main.marker]);
                for (int x = 0; x < 36; x++) {
                    //subjectArray[Main.marker][0][x]=subs.get(x)+"";
                    subjectArray[Main.marker][1][x] = yearList.get(x) + "";
                    subjectArray[Main.marker][2][x] = semList.get(x) + "";

                    //q++;
                }
                if (Evaluation.markerIrreg == 1) {
                    for (int x = 0; x < AssesmentPaper.cpy.size(); x++) {
                        for (int y = 0; y < 10; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT1stsem1.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 10; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT1stsem2.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 8; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT2ndsem1.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 8; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT2ndsem2.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }

                    }
                    
                    first = 0.0;
                    second = 0.0;
                    total = 0.0;
                    dispose();
                    codeI.clear();
                    AssesmentPaper.totalUnits = 0;
                } else {
                    if (reg == 1) {

                        for (int x = 0; x < 10; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 2) {

                        for (int x = 10; x < 20; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 3) {

                        for (int x = 20; x < 28; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 4) {

                        for (int x = 28; x < 36; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    }
                    //for(int x=0; x<subs.size(); x++)
                    //{
                    //ctr[Main.marker]++;
                    //}
                    totalUnits = 0;
                    first = 0.0;
                    second = 0.0;
                    total = 0.0;
                    dispose();
                    codeI.clear();
                    AssesmentPaper.totalUnits = 0;
                }

                if (Form.YearLev.get(Main.marker).toString().equals("1st Year") && Semester.get(Main.marker).toString().equals("1st Semester")) {
                    Semester.set(Main.marker, "2nd Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("1st Year") && Semester.get(Main.marker).toString().equals("2nd Semester")) {
                    YearLev.set(Main.marker, "2nd Year");
                    Semester.set(Main.marker, "1st Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("2nd Year") && Semester.get(Main.marker).toString().equals("1st Semester")) {
                    Semester.set(Main.marker, "2nd Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("2nd Year") && Semester.get(Main.marker).toString().equals("2nd Semester")) {
                    Semester.set(Main.marker, "Graduating");
                    YearLev.set(Main.marker, "Graduating");
                }
                  Reciept r = new Reciept();
            r.setVisible(true);
            dispose();
            }
          

        } else if (promiRadio.isSelected()) {
            //double tempTotal = Double.parseDouble(promiTxt.getText());
            if (total < 1000) {
                JOptionPane.showMessageDialog(null, "Sorry the lowest possible payment is P 1000.00", "Promisory", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Form.rems.set(Main.marker, "Enrolled");
                scholarPayment = AssesmentPaper.first+AssesmentPaper.second;
                meth="Promisory";
                payment=total;
                change = total - (AssesmentPaper.first+second);
                JOptionPane.showMessageDialog(null, "Transaction successful\nYou are now officially enrolled", "ATTENTION", JOptionPane.INFORMATION_MESSAGE);
                Double bal = (first + second) - total;
                Main.studBalance[Main.marker] = bal;
                System.out.println(Main.studBalance[Main.marker]);
                for (int x = 0; x < 36; x++) {
                    //subjectArray[Main.marker][0][x]=subs.get(x)+"";
                    subjectArray[Main.marker][1][x] = yearList.get(x) + "";
                    subjectArray[Main.marker][2][x] = semList.get(x) + "";

                    //q++;
                }
                if (Evaluation.markerIrreg == 1) {
                    for (int x = 0; x < AssesmentPaper.cpy.size(); x++) {
                        for (int y = 0; y < 10; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT1stsem1.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 10; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT1stsem2.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 8; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT2ndsem1.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }
                        for (int y = 0; y < 8; y++) {
                            if (AssesmentPaper.cpy.get(x).equals(Evaluation.subjT2ndsem2.getValueAt(y, 1))) {
                                Main.remarks[Main.marker][y] = "*";
                            }
                        }

                    }
                    totalUnits = 0;
                    first = 0.0;
                    second = 0.0;
                    total = 0.0;
                    dispose();
                    codeI.clear();
                    AssesmentPaper.totalUnits = 0;
                } else {
                    if (reg == 1) {

                        for (int x = 0; x < 10; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 2) {

                        for (int x = 10; x < 20; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 3) {

                        for (int x = 20; x < 28; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    } else if (reg == 4) {

                        for (int x = 28; x < 36; x++) {
                            Main.remarks[Main.marker][x] = "*";
                        }
                    }
                    //for(int x=0; x<subs.size(); x++)
                    //{
                    //ctr[Main.marker]++;
                    //}
                    totalUnits = 0;
                    first = 0.0;
                    second = 0.0;
                    total = 0.0;
                    dispose();
                    codeI.clear();
                    AssesmentPaper.totalUnits = 0;
                }

                if (Form.YearLev.get(Main.marker).toString().equals("1st Year") && Semester.get(Main.marker).toString().equals("1st Semester")) {
                    Semester.set(Main.marker, "2nd Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("1st Year") && Semester.get(Main.marker).toString().equals("2nd Semester")) {
                    YearLev.set(Main.marker, "2nd Year");
                    Semester.set(Main.marker, "1st Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("2nd Year") && Semester.get(Main.marker).toString().equals("1st Semester")) {
                    Semester.set(Main.marker, "2nd Semester");
                } else if (Form.YearLev.get(Main.marker).toString().equals("2nd Year") && Semester.get(Main.marker).toString().equals("2nd Semester")) {
                    Semester.set(Main.marker, "Graduating");
                    YearLev.set(Main.marker, "Graduating");
                }
                
                
                
                 Reciept r = new Reciept();
            r.setVisible(true);
            viewStudRecords();
            dispose();
            }
           
        } else {
            JOptionPane.showMessageDialog(null, "Please select a payment method", "Payment Method", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void installRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_installRadioItemStateChanged

    }//GEN-LAST:event_installRadioItemStateChanged

    private void promiRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_promiRadioItemStateChanged

    }//GEN-LAST:event_promiRadioItemStateChanged

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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel blackPanelDesign;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton cashRadio;
    private javax.swing.JLabel fiftyLabel;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel fiveHunLabel;
    private javax.swing.JPanel grayPanelDesign;
    private javax.swing.JRadioButton installRadio;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel oneHunLabel;
    private javax.swing.JLabel oneThouLabel;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JRadioButton promiRadio;
    private javax.swing.JLabel scholarLabel;
    private javax.swing.JLabel secondLabel;
    private javax.swing.JLabel studInfoLabel;
    private javax.swing.JPanel totP;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalLabel1;
    private javax.swing.JLabel twentyLabel;
    private javax.swing.JLabel twoHunLabel;
    // End of variables declaration//GEN-END:variables
}
