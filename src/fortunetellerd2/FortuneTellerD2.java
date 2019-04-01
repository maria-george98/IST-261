/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunetellerd2;

/* This deliverable was completed by Maria George and Sophie Vouvalis. 
This app is a fortune game that stimulates users to make choices in order to receive a fortune
The user can select a color to get to number choices, 
For deliverable 2, the user can choose a number to receive a fortune.
For deliverable 3, the user can go back and there will be more fortunes added.

The user interface consists of:
TellerUI: has the background image for the app
ColorUI: displas the color buttons
NumberUI: displas the number buttons
FortuneI: displas the fortune

Viewer:
TellerUI
ColorUI
NumberUI
FortuneI

Model:
ColorModel: contains info about the color options
NumberUI: contains info about the number options
FortuneModel: contains info about the fortune options

Controller:
TellerCntl: receives requests to switch between the rest of the controllers
ColorCntl: receieves requet to display the ColorUI and call the ColorModel
NumberCntl: receieves requet to display the NumberUI and call the NumberModel
FortuneCntl: receieves requet to display the FortuneUI and call the FortuneModel

How to test:
You will be able to test this by clicking on the color and number buttons on each screen to go to the next user page. 
 */
public class FortuneTellerD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TellerCntl tellerCntl = new TellerCntl();
    }
    
}
