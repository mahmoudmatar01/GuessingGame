public class Player {

    private int guessNumber;

    public void guess(){
        guessNumber= (int) (Math.random() * 10);
        System.out.println("I'm guessing "+guessNumber);
    }

    public int getGuessNumber() {
        return guessNumber;
    }

}
