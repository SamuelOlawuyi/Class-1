package org.example;

import org.w3c.dom.ls.LSOutput;

public class OperatorChallenge {
    public static void main(String[] args) {

        double firstVar = 20.00d;
        double secondVar = 80.00d;
        double thirdVar = firstVar + secondVar;
        double fourthVar = thirdVar * 100.00d;
        System.out.println("My values total is: " + fourthVar);
        double fifthVar = (fourthVar % 40.00d);
        System.out.println("The remainder = " + fifthVar);
        double sixthVar = fifthVar;
        boolean sevenVal = (sixthVar == 0.00) ? true : false;

        System.out.println("is no remainder: " + sevenVal);

        if (!sevenVal) {
            System.out.println("got some remainder");
        }

    }
}