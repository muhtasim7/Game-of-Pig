/**

 * Author: Muhtasim Khan 

 * Date: 23/03/2022

 * Filename: GameOfPig.java

 * Description: This code is used to play the game of pig. Player 1 and Player 2 take turns playing the game. During each turn, the player has the choice to roll or to stick. Rolling lets the player roll the die and add the number they get to their turn total and choose whether or not to roll again as long as the roll ranges from 2 to 6. If they roll a 1, their turn total is decreased to 0, and it is the other player's turn. If they choose not to roll, the value of their turn total adds to their actual total. The first player to have a total of 100, and stick with it wins the game. 

 **/

//import the scanner

import java.util.*;

// this is the class for the program

class GameOfPig

{

  public static void main(String[] args)

  {

    //Print the rules of the game of pig for the user

    System.out.println("Welcome to the game of pig! Player 1 and Player 2 take turns playing the game. During each turn, the player has the choice to roll or to stick. Rolling lets the player roll the die and add the number they get to their subtotal and choose whether or not to roll again as long as the roll ranges from 2 to 6. If they roll a 1, their subtotal is decreased to 0, and it is the other players turn. If they choose not to roll, the value of their subtotal adds to their actual total. The first player to have a total of 100, and stick with it wins the game. Good luck!");

    //skip a line

    System.out.println(" ");

    

    // Initializing each variable used in the program

    // dice = dice used to roll the number

    int dice,temp1,temp2,total1,total2,winner,player;

    // total1 = place holder 2 for player 1

    total1=0;

    // temp1 = place holder 1 for player 1 

    temp1=0;

    // total2 = place holder 2 for player 2 

    total2=0;

    // temp2 = place holder 1 for player 2

    temp2=0;

    // winner = it is the  count that ends the program when someone reaches 100 points or more

    winner=0;

    // it is declaring which player is playing

    player=1;

    // the scanner is set with reader to let the user input their choice

    Scanner reader = new Scanner(System.in);

    // reader is a variable to hold the answer from the user

    String rolling="";

    

    // holds the random number created by the random generator 

    Random rnd = new Random();

    //keep playing the game while there is not yet a winner

    while (winner==0)

      {

        // Play out player ones turn when it is his turn and there is not yet a winner

        while ((player==1)&&(winner==0))

        {

          System.out.printf(" Player %d: (%d, %d) Rolling? (y/n)", player,temp1,total1);

          //use the user input to decide if the player rolls or not

          rolling = reader.nextLine();

          //roll the dice if the dice if the player inputs "y"

          if (rolling.equals("y"))

          {

            //roll the die and get an random number from 1 to 6

            dice = rnd.nextInt(6) + 1;

            //print the users roll

            System.out.printf(" Rolled %d\n", dice);

            // if a number between 2 and 6 is rolled add that to the player 1 subtotal point then go back to asking if they want to roll again 

            if (dice!=1)

            {

            //add roll to subtotal

            temp1=temp1 +dice;

            } 

            //remove subtotal and let the user know they bust if they roll a 1

            else 

            {

              //Tells the user they bust and shows the subtotal they lost as well as their current toal

              System.out.printf( "Bust! You lose %d but keep %d\n\n", temp1, total1);

              //makes their subtotal 0 again

              temp1 = 0;

              //changes the players turn

              player =2;

            }

          }

            //if the user does not wish to roll, changes the players turn and adds subtotal to total

            else

            {

              //changes the players turn

              player =2;

              //adds subtotal to total

              total1=total1 + temp1;

              //Prints the players 1's current total

              System.out.printf("Sticking with %d\n\n", total1);

              //sets subtotal to 0

              temp1 = 0;

              //if total is over 100, the winner is set to player 1

              if (total1>=100)

                //Sets the winner to player one

                winner = 1;

            }

          }

         // Play out player twos turn when it is his turn and there is not yet a winner

        while ((player==2)&&(winner==0))

        {

          // Ask if the user wants to roll displays subtotal and total

          System.out.printf(" Player %d: (%d, %d) Rolling? ((y/n))", player,temp2,total2);

          //takes users input

          rolling = reader.nextLine();

            //rolls if player inputs "y"

            if (rolling.equals("y"))

            {

              //roll the die and get an random number from 1 to 6

              dice = rnd.nextInt(6) + 1;

              //print the users roll

              System.out.printf(" Rolled %d\n", dice);

              // if a number between 2 and 6 is rolled add that to the player 2 subtotal point then go back to asking if they want to roll again 

              if (dice!=1)

              {

                //add roll to subtotal

                temp2= temp2 + dice;

              }

              // if 1 is rolled then say their progress is lost and move on to the next player.  

              else 

              {

                System.out.printf( "Bust! You lose %d but keep %d\n\n", temp2, total2);

                //set subtotal to 0

                temp2 = 0;

                //change players turn

                player =1;

              }

            }

            // if player two does not want to play then go back to player one's turn and keep player two's scored saved

            else

            {

              //changes player turn

              player =1;

              //add subtotal to total

              total2=total2 + temp2;

              //prints the current total

              System.out.printf("Sticking with %d\n\n", total2);

              //set subtotal to 0

              temp2 = 0;

              // if player two reaches 100 points then end the program and say player two wins

              if (total2>=100)

                //Sets the winner to player two

                winner = 2;

            }

        }

      }

      // if player 1 is the winner, print that player 1 wins and his total points

      if (winner ==1)

        System.out.printf("Player 1 wins with a score of %d", total1);

      // if player 2 is the winner, print that player 2 wins and his total points

      else 

        System.out.printf("Player 2 wins with a score of %d", total2); 

     

  }  

}

