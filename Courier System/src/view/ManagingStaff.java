package view;

import dao.UserDaoImp;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ManagingStaff extends javax.swing.JFrame {

    CardLayout cardLayout;
    UserDaoImp dao;
    String fileName, email, password;
    ImageIcon adminImage = new ImageIcon("./src/images/Managing.png");
    ImageIcon adminhomeImage = new ImageIcon(new ImageIcon("./src/images/Manager.png").getImage().getScaledInstance(100, 100, Image.SCALE_FAST));

    public ManagingStaff(String email, String password) {
        initComponents();
        cardLayout = (CardLayout) (pnlAdminCards.getLayout());
        dao = new UserDaoImp();
        fileName = "user_details";
        this.email = email;
        this.password = password;
    }

    private void searchFocus(JTextField[] txtSearch) {
        for (JTextField field : txtSearch) {
            if (field.getText().equals("Search here..."));
            {
                field.setText("");
                field.setForeground(new Color(0, 0, 0));
            }
        }
    }

    private void searchFocusLost(JTextField[] txtSearch) {
        for (JTextField field : txtSearch) {
            if (field.getText().equals("")) {
                field.setText("Search here...");
                field.setForeground(new Color(153, 153, 153));
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        navBar = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ManageUser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ViewRequest = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Feedbacks = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblImageIcon = new javax.swing.JLabel();
        pnlAdminCards = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        txtUserName = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        manageUser = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblViewDelivery = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnViewAll = new javax.swing.JButton();
        btnDeleteRecord = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        viewRequest = new javax.swing.JPanel();
        jPanel171 = new javax.swing.JPanel();
        txtRequestSearch = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblUserRequest = new javax.swing.JTable();
        btnRequestSearch = new javax.swing.JButton();
        btnRequestDelete = new javax.swing.JButton();
        btnRequestViewAll = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        feedbacks = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComments = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Courier Service");
        setResizable(false);

        jSplitPane1.setDividerSize(2);

        navBar.setBackground(new java.awt.Color(240, 240, 240));

        Home.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        ManageUser.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 204, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Users");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ManageUserLayout = new javax.swing.GroupLayout(ManageUser);
        ManageUser.setLayout(ManageUserLayout);
        ManageUserLayout.setHorizontalGroup(
            ManageUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        ManageUserLayout.setVerticalGroup(
            ManageUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        ViewRequest.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Order");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ViewRequestLayout = new javax.swing.GroupLayout(ViewRequest);
        ViewRequest.setLayout(ViewRequestLayout);
        ViewRequestLayout.setHorizontalGroup(
            ViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewRequestLayout.setVerticalGroup(
            ViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Feedbacks.setBackground(new java.awt.Color(255, 255, 255));
        Feedbacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbacksMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Feedbacks");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout FeedbacksLayout = new javax.swing.GroupLayout(Feedbacks);
        Feedbacks.setLayout(FeedbacksLayout);
        FeedbacksLayout.setHorizontalGroup(
            FeedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbacksLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FeedbacksLayout.setVerticalGroup(
            FeedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Logout.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Logout");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        lblImageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageIcon.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblImageIconAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Feedbacks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(navBar);

        pnlAdminCards.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                homeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtUserName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtUserName.setText("Home");

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblImgAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAdminCards.add(home, "home");

        manageUser.setBackground(new java.awt.Color(255, 255, 255));
        manageUser.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                manageUserAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 4));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Full Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email ID");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Password");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Mobile Number");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Role");

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Users");

        btnUpdate.setText("Update User");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtRole, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 4));

        tblViewDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DPID", "Name", "Email ID", "Password", "Phone", "Role"
            }
        ));
        tblViewDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewDeliveryMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblViewDelivery);

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search here...");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });

        btnViewAll.setText("View All");
        btnViewAll.setToolTipText("");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnDeleteRecord.setBackground(new java.awt.Color(255, 148, 77));
        btnDeleteRecord.setText("Delete");
        btnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRecordActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(133, 185, 241));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(421, 421, 421))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnDeleteRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout manageUserLayout = new javax.swing.GroupLayout(manageUser);
        manageUser.setLayout(manageUserLayout);
        manageUserLayout.setHorizontalGroup(
            manageUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(manageUserLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageUserLayout.setVerticalGroup(
            manageUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAdminCards.add(manageUser, "addDelivery");

        viewRequest.setBackground(new java.awt.Color(255, 255, 255));
        viewRequest.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                viewRequestAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel171.setBackground(new java.awt.Color(248, 248, 248));
        jPanel171.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 4));

        txtRequestSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtRequestSearch.setText("Search here...");
        txtRequestSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRequestSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRequestSearchFocusLost(evt);
            }
        });

        tblUserRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Courier ID", "Email ID", "Mobile No.", "Courier Type", "Weightage", "Description", "Destination", "Address", "Amount", "Status"
            }
        ));
        jScrollPane5.setViewportView(tblUserRequest);

        btnRequestSearch.setText("Search");
        btnRequestSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestSearchActionPerformed(evt);
            }
        });

        btnRequestDelete.setBackground(new java.awt.Color(255, 148, 77));
        btnRequestDelete.setText("Delete");
        btnRequestDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestDeleteActionPerformed(evt);
            }
        });

        btnRequestViewAll.setText("View All");
        btnRequestViewAll.setToolTipText("");
        btnRequestViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestViewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel171Layout = new javax.swing.GroupLayout(jPanel171);
        jPanel171.setLayout(jPanel171Layout);
        jPanel171Layout.setHorizontalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel171Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                    .addGroup(jPanel171Layout.createSequentialGroup()
                        .addComponent(txtRequestSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRequestSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnRequestDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnRequestViewAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel171Layout.setVerticalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel171Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequestSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestSearch)
                    .addComponent(btnRequestDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRequestViewAll))
                .addGap(42, 42, 42))
        );

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Order Requests");

        javax.swing.GroupLayout viewRequestLayout = new javax.swing.GroupLayout(viewRequest);
        viewRequest.setLayout(viewRequestLayout);
        viewRequestLayout.setHorizontalGroup(
            viewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        viewRequestLayout.setVerticalGroup(
            viewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewRequestLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pnlAdminCards.add(viewRequest, "viewRequest");

        feedbacks.setBackground(new java.awt.Color(255, 255, 255));
        feedbacks.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                feedbacksAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tblComments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Comments"
            }
        ));
        jScrollPane1.setViewportView(tblComments);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Comments");

        javax.swing.GroupLayout feedbacksLayout = new javax.swing.GroupLayout(feedbacks);
        feedbacks.setLayout(feedbacksLayout);
        feedbacksLayout.setHorizontalGroup(
            feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbacksLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        feedbacksLayout.setVerticalGroup(
            feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbacksLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pnlAdminCards.add(feedbacks, "feedbacks");

        jSplitPane1.setRightComponent(pnlAdminCards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(pnlAdminCards, "home");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cardLayout.show(pnlAdminCards, "addDelivery");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JTextField[] textfields = {txtFullName, txtEmail, txtPassword, txtMobile};
        dao.clearFields(textfields);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String filename = "user_details";
            String dpid = dao.uniqueID("D");
            String fullname = txtFullName.getText();
            String email = txtEmail.getText();
            String password = txtPassword.getText();
            String mobile = txtMobile.getText();
            String role = txtRole.getText();
            System.out.println(email);

            JTextField[] textfields = {txtFullName, txtEmail, txtPassword, txtMobile, txtRole};
            if (dao.formValidation(textfields)) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields.");
            } else if (dao.checkUser(filename, email)) {
                JOptionPane.showMessageDialog(this, "User is already available !");
            } else {
                String[] data = {dpid, fullname, email, password, mobile, role};
                dao.RegisterUser(data);
                JOptionPane.showMessageDialog(this, "Delivery person  has been added successfully.");
                dao.clearFields(textfields);
                DefaultTableModel tbl = (DefaultTableModel) tblViewDelivery.getModel();
                Integer[] index = {0, 1, 2, 3, 4, 5};
                dao.viewRecord(tbl, filename, index);

            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Please fill the inputs.");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        cardLayout.show(pnlAdminCards, "viewRequest");

    }//GEN-LAST:event_jLabel6MouseClicked

    private void viewRequestAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_viewRequestAncestorAdded
        DefaultTableModel tbl = (DefaultTableModel) tblUserRequest.getModel();
        Integer[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        dao.viewRecord(tbl, "user_requests", index);

    }//GEN-LAST:event_viewRequestAncestorAdded

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchTxt = txtSearch.getText();
        DefaultTableModel tbl = (DefaultTableModel) tblViewDelivery.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tbl);
        tblViewDelivery.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchTxt.trim()));
    }//GEN-LAST:event_btnSearchActionPerformed

    //show all data in a table
    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tblViewDelivery.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tbl);
        tblViewDelivery.setRowSorter(tr);
        tr.setRowFilter(null);
    }//GEN-LAST:event_btnViewAllActionPerformed

    // set focus on search
    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if (txtSearch.getText().equals("Search here..."));
        {
            txtSearch.setText("");
            txtSearch.setForeground(new Color(0, 0, 0));
        }
        JTextField[] search = {txtSearch};
        searchFocus(search);
    }//GEN-LAST:event_txtSearchFocusGained

    //dissaper focus on serach
    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().equals("")) {
            txtSearch.setText("Search here...");
            txtSearch.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSearchFocusLost

    // delete button 
    private void btnDeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRecordActionPerformed
        DefaultTableModel table = (DefaultTableModel) tblViewDelivery.getModel();

        String filepath = "./src/data/user_details.txt";

        if (tblViewDelivery.getSelectedRowCount() == 1) {
            int selectedRow = tblViewDelivery.getSelectedRow();
            table.removeRow(selectedRow);
            File oldfile = new File(filepath);
            if (oldfile.delete()) {
                System.out.println("deleted");
            }
            //writing table
            String str = null;
            try {
                File file = new File(filepath);
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < tblViewDelivery.getRowCount(); i++) {
                    for (int j = 0; j < tblViewDelivery.getColumnCount(); j++) {
                        str = tblViewDelivery.getValueAt(i, j).toString() + ",";

                        bw.write(str);

                    }
                    if (str.endsWith(",")) {
                        str = str.substring(0, str.length() - 1) + "\n";
                        bw.write(str);
                    }
                }
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            table.setRowCount(0);
            Integer[] index = {0, 1, 2, 3, 4, 5};
            dao.viewRecord(table, "user_details", index);

        } else if (tblViewDelivery.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No record found.");
        }
    }//GEN-LAST:event_btnDeleteRecordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // update table data and write update in file

        DefaultTableModel table = (DefaultTableModel) tblViewDelivery.getModel();
        String filepath = "./src/data/user_details.txt";

        if (tblViewDelivery.getSelectedRowCount() == 1) {
            int c = tblViewDelivery.getSelectedRow();
            table.setValueAt(txtFullName.getText(), c, 1);
            table.setValueAt(txtEmail.getText(), c, 2);
            table.setValueAt(txtPassword.getText(), c, 3);
            table.setValueAt(txtMobile.getText(), c, 4);
            table.setValueAt(txtRole.getText(), c, 5);

            dao.deleteRecord(filepath);
            //writing table
            String str = null;
            try {
                File file = new File(filepath);
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                System.out.println("writing");
                for (int i = 0; i < tblViewDelivery.getRowCount(); i++) {
                    for (int j = 0; j < tblViewDelivery.getColumnCount(); j++) {
                        str = tblViewDelivery.getValueAt(i, j).toString() + ",";
                        bw.write(str);
                    }
                    if (str.endsWith(",")) {
                        str = str.substring(0, str.length() - 1) + "\n";
                        bw.write(str);
                    }
                }
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            table.setRowCount(0);
            Integer[] index = {0, 1, 2, 3, 4, 5};
            dao.viewRecord(table, "user_details", index);

        } else {
            JOptionPane.showMessageDialog(null, "Record not selected");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dao.logoutDialog(this);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnRequestViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestViewAllActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tblUserRequest.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tbl);
        tblUserRequest.setRowSorter(tr);
        tr.setRowFilter(null);
    }//GEN-LAST:event_btnRequestViewAllActionPerformed

    private void btnRequestDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestDeleteActionPerformed
        DefaultTableModel table = (DefaultTableModel) tblUserRequest.getModel();

        String filepath = "./src/data/user_requests.txt";
        if (tblUserRequest.getSelectedRowCount() == 1) {
            int selectedRow = tblUserRequest.getSelectedRow();
            table.removeRow(selectedRow);
            dao.deleteRecord(filepath);
            //writing table
            String str = null;
            try {
                File file = new File(filepath);
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < tblUserRequest.getRowCount(); i++) {
                    for (int j = 0; j < tblUserRequest.getColumnCount(); j++) {
                        str = tblUserRequest.getValueAt(i, j).toString() + ",";
                        bw.write(str);
                    }
                    if (str.endsWith(",")) {
                        str = str.substring(0, str.length() - 1) + "\n";
                        bw.write(str);
                    }
                }
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            table.setRowCount(0);
            Integer[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            dao.viewRecord(table, "user_requests", index);
        }
    }//GEN-LAST:event_btnRequestDeleteActionPerformed

    private void txtRequestSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRequestSearchFocusLost
        JTextField[] field = {txtRequestSearch};
        searchFocusLost(field);
    }//GEN-LAST:event_txtRequestSearchFocusLost

    private void txtRequestSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRequestSearchFocusGained
        JTextField[] field = {txtRequestSearch};
        searchFocus(field);
    }//GEN-LAST:event_txtRequestSearchFocusGained

    private void btnRequestSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestSearchActionPerformed
        String searchTxt = txtRequestSearch.getText();
        DefaultTableModel tbl = (DefaultTableModel) tblUserRequest.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tbl);
        tblUserRequest.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchTxt.trim()));
    }//GEN-LAST:event_btnRequestSearchActionPerformed

    private void manageUserAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_manageUserAncestorAdded
        DefaultTableModel table = (DefaultTableModel) tblViewDelivery.getModel();
        Integer[] index = {0, 1, 2, 3, 4, 5};
        dao.viewRecord(table, fileName, index);

    }//GEN-LAST:event_manageUserAncestorAdded

    private void tblViewDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewDeliveryMouseClicked
        DefaultTableModel table = (DefaultTableModel) tblViewDelivery.getModel();

        // set data into fields
        if (tblViewDelivery.getSelectedRowCount() == 1) {
            int selectedRowIndex = tblViewDelivery.getSelectedRow();
            txtFullName.setText(table.getValueAt(selectedRowIndex, 1).toString());
            txtEmail.setText(table.getValueAt(selectedRowIndex, 2).toString());
            txtPassword.setText(table.getValueAt(selectedRowIndex, 3).toString());
            txtMobile.setText(table.getValueAt(selectedRowIndex, 4).toString());
            txtRole.setText(table.getValueAt(selectedRowIndex, 5).toString());
        }
    }//GEN-LAST:event_tblViewDeliveryMouseClicked

    private void homeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_homeAncestorAdded
        String name = dao.findUserName("user_details", email);
        txtUserName.setText("Hello " + name);
    }//GEN-LAST:event_homeAncestorAdded

    private void FeedbacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbacksMouseClicked
        cardLayout.show(pnlAdminCards, "feedbacks");
    }//GEN-LAST:event_FeedbacksMouseClicked

    private void feedbacksAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_feedbacksAncestorAdded
        DefaultTableModel table = (DefaultTableModel) tblComments.getModel();
        Integer[] index = {0, 1};
        dao.viewRecord(table, "comments", index);

    }//GEN-LAST:event_feedbacksAncestorAdded

    private void lblImgAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblImgAncestorAdded
        // TODO add your handling code here:
        lblImg.setIcon(adminImage);

    }//GEN-LAST:event_lblImgAncestorAdded

    private void lblImageIconAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblImageIconAncestorAdded
        // TODO add your handling code here:
        lblImageIcon.setIcon(adminhomeImage);
    }//GEN-LAST:event_lblImageIconAncestorAdded

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        dao.setColor(Home);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        dao.resetColor(Home);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        dao.setColor(ManageUser);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        dao.resetColor(ManageUser);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        dao.setColor(ViewRequest);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        dao.resetColor(ViewRequest);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        dao.setColor(Feedbacks);

    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        dao.resetColor(Feedbacks);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        dao.setColor(Logout);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        dao.resetColor(Logout);

    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        cardLayout.show(pnlAdminCards, "feedbacks");
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Feedbacks;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel ManageUser;
    private javax.swing.JPanel ViewRequest;
    private javax.swing.JButton btnDeleteRecord;
    private javax.swing.JButton btnRequestDelete;
    private javax.swing.JButton btnRequestSearch;
    private javax.swing.JButton btnRequestViewAll;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JPanel feedbacks;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblImageIcon;
    private javax.swing.JLabel lblImg;
    private javax.swing.JPanel manageUser;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel pnlAdminCards;
    private javax.swing.JTable tblComments;
    private javax.swing.JTable tblUserRequest;
    private javax.swing.JTable tblViewDelivery;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRequestSearch;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtUserName;
    private javax.swing.JPanel viewRequest;
    // End of variables declaration//GEN-END:variables
}
