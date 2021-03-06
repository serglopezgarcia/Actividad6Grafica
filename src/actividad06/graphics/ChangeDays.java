/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06.graphics;

import actividad06.pideDatos.Pregunta;
import actividad06.vehiculos.Vehiculo;
import actividad06.vehiculos.VehiculoVerifications;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public class ChangeDays extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChangeDays
     */
    public ChangeDays() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        actualNumDays = new javax.swing.JTextField();
        newNumDays = new javax.swing.JTextField();
        numDaysCheck = new javax.swing.JButton();
        confirmDaysButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 209, 214));
        jLabel8.setText("En qué posición lo quieres almacenar?");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 209, 214));
        jLabel1.setText("Datos del vehiculo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(17, 54, 74));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(199, 209, 214));
        jLabel10.setText("Selecciona el vehiculo al cual modificarle su alquiler:");

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posición 1", "Posición 2", "Posición 3", "Posición 4" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 209, 214));
        jLabel6.setText("Duración actual del alquiler:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 209, 214));
        jLabel7.setText("Introduce la nueva cantidad de días: ");

        actualNumDays.setEditable(false);
        actualNumDays.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        newNumDays.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newNumDays.setEnabled(false);

        numDaysCheck.setText("Check");
        numDaysCheck.setEnabled(false);
        numDaysCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDaysCheckActionPerformed(evt);
            }
        });

        confirmDaysButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        confirmDaysButton.setText("Confirmar");
        confirmDaysButton.setEnabled(false);
        confirmDaysButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDaysButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 209, 214));
        jLabel2.setText("Días de alquiler");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newNumDays, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualNumDays, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(numDaysCheck))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmDaysButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(actualNumDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(newNumDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numDaysCheck))
                .addGap(73, 73, 73)
                .addComponent(confirmDaysButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//GEN-FIRST:event_confirmDaysButtonActionPerformed
//GEN-LAST:event_confirmDaysButtonActionPerformed
/*
    private void numDaysCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDaysCheckActionPerformed
    }//GEN-LAST:event_numDaysCheckActionPerformed
*/
    
    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        Vehiculo toShow = (Vehiculo) actividad06.graphics.VehiculesMain.vehiculeList[positionComboBox.getSelectedIndex() + 1];
        if(toShow == null) {
            JOptionPane.showMessageDialog(null, "No tienes ningún vehiculo en esa posición!", "Posición vacía", JOptionPane.WARNING_MESSAGE);
        } else {
            positionComboBox.setEnabled(false);
            actualNumDays.setText(Integer.toString(toShow.getNumberDaysRented()));
            newNumDays.setEnabled(true);
            newNumDays.requestFocus();
            numDaysCheck.setEnabled(true);
        }
    }//GEN-LAST:event_positionComboBoxActionPerformed
  
    private int numDaysCheckActionPerformed(java.awt.event.ActionEvent evt) {
        int days = 0;
        if(numDaysCheck.getText().equals("Check")) {
            if(!Pregunta.isNumInt(newNumDays.getText())) {
            newNumDays.setText("");
            newNumDays.requestFocus();
            return -1;
            }
            days = Integer.parseInt(newNumDays.getText());
            if(!VehiculoVerifications.validDaysAsk(days)) {
                newNumDays.setText("");
                newNumDays.requestFocus();
                return -1;
            } else {
                newNumDays.setEditable(false);
                numDaysCheck.setText("Modify");
                confirmDaysButton.setEnabled(true);
                confirmDaysButton.requestFocus();
            }
        } else {
            numDaysCheck.setText("Check");
            newNumDays.setEditable(true);
            newNumDays.setText("");
            newNumDays.requestFocus();
        }
        return days;
    }
    
    private void confirmDaysButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Vehiculo toChange = (Vehiculo) actividad06.graphics.VehiculesMain.vehiculeList[positionComboBox.getSelectedIndex() + 1];
        toChange.setNumberDaysRented(Integer.parseInt(newNumDays.getText()));
        JOptionPane.showMessageDialog(null, "Has modificado exitosamente la cantidad de días de alquiler!");
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error al intentar cerrar!", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actualNumDays;
    private javax.swing.JButton confirmDaysButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField newNumDays;
    private javax.swing.JButton numDaysCheck;
    private javax.swing.JComboBox<String> positionComboBox;
    // End of variables declaration//GEN-END:variables
}
