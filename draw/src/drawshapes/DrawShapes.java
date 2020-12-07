/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class DrawShapes extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        ////// draw oval and scal it ////// 
        g2d.setColor(Color.RED);
        g2d.fillOval(20, 20, 40, 40);

        // translate the oval and scale it
        g2d.translate(110, 22);
        // scall it  
        g2d.scale(2, 2);
        // set the affine transform
        g2d.setColor(Color.BLUE);
        g2d.fillOval(0, 0, 40, 40);

/////////////////////////////////////////////////////////
        ///// Draw Rectangel and shear it ///// 
        g2d.setColor(Color.ORANGE);
        g2d.translate(30, 60);
        g2d.drawRect(0, 0, 80, 50);

        g2d.shear(1, 0);
        g2d.translate(40, 50);
        g2d.setPaint(Color.magenta);
        g2d.drawRect(0, 0, 80, 50);

        g2d.dispose();
    }

    public static void main(String[] args) {
        // TODO code application logic here

        JFrame frame = new JFrame();

        frame.setTitle("Scalling and Shearing");
        frame.add(new DrawShapes());
        frame.setSize(700, 500);
        frame.setVisible(true);

    }

}
