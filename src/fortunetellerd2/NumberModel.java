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
public class NumberModel {

    String numOne = "1";
    String numTwo = "2";
    String numThree = "3";
    String numFour = "4";

    public NumberModel(String numOne, String numTwo, String numThree, String numFour){
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.numThree = numThree;
        this.numFour = numFour;
    }
    
    NumberModel() {
        
    }

    public String getNumOne() {
        return numOne;
    }

    public String getNumTwo() {
        return numTwo;
    }

    public String getNumThree() {
        return numThree;
    }

    public String getNumFour() {
        return numFour;
    }
}
