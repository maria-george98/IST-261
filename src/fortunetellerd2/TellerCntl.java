/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunetellerd2;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.UIManager;

/**
 *
 * @author MariaGeorge
 */
public class TellerCntl {

    ColorCntl colorCntl;
    NumberCntl numberCntl;
    TellerUI tellerUI = new TellerUI();
    
    public TellerCntl() {
       
        colorCntl = new ColorCntl(this);
        tellerUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tellerUI.setSize(800, 600);
        tellerUI.setVisible(true);
    }

    public void toNumberScreen()
    {
        numberCntl = new NumberCntl();
        tellerUI.getContentPane().add(numberCntl, "Center");
        tellerUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tellerUI.setSize(800, 600);
        tellerUI.setVisible(true);
    }

}
