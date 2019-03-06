import java.util.Random;

public class Coin {

    public final static int HEADS = 0;
    public final static int TAILS = 1;

    private int faceUp;

    public Coin() {

        flipACoin();

    }

    public void flipACoin() {
        Random rand = new Random();
        faceUp = rand.nextInt(2);

    }

    public String getResult() {
        if (faceUp == HEADS) {
            return "HEADS";
        } else if (faceUp == TAILS){
            return "TAILS";
        } else {
            return "invalid";
        }


    }
}
