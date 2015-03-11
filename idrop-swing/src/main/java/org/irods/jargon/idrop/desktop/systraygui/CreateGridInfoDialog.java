/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.irods.jargon.idrop.desktop.systraygui;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import org.irods.jargon.conveyor.core.ConveyorExecutionException;
import org.irods.jargon.conveyor.core.GridAccountService;
import org.irods.jargon.core.connection.AuthScheme;
import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.exception.AuthenticationException;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.transfer.exception.PassPhraseInvalidException;

/**
 *
 * @author lisa
 */
public class CreateGridInfoDialog extends javax.swing.JDialog {

    /**
     *
     */
    private static final long serialVersionUID = 7703488544654594622L;
    private final IDROPCore idropCore;
    private IRODSAccount gridInfo = null;

    /**
     * Creates new form CreateGridInfoDialog
     */
    public CreateGridInfoDialog(final java.awt.Frame parent,
            final boolean modal, final IDROPCore idropCore) {
        super(parent, modal);
        initComponents();
        initAuthSchemesCombo();
        this.idropCore = idropCore;
    }

    public IRODSAccount getGridInfo() {
        return gridInfo;
    }

    private void initAuthSchemesCombo() {
        cbAuthScheme.setModel(new DefaultComboBoxModel(AuthScheme
                .values()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblHost = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        lblPort = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        lblZone = new javax.swing.JLabel();
        txtZone = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblDefaultResource = new javax.swing.JLabel();
        txtDefaultResource = new javax.swing.JTextField();
        lblStartingCollection = new javax.swing.JLabel();
        txtInitialPath = new javax.swing.JTextField();
        lblAuthScheme = new javax.swing.JLabel();
        cbAuthScheme = new javax.swing.JComboBox();
        lblComment = new javax.swing.JLabel();
        scrollComment = new javax.swing.JScrollPane();
        textareaComment = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.title")); // NOI18N
        setMinimumSize(null);
        setName("gridInfoDialog"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 4, 10));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblHost.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblHost.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblHost.text")); // NOI18N
        lblHost.setName("lblHost"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblHost, gridBagConstraints);

        txtHost.setColumns(80);
        txtHost.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.host.text")); // NOI18N
        txtHost.setMinimumSize(new java.awt.Dimension(150, 25));
        txtHost.setName("host"); // NOI18N
        txtHost.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtHost, gridBagConstraints);

        lblPort.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblPort.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblPort.text")); // NOI18N
        lblPort.setName("lblPort"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblPort, gridBagConstraints);

        txtPort.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.port.text")); // NOI18N
        txtPort.setName("port"); // NOI18N
        txtPort.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtPort, gridBagConstraints);

        lblZone.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblZone.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblZone.text")); // NOI18N
        lblZone.setName("lblZone"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblZone, gridBagConstraints);

        txtZone.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.zone.text")); // NOI18N
        txtZone.setMinimumSize(null);
        txtZone.setName("zone"); // NOI18N
        txtZone.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtZone, gridBagConstraints);

        lblUser.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblUser.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblUser.text")); // NOI18N
        lblUser.setName("lblUser"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblUser, gridBagConstraints);

        txtUser.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.user.text")); // NOI18N
        txtUser.setMinimumSize(null);
        txtUser.setName("user"); // NOI18N
        txtUser.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtUser, gridBagConstraints);

        lblPassword.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblPassword.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblPassword.text")); // NOI18N
        lblPassword.setName("lblPassword"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblPassword, gridBagConstraints);

        txtPassword.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.password.text")); // NOI18N
        txtPassword.setMinimumSize(null);
        txtPassword.setName("password"); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtPassword, gridBagConstraints);

        lblDefaultResource.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDefaultResource.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblDefaultResource.text")); // NOI18N
        lblDefaultResource.setName("lblDefaultResource"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblDefaultResource, gridBagConstraints);

        txtDefaultResource.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.defaultResource.text")); // NOI18N
        txtDefaultResource.setMinimumSize(null);
        txtDefaultResource.setName("defaultResource"); // NOI18N
        txtDefaultResource.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtDefaultResource, gridBagConstraints);

        lblStartingCollection.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblStartingCollection.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblStartingCollection.text")); // NOI18N
        lblStartingCollection.setName("lblStartingCollection"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblStartingCollection, gridBagConstraints);

        txtInitialPath.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.startingCollection.text")); // NOI18N
        txtInitialPath.setMinimumSize(null);
        txtInitialPath.setName("startingCollection"); // NOI18N
        txtInitialPath.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(txtInitialPath, gridBagConstraints);

        lblAuthScheme.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAuthScheme.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblAuthScheme.text")); // NOI18N
        lblAuthScheme.setName("lblAuthScheme"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblAuthScheme, gridBagConstraints);

        cbAuthScheme.setMinimumSize(null);
        cbAuthScheme.setName("authScheme"); // NOI18N
        cbAuthScheme.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(cbAuthScheme, gridBagConstraints);

        lblComment.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblComment.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.lblComment.text")); // NOI18N
        lblComment.setName("lblComment"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(lblComment, gridBagConstraints);

        scrollComment.setMinimumSize(new java.awt.Dimension(250, 75));
        scrollComment.setPreferredSize(new java.awt.Dimension(338, 300));

        textareaComment.setColumns(20);
        textareaComment.setRows(5);
        textareaComment.setMinimumSize(null);
        textareaComment.setName("comment"); // NOI18N
        textareaComment.setPreferredSize(new java.awt.Dimension(150, 75));
        scrollComment.setViewportView(textareaComment);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(scrollComment, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 4, 1));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/irods/jargon/idrop/desktop/systraygui/images/glyphicons_192_circle_remove.png"))); // NOI18N
        btnCancel.setMnemonic('C');
        btnCancel.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.btnCancel.text")); // NOI18N
        btnCancel.setToolTipText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.btnCancel.toolTipText")); // NOI18N
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.setPreferredSize(new java.awt.Dimension(110, 37));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancel);

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/irods/jargon/idrop/desktop/systraygui/images/glyphicons_193_circle_ok.png"))); // NOI18N
        btnOK.setMnemonic('S');
        btnOK.setText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.btnOK.text")); // NOI18N
        btnOK.setToolTipText(org.openide.util.NbBundle.getMessage(CreateGridInfoDialog.class, "CreateGridInfoDialog.btnOK.toolTipText")); // NOI18N
        btnOK.setMaximumSize(null);
        btnOK.setMinimumSize(null);
        btnOK.setName("btnOK"); // NOI18N
        btnOK.setPreferredSize(new java.awt.Dimension(90, 37));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel3.add(btnOK);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }// GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnOKActionPerformed

        String host = txtHost.getText().trim();
        String strPort = txtPort.getText().trim();
        int port = 0;
        if ((strPort != null) && (!strPort.isEmpty())) {
            port = Integer.valueOf(strPort).intValue();
        }
        String zone = txtZone.getText().trim();
        String user = txtUser.getText().trim();
        String passwd = new String(txtPassword.getPassword()).trim();
        String defaultResc = txtDefaultResource.getText().trim();
        String initialPath = txtInitialPath.getText().trim();
        if ((txtInitialPath.getText() == null)
                || (txtInitialPath.getText().isEmpty())) {
            StringBuilder homeBuilder = new StringBuilder();
            homeBuilder.append("/");
            homeBuilder.append(zone);
            homeBuilder.append("/home/");
            homeBuilder.append(user);
            initialPath = homeBuilder.toString();
        }

        // TODO: make sure all fields are filled in and validated
        try {
            gridInfo = IRODSAccount.instance(host, port, user, passwd,
                    initialPath, zone, defaultResc);
        } catch (JargonException ex) {
            JOptionPane
                    .showMessageDialog(
                            this,
                            "Please enter grid account information. Host, port, zone, and user name are required.",
                            "Create Grid Account", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IllegalArgumentException ex) {
            JOptionPane
                    .showMessageDialog(
                            this,
                            "Please enter grid account information. Host, port, zone, and user name are required.",
                            "Create Grid Account", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // now add authorization scheme to gridaccount
        AuthScheme scheme = (AuthScheme) cbAuthScheme.getSelectedItem();
        if ((scheme != null) && (!(scheme.getTextValue().isEmpty()))) {
            gridInfo.setAuthenticationScheme(scheme);
        }

        if (!validateGridAccount(gridInfo)) {
            MessageManager
                    .showError(this,
                            "Unable to process login, the server or account appears to be invalid");
            gridInfo = null;
            return;
        }

        GridAccountService gridAccountService = idropCore.getConveyorService()
                .getGridAccountService();
        try {
            gridAccountService
                    .addOrUpdateGridAccountBasedOnIRODSAccount(gridInfo);
            // use this when Mike adds comment to
            // addOrUpdateGridAccountBasedOnIRODSAccount()
            // gridAccountService.addOrUpdateGridAccountBasedOnIRODSAccount(gridInfo,
            // comment);
        } catch (PassPhraseInvalidException ex) {
            gridInfo = null;
            Logger.getLogger(CreateGridInfoDialog.class.getName()).log(
                    Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,
                    "Creation of grid account failed. Pass phrase is invalid",
                    "Create Grid Account", JOptionPane.ERROR_MESSAGE);
        } catch (ConveyorExecutionException ex) {
            gridInfo = null;
            Logger.getLogger(CreateGridInfoDialog.class.getName()).log(
                    Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,
                    "Creation of grid account failed.", "Create Grid Account",
                    JOptionPane.ERROR_MESSAGE);
        }

        dispose();
 lblHostGEN-LAST:event_btnOKActionPerformed

    private boolean validateGridAccount(final IRODSAccount gridInfo) {
        try {
            idropCore.getIrodsFileSystem().getIRODSAccessObjectFactory()
                    .authenticateIRODSAccount(gridInfo);
            return true;
        } catch (AuthenticationException ex) {
            return false;
        } catch (JargonException je) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox cbAuthScheme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAuthScheme;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblDefaultResource;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblStartingCollection;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblZone;
    private javax.swing.JScrollPane scrollComment;
    private javax.swing.JTextArea textareaComment;
    private javax.swing.JTextField txtDefaultResource;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtInitialPath;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtZone;
    // End of variables declaration//GEN-END:variables
}
