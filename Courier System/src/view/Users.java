package view;

import bll.User;
import dao.UserDaoImp;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhanb
 */
public class Users extends javax.swing.JFrame {

    CardLayout cardLayout;
    UserDaoImp dao;
    String email, password;
    ImageIcon userHome = new ImageIcon("./src/images/UserHome.png");
    ImageIcon UserIcon = new ImageIcon(new ImageIcon("./src/images/UserIcon.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
    public Users(String email, String password) {
        initComponents();
        cardLayout = (CardLayout) (pnlCards.getLayout());
        dao = new UserDaoImp();
        this.email = email;
        this.password = password;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        sideNav = new javax.swing.JPanel();
        lblUserIcon = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SendCourier = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ViewStatus = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        Comment = new javax.swing.JPanel();
        zzzzz = new javax.swing.JLabel();
        pnlCards = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        txtUserName = new javax.swing.JLabel();
        lblUserImage = new javax.swing.JLabel();
        viewStatus = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userViewStatus = new javax.swing.JTable();
        sendCourier = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCurrentAddress = new javax.swing.JTextField();
        txtDestinationAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        comment = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        btncomment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Courier Service");
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jSplitPane1.setDividerSize(2);

        sideNav.setBackground(new java.awt.Color(240, 240, 240));

        lblUserIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserIcon.setToolTipText("");
        lblUserIcon.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblUserIconAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Home.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jLabel1.setToolTipText("");
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

        SendCourier.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Send Order Request");
        jLabel2.setToolTipText("");
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

        javax.swing.GroupLayout SendCourierLayout = new javax.swing.GroupLayout(SendCourier);
        SendCourier.setLayout(SendCourierLayout);
        SendCourierLayout.setHorizontalGroup(
            SendCourierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SendCourierLayout.setVerticalGroup(
            SendCourierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        ViewStatus.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Status");
        jLabel3.setToolTipText("");
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

        javax.swing.GroupLayout ViewStatusLayout = new javax.swing.GroupLayout(ViewStatus);
        ViewStatus.setLayout(ViewStatusLayout);
        ViewStatusLayout.setHorizontalGroup(
            ViewStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewStatusLayout.setVerticalGroup(
            ViewStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Logout.setBackground(new java.awt.Color(255, 255, 255));

        logout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Logout");
        logout.setToolTipText("");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Comment.setBackground(new java.awt.Color(255, 255, 255));

        zzzzz.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        zzzzz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zzzzz.setText("Send Comment");
        zzzzz.setToolTipText("");
        zzzzz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zzzzzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zzzzzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                zzzzzMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CommentLayout = new javax.swing.GroupLayout(Comment);
        Comment.setLayout(CommentLayout);
        CommentLayout.setHorizontalGroup(
            CommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zzzzz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CommentLayout.setVerticalGroup(
            CommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zzzzz, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sideNavLayout = new javax.swing.GroupLayout(sideNav);
        sideNav.setLayout(sideNavLayout);
        sideNavLayout.setHorizontalGroup(
            sideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SendCourier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Comment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideNavLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        sideNavLayout.setVerticalGroup(
            sideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideNavLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SendCourier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(sideNav);

        pnlCards.setBackground(new java.awt.Color(255, 255, 255));
        pnlCards.setLayout(new java.awt.CardLayout());

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
        txtUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUserName.setText("Home");

        lblUserImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserImage.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblUserImageAncestorAdded(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserImage, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserImage, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        pnlCards.add(home, "home");

        viewStatus.setBackground(new java.awt.Color(255, 255, 255));
        viewStatus.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                viewStatusAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("View Courier Status");

        userViewStatus.setBackground(new java.awt.Color(242, 242, 242));
        userViewStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Courier ID", "Email", "Phone", "Courier Type", "Weightage", "Description", "Destination", "Address", "Amount", "Status"
            }
        ));
        jScrollPane2.setViewportView(userViewStatus);

        javax.swing.GroupLayout viewStatusLayout = new javax.swing.GroupLayout(viewStatus);
        viewStatus.setLayout(viewStatusLayout);
        viewStatusLayout.setHorizontalGroup(
            viewStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewStatusLayout.setVerticalGroup(
            viewStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStatusLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pnlCards.add(viewStatus, "viewStatus");

        sendCourier.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Send Order Request");

        jLabel8.setText("Email ID");

        jLabel9.setText("Product Type");

        cbType.setMaximumRowCount(3);
        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -- Select--", "Document", "Non-Document" }));
        cbType.setToolTipText("");
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });

        jLabel10.setText("Approx. Weight");

        jLabel11.setText("Description");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setAutoscrolls(false);
        jScrollPane1.setViewportView(txtDescription);

        jLabel12.setText("Mobile Number");

        jLabel13.setText("Current Address");

        jLabel14.setText("Destination Address");

        jButton1.setText("Send Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWeight)
                    .addComponent(txtEmail)
                    .addComponent(txtMobile)
                    .addComponent(cbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(txtCurrentAddress)
                    .addComponent(txtDestinationAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCurrentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDestinationAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sendCourierLayout = new javax.swing.GroupLayout(sendCourier);
        sendCourier.setLayout(sendCourierLayout);
        sendCourierLayout.setHorizontalGroup(
            sendCourierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendCourierLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        sendCourierLayout.setVerticalGroup(
            sendCourierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendCourierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pnlCards.add(sendCourier, "sendCourier");

        comment.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Comment");

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane3.setViewportView(txtComment);

        btncomment.setBackground(new java.awt.Color(133, 185, 241));
        btncomment.setText("Comment");
        btncomment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncommentMouseClicked(evt);
            }
        });
        btncomment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncommentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout commentLayout = new javax.swing.GroupLayout(comment);
        comment.setLayout(commentLayout);
        commentLayout.setHorizontalGroup(
            commentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(commentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, commentLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btncomment, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        commentLayout.setVerticalGroup(
            commentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncomment, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pnlCards.add(comment, "comment");

        jSplitPane1.setRightComponent(pnlCards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents




    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(pnlCards, "home");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cardLayout.show(pnlCards, "sendCourier");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        dao.setColor(Home);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        dao.resetColor(Home);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        dao.setColor(SendCourier);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        dao.resetColor(SendCourier);
    }//GEN-LAST:event_jLabel2MouseExited

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String email = txtEmail.getText();
        String mobile = txtMobile.getText();
        String productType = cbType.getItemAt(cbType.getSelectedIndex());
        Double weight = Double.parseDouble(txtWeight.getText());
        String description = txtDescription.getText();
        String cAddress = txtCurrentAddress.getText();
        String dAddress = txtDestinationAddress.getText();

        if (email.equals("") || mobile.equals("") || productType.equals("") || cAddress.equals("") || dAddress.equals("")) {
            JOptionPane.showMessageDialog(this, "All the fields are required.");
    }//GEN-LAST:event_jButton1ActionPerformed
         else {
            User u = new User();
            dao.SendRequest(email, mobile, productType, weight, description, cAddress, dAddress);
            JOptionPane.showMessageDialog(this, "Request has been sent.");
            txtEmail.setText("");
            txtMobile.setText("");
            cbType.setSelectedIndex(0);
            txtDescription.setText("");
            txtWeight.setText("");
            txtCurrentAddress.setText("");
            txtDestinationAddress.setText("");

        }
    }
    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        dao.setColor(Logout);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        dao.resetColor(Logout);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dao.logoutDialog(this);

    }//GEN-LAST:event_logoutMouseClicked

    private void homeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_homeAncestorAdded
        String name = dao.findUserName("user_details",email);
        txtUserName.setText("Hello " + name);
    }//GEN-LAST:event_homeAncestorAdded

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded

    }//GEN-LAST:event_formComponentAdded

    private void viewStatusAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_viewStatusAncestorAdded
        DefaultTableModel tbl = (DefaultTableModel) userViewStatus.getModel();
        Integer[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        dao.viewRecord(tbl, "user_requests", index);
    }//GEN-LAST:event_viewStatusAncestorAdded

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        dao.resetColor(ViewStatus);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        dao.setColor(ViewStatus);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cardLayout.show(pnlCards, "viewStatus");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btncommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncommentActionPerformed
        String commentText = txtComment.getText();
        String[] data = {email, commentText};
        dao.addRecord("comments", data, true);
        JOptionPane.showMessageDialog(this, "Your comment has been posted.");
        txtComment.setText("");
        
    }//GEN-LAST:event_btncommentActionPerformed

    private void zzzzzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zzzzzMouseExited
        // TODO add your handling code here:
        dao.resetColor(Comment);
    }//GEN-LAST:event_zzzzzMouseExited

    private void zzzzzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zzzzzMouseEntered
        // TODO add your handling code here:
        dao.setColor(Comment);
    }//GEN-LAST:event_zzzzzMouseEntered

    private void zzzzzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zzzzzMouseClicked
        cardLayout.show(pnlCards, "comment");
    }//GEN-LAST:event_zzzzzMouseClicked

    private void lblUserImageAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblUserImageAncestorAdded
        // TODO add your handling code here:
        lblUserImage.setIcon(userHome);
    }//GEN-LAST:event_lblUserImageAncestorAdded

    private void lblUserIconAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblUserIconAncestorAdded
        // TODO add your handling code here:
        lblUserIcon.setIcon(UserIcon);
    }//GEN-LAST:event_lblUserIconAncestorAdded

    private void btncommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncommentMouseClicked
        // TODO add your handling code here:
        btncomment.setBackground(new Color(204, 255, 102));
    }//GEN-LAST:event_btncommentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Comment;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel SendCourier;
    private javax.swing.JPanel ViewStatus;
    private javax.swing.JButton btncomment;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JPanel comment;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblUserIcon;
    private javax.swing.JLabel lblUserImage;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel sendCourier;
    private javax.swing.JPanel sideNav;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtCurrentAddress;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDestinationAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JLabel txtUserName;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTable userViewStatus;
    private javax.swing.JPanel viewStatus;
    private javax.swing.JLabel zzzzz;
    // End of variables declaration//GEN-END:variables
}
