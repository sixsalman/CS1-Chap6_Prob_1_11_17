package Prob17;

/**
 *  Author: Salman
 *
 *  This class gets state of a coin 20 times and displays how many of them were heads and how many were tails.
 */
public class Prob17Main {

    /**
     * Prob1.Prob1Main handles the driver code for the program. Inputs are taken,
     * processed and outputted in this method.
     * @param args is not used
     */
    public static void main(String[] args) {

        int tailCount = 0;
        int headCount = 0;

        Coin dime = new Coin();

        //gets initial state of the coin and counts head or tail accordingly
        System.out.println("The side initially facing up is: " + dime.getSideUp());

        if ((dime.getSideUp()).equals("heads")){
            headCount += 1;
        } else {
            tailCount += 1;
        }


        //tosses and gets state of the coin 20 times and counts head or tail accordingly
        for(int i = 2; i <= 20; i++) {
            dime.toss();
            System.out.println("The side facing up for toss " + i + " is: " + dime.getSideUp());
            if ((dime.getSideUp()).equals("heads")){
                headCount += 1;
            } else {
                tailCount += 1;
            }
        }

        //outputs result
        System.out.println("\nTotal number of heads: " + headCount + "\nTotal number of tails: " + tailCount);

    }

}
