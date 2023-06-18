package org.example;

public class MethodChallenge {
    public static void main(String[] args) {

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScoreposition("Tim", highScorePosition);

         highScorePosition = calculateHighScorePosition(1000);
        displayHighScoreposition("Bob", highScorePosition);

         highScorePosition = calculateHighScorePosition(500);
        displayHighScoreposition("percy", highScorePosition);

         highScorePosition = calculateHighScorePosition(100);
        displayHighScoreposition("james", highScorePosition);

         highScorePosition = calculateHighScorePosition(25);
        displayHighScoreposition("Timmy", highScorePosition);


        //        String playerName = "Tim";
//        String playerPosition = "Second";
//        String message;
//
//        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static void displayHighScoreposition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition (int playerScore){

        //int playerScore = 1000;
       int position = 4;

        if(playerScore >= 1000){
           position = 1;
        } else if((playerScore >= 500)){
            position = 2;
        }else if((playerScore >= 100)){
            position = 3;
        }
           return position;
        }

       // return calculateHighScorePosition(700);
    }


