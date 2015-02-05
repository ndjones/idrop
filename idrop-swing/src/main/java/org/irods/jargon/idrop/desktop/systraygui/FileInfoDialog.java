/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileInfoDialog.java
 *
 * Created on Oct 12, 2011, 3:35:17 PM
 */
package org.irods.jargon.idrop.desktop.systraygui;

import org.irods.jargon.idrop.desktop.systraygui.viscomponents.FileInfoPanel;

/**
 * 
 * @author mikeconway
 */
public class FileInfoDialog extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -923560133655126470L;

	/** Creates new form FileInfoDialog */
	public FileInfoDialog(final java.awt.Frame parent,
			final FileInfoPanel fileInfoPanel, final boolean modal) {
		super(parent, modal);
		initComponents();
		fileInfoArea.add(fileInfoPanel);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileInfoArea = new javax.swing.JPanel();
        fileInfoButtons = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(FileInfoDialog.class, "FileInfoDialog.title")); // NOI18N
        setName("fileInfoDialog"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 200));

        fileInfoArea.setLayout(new javax.swing.BoxLayout(fileInfoArea, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(fileInfoArea, java.awt.BorderLayout.CENTER);

        fileInfoButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/irods/jargon/idrop/desktop/systraygui/images/glyphicons_193_circle_ok.png"))); // NOI18N
        btnOK.setMnemonic('o');
        btnOK.setText(org.openide.util.NbBundle.getMessage(FileInfoDialog.class, "OK")); // NOI18N
        btnOK.setToolTipText(org.openide.util.NbBundle.getMessage(FileInfoDialog.class, "FileInfoDialog.btnOk.toolTipText")); // NOI18N
        btnOK.setName("btnOk"); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        fileInfoButtons.add(btnOK);

        getContentPane().add(fileInfoButtons, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnOKActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnOKActionPerformed
		dispose();
	}// GEN-LAST:event_btnOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JPanel fileInfoArea;
    private javax.swing.JPanel fileInfoButtons;
    // End of variables declaration//GEN-END:variables
}
