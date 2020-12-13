/*This is the program that uses instances of LaserLight to create multiple shows*/
package finalproject;

/**
 *
 * @author Jonathan Pugh
 */
public class LaserLightShow {
    // declare final variable to represent the amount of power used by the device each 
    // time it activates
    final static int ACTIVATE = 5;
    
    public static void main(String[] args){
        // declare new instance of LaserLight for first show
        LaserLight firstShow = new LaserLight();
        // name first show Christmas
        firstShow.show = "Christmas";
        showPower(firstShow);
        // declare new instance of LaserLight for second show
        LaserLight secondShow = new LaserLight();
        // name second show Pride
        secondShow.show = "Pride";
        showPower(secondShow);
        // create program for first show, displaying name and printing out how
        // much power remaining at end of show
        System.out.println("Starting " + firstShow.show + " Show");
        firstShow.redLight(ACTIVATE);
        firstShow.greenLight(ACTIVATE);
        firstShow.redLight(ACTIVATE);
        firstShow.greenLight(ACTIVATE);
        firstShow.redLight(ACTIVATE);
        firstShow.greenLight(ACTIVATE);
        firstShow.redLight(ACTIVATE);
        firstShow.greenLight(ACTIVATE);
        firstShow.redLight(ACTIVATE);
        firstShow.greenLight(ACTIVATE);
        showPower(firstShow);
        System.out.println("**********End of first show**********");
        System.out.println("                                     ");
        // create program for second show, displaying name and printing out how
        // much power remaining at end of show
        System.out.println("Starting " + secondShow.show + " Show");
        secondShow.redLight(ACTIVATE);
        secondShow.orangeLight(ACTIVATE);
        secondShow.yellowLight(ACTIVATE);
        secondShow.greenLight(ACTIVATE);
        secondShow.blueLight(ACTIVATE);
        secondShow.purpleLight(ACTIVATE);
        secondShow.redLight(ACTIVATE);
        secondShow.orangeLight(ACTIVATE);
        secondShow.yellowLight(ACTIVATE);
        secondShow.greenLight(ACTIVATE);
        secondShow.blueLight(ACTIVATE);
        secondShow.purpleLight(ACTIVATE);
        secondShow.redLight(ACTIVATE);
        secondShow.orangeLight(ACTIVATE);
        secondShow.yellowLight(ACTIVATE);
        secondShow.greenLight(ACTIVATE);
        secondShow.blueLight(ACTIVATE);
        secondShow.purpleLight(ACTIVATE);
        showPower(secondShow);
        System.out.println("**********End of second show**********");
        
        
        
    }// close main
    // create method to show the amount of power remaining
    private static void showPower(LaserLight inputLaserLight){
        System.out.println("Show Name: " + inputLaserLight.show);
        System.out.println("Power Remaining: " + inputLaserLight.getPowerRemaining());
        
    }// close method
    
}


