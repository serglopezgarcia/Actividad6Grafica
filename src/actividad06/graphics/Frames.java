/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06.graphics;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public class Frames extends JFrame {
    
    private final Toolkit screen = Toolkit.getDefaultToolkit();
    private final Dimension screenSize = screen.getScreenSize();
    private final int screenHeight = screenSize.height;
    private final int screenWidth = screenSize.width;
    
    
    public Frames() {
        //setSize(screenWidth/2,screenHeight/2);
        setSize(800,600);
        //setLocation(screenWidth/4,screenHeight/4);
        setLocation(200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(200, 300, 1000, 500); ubicacion y tamaño
        setResizable(true);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Gestion de Vehiculos");
        Panels panel = new Panels();
        add(panel);
    }
}
