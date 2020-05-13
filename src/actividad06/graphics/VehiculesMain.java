
package actividad06.graphics;

import actividad06.vehiculos.IVehiculo;
import actividad06.vehiculos.Vehiculo;
import actividad06.vehiculos.VehiculoVerifications;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public class VehiculesMain extends javax.swing.JFrame {
    
    /**
     * Creates new form VehiculesMain
     */
    public VehiculesMain() {
        initComponents();
        setSpots();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        spotOnePanel = new javax.swing.JPanel();
        spotOne = new javax.swing.JLabel();
        spotThreePanel = new javax.swing.JPanel();
        spotThree = new javax.swing.JLabel();
        spotFourPanel = new javax.swing.JPanel();
        spotFour = new javax.swing.JLabel();
        spotTwoPanel = new javax.swing.JPanel();
        spotTwo = new javax.swing.JLabel();
        freeSignPanel = new javax.swing.JPanel();
        freeSign = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        createVehicule = new javax.swing.JMenuItem();
        displayOne = new javax.swing.JMenuItem();
        changeDays = new javax.swing.JMenuItem();
        displayAll = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(242, 234, 234));

        spotOnePanel.setBackground(new java.awt.Color(153, 153, 153));

        spotOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spotOneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout spotOnePanelLayout = new javax.swing.GroupLayout(spotOnePanel);
        spotOnePanel.setLayout(spotOnePanelLayout);
        spotOnePanelLayout.setHorizontalGroup(
            spotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spotOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotOne, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        spotOnePanelLayout.setVerticalGroup(
            spotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spotOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        spotThreePanel.setBackground(new java.awt.Color(153, 153, 153));

        spotThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spotThreeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout spotThreePanelLayout = new javax.swing.GroupLayout(spotThreePanel);
        spotThreePanel.setLayout(spotThreePanelLayout);
        spotThreePanelLayout.setHorizontalGroup(
            spotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spotThreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotThree, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        spotThreePanelLayout.setVerticalGroup(
            spotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spotThreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        spotFourPanel.setBackground(new java.awt.Color(153, 153, 153));

        spotFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spotFourMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout spotFourPanelLayout = new javax.swing.GroupLayout(spotFourPanel);
        spotFourPanel.setLayout(spotFourPanelLayout);
        spotFourPanelLayout.setHorizontalGroup(
            spotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spotFourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotFour, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        spotFourPanelLayout.setVerticalGroup(
            spotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spotFourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        spotTwoPanel.setBackground(new java.awt.Color(153, 153, 153));

        spotTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spotTwoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout spotTwoPanelLayout = new javax.swing.GroupLayout(spotTwoPanel);
        spotTwoPanel.setLayout(spotTwoPanelLayout);
        spotTwoPanelLayout.setHorizontalGroup(
            spotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spotTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        spotTwoPanelLayout.setVerticalGroup(
            spotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spotTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spotTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(spotOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spotTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spotThreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spotFourPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spotThreePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spotFourPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spotOnePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spotTwoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(50, 260, 850, 470);

        freeSignPanel.setBackground(new java.awt.Color(255, 255, 255));

        freeSign.setBackground(new java.awt.Color(255, 255, 255));
        freeSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad06/graphics/files/parking.png"))); // NOI18N

        javax.swing.GroupLayout freeSignPanelLayout = new javax.swing.GroupLayout(freeSignPanel);
        freeSignPanel.setLayout(freeSignPanelLayout);
        freeSignPanelLayout.setHorizontalGroup(
            freeSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, freeSignPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(freeSign))
        );
        freeSignPanelLayout.setVerticalGroup(
            freeSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, freeSignPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(freeSign))
        );

        desktopPane.add(freeSignPanel);
        freeSignPanel.setBounds(400, 30, 150, 180);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menu");
        fileMenu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        createVehicule.setMnemonic('o');
        createVehicule.setText("Crear un Vehiculo");
        createVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVehiculeActionPerformed(evt);
            }
        });
        fileMenu.add(createVehicule);

        displayOne.setText("Mostrar la info de un Vehiculo");
        displayOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayOneActionPerformed(evt);
            }
        });
        fileMenu.add(displayOne);

        changeDays.setText("Cambiar la duracion del alquiler");
        changeDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDaysActionPerformed(evt);
            }
        });
        fileMenu.add(changeDays);

        displayAll.setText("Mostrar la info de todos los vehiculos");
        displayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllActionPerformed(evt);
            }
        });
        fileMenu.add(displayAll);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VehiculesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiculesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiculesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiculesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehiculesMain().setVisible(true);
            }
        });
    }
    
    public void setSpots() {
        this.spotList[0] = this.spotOne;
        this.spotList[1] = this.spotTwo;
        this.spotList[2] = this.spotThree;
        this.spotList[3] = this.spotFour;
        this.spotList[4] = this.freeSign;
    }
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    
    private void createVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVehiculeActionPerformed
        CreateVehicule v = new CreateVehicule(spotList);
        v.setResizable(true);
        v.setMaximizable(true);
        v.setMinimumSize(new Dimension(750, 700));
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        desktopPane.add(v);
        v.toFront();
        v.requestFocus();
        v.repaint();
    }//GEN-LAST:event_createVehiculeActionPerformed
    
    private void displayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllActionPerformed
        if(VehiculoVerifications.noVehicules()) {
            JOptionPane.showMessageDialog(null, "No tienes ningún vehiculo guardado. Introduce alguno primero!", "Garage Vacío", JOptionPane.WARNING_MESSAGE);
        } else {
            DisplayAll v = new DisplayAll();
            v.setResizable(true);
            v.setMaximizable(true);
            v.setMinimumSize(new Dimension(800, 620));
            v.setIconifiable(true);
            v.setVisible(true);
            v.setClosable(true);
            desktopPane.add(v);
            v.toFront();
            v.requestFocus();
            v.repaint();
        }
    }//GEN-LAST:event_displayAllActionPerformed
    
    private void displayOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayOneActionPerformed
        if(VehiculoVerifications.noVehicules()) {
            JOptionPane.showMessageDialog(null, "No tienes ningún vehiculo guardado. Introduce alguno primero!", "Garage Vacío", JOptionPane.WARNING_MESSAGE);
        } else {
            DisplayOne v = new DisplayOne();
            v.setResizable(true);
            v.setMaximizable(true);
            v.setMinimumSize(new Dimension(700, 600));
            v.setIconifiable(true);
            v.setVisible(true);
            v.setClosable(true);
            desktopPane.add(v);
            v.toFront();
            v.requestFocus();
            v.repaint();
        }
    }//GEN-LAST:event_displayOneActionPerformed

    private void changeDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDaysActionPerformed
        if(VehiculoVerifications.noVehicules()) {
            JOptionPane.showMessageDialog(null, "No tienes ningún vehiculo guardado. Introduce alguno primero!", "Garage Vacío", JOptionPane.WARNING_MESSAGE);
        } else {
            ChangeDays v = new ChangeDays();
            v.setResizable(true);
            v.setMaximizable(true);
            v.setMinimumSize(new Dimension(700, 600));
            v.setIconifiable(true);
            v.setVisible(true);
            v.setClosable(true);
            desktopPane.add(v);
            v.toFront();
            v.requestFocus();
            v.repaint();
        }
    }//GEN-LAST:event_changeDaysActionPerformed

    private void spotOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spotOneMouseClicked
        displayInfo(1);
    }//GEN-LAST:event_spotOneMouseClicked

    private void spotTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spotTwoMouseClicked
        displayInfo(2);
    }//GEN-LAST:event_spotTwoMouseClicked

    private void spotThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spotThreeMouseClicked
        displayInfo(3);
    }//GEN-LAST:event_spotThreeMouseClicked

    private void spotFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spotFourMouseClicked
        displayInfo(4);
    }//GEN-LAST:event_spotFourMouseClicked
    
    private void displayInfo(int spot) {
        if((Vehiculo) vehiculeList[spot] != null) {
            DisplayOne v = new DisplayOne();
            v.setResizable(true);
            v.setMaximizable(true);
            v.setMinimumSize(new Dimension(700, 600));
            v.setIconifiable(true);
            v.setVisible(true);
            v.setClosable(true);
            v.setPositionComboBox(spot - 1);
            desktopPane.add(v);
            v.toFront();
            v.requestFocus();
            v.repaint();
        }
    }
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static IVehiculo[] vehiculeList = new Vehiculo[5];
    public JLabel[] spotList = new JLabel[5];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem changeDays;
    private javax.swing.JMenuItem createVehicule;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem displayAll;
    private javax.swing.JMenuItem displayOne;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel freeSign;
    private javax.swing.JPanel freeSignPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel spotFour;
    private javax.swing.JPanel spotFourPanel;
    private javax.swing.JLabel spotOne;
    private javax.swing.JPanel spotOnePanel;
    private javax.swing.JLabel spotThree;
    private javax.swing.JPanel spotThreePanel;
    private javax.swing.JLabel spotTwo;
    private javax.swing.JPanel spotTwoPanel;
    // End of variables declaration//GEN-END:variables
}