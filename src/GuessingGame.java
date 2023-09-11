public class GuessingGame {

   private Player player1;
   private Player player2;
   private Player player3;

   public void startGame(){

       // initial values
       player1=new Player();
       player2=new Player();
       player3=new Player();

       int guessP1 = 0;
       int guessP2 = 0;
       int guessP3 = 0;

       boolean p1isRight = false;
       boolean p2isRight = false;
       boolean p3isRight = false;

       //declaring target number
       int targetNumber = (int) (Math.random() * 10);

       //make players guess number

       while (true) {
           player1.guess();
           player2.guess();
           player3.guess();

           //set values in guessing variables
           guessP1=player1.getGuessNumber();
           guessP2=player2.getGuessNumber();
           guessP3=player3.getGuessNumber();

           //check if any player guess number == target number and update player status
           if(guessP1==targetNumber){
               p1isRight=true;
           }
           if(guessP2==targetNumber){
               p2isRight=true;
           }
           if(guessP3==targetNumber){
               p3isRight=true;
           }

           // print result
           if (p1isRight || p2isRight || p3isRight) {
               System.out.println("We have a winner!");
               System.out.println("Player one got it right? " + p1isRight);
               System.out.println("Player two got it right? " + p2isRight);
               System.out.println("Player three got it right? " + p3isRight);
               System.out.println("Game is over.");
               break; // game over, so break out of the loop
           } else {
               // we must keep going because nobody got it right!
               System.out.println("Players will have to try again");
           }
       }
   }

}
