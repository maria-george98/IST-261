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
public class NumberUI extends JPanel implements ActionListener{
    
    NumberModel numberModel = new NumberModel();
    FortuneCntl fortuneCntl = new FortuneCntl();
    ImageIcon sourceImage1 = new ImageIcon("images/cootiecatcher.jpg");
    Image myImage1 = sourceImage1.getImage();
    JButton one, two, three, four;
    
    public NumberUI() {
        super();
        setLayout(null);
        
        one = new JButton(numberModel.getNumOne());
        add(one).setBounds(100, 150, 100, 250);
        
        two = new JButton(numberModel.getNumTwo());
        add(two).setBounds(200, 400, 400, 100);
        
        three = new JButton(numberModel.getNumThree());
        add(three).setBounds(200, 50, 400, 100);
        
        four = new JButton(numberModel.getNumFour());
        add(four).setBounds(600, 150, 100, 250);
        
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
    }
    
    //@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); {
        Image myImage1;
        myImage1 = Toolkit.getDefaultToolkit().getImage("images/cootiecatcher.jpg");
        g.drawImage(myImage1, 0, 0, this);
        
        Font f1 = new Font("Lucida", Font.ITALIC, 40);
        g.setFont(f1);
        g.setColor(Color.magenta);
        g.drawString("Pick a Number!", 260, 50);
        }
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if (obj == one) {
            removeAll();
            add(fortuneCntl, "Center");
            validate();
            repaint();
        }
        
        if (obj == two) {
            removeAll();
            add(fortuneCntl, "Center");
            validate();
            repaint();
        }
        
        if (obj == three) {
            removeAll();
            add(fortuneCntl, "Center");
            validate();
            repaint();
        }
        
        if (obj == four) {
            removeAll();
            add(fortuneCntl, "Center");
            validate();
            repaint();
        }
    }
}
