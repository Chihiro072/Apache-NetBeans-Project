/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.awt.Color;

public class LecturerUI extends javax.swing.JFrame {  
    
    Lecturer lec = new Lecturer();
    
    public LecturerUI(){
        initComponents();
        idLbl.setText(lec.getId());
        jLabel4.setText(lec.getUsername());
        jLabel5.setText(lec.getRole());
        lec.setScaledImage("back icon.png", backIcn6);
        lec.setScaledImage("refresh icon.png", refreshIcn6);      
        lec.setScaledImage("umaru.png", jLabel3);
        RCB.setVisible(false);
        DateLabel.setVisible(true);
        DateLabel.setText(lec.getCurrentDate());
        if(lec.getRole().equals("Project Manager")){
            RCB.setVisible(true);
            lec.setRoleCombobox(RCB);
        }
        lec.checkRole();
        lec.showDashboard(Table);
        GCB.removeAllItems();
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel11.setBackground(new Color(255,255,255));
        RejectBtn.setVisible(false);
        if(lec.getRole().equals("Second Marker")){
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            VPRBtn.setVisible(false);
            VSLBtn.setVisible(false);
            DbBtn.setVisible(false);
            GradeLabel.setVisible(false);
            GCB.setVisible(false);
            SMCB.setVisible(false);
            VSMBtn.setText("View Request");
            RejectBtn.setVisible(true);
        }
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
        VPRBtn = new javax.swing.JButton();
        ERBtn = new javax.swing.JButton();
        VASBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VSMBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        VSLBtn = new javax.swing.JButton();
        DbBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        RCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        TablePanel = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        TableScrollPanel = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ERPanel = new javax.swing.JPanel();
        ViewReportLabel = new javax.swing.JLabel();
        SCB = new javax.swing.JComboBox<>();
        FeedbackScrollPanel = new javax.swing.JScrollPane();
        FeedbackTextArea = new javax.swing.JTextArea();
        SubmitBtn = new javax.swing.JButton();
        SubmissionDateLabel = new javax.swing.JLabel();
        SubmissionDateText = new javax.swing.JLabel();
        GradeLabel = new javax.swing.JLabel();
        GCB = new javax.swing.JComboBox<>();
        ClickableTablePanel = new javax.swing.JPanel();
        ClickableTableScrollPanel = new javax.swing.JScrollPane();
        ClickableTable = new javax.swing.JTable();
        IDLabel = new javax.swing.JLabel();
        IDText = new javax.swing.JLabel();
        PresentationDateChooser = new com.toedter.calendar.JDateChooser();
        Btn = new javax.swing.JButton();
        SMCB = new javax.swing.JComboBox<>();
        RejectBtn = new javax.swing.JButton();

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
                .addComponent(refreshIcn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
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

        VPRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VPRBtn.setForeground(new java.awt.Color(51, 51, 51));
        VPRBtn.setText("View Presentation Requests");
        VPRBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        VPRBtn.setContentAreaFilled(false);
        VPRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VPRBtnActionPerformed(evt);
            }
        });

        ERBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ERBtn.setForeground(new java.awt.Color(51, 51, 51));
        ERBtn.setText("Evaluate Report");
        ERBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ERBtn.setContentAreaFilled(false);
        ERBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ERBtnActionPerformed(evt);
            }
        });

        VASBtn.setBackground(new java.awt.Color(240, 240, 240));
        VASBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VASBtn.setForeground(new java.awt.Color(51, 51, 51));
        VASBtn.setText("View Assigned Supervisees");
        VASBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        VASBtn.setContentAreaFilled(false);
        VASBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VASBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VASBtnActionPerformed(evt);
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

        VSMBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VSMBtn.setForeground(new java.awt.Color(51, 51, 51));
        VSMBtn.setText("View Second Marker");
        VSMBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        VSMBtn.setContentAreaFilled(false);
        VSMBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VSMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VSMBtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(189, 72, 249));
        jLabel10.setForeground(new java.awt.Color(189, 72, 249));
        jLabel10.setOpaque(true);

        VSLBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VSLBtn.setForeground(new java.awt.Color(51, 51, 51));
        VSLBtn.setText("View Supervisees List");
        VSLBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        VSLBtn.setContentAreaFilled(false);
        VSLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VSLBtnActionPerformed(evt);
            }
        });

        DbBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DbBtn.setForeground(new java.awt.Color(51, 51, 51));
        DbBtn.setText("Dashboard");
        DbBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DbBtn.setContentAreaFilled(false);
        DbBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DbBtnActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(189, 72, 249));
        jLabel11.setForeground(new java.awt.Color(189, 72, 249));
        jLabel11.setOpaque(true);

        RCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCBActionPerformed(evt);
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
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RCB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(idLbl))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VASBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VSMBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(VPRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(HeaderLayout.createSequentialGroup()
                                        .addComponent(VSLBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ERBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DbBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(upperTab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
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
                                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(RCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addGap(20, 20, 20)
                                .addComponent(VASBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ERBtn)
                                    .addComponent(VSMBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addComponent(DbBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VPRBtn)
                            .addComponent(VSLBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        HeaderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel6, jLabel8, jLabel9});

        HeaderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ERBtn, VASBtn, VPRBtn, VSLBtn, VSMBtn});

        Body.setBackground(new java.awt.Color(240, 240, 240));
        Body.setLayout(new java.awt.CardLayout());

        DateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DateLabel.setText("Date");
        DateLabel.setToolTipText("");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableScrollPanel.setViewportView(Table);
        Table.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TablePanelLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        Body.add(TablePanel, "card4");

        ViewReportLabel.setForeground(new java.awt.Color(52, 152, 219));
        ViewReportLabel.setText("View Report");
        ViewReportLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ViewReportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewReportLabelMouseClicked(evt);
            }
        });

        SCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCBActionPerformed(evt);
            }
        });

        FeedbackTextArea.setColumns(20);
        FeedbackTextArea.setRows(5);
        FeedbackScrollPanel.setViewportView(FeedbackTextArea);

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        SubmissionDateLabel.setText("Submission Date:");

        GradeLabel.setText("Grade:");

        javax.swing.GroupLayout ERPanelLayout = new javax.swing.GroupLayout(ERPanel);
        ERPanel.setLayout(ERPanelLayout);
        ERPanelLayout.setHorizontalGroup(
            ERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ERPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(ERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ERPanelLayout.createSequentialGroup()
                        .addComponent(SubmissionDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SubmissionDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GCB, 0, 62, Short.MAX_VALUE))
                    .addComponent(FeedbackScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ERPanelLayout.createSequentialGroup()
                        .addComponent(SCB, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewReportLabel)))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ERPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitBtn)
                .addGap(276, 276, 276))
        );
        ERPanelLayout.setVerticalGroup(
            ERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ERPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewReportLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmissionDateLabel)
                    .addComponent(SubmissionDateText)
                    .addComponent(GradeLabel)
                    .addComponent(GCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(FeedbackScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitBtn)
                .addGap(18, 18, 18))
        );

        Body.add(ERPanel, "card3");

        ClickableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ClickableTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickableTableMouseClicked(evt);
            }
        });
        ClickableTableScrollPanel.setViewportView(ClickableTable);

        IDLabel.setText("ID:");

        PresentationDateChooser.setDateFormatString("yyyy MM dd");
        PresentationDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PresentationDateChooserPropertyChange(evt);
            }
        });

        Btn.setText("Confirm");
        Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActionPerformed(evt);
            }
        });

        SMCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assigned Second Marker", "Available Second Marker" }));
        SMCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMCBActionPerformed(evt);
            }
        });

        RejectBtn.setText("Reject");
        RejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClickableTablePanelLayout = new javax.swing.GroupLayout(ClickableTablePanel);
        ClickableTablePanel.setLayout(ClickableTablePanelLayout);
        ClickableTablePanelLayout.setHorizontalGroup(
            ClickableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClickableTablePanelLayout.createSequentialGroup()
                .addGroup(ClickableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClickableTablePanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(ClickableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClickableTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClickableTablePanelLayout.createSequentialGroup()
                                .addComponent(RejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClickableTablePanelLayout.createSequentialGroup()
                                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PresentationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClickableTablePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SMCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ClickableTablePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Btn, RejectBtn});

        ClickableTablePanelLayout.setVerticalGroup(
            ClickableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClickableTablePanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(SMCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClickableTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ClickableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PresentationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ClickableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(IDText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IDLabel)))
                .addGap(32, 32, 32)
                .addGroup(ClickableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn)
                    .addComponent(RejectBtn))
                .addGap(17, 17, 17))
        );

        Body.add(ClickableTablePanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void ViewReportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewReportLabelMouseClicked
        lec.openReport(SCB);
    }//GEN-LAST:event_ViewReportLabelMouseClicked

    private void VPRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VPRBtnActionPerformed
        lec.newPanel(Body, ClickableTablePanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(189,72,249));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel11.setBackground(new Color(255,255,255));
        IDLabel.setVisible(true);
        IDText.setVisible(true);
        IDText.setText("");
        PresentationDateChooser.setVisible(true);
        SMCB.setVisible(false);
        Btn.setVisible(true);
        Btn.setText("Confirm");
        lec.showPR(ClickableTable);
    }//GEN-LAST:event_VPRBtnActionPerformed

    private void ERBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ERBtnActionPerformed
        lec.newPanel(Body, ERPanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(189,72,249));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel11.setBackground(new Color(255,255,255));
        lec.showReport(SCB);
        lec.showGrade(GCB);
    }//GEN-LAST:event_ERBtnActionPerformed

    private void VASBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VASBtnActionPerformed
        lec.newPanel(Body, TablePanel);
        jLabel6.setBackground(new Color(189,72,249));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel11.setBackground(new Color(255,255,255));
        lec.showAS(Table);
    }//GEN-LAST:event_VASBtnActionPerformed

    private void VSMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VSMBtnActionPerformed
        lec.newPanel(Body, ClickableTablePanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(189,72,249));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel11.setBackground(new Color(255,255,255));
        IDText.setText("");
        PresentationDateChooser.setVisible(false);
        if(lec.getRole().equals("Second Marker")){
            lec.showSR(ClickableTable);
        }
        else{
            SMCB.setVisible(true);
            SMCB.setSelectedIndex(0);
            Btn.setText("Send Request");
            lec.showSM(SMCB, ClickableTable, IDLabel, IDText, Btn);
        }
    }//GEN-LAST:event_VSMBtnActionPerformed

    private void VSLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VSLBtnActionPerformed
        lec.newPanel(Body, TablePanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(189,72,249));
        jLabel11.setBackground(new Color(255,255,255));
        lec.showSL(Table);
    }//GEN-LAST:event_VSLBtnActionPerformed

    private void DbBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DbBtnActionPerformed
        lec.newPanel(Body, TablePanel);
        jLabel6.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel11.setBackground(new Color(189,72,249));
        DateLabel.setText(lec.getCurrentDate());
        lec.showDashboard(Table);
    }//GEN-LAST:event_DbBtnActionPerformed

    private void SCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCBActionPerformed
        lec.showSubmissionDate(SCB, SubmissionDateText);
    }//GEN-LAST:event_SCBActionPerformed

    private void ClickableTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickableTableMouseClicked
        lec.chooseRow(ClickableTable, IDText);
    }//GEN-LAST:event_ClickableTableMouseClicked

    private void BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActionPerformed
        if(lec.getRole().equals("Second Marker")){
            lec.confirmRequest(ClickableTable, IDText);
        }
        else if(Btn.getText().equals("Confirm")){
            lec.confirmPR(ClickableTable, IDText, PresentationDateChooser);
        }
        else if(Btn.getText().equals("Send Request")){
            lec.sendRequest(ClickableTable, IDText);
        }
    }//GEN-LAST:event_BtnActionPerformed

    private void PresentationDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PresentationDateChooserPropertyChange
        lec.compareDate(PresentationDateChooser);
    }//GEN-LAST:event_PresentationDateChooserPropertyChange

    private void SMCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMCBActionPerformed
        lec.showSM(SMCB, ClickableTable, IDLabel, IDText, Btn);
    }//GEN-LAST:event_SMCBActionPerformed

    private void RejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectBtnActionPerformed
        lec.rejectRequest(ClickableTable, IDText);
    }//GEN-LAST:event_RejectBtnActionPerformed

    private void backIcn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIcn6MouseClicked
        jLabel6.setBackground(new Color(255,255,255));
        jLabel9.setBackground(new Color(255,255,255));
        jLabel8.setBackground(new Color(255,255,255));
        jLabel10.setBackground(new Color(255,255,255));
        jLabel7.setBackground(new Color(255,255,255));
        jLabel11.setBackground(new Color(255,255,255));
        lec.newPanel(Body, TablePanel);
        lec.showDashboard(Table);
    }//GEN-LAST:event_backIcn6MouseClicked

    private void refreshIcn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshIcn6MouseClicked
        lec.refresh(Body);
    }//GEN-LAST:event_refreshIcn6MouseClicked

    private void logoutLbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLbl6MouseClicked
        this.dispose();
    }//GEN-LAST:event_logoutLbl6MouseClicked

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        lec.submitFeedback(SCB, GCB, FeedbackTextArea);
        lec.refresh(Body);
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void RCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCBActionPerformed
        if(RCB.getSelectedIndex() == 1){
            this.dispose();
            ProjectManagerUI PMUI = new ProjectManagerUI(lec.getId(), true);
            PMUI.setVisible(true);
        }
    }//GEN-LAST:event_RCBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LecturerUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JButton Btn;
    private javax.swing.JTable ClickableTable;
    private javax.swing.JPanel ClickableTablePanel;
    private javax.swing.JScrollPane ClickableTableScrollPanel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton DbBtn;
    private javax.swing.JButton ERBtn;
    private javax.swing.JPanel ERPanel;
    private javax.swing.JScrollPane FeedbackScrollPanel;
    private javax.swing.JTextArea FeedbackTextArea;
    private javax.swing.JComboBox<String> GCB;
    private javax.swing.JLabel GradeLabel;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel IDText;
    private com.toedter.calendar.JDateChooser PresentationDateChooser;
    private javax.swing.JComboBox<String> RCB;
    private javax.swing.JButton RejectBtn;
    private javax.swing.JComboBox<String> SCB;
    private javax.swing.JComboBox<String> SMCB;
    private javax.swing.JLabel SubmissionDateLabel;
    private javax.swing.JLabel SubmissionDateText;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTable Table;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JScrollPane TableScrollPanel;
    private javax.swing.JButton VASBtn;
    private javax.swing.JButton VPRBtn;
    private javax.swing.JButton VSLBtn;
    private javax.swing.JButton VSMBtn;
    private javax.swing.JLabel ViewReportLabel;
    private javax.swing.JLabel backIcn6;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logoutLbl6;
    private javax.swing.JLabel refreshIcn6;
    private javax.swing.JPanel upperTab6;
    // End of variables declaration//GEN-END:variables
}
