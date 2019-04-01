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
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author MariaGeorge
 */
public class FortuneUI extends JPanel {

    FortuneModel fortuneModel = new FortuneModel();
    ImageIcon sourceImage1 = new ImageIcon("images/cootiecatcher.jpg");
    Image myImage1 = sourceImage1.getImage();
    JButton one;

    public FortuneUI() {
        super();
        setLayout(null);

        one = new JButton(fortuneModel.getFortune());
        add(one).setBounds(200, 400, 400, 100);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        {
            Image myImage1;
            myImage1 = Toolkit.getDefaultToolkit().getImage("images/cootiecatcher.jpg");
            g.drawImage(myImage1, 0, 0, this);

            Font f1 = new Font("Lucida", Font.ITALIC, 40);
            g.setFont(f1);
            g.setColor(Color.magenta);
            g.drawString("Here's your Fortune!", 280, 50);
        }
    }
}
