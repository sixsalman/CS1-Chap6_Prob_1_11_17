package Prob11;
import java.util.Scanner; //imports util package's Scanner class

/**
 *  Author: Salman
 *
 *  This class asks for temperature and outputs state of ethyl, oxygen and water accordingly
 */
public class Prob11Main {

    /**
     * Prob1.Prob1Main handles the driver code for the program. Inputs are taken,
     * processed and outputted in this method.
     * @param args is not used
     */
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in); //Scanned named kbd created
        System.out.print("Enter temperature: "); // asks temperature
        FreezingAndBoilingPoints freezeAndBoil = new FreezingAndBoilingPoints(kbd.nextDouble());

        //prints ethyl state accordingly
        if (freezeAndBoil.isEthylFreezing()){
            System.out.print("Ethyl will freeze, ");
        } else if (freezeAndBoil.isEthylBoiling()) {
            System.out.print("Ethyl will boil, ");
        } else {
            System.out.print("Ethyl will be liquid, ");
        }

        //prints oxygen state accordingly
        if (freezeAndBoil.isOxygenFreezing()){
            System.out.print("oxygen will freeze and ");
        } else if (freezeAndBoil.isOxygenBoiling()) {
            System.out.print("oxygen will boil and ");
        } else {
            System.out.print("oxygen will be liquid and ");
        }

        //prints water state accordingly
        if (freezeAndBoil.isWaterFreezing()){
            System.out.print("water will freeze.");
        } else if (freezeAndBoil.isWaterBoiling()) {
            System.out.print("water will boil.");
        } else {
            System.out.print("water will be liquid.");
        }

    }

}
