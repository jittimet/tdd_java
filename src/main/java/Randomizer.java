import java.util.Random;
public class Randomizer {
    private Random random;
    public Randomizer(){
        random = new Random();
    }
    public void setRandom(Random random){
        this.random = random;
    }

    public Integer getPattern() {
        return random.nextInt(2)+1;
    }

    public Integer getOperator() {
        return random.nextInt(3)+1;
    }

    public Integer getOperand() {
        return random.nextInt(9)+1;
    }
}