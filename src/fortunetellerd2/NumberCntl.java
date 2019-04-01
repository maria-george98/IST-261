/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunetellerd2;

import javax.swing.JPanel;

/**
 *
 * @author MariaGeorge
 */
public class NumberCntl extends JPanel {
    NumberUI numberUI;
    NumberModel numberModel;
    
    public NumberCntl(){
        setLayout(null);
        numberModel = new NumberModel();
        
        numberUI = new NumberUI();
        numberUI.setBounds(0, 0, 1200, 800);
        add(numberUI);
    }
}
