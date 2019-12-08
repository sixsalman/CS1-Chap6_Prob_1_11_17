package Prob17;
import java.util.Random; //util package's Random class is imported

/**
 *  Author: Salman
 *
 *  This class serves as blueprint for creation of a Coin object in which a coin is tossed and the result is returned
 */
public class Coin {

    private String sideUp; //holds state of the coin (heads or tails)

    Random rand = new Random();

    /**
     * This no-arg constructor tosses the coin initially
     */
    public Coin() {
        sideUp = rand.nextBoolean() ? "heads" : "tails";
    }

    /**
     * This method tosses the coin
     */
    public void toss() {
        sideUp = rand.nextBoolean() ? "heads" : "tails";
    }

    /**
     * Get's sideUp/state
     * @return state of the coin (heads or tails)
     */
    public String getSideUp(){
        return sideUp;
    }

}
