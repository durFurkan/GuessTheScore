import java.util.Random;

public class Score {

    public int scoreGS (){
        Random random = new Random();
        int gs = random.nextInt(0,5);
        return gs;
    }

    public int scoreKopenhag (){
        Random random = new Random();
        int kh = random.nextInt(0,5);
        return kh;
    }

}
