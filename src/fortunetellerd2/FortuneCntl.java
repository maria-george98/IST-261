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
public class FortuneCntl extends JPanel{
    FortuneUI fortuneUI;
    FortuneModel fortuneModel;
    
    public FortuneCntl(){
        setLayout(null);
        
        fortuneModel = new FortuneModel();
        
        fortuneUI = new FortuneUI();
        fortuneUI.setBounds(0, 0, 1200, 800);
        add(fortuneUI);
    }
}
