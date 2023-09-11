public class GuessingGame {

    //GuessGame has three instance
    //variables for the three Player
    //objects
   private Player player1;
   private Player player2;
   private Player player3;

   public void startGame(){

       /*
        create three Player objects and
        assign them to the three Player
        instance variables
        */
       player1=new Player();
       player2=new Player();
       player3=new Player();

       /*
       declare three variables to hold the
       three guesses the Players make*/
       int guessP1 = 0;
       int guessP2 = 0;
       int guessP3 = 0;

       /*
       * declare three variables to hold a true or
         false based on the player’s answer*/
       boolean p1isRight = false;
       boolean p2isRight = false;
       boolean p3isRight = false;

       //make a ‘target’ number that the players have to guess
       int targetNumber = (int) (Math.random() * 10);

       while (true) {
           //make players guess number
           player1.guess();
           player2.guess();
           player3.guess();

           //get each player’s guess (the result of their
           //guess() method running) by accessing the
           //number variable of each player
           guessP1=player1.getGuessNumber();
           guessP2=player2.getGuessNumber();
           guessP3=player3.getGuessNumber();

           //get each player’s guess (the result of their
           //guess() method running) by accessing the
           //number variable of each player
           if(guessP1==targetNumber){
               p1isRight=true;
           }
           if(guessP2==targetNumber){
               p2isRight=true;
           }
           if(guessP3==targetNumber){
               p3isRight=true;
           }

           // if player one OR player two OR player three is right...(the || operator means OR)
           if (p1isRight || p2isRight || p3isRight) {
               System.out.println("We have a winner!");
               System.out.println("Player one got it right? " + p1isRight);
               System.out.println("Player two got it right? " + p2isRight);
               System.out.println("Player three got it right? " + p3isRight);
               System.out.println("Game is over.");
               break; // game over, so break out of the loop
           } else {
               // otherwise, stay in the loop and ask the players for another guess.
               System.out.println("Players will have to try again");
           }
       }
   }

}
