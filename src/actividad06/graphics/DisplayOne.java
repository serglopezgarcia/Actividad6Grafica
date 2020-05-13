/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actividad06.graphics;

import actividad06.vehiculos.Camion;
import actividad06.vehiculos.Carga;
import actividad06.vehiculos.Coche;
import actividad06.vehiculos.IVehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public class DisplayOne extends javax.swing.JInternalFrame {

    /** Creates new form DisplayOne */
    public DisplayOne() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        typeDisplay = new javax.swing.JTextField();
        brandDisplay = new javax.swing.JTextField();
        modelDisplay = new javax.swing.JTextField();
        seatsDisplay = new javax.swing.JTextField();
        daysDisplay = new javax.swing.JTextField();
        gamaDisplay = new javax.swing.JTextField();
        weightDisplay = new javax.swing.JTextField();
        structureDisplay = new javax.swing.JTextField();
        priceDisplay = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        plateDisplay = new javax.swing.JTextField();

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 209, 214));
        jLabel7.setText("En qué posición lo quieres almacenar?");

        jPanel1.setBackground(new java.awt.Color(17, 54, 74));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 209, 214));
        jLabel1.setText("Datos del vehiculo");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 209, 214));
        jLabel8.setText("Elige el vehiculo para ver su info:");

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posición 1", "Posición 2", "Posición 3", "Posición 4" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 209, 214));
        jLabel6.setText("Tipo:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 209, 214));
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 209, 214));
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 209, 214));
        jLabel4.setText("Asientos:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 209, 214));
        jLabel5.setText("Dias alquiler:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 209, 214));
        jLabel9.setText("Gama:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(199, 209, 214));
        jLabel10.setText("Peso Max(Tn):");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(199, 209, 214));
        jLabel11.setText("Estructura:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(199, 209, 214));
        jLabel12.setText("Precio(€):");

        typeDisplay.setEditable(false);
        typeDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        typeDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        brandDisplay.setEditable(false);
        brandDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        brandDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        modelDisplay.setEditable(false);
        modelDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        modelDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        seatsDisplay.setEditable(false);
        seatsDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        seatsDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        daysDisplay.setEditable(false);
        daysDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        daysDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gamaDisplay.setEditable(false);
        gamaDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        gamaDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        weightDisplay.setEditable(false);
        weightDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        weightDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        structureDisplay.setEditable(false);
        structureDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        structureDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        priceDisplay.setEditable(false);
        priceDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        priceDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(199, 209, 214));
        jLabel13.setText("Matrícula:");

        plateDisplay.setEditable(false);
        plateDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        plateDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(weightDisplay)
                                .addComponent(priceDisplay)
                                .addComponent(gamaDisplay)
                                .addComponent(daysDisplay)
                                .addComponent(modelDisplay)
                                .addComponent(structureDisplay)
                                .addComponent(brandDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                .addComponent(seatsDisplay))
                            .addComponent(plateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(typeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(plateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(structureDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        IVehiculo toShow = actividad06.graphics.VehiculesMain.vehiculeList[positionComboBox.getSelectedIndex() + 1];
        if(toShow == null) {
            JOptionPane.showMessageDialog(null, "No tienes ningún vehiculo en esa posición!", "Posición vacía", JOptionPane.WARNING_MESSAGE);
            typeDisplay.setText("");
            plateDisplay.setText("");
            brandDisplay.setText("");
            modelDisplay.setText("");
            seatsDisplay.setText("");
            daysDisplay.setText("");
            gamaDisplay.setText("");
            priceDisplay.setText("");
            weightDisplay.setText("");
            structureDisplay.setText("");
        } else {
            switch (toShow.getClass().getSimpleName()) {
            case "Coche":
                Coche car = (Coche) toShow;
                typeDisplay.setText("COCHE");
                plateDisplay.setText(car.getLicense().toUpperCase());
                brandDisplay.setText(car.getBrand().toUpperCase());
                modelDisplay.setText(car.getModel().toUpperCase());
                seatsDisplay.setText(Integer.toString(car.getNumSeats()));
                daysDisplay.setText(Integer.toString(car.getNumberDaysRented()));
                gamaDisplay.setText(car.getGama().toString());
                priceDisplay.setText(Double.toString(car.getTotalPriceOfRent()));
                break;
            case "Carga":
                Carga carga = (Carga) toShow;
                typeDisplay.setText("CARGA");
                plateDisplay.setText(carga.getLicense().toUpperCase());
                brandDisplay.setText(carga.getBrand().toUpperCase());
                modelDisplay.setText(carga.getModel().toUpperCase());
                seatsDisplay.setText(Integer.toString(carga.getNumSeats()));
                daysDisplay.setText(Integer.toString(carga.getNumberDaysRented()));
                weightDisplay.setText(Double.toString(carga.getPMA()));
                priceDisplay.setText(Double.toString(carga.getTotalPriceOfRent()));
                break;
            case "Camion":
                Camion truck = (Camion) toShow;
                typeDisplay.setText("CAMION");
                plateDisplay.setText(truck.getLicense().toUpperCase());
                brandDisplay.setText(truck.getBrand().toUpperCase());
                modelDisplay.setText(truck.getModel().toUpperCase());
                seatsDisplay.setText(Integer.toString(truck.getNumSeats()));
                daysDisplay.setText(Integer.toString(truck.getNumberDaysRented()));
                weightDisplay.setText(Double.toString(truck.getPMA()));
                priceDisplay.setText(Double.toString(truck.getTotalPriceOfRent()));
                structureDisplay.setText(truck.getStructure().toString());
                break;
            }
        }
    }//GEN-LAST:event_positionComboBoxActionPerformed
    
    public void setPositionComboBox(int pos) {
        this.positionComboBox.setSelectedIndex(pos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brandDisplay;
    private javax.swing.JTextField daysDisplay;
    private javax.swing.JTextField gamaDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modelDisplay;
    private javax.swing.JTextField plateDisplay;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JTextField priceDisplay;
    private javax.swing.JTextField seatsDisplay;
    private javax.swing.JTextField structureDisplay;
    private javax.swing.JTextField typeDisplay;
    private javax.swing.JTextField weightDisplay;
    // End of variables declaration//GEN-END:variables

}
