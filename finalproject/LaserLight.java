/*The object or model used by LaserLightShow to run, it is the laser light that 
is the centerpiece of the show. It has methods for each color of light and a method 
return the amount of power remaining*/
package finalproject;

/**
 *
 * @author Jonathan Pugh
 */
public class LaserLight {
    
    // member variables
    private int powerRemaining = 100;
    public String show;
    
    // create a method for each color of light and one to return the amount of 
    // power used after each show
    public void redLight(int powerUsed){
        System.out.println("Red Laser activate");
        powerRemaining = powerRemaining - powerUsed;
        
    }// close method
    
    public void orangeLight(int powerUsed){
        System.out.println("Orange Laser activate");
        powerRemaining = powerRemaining - powerUsed;
    }// close method
    
    public void yellowLight(int powerUsed){
        System.out.println("Yellow Laser activate");
        powerRemaining = powerRemaining - powerUsed;
    }// close method
    
    public void greenLight(int powerUsed){
        System.out.println("Green Laser activate");
        powerRemaining = powerRemaining - powerUsed;
    }// close method
    
    public void blueLight(int powerUsed){
        System.out.println("Blue Laser activate");
        powerRemaining = powerRemaining - powerUsed;
    }// close method
    
    public void purpleLight(int powerUsed){
        System.out.println("Purple Laser activate");
        powerRemaining = powerRemaining - powerUsed;
    }// close method
    
    
    public int getPowerRemaining(){
        System.out.println(powerRemaining + " power remaining");
        
        return powerRemaining;
        
    }// close method
    
}// close class
