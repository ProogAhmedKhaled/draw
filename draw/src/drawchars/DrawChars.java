/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawchars;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class DrawChars extends JPanel {

    
    @Override
    public void paintComponent(Graphics g) {

        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        String redStr = abc[3] + " " + abc[4] + " " + abc[5] + " " + abc[6], 
                orangeStr = abc[2] + " " + redStr + " " + abc[7],
                your_Name = " Shaza ALi";

        Graphics2D g1 = (Graphics2D) g;

        Font f1 = new Font("impact", Font.BOLD, 20);
        g1.setColor(Color.RED);
        g1.setFont(f1);
        g1.drawString(redStr, 100, 100);

        Font f2 = new Font("impact", Font.ITALIC, 28);
        g1.setColor(Color.ORANGE);
        g1.setFont(f2);
        g1.drawString(orangeStr, 100, 150);

        Font f3 = new Font("impact", Font.BOLD, 28);
        g1.setColor(Color.BLUE);
        g1.setFont(f3);
        g1.drawString(your_Name, 100, 200);

    }

    public static void main(String[] args) {

        JFrame f = new JFrame();
        DrawChars dr = new DrawChars();
        f.add(dr);
        f.setSize(400, 400);
        f.setVisible(true);

    }

}
