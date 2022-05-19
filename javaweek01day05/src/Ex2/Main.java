package Ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Rock Paper Scissor game!");
        while (true) {
            System.out.println("Please Enter your move? To make a move type rock, paper, or scissors. To quit the game, enter quit. ");

            Scanner in = new Scanner(System.in);
            String myMove = in.nextLine();
            if(myMove.equalsIgnoreCase("quit")) {
                break;
            }

            if(!myMove.equalsIgnoreCase("rock") && !myMove.equalsIgnoreCase("paper") && !myMove.equalsIgnoreCase("scissors")) {
                System.out.println("Your move is invalid, please try again!");
            } else {
                int rand = (int) (Math.random() * 3);
                String opponentMove = "";
                if(rand == 0) {
                    opponentMove = "rock";
                } else if(rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }

                if(myMove.equals(opponentMove)) {
                    System.out.println("Tie");
                } else if ((myMove.equalsIgnoreCase("rock") && opponentMove.equalsIgnoreCase("scissors")) || (myMove.equalsIgnoreCase("scissors") && opponentMove.equalsIgnoreCase("paper")) || (myMove.equalsIgnoreCase("paper") && opponentMove.equalsIgnoreCase("rock"))){
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost :(");
                }


            }
        }
        System.out.println("Thanks for playing Rock, Paper, Scissors!");


    }
}
