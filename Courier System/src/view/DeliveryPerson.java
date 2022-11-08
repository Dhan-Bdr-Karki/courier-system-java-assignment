package view;

import dao.UserDaoImp;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DeliveryPerson extends javax.swing.JFrame {

    CardLayout cardLayout;
    UserDaoImp dao;
    String email, password;
    ImageIcon deliveryImage = new ImageIcon(new ImageIcon("./src/images/DeliveryHome.jpg").getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
    ImageIcon DeliveryHomeIcon = new ImageIcon(new ImageIcon("./src/images/CourierIcon.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

    public DeliveryPerson(String email, String password) {
        initComponents();
        cardLayout = (CardLayout) (pnlDelivery.getLayout());
        dao = new UserDaoImp();
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
        AddDelivery = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ManageUsers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblDeliveryIcon = new javax.swing.JLabel();
        pnlDelivery = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        txtUserName = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        manageDelivery = new javax.swing.JPanel();
        jPanel171 = new javax.swing.JPanel();
        btnUserSearch1 = new javax.swing.JButton();
        txtRequestSearch = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDeliveryUserRequest = new javax.swing.JTable();
        btnUserView1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        deliveryStatus = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        deliveryAmount = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnUserUpdate = new javax.swing.JButton();
        manageProfile = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Courier Service");
        setResizable(false);

        jSplitPane1.setDividerSize(1);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(2, 1));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1051, 619));

        navBar.setBackground(new java.awt.Color(240, 240, 240));

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jLabel1.setVerifyInputWhenFocusTarget(false);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        AddDelivery.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Delivery");
        jLabel2.setVerifyInputWhenFocusTarget(false);
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

        javax.swing.GroupLayout AddDeliveryLayout = new javax.swing.GroupLayout(AddDelivery);
        AddDelivery.setLayout(AddDeliveryLayout);
        AddDeliveryLayout.setHorizontalGroup(
            AddDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AddDeliveryLayout.setVerticalGroup(
            AddDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("");

        ManageUsers.setBackground(new java.awt.Color(255, 255, 255));
        ManageUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageUsersMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Edit Profile");
        jLabel3.setVerifyInputWhenFocusTarget(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ManageUsersLayout = new javax.swing.GroupLayout(ManageUsers);
        ManageUsers.setLayout(ManageUsersLayout);
        ManageUsersLayout.setHorizontalGroup(
            ManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ManageUsersLayout.setVerticalGroup(
            ManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel3.getAccessibleContext().setAccessibleDescription("");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Logout");
        jLabel9.setVerifyInputWhenFocusTarget(false);
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel9.getAccessibleContext().setAccessibleDescription("");

        lblDeliveryIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeliveryIcon.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDeliveryIconAncestorAdded(evt);
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
            .addComponent(AddDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeliveryIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeliveryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(240, 240, 240))
        );

        Home.getAccessibleContext().setAccessibleDescription("");
        AddDelivery.getAccessibleContext().setAccessibleDescription("");
        ManageUsers.getAccessibleContext().setAccessibleDescription("");
        jPanel8.getAccessibleContext().setAccessibleDescription("");

        jSplitPane1.setLeftComponent(navBar);

        pnlDelivery.setBackground(new java.awt.Color(255, 255, 255));
        pnlDelivery.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(255, 255, 255));

        txtUserName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtUserName.setText("Welcome");
        txtUserName.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtUserNameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblImage.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblImageAncestorAdded(evt);
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
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );

        pnlDelivery.add(home, "home");

        manageDelivery.setBackground(new java.awt.Color(255, 255, 255));
        manageDelivery.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                manageDeliveryAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel171.setBackground(new java.awt.Color(248, 248, 248));
        jPanel171.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 4));

        btnUserSearch1.setText("Search");
        btnUserSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSearch1ActionPerformed(evt);
            }
        });

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

        tblDeliveryUserRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Courier ID", "Email ID", "Mobile No.", "Courier Type", "Weightage", "Description", "Destination", "Address", "Amount", "Status"
            }
        ));
        tblDeliveryUserRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeliveryUserRequestMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblDeliveryUserRequest);

        btnUserView1.setText("View All");
        btnUserView1.setToolTipText("");
        btnUserView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserView1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel171Layout = new javax.swing.GroupLayout(jPanel171);
        jPanel171.setLayout(jPanel171Layout);
        jPanel171Layout.setHorizontalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel171Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel171Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtRequestSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUserSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(568, 568, 568)
                        .addComponent(btnUserView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel171Layout.setVerticalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel171Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequestSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserSearch1)
                    .addComponent(btnUserView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        jPanel10.setBackground(new java.awt.Color(248, 248, 248));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 4));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Status");

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Update Delivery Status");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Amount");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUserUpdate.setText("Update");
        btnUserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnUserUpdate))
                            .addComponent(deliveryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(deliveryStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deliveryStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deliveryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnUserUpdate))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout manageDeliveryLayout = new javax.swing.GroupLayout(manageDelivery);
        manageDelivery.setLayout(manageDeliveryLayout);
        manageDeliveryLayout.setHorizontalGroup(
            manageDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(manageDeliveryLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageDeliveryLayout.setVerticalGroup(
            manageDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDeliveryLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pnlDelivery.add(manageDelivery, "manageDelivery");
        manageDelivery.getAccessibleContext().setAccessibleName("");

        manageProfile.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 4));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Full Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email ID");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Password");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Mobile Number");

        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Edit Profile");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdate))))
                .addGap(0, 36, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtFullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout manageProfileLayout = new javax.swing.GroupLayout(manageProfile);
        manageProfile.setLayout(manageProfileLayout);
        manageProfileLayout.setHorizontalGroup(
            manageProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProfileLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        manageProfileLayout.setVerticalGroup(
            manageProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProfileLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        pnlDelivery.add(manageProfile, "manageProfile");

        jSplitPane1.setRightComponent(pnlDelivery);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(pnlDelivery, "home");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cardLayout.show(pnlDelivery, "manageDelivery");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cardLayout.show(pnlDelivery, "manageProfile");
        String[][] array = null;
        String id = null;
        array = dao.readFile("user_details");
        //filling delivery user detail in fields
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (email.equals(array[i][2])) {
                    id = array[i][0];
                    txtFullName.setText(array[i][1]);
                    txtEmail.setText(array[i][2]);
                    txtPassword.setText(array[i][3]);
                    txtMobile.setText(array[i][4]);
                }
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void ManageUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUsersMouseClicked
        cardLayout.show(pnlDelivery, "sendCourier");
    }//GEN-LAST:event_ManageUsersMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dao.logoutDialog(this);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtRequestSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRequestSearchFocusGained
        JTextField[] field = {txtRequestSearch};
        searchFocus(field);
    }//GEN-LAST:event_txtRequestSearchFocusGained

    private void txtRequestSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRequestSearchFocusLost
        JTextField[] field = {txtRequestSearch};
        searchFocusLost(field);
    }//GEN-LAST:event_txtRequestSearchFocusLost

    private void btnUserView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserView1ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tblDeliveryUserRequest.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tbl);
        tblDeliveryUserRequest.setRowSorter(tr);
        tr.setRowFilter(null);
    }//GEN-LAST:event_btnUserView1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        JTextField[] textfields = {deliveryStatus, deliveryAmount};
        dao.clearFields(textfields);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserUpdateActionPerformed
        // update table data and write update in file

        DefaultTableModel table = (DefaultTableModel) tblDeliveryUserRequest.getModel();
        String filepath = "./src/data/user_requests.txt";

        if (tblDeliveryUserRequest.getSelectedRowCount() == 1) {
            int c = tblDeliveryUserRequest.getSelectedRow();
            table.setValueAt(deliveryStatus.getText(), c, 10);
            table.setValueAt(deliveryAmount.getText(), c, 9);
            dao.deleteRecord(filepath);

            //writing table
            String str = null;
            try {
                File file = new File(filepath);
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                System.out.println("writing");
                for (int i = 0; i < tblDeliveryUserRequest.getRowCount(); i++) {
                    for (int j = 0; j < tblDeliveryUserRequest.getColumnCount(); j++) {
                        str = tblDeliveryUserRequest.getValueAt(i, j).toString() + ",";
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

        } else {
            JOptionPane.showMessageDialog(null, "Record not selected");
        }
    }//GEN-LAST:event_btnUserUpdateActionPerformed

    private void manageDeliveryAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_manageDeliveryAncestorAdded
        DefaultTableModel tbl = (DefaultTableModel) tblDeliveryUserRequest.getModel();
        Integer[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        dao.viewRecord(tbl, "user_requests", index);
    }//GEN-LAST:event_manageDeliveryAncestorAdded

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        cardLayout.show(pnlDelivery, "home");
    }//GEN-LAST:event_HomeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JTextField[] textfields = {txtFullName, txtEmail, txtPassword, txtMobile};
        dao.clearFields(textfields);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // write update in file
        String[][] array = null;
        String id = null, role = null;
        try {
            array = dao.readFile("user_details");

            //filling delivery user detail in fields
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (email.equals(array[i][2])) {
                        id = array[i][0];
                        role = array[i][5];
                        break;
                    }
                }
            }

            //get updated value
            String fullname = txtFullName.getText();
            String email = txtEmail.getText();
            String password = txtPassword.getText();
            String mobile = txtMobile.getText();
            JTextField[] textFields = {txtFullName, txtEmail, txtPassword, txtMobile};
            if (dao.formValidation(textFields)) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields.");
            }
//            String data[] = {fullname, email, password, gender, dob, location, mobile, id};
            String current = "./src/data/user_details.txt";
            String temp = "./src/data/temp.txt";
            String record;
            File tempDb = new File(temp);
            File db = new File(current);

            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDb));
            while ((record = br.readLine()) != null) {
                if (record.contains(id)) {
                    bw.write(id + "," + fullname + "," + email + "," + password + "," + mobile + "," + role);
                } else {
                    bw.write(record);
                }
                bw.flush();
                bw.newLine();
            }
            bw.close();
            br.close();
            db.delete();
            boolean success = tempDb.renameTo(db);
            System.out.println(success);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No record has been selected.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblDeliveryUserRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeliveryUserRequestMouseClicked
        DefaultTableModel table = (DefaultTableModel) tblDeliveryUserRequest.getModel();
        if (tblDeliveryUserRequest.getSelectedRowCount() == 1) {
            int selectedRowIndex = tblDeliveryUserRequest.getSelectedRow();
            deliveryAmount.setText(table.getValueAt(selectedRowIndex, 9).toString());
            deliveryStatus.setText(table.getValueAt(selectedRowIndex, 10).toString().toLowerCase());

        }
    }//GEN-LAST:event_tblDeliveryUserRequestMouseClicked

    private void lblDeliveryIconAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDeliveryIconAncestorAdded
        // TODO add your handling code here:
        lblDeliveryIcon.setIcon(DeliveryHomeIcon);
    }//GEN-LAST:event_lblDeliveryIconAncestorAdded

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void lblImageAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblImageAncestorAdded
        // TODO add your handling code here:
        lblImage.setIcon(deliveryImage);
    }//GEN-LAST:event_lblImageAncestorAdded

    private void txtUserNameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtUserNameAncestorAdded
        // TODO add your handling code here:
        String name = dao.findUserName("user_details", email);
        txtUserName.setText("Welcome  " + name);
    }//GEN-LAST:event_txtUserNameAncestorAdded

    private void btnUserSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSearch1ActionPerformed
        String searchTxt = txtRequestSearch.getText();
        DefaultTableModel tbl = (DefaultTableModel) tblDeliveryUserRequest.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tbl);
        tblDeliveryUserRequest.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchTxt.trim()));
    }//GEN-LAST:event_btnUserSearch1ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        dao.setColor(Home);

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        dao.resetColor(Home);

    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        dao.setColor(AddDelivery);

    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        dao.resetColor(AddDelivery);

    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        dao.setColor(ManageUsers);

    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        dao.resetColor(ManageUsers);

    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        dao.setColor(jPanel8);

    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        dao.resetColor(jPanel8);

    }//GEN-LAST:event_jLabel9MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddDelivery;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel ManageUsers;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUserSearch1;
    private javax.swing.JButton btnUserUpdate;
    private javax.swing.JButton btnUserView1;
    private javax.swing.JTextField deliveryAmount;
    private javax.swing.JTextField deliveryStatus;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblDeliveryIcon;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel manageDelivery;
    private javax.swing.JPanel manageProfile;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel pnlDelivery;
    private javax.swing.JTable tblDeliveryUserRequest;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRequestSearch;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
