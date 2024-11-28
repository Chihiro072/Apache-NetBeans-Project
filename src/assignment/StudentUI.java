/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.awt.Color;

public class StudentUI extends javax.swing.JFrame {  
    
    Student std = new Student();
    
    public StudentUI(){
        initComponents();
        idLbl.setText(std.getId());
        std.setid(std.getId());
        jLabel4.setText(std.getUsername());
        jLabel5.setText(std.getRole());
        std.setDetails();
        std.setScaledImage("back icon.png", backIcn6);
        std.setScaledImage("refresh icon.png", refreshIcn6);      
        std.setScaledImage("umaru.png", jLabel3);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        upperTab6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        backIcn6 = new javax.swing.JLabel();
        refreshIcn6 = new javax.swing.JLabel();
        logoutLbl6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SFBtn = new javax.swing.JButton();
        VRBtn = new javax.swing.JButton();
        SRBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SPRBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        VPDBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        BlankPanel = new javax.swing.JPanel();
        SubmitReportPanel = new javax.swing.JPanel();
        SubmitBtn = new javax.swing.JButton();
        StdIDLabel = new javax.swing.JLabel();
        StdNameLabel = new javax.swing.JLabel();
        TcIDLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        AssessmentLabel = new javax.swing.JLabel();
        ReportLabel = new javax.swing.JLabel();
        StdIDText = new javax.swing.JLabel();
        StdNameText = new javax.swing.JLabel();
        TcIDText = new javax.swing.JLabel();
        DateText = new javax.swing.JLabel();
        AssessmentText = new javax.swing.JLabel();
        ReportText = new javax.swing.JLabel();
        AttachBtn = new javax.swing.JButton();
        SendRequestPanel = new javax.swing.JPanel();
        StdIDLabel1 = new javax.swing.JLabel();
        StdIDText1 = new javax.swing.JLabel();
        StdNameLabel1 = new javax.swing.JLabel();
        StdNameText1 = new javax.swing.JLabel();
        AssessmentLabel1 = new javax.swing.JLabel();
        AssessmentText1 = new javax.swing.JLabel();
        ContactLabel = new javax.swing.JLabel();
        TcIDLabel1 = new javax.swing.JLabel();
        TcIDText1 = new javax.swing.JLabel();
        DateLabel1 = new javax.swing.JLabel();
        DateText1 = new javax.swing.JLabel();
        SendRequestBtn = new javax.swing.JButton();
        ContactText = new javax.swing.JLabel();
        ViewResultPanel = new javax.swing.JPanel();
        RCB = new javax.swing.JComboBox<>();
        ResultPanel = new javax.swing.JPanel();
        GradePanel = new javax.swing.JPanel();
        StdIDLabel2 = new javax.swing.JLabel();
        StdIDText2 = new javax.swing.JLabel();
        StdNameLabel2 = new javax.swing.JLabel();
        StdNameText2 = new javax.swing.JLabel();
        AssessmentText2 = new javax.swing.JLabel();
        AssessmentLabel2 = new javax.swing.JLabel();
        DateLabel2 = new javax.swing.JLabel();
        DateText2 = new javax.swing.JLabel();
        ReportText2 = new javax.swing.JLabel();
        GradeText = new javax.swing.JLabel();
        ReportLabel2 = new javax.swing.JLabel();
        GradeLabel = new javax.swing.JLabel();
        FeedbackPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportFeedback = new javax.swing.JTextArea();
        TcIDLabel2 = new javax.swing.JLabel();
        TcIDText2 = new javax.swing.JLabel();
        SubmitFeedbackPanel = new javax.swing.JPanel();
        anonymousChck = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        FeedbackText = new javax.swing.JTextArea();
        SubmitBtn1 = new javax.swing.JButton();
        ViewProfilePanel = new javax.swing.JPanel();
        StdIDLabel3 = new javax.swing.JLabel();
        StdIDText3 = new javax.swing.JLabel();
        StdNameText3 = new javax.swing.JLabel();
        StdNameLabel3 = new javax.swing.JLabel();
        RoleLabel3 = new javax.swing.JLabel();
        RoleText3 = new javax.swing.JLabel();
        ContactLabel3 = new javax.swing.JLabel();
        ContactText3 = new javax.swing.JLabel();
        DOBText = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        GenderText = new javax.swing.JLabel();
        CourseLabel = new javax.swing.JLabel();
        CourseText = new javax.swing.JLabel();
        NationLabel = new javax.swing.JLabel();
        NationText = new javax.swing.JLabel();
        EmergencyLabel = new javax.swing.JLabel();
        EmergencyText = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        AddressText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(255, 255, 255));

        upperTab6.setBackground(new java.awt.Color(245, 245, 245));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/ac20.png"))); // NOI18N
        jLabel24.setText("Academic Guidance Hub");

        backIcn6.setMaximumSize(new java.awt.Dimension(16, 16));
        backIcn6.setMinimumSize(new java.awt.Dimension(16, 16));
        backIcn6.setPreferredSize(new java.awt.Dimension(16, 16));
        backIcn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIcn6MouseClicked(evt);
            }
        });

        refreshIcn6.setMaximumSize(new java.awt.Dimension(16, 16));
        refreshIcn6.setMinimumSize(new java.awt.Dimension(16, 16));
        refreshIcn6.setPreferredSize(new java.awt.Dimension(16, 16));
        refreshIcn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshIcn6MouseClicked(evt);
            }
        });

        logoutLbl6.setForeground(new java.awt.Color(52, 152, 219));
        logoutLbl6.setText("Logout?");
        logoutLbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLbl6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout upperTab6Layout = new javax.swing.GroupLayout(upperTab6);
        upperTab6.setLayout(upperTab6Layout);
        upperTab6Layout.setHorizontalGroup(
            upperTab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperTab6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(backIcn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshIcn6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        upperTab6Layout.setVerticalGroup(
            upperTab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperTab6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperTab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshIcn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backIcn6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(upperTab6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(upperTab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(logoutLbl6))))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setForeground(new java.awt.Color(149, 165, 166));
        jLabel5.setText("Role");

        SFBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SFBtn.setForeground(new java.awt.Color(51, 51, 51));
        SFBtn.setText("Submit Feedback");
        SFBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SFBtn.setContentAreaFilled(false);
        SFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SFBtnActionPerformed(evt);
            }
        });

        VRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VRBtn.setForeground(new java.awt.Color(51, 51, 51));
        VRBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        VRBtn.setContentAreaFilled(false);
        VRBtn.setLabel("View Result");
        VRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VRBtnActionPerformed(evt);
            }
        });

        SRBtn.setBackground(new java.awt.Color(240, 240, 240));
        SRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SRBtn.setForeground(new java.awt.Color(51, 51, 51));
        SRBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SRBtn.setContentAreaFilled(false);
        SRBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SRBtn.setLabel("Submit Report");
        SRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRBtnActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(189, 72, 249));
        jLabel6.setForeground(new java.awt.Color(189, 72, 249));
        jLabel6.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(189, 72, 249));
        jLabel9.setForeground(new java.awt.Color(189, 72, 249));
        jLabel9.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(189, 72, 249));
        jLabel8.setForeground(new java.awt.Color(189, 72, 249));
        jLabel8.setOpaque(true);

        SPRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SPRBtn.setForeground(new java.awt.Color(51, 51, 51));
        SPRBtn.setActionCommand("Send Presentation Request");
        SPRBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SPRBtn.setContentAreaFilled(false);
        SPRBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SPRBtn.setLabel("Send Presentation Request");
        SPRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPRBtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(189, 72, 249));
        jLabel10.setForeground(new java.awt.Color(189, 72, 249));
        jLabel10.setOpaque(true);

        VPDBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VPDBtn.setForeground(new java.awt.Color(51, 51, 51));
        VPDBtn.setText("View Profile Details");
        VPDBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        VPDBtn.setContentAreaFilled(false);
        VPDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VPDBtnActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(189, 72, 249));
        jLabel7.setForeground(new java.awt.Color(189, 72, 249));
        jLabel7.setOpaque(true);

        idLbl.setForeground(new java.awt.Color(149, 165, 166));
        idLbl.setText("Id");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upperTab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SFBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VPDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(218, 218, 218))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SPRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(upperTab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(idLbl)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(20, 20, 20)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addComponent(SRBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addComponent(VRBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(SPRBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFBtn)
                    .addComponent(VPDBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        HeaderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel6, jLabel8, jLabel9});

        HeaderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SFBtn, SPRBtn, SRBtn, VPDBtn, VRBtn});

        Body.setBackground(new java.awt.Color(240, 240, 240));
        Body.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout BlankPanelLayout = new javax.swing.GroupLayout(BlankPanel);
        BlankPanel.setLayout(BlankPanelLayout);
        BlankPanelLayout.setHorizontalGroup(
            BlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        BlankPanelLayout.setVerticalGroup(
            BlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        Body.add(BlankPanel, "card4");

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        StdIDLabel.setText("Student ID:");

        StdNameLabel.setText("Student Name:");

        TcIDLabel.setText("Teacher ID:");

        DateLabel.setText("Submission Date:");

        AssessmentLabel.setText("Assessment:");

        ReportLabel.setText("Report:");

        StdIDText.setText("-");

        StdNameText.setText("-");

        TcIDText.setText("-");

        DateText.setText("-");

        AssessmentText.setText("-");

        ReportText.setText("-");

        AttachBtn.setText("Attach");
        AttachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttachBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubmitReportPanelLayout = new javax.swing.GroupLayout(SubmitReportPanel);
        SubmitReportPanel.setLayout(SubmitReportPanelLayout);
        SubmitReportPanelLayout.setHorizontalGroup(
            SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitReportPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(SubmitBtn)
                .addGap(273, 273, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitReportPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AttachBtn)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitReportPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SubmitReportPanelLayout.createSequentialGroup()
                        .addComponent(StdNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StdNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SubmitReportPanelLayout.createSequentialGroup()
                        .addComponent(StdIDLabel)
                        .addGap(34, 34, 34)
                        .addComponent(StdIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SubmitReportPanelLayout.createSequentialGroup()
                        .addComponent(AssessmentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AssessmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateLabel)
                    .addComponent(ReportLabel)
                    .addComponent(TcIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TcIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReportText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        SubmitReportPanelLayout.setVerticalGroup(
            SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitReportPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StdIDLabel)
                    .addComponent(DateLabel)
                    .addComponent(StdIDText)
                    .addComponent(DateText))
                .addGap(18, 18, 18)
                .addGroup(SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StdNameLabel)
                    .addComponent(StdNameText)
                    .addComponent(TcIDLabel)
                    .addComponent(TcIDText))
                .addGap(18, 18, 18)
                .addGroup(SubmitReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReportLabel)
                    .addComponent(AssessmentLabel)
                    .addComponent(AssessmentText)
                    .addComponent(ReportText))
                .addGap(18, 18, 18)
                .addComponent(AttachBtn)
                .addGap(45, 45, 45)
                .addComponent(SubmitBtn)
                .addGap(23, 23, 23))
        );

        Body.add(SubmitReportPanel, "card3");

        StdIDLabel1.setText("Student ID:");

        StdIDText1.setText("-");

        StdNameLabel1.setText("Student Name:");

        StdNameText1.setText("-");

        AssessmentLabel1.setText("Assessment:");

        AssessmentText1.setText("-");

        ContactLabel.setText("Contact:");

        TcIDLabel1.setText("Teacher ID:");

        TcIDText1.setText("-");

        DateLabel1.setText("Presentation Date:");

        DateText1.setText("-");

        SendRequestBtn.setText("Send Request");
        SendRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendRequestBtnActionPerformed(evt);
            }
        });

        ContactText.setText("-");

        javax.swing.GroupLayout SendRequestPanelLayout = new javax.swing.GroupLayout(SendRequestPanel);
        SendRequestPanel.setLayout(SendRequestPanelLayout);
        SendRequestPanelLayout.setHorizontalGroup(
            SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendRequestPanelLayout.createSequentialGroup()
                .addGroup(SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SendRequestPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SendRequestPanelLayout.createSequentialGroup()
                                .addComponent(StdNameLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StdNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SendRequestPanelLayout.createSequentialGroup()
                                .addComponent(StdIDLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(StdIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SendRequestPanelLayout.createSequentialGroup()
                                .addComponent(AssessmentLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AssessmentText1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateLabel1)
                            .addComponent(TcIDLabel1)
                            .addComponent(ContactLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TcIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateText1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContactText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SendRequestPanelLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(SendRequestBtn)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        SendRequestPanelLayout.setVerticalGroup(
            SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SendRequestPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StdIDLabel1)
                    .addComponent(DateLabel1)
                    .addComponent(StdIDText1)
                    .addComponent(DateText1))
                .addGap(18, 18, 18)
                .addGroup(SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StdNameLabel1)
                    .addComponent(StdNameText1)
                    .addComponent(TcIDLabel1)
                    .addComponent(TcIDText1))
                .addGap(18, 18, 18)
                .addGroup(SendRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactLabel)
                    .addComponent(AssessmentLabel1)
                    .addComponent(AssessmentText1)
                    .addComponent(ContactText))
                .addGap(55, 55, 55)
                .addComponent(SendRequestBtn)
                .addGap(24, 24, 24))
        );

        Body.add(SendRequestPanel, "card4");

        RCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCBActionPerformed(evt);
            }
        });

        ResultPanel.setLayout(new java.awt.CardLayout());

        StdIDLabel2.setText("Student ID:");

        StdIDText2.setText("-");

        StdNameLabel2.setText("Student Name:");

        StdNameText2.setText("-");

        AssessmentText2.setText("-");

        AssessmentLabel2.setText("Assessment:");

        DateLabel2.setText("Submission Date:");

        DateText2.setText("-");

        ReportText2.setText("-");

        GradeText.setText("-");

        ReportLabel2.setText("Report:");

        GradeLabel.setText("Grade:");

        javax.swing.GroupLayout GradePanelLayout = new javax.swing.GroupLayout(GradePanel);
        GradePanel.setLayout(GradePanelLayout);
        GradePanelLayout.setHorizontalGroup(
            GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
            .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GradePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(GradePanelLayout.createSequentialGroup()
                            .addComponent(StdNameLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StdNameText2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GradePanelLayout.createSequentialGroup()
                            .addComponent(StdIDLabel2)
                            .addGap(34, 34, 34)
                            .addComponent(StdIDText2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GradePanelLayout.createSequentialGroup()
                            .addComponent(AssessmentLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AssessmentText2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DateLabel2)
                        .addComponent(ReportLabel2)
                        .addComponent(GradeLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ReportText2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DateText2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GradeText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        GradePanelLayout.setVerticalGroup(
            GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
            .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GradePanelLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StdIDLabel2)
                        .addComponent(DateLabel2)
                        .addComponent(StdIDText2)
                        .addComponent(DateText2))
                    .addGap(18, 18, 18)
                    .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StdNameLabel2)
                        .addComponent(StdNameText2)
                        .addComponent(ReportLabel2)
                        .addComponent(ReportText2))
                    .addGap(18, 18, 18)
                    .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GradeLabel)
                        .addComponent(AssessmentLabel2)
                        .addComponent(AssessmentText2)
                        .addComponent(GradeText))
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        ResultPanel.add(GradePanel, "card2");

        ReportFeedback.setEditable(false);
        ReportFeedback.setColumns(20);
        ReportFeedback.setRows(5);
        jScrollPane1.setViewportView(ReportFeedback);

        TcIDLabel2.setText("Teacher ID:");

        TcIDText2.setText("-");

        javax.swing.GroupLayout FeedbackPanelLayout = new javax.swing.GroupLayout(FeedbackPanel);
        FeedbackPanel.setLayout(FeedbackPanelLayout);
        FeedbackPanelLayout.setHorizontalGroup(
            FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FeedbackPanelLayout.createSequentialGroup()
                        .addComponent(TcIDLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TcIDText2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FeedbackPanelLayout.setVerticalGroup(
            FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeedbackPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TcIDLabel2)
                    .addComponent(TcIDText2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        ResultPanel.add(FeedbackPanel, "card3");

        javax.swing.GroupLayout ViewResultPanelLayout = new javax.swing.GroupLayout(ViewResultPanel);
        ViewResultPanel.setLayout(ViewResultPanelLayout);
        ViewResultPanelLayout.setHorizontalGroup(
            ViewResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewResultPanelLayout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(RCB, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(ViewResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewResultPanelLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
        ViewResultPanelLayout.setVerticalGroup(
            ViewResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(ViewResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewResultPanelLayout.createSequentialGroup()
                    .addContainerGap(54, Short.MAX_VALUE)
                    .addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        Body.add(ViewResultPanel, "card5");

        anonymousChck.setText("Stay Anonymous");

        FeedbackText.setColumns(20);
        FeedbackText.setRows(5);
        jScrollPane2.setViewportView(FeedbackText);

        SubmitBtn1.setText("Submit");
        SubmitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubmitFeedbackPanelLayout = new javax.swing.GroupLayout(SubmitFeedbackPanel);
        SubmitFeedbackPanel.setLayout(SubmitFeedbackPanelLayout);
        SubmitFeedbackPanelLayout.setHorizontalGroup(
            SubmitFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitFeedbackPanelLayout.createSequentialGroup()
                .addGroup(SubmitFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubmitFeedbackPanelLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(anonymousChck))
                    .addGroup(SubmitFeedbackPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SubmitFeedbackPanelLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(SubmitBtn1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        SubmitFeedbackPanelLayout.setVerticalGroup(
            SubmitFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitFeedbackPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(anonymousChck)
                .addGap(18, 18, 18)
                .addComponent(SubmitBtn1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Body.add(SubmitFeedbackPanel, "card5");

        StdIDLabel3.setText("Student ID:");

        StdIDText3.setText("-");

        StdNameText3.setText("-");

        StdNameLabel3.setText("Student Name:");

        RoleLabel3.setText("Role:");

        RoleText3.setText("-");

        ContactLabel3.setText("Contact:");

        ContactText3.setText("-");

        DOBText.setText("-");

        DOBLabel.setText("DOB:");

        GenderLabel.setText("Gender:");

        GenderText.setText("-");

        CourseLabel.setText("Course:");

        CourseText.setText("-");

        NationLabel.setText("Nation:");

        NationText.setText("-");

        EmergencyLabel.setText("Emergency:");

        EmergencyText.setText("-");

        AddressLabel.setText("Address:");

        AddressText.setText("-");

        javax.swing.GroupLayout ViewProfilePanelLayout = new javax.swing.GroupLayout(ViewProfilePanel);
        ViewProfilePanel.setLayout(ViewProfilePanelLayout);
        ViewProfilePanelLayout.setHorizontalGroup(
            ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewProfilePanelLayout.createSequentialGroup()
                        .addComponent(CourseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CourseText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                        .addComponent(StdNameLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StdNameText3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                        .addComponent(StdIDLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(StdIDText3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                        .addComponent(RoleLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RoleText3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                        .addComponent(DOBLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DOBText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContactLabel3)
                    .addComponent(GenderLabel)
                    .addComponent(NationLabel)
                    .addComponent(EmergencyLabel)
                    .addComponent(AddressLabel))
                .addGap(18, 18, 18)
                .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmergencyText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NationText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactText3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        ViewProfilePanelLayout.setVerticalGroup(
            ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                        .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StdIDLabel3)
                            .addComponent(StdIDText3))
                        .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(DOBText))
                            .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                                .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StdNameLabel3)
                                    .addComponent(StdNameText3))
                                .addGap(18, 18, 18)
                                .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RoleLabel3)
                                    .addComponent(RoleText3))
                                .addGap(18, 18, 18)
                                .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CourseLabel)
                                    .addComponent(CourseText))
                                .addGap(18, 18, 18)
                                .addComponent(DOBLabel))))
                    .addGroup(ViewProfilePanelLayout.createSequentialGroup()
                        .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenderLabel)
                            .addComponent(GenderText))
                        .addGap(18, 18, 18)
                        .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NationLabel)
                            .addComponent(NationText))
                        .addGap(18, 18, 18)
                        .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContactLabel3)
                            .addComponent(ContactText3))
                        .addGap(18, 18, 18)
                        .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmergencyLabel)
                            .addComponent(EmergencyText))
                        .addGap(18, 18, 18)
                        .addGroup(ViewProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressLabel)
                            .addComponent(AddressText))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Body.add(ViewProfilePanel, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VPDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VPDBtnActionPerformed
        std.newPanel(Body, ViewProfilePanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(189,72,249));
        StdIDText3.setText(std.getId());
        StdNameText3.setText(std.getUsername());
        RoleText3.setText("Student");
        CourseText.setText(std.getCourse());
        DOBText.setText(std.getDOB());
        GenderText.setText(std.getGender());
        NationText.setText(std.getNation());
        ContactText3.setText(std.getContact());
        EmergencyText.setText(std.getEmergency());
        AddressText.setText(std.getAddress());
    }//GEN-LAST:event_VPDBtnActionPerformed

    private void SPRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPRBtnActionPerformed
        std.newPanel(Body, SendRequestPanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(189,72,249));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        StdIDText1.setText(std.getId());
        StdNameText1.setText(std.getUsername());
        DateText1.setText(std.getPresentationDate());
        TcIDText1.setText(std.getTCID());
        AssessmentText1.setText(std.getAssessment());
        std.getContact(ContactText);
        if(!DateText1.getText().equals("-")){
            SendRequestBtn.setVisible(false);
        }
    }//GEN-LAST:event_SPRBtnActionPerformed

    private void SRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRBtnActionPerformed
        std.newPanel(Body, SubmitReportPanel);
        jLabel6.setBackground(new Color(189,72,249));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        StdIDText.setText(std.getId());
        StdNameText.setText(std.getUsername());
        if(std.getSubmissionDate().equals("-")){
            DateText.setText(std.getCurrentDate());
        }
        else{
            DateText.setText(std.getSubmissionDate());
        }
        TcIDText.setText(std.getTCID());
        AssessmentText.setText(std.getAssessment());
        ReportText.setText(std.getReport());
        if(!std.getReport().equals("-")){
            AttachBtn.setVisible(false);
            SubmitBtn.setVisible(false);
        }
    }//GEN-LAST:event_SRBtnActionPerformed

    private void VRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VRBtnActionPerformed
        std.newPanel(Body, ViewResultPanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(189,72,249));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        std.setResultComboBox(RCB);
        StdIDText2.setText(std.getId());
        StdNameText2.setText(std.getUsername());
        DateText2.setText(std.getSubmissionDate());
        ReportText2.setText(std.getReport());
        AssessmentText2.setText(std.getAssessment());
        GradeText.setText(std.getGrade());
    }//GEN-LAST:event_VRBtnActionPerformed

    private void SFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SFBtnActionPerformed
        std.newPanel(Body, SubmitFeedbackPanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(189,72,249));
        jLabel10.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_SFBtnActionPerformed

    private void logoutLbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLbl6MouseClicked
        this.dispose();
    }//GEN-LAST:event_logoutLbl6MouseClicked

    private void refreshIcn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshIcn6MouseClicked
        std.refresh(Body);
        this.std = new Student();
    }//GEN-LAST:event_refreshIcn6MouseClicked

    private void backIcn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIcn6MouseClicked
        jLabel6.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        std.newPanel(Body, BlankPanel);
    }//GEN-LAST:event_backIcn6MouseClicked

    private void SendRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendRequestBtnActionPerformed
        std.sendPresentationRequest();
    }//GEN-LAST:event_SendRequestBtnActionPerformed

    private void RCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCBActionPerformed
        if(RCB.getSelectedIndex() == 0){
            std.newPanel(ResultPanel, GradePanel);
        }
        else{
            std.newPanel(ResultPanel, FeedbackPanel);
            std.setResultFeedback(RCB, TcIDText2, ReportFeedback);
        }
    }//GEN-LAST:event_RCBActionPerformed

    private void SubmitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtn1ActionPerformed
        std.sendFeedback(FeedbackText, anonymousChck);
    }//GEN-LAST:event_SubmitBtn1ActionPerformed

    private void AttachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttachBtnActionPerformed
        std.getFile(ReportText);
    }//GEN-LAST:event_AttachBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        std.submitReport();
    }//GEN-LAST:event_SubmitBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LecturerUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel AddressText;
    private javax.swing.JLabel AssessmentLabel;
    private javax.swing.JLabel AssessmentLabel1;
    private javax.swing.JLabel AssessmentLabel2;
    private javax.swing.JLabel AssessmentText;
    private javax.swing.JLabel AssessmentText1;
    private javax.swing.JLabel AssessmentText2;
    private javax.swing.JButton AttachBtn;
    private javax.swing.JPanel BlankPanel;
    private javax.swing.JPanel Body;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JLabel ContactLabel3;
    private javax.swing.JLabel ContactText;
    private javax.swing.JLabel ContactText3;
    private javax.swing.JLabel CourseLabel;
    private javax.swing.JLabel CourseText;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel DOBText;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DateLabel1;
    private javax.swing.JLabel DateLabel2;
    private javax.swing.JLabel DateText;
    private javax.swing.JLabel DateText1;
    private javax.swing.JLabel DateText2;
    private javax.swing.JLabel EmergencyLabel;
    private javax.swing.JLabel EmergencyText;
    private javax.swing.JPanel FeedbackPanel;
    private javax.swing.JTextArea FeedbackText;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel GenderText;
    private javax.swing.JLabel GradeLabel;
    private javax.swing.JPanel GradePanel;
    private javax.swing.JLabel GradeText;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel NationLabel;
    private javax.swing.JLabel NationText;
    private javax.swing.JComboBox<String> RCB;
    private javax.swing.JTextArea ReportFeedback;
    private javax.swing.JLabel ReportLabel;
    private javax.swing.JLabel ReportLabel2;
    private javax.swing.JLabel ReportText;
    private javax.swing.JLabel ReportText2;
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JLabel RoleLabel3;
    private javax.swing.JLabel RoleText3;
    private javax.swing.JButton SFBtn;
    private javax.swing.JButton SPRBtn;
    private javax.swing.JButton SRBtn;
    private javax.swing.JButton SendRequestBtn;
    private javax.swing.JPanel SendRequestPanel;
    private javax.swing.JLabel StdIDLabel;
    private javax.swing.JLabel StdIDLabel1;
    private javax.swing.JLabel StdIDLabel2;
    private javax.swing.JLabel StdIDLabel3;
    private javax.swing.JLabel StdIDText;
    private javax.swing.JLabel StdIDText1;
    private javax.swing.JLabel StdIDText2;
    private javax.swing.JLabel StdIDText3;
    private javax.swing.JLabel StdNameLabel;
    private javax.swing.JLabel StdNameLabel1;
    private javax.swing.JLabel StdNameLabel2;
    private javax.swing.JLabel StdNameLabel3;
    private javax.swing.JLabel StdNameText;
    private javax.swing.JLabel StdNameText1;
    private javax.swing.JLabel StdNameText2;
    private javax.swing.JLabel StdNameText3;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton SubmitBtn1;
    private javax.swing.JPanel SubmitFeedbackPanel;
    private javax.swing.JPanel SubmitReportPanel;
    private javax.swing.JLabel TcIDLabel;
    private javax.swing.JLabel TcIDLabel1;
    private javax.swing.JLabel TcIDLabel2;
    private javax.swing.JLabel TcIDText;
    private javax.swing.JLabel TcIDText1;
    private javax.swing.JLabel TcIDText2;
    private javax.swing.JButton VPDBtn;
    private javax.swing.JButton VRBtn;
    private javax.swing.JPanel ViewProfilePanel;
    private javax.swing.JPanel ViewResultPanel;
    private javax.swing.JCheckBox anonymousChck;
    private javax.swing.JLabel backIcn6;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutLbl6;
    private javax.swing.JLabel refreshIcn6;
    private javax.swing.JPanel upperTab6;
    // End of variables declaration//GEN-END:variables
}
