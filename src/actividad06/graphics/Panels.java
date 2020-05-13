/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06.graphics;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public class Panels extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawString("Primer texto", 200, 200);
        //para texto
        g.drawRect(50, 50, 300, 200);
    }
}
