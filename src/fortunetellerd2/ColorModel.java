/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunetellerd2;

/**
 *
 * @author MariaGeorge
 */
public class ColorModel {

    ColorUI colorUI;
    String purple = "Purple";
    String blue = "Blue";
    String green = "Green";
    String red = "Red";

    public ColorModel(String purple, String blue, String green, String red) {
        this.purple = purple;
        this.blue = blue;
        this.green = green;
        this.red = red;
    }
    
    public ColorModel() {
        
    }

    public String getPurple() {
        return purple;
    }

    public String getBlue() {
        return blue;
    }

    public String getGreen() {
        return green;
    }

    public String getRed() {
        return red;
    }
}
