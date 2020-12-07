/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class Draw extends JPanel {

    static int up_down = 5;
    static int right_left = 5;
    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        // 1 - width from x axis
        // 2-  height from y axis
        // 3-  width
        // 4-  height
        g2d.setStroke(dashed);
        g2d.draw(new Rectangle(200, 200, 150, 100));
        // 1 - width from x axis
        // 2-  height from y axis
        // 3-  width
        // 4-  height

        g2d.drawLine(350, 200, 300, 100);
        g2d.drawLine(155, 100, 200, 200);
        g2d.drawLine(160, 100, 300, 100);
        g2d.drawLine(103, 200, 154, 100);

        // draw  Fill Rectangel 
        g2d.fillRect(102, 200, 100, 100);

        // Draw oval and set Orange color
        g2d.setColor(Color.ORANGE);
        g2d.fillOval(right_left, up_down, 60, 60);

        repaint();

    }

    private void moveIt() {
        while (true) {
            if (right_left >= 283) {
                right = false;
                left = true;
            }
            if (right_left <= 5) {
                right = true;
                left = false;
            }
            if (up_down >= 259) {
                up = true;
                down = false;
            }
            if (up_down <= 5) {
                up = false;
                down = true;
            }
            if (up) {
                up_down--;
            }
            if (down) {
                up_down++;
            }
            if (left) {
                right_left--;
            }
            if (right) {
                right_left++;
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            repaint();
        }

    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Draw dr = new Draw();
        dr.setFocusable(true);
        f.add(dr);

        f.setSize(400, 400);
        f.setVisible(true);
        dr.moveIt();

    }

}
