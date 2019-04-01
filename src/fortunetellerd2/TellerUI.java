/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunetellerd2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author shane
 */
public class TellerUI extends JFrame{
    ImageIcon sourceImage1 = new ImageIcon("images/cootiecatcher.jpg");
    Image myImage1 = sourceImage1.getImage();
    
        public void paintComponent(Graphics g) {
        paintComponent(g);
        {
            Image myImage1;
            myImage1 = Toolkit.getDefaultToolkit().getImage("images/cootiecatcher.jpg");
            g.drawImage(myImage1, 0, 0, this);

            Font f1 = new Font("Lucida", Font.ITALIC, 40);
            g.setFont(f1);
            g.setColor(Color.magenta);
            g.drawString("Pick a Color!", 280, 50);
        }
    }  
}
