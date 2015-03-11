/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileInfoPanel.java
 *
 * Created on Oct 12, 2011, 3:25:30 PM
 */
package org.irods.jargon.idrop.desktop.systraygui.viscomponents;

import java.io.File;
import java.text.DateFormat;

import org.irods.jargon.idrop.desktop.systraygui.utils.IconHelper;

/**
 *
 * @author mikeconway
 */
public class FileInfoPanel extends javax.swing.JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 4628376823351035895L;
    private final File infoFile;
    private final DateFormat dateFormat = DateFormat.getDateTimeInstance();

    /**
     * Creates new form FileInfoPanel
     */
    public FileInfoPanel(final File infoFile) {
        if (infoFile == null) {
            throw new IllegalArgumentException("null infoFile");
        }

        this.infoFile = infoFile;
        initComponents();
        initMyComponents();
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

        pnlFileIconSizer = new javax.swing.JPanel();
        pnlInfoIcon = new javax.swing.JPanel();
        pnlFileNameAndIcon = new javax.swing.JPanel();
        lblFileOrCollectionName = new javax.swing.JLabel();
        pnlInfoCollectionParent = new javax.swing.JPanel();
        lblFileParentLabel = new javax.swing.JLabel();
        lblFileParent = new javax.swing.JLabel();
        pnlInfoDetails = new javax.swing.JPanel();
        lblInfoUpdatedAt = new javax.swing.JLabel();
        lblInfoUpdatedAtValue = new javax.swing.JLabel();
        lblInfoLength = new javax.swing.JLabel();
        lblInfoLengthValue = new javax.swing.JLabel();
        lblInfoChecksum = new javax.swing.JLabel();
        lblInfoChecksumValue = new javax.swing.JLabel();
        pnlToolbarInfo = new javax.swing.JPanel();
        toolBarInfo = new javax.swing.JToolBar();

        setLayout(new java.awt.GridBagLayout());

        pnlFileIconSizer.setMinimumSize(new java.awt.Dimension(80, 40));
        pnlFileIconSizer.setLayout(new java.awt.BorderLayout());

        pnlInfoIcon.setMaximumSize(new java.awt.Dimension(50, 50));
        pnlInfoIcon.setName("infoIcon"); // NOI18N
        pnlInfoIcon.setLayout(new java.awt.GridLayout(1, 0));
        pnlFileIconSizer.add(pnlInfoIcon, java.awt.BorderLayout.WEST);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        add(pnlFileIconSizer, gridBagConstraints);

        pnlFileNameAndIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFileNameAndIcon.setMinimumSize(new java.awt.Dimension(100, 50));
        pnlFileNameAndIcon.setLayout(new java.awt.GridLayout(1, 0));

        lblFileOrCollectionName.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.fileName.text")); // NOI18N
        lblFileOrCollectionName.setMaximumSize(new java.awt.Dimension(900, 100));
        lblFileOrCollectionName.setMinimumSize(new java.awt.Dimension(80, 30));
        lblFileOrCollectionName.setName("fileName"); // NOI18N
        pnlFileNameAndIcon.add(lblFileOrCollectionName);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 0, 2);
        add(pnlFileNameAndIcon, gridBagConstraints);

        pnlInfoCollectionParent.setLayout(new java.awt.BorderLayout());

        lblFileParentLabel.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.parentLabel.text")); // NOI18N
        lblFileParentLabel.setName("parentLabel"); // NOI18N
        pnlInfoCollectionParent.add(lblFileParentLabel, java.awt.BorderLayout.NORTH);

        lblFileParent.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.fileParent.text")); // NOI18N
        lblFileParent.setMinimumSize(new java.awt.Dimension(80, 30));
        lblFileParent.setName("fileParent"); // NOI18N
        pnlInfoCollectionParent.add(lblFileParent, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 0, 2);
        add(pnlInfoCollectionParent, gridBagConstraints);

        pnlInfoDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInfoDetails.setLayout(new java.awt.GridBagLayout());

        lblInfoUpdatedAt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblInfoUpdatedAt.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.lblUpdatedAt.text")); // NOI18N
        lblInfoUpdatedAt.setName("lblUpdatedAt"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pnlInfoDetails.add(lblInfoUpdatedAt, gridBagConstraints);

        lblInfoUpdatedAtValue.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.updatedAt.text")); // NOI18N
        lblInfoUpdatedAtValue.setName("updatedAt"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pnlInfoDetails.add(lblInfoUpdatedAtValue, gridBagConstraints);

        lblInfoLength.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblInfoLength.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.lblLength.text")); // NOI18N
        lblInfoLength.setName("lblLength"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pnlInfoDetails.add(lblInfoLength, gridBagConstraints);

        lblInfoLengthValue.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.length.text")); // NOI18N
        lblInfoLengthValue.setName("length"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pnlInfoDetails.add(lblInfoLengthValue, gridBagConstraints);

        lblInfoChecksum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblInfoChecksum.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.lblChecksum.text")); // NOI18N
        lblInfoChecksum.setName("lblChecksum"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        pnlInfoDetails.add(lblInfoChecksum, gridBagConstraints);

        lblInfoChecksumValue.setText(org.openide.util.NbBundle.getMessage(FileInfoPanel.class, "FileInfoPanel.checksum.text")); // NOI18N
        lblInfoChecksumValue.setName("checksum"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pnlInfoDetails.add(lblInfoChecksumValue, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 10, 2);
        add(pnlInfoDetails, gridBagConstraints);

        pnlToolbarInfo.setLayout(new java.awt.BorderLayout());

        toolBarInfo.setRollover(true);
        pnlToolbarInfo.add(toolBarInfo, java.awt.BorderLayout.NORTH);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.8;
        add(pnlToolbarInfo, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFileOrCollectionName;
    private javax.swing.JLabel lblFileParent;
    private javax.swing.JLabel lblFileParentLabel;
    private javax.swing.JLabel lblInfoChecksum;
    private javax.swing.JLabel lblInfoChecksumValue;
    private javax.swing.JLabel lblInfoLength;
    private javax.swing.JLabel lblInfoLengthValue;
    private javax.swing.JLabel lblInfoUpdatedAt;
    private javax.swing.JLabel lblInfoUpdatedAtValue;
    private javax.swing.JPanel pnlFileIconSizer;
    private javax.swing.JPanel pnlFileNameAndIcon;
    private javax.swing.JPanel pnlInfoCollectionParent;
    private javax.swing.JPanel pnlInfoDetails;
    private javax.swing.JPanel pnlInfoIcon;
    private javax.swing.JPanel pnlToolbarInfo;
    private javax.swing.JToolBar toolBarInfo;
    // End of variables declaration//GEN-END:variables
    private void initMyComponents() {
        lblFileOrCollectionName.setText(infoFile.getAbsolutePath());
        lblFileParent.setText(infoFile.getParent());
        lblInfoChecksumValue.setText("-");
        lblInfoUpdatedAtValue
                .setText(dateFormat.format(infoFile.lastModified()));
        lblInfoLengthValue.setText(String.valueOf(infoFile.length()));
        pnlInfoIcon.removeAll();

        if (infoFile.isFile()) {
            pnlInfoIcon.add(IconHelper.getFileIcon());
        } else {
            pnlInfoIcon.add(IconHelper.getFolderIcon());
        }

        pnlInfoIcon.validate();
    }
}
