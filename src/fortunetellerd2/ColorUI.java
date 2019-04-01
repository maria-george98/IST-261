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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author MariaGeorge
 */
public class ColorUI extends JPanel implements ActionListener {

    ColorModel colorModel = new ColorModel();
    NumberCntl numberCntl = new NumberCntl();
    ImageIcon sourceImage1 = new ImageIcon("images/cootiecatcher.jpg");
    Image myImage1 = sourceImage1.getImage();
    JButton purple, blue, green, red;
    TellerCntl tellerCntl;

    public ColorUI(TellerCntl tellerCntl) {
        this.tellerCntl = tellerCntl;
        
        setLayout(null);

        purple = new JButton(colorModel.getPurple());
        add(purple).setBounds(200, 400, 400, 100);

        blue = new JButton(colorModel.getBlue());
        add(blue).setBounds(100, 150, 100, 250);

        green = new JButton(colorModel.getGreen());
        add(green).setBounds(200, 50, 400, 100);

        red = new JButton(colorModel.getRed());
        add(red).setBounds(600, 150, 100, 250);

        purple.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        red.addActionListener(this);
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
        removeAll();
        tellerCntl.toNumberScreen(); 
    }
    
    //@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
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
