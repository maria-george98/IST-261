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
public class ColorCntl{
    ColorUI colorUI;
    ColorModel colorModel;
    
    public ColorCntl(TellerCntl tellerCntl){

        colorModel = new ColorModel();
        
        colorUI = new ColorUI(tellerCntl);
        colorUI.setBounds(0, 0, 1200, 800);
        tellerCntl.tellerUI.add(colorUI); 
        
    }
}
