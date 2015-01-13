
public class FizzBuzz {

    public String count(int input) {
        if(isMod3And5EqualZero(input)){
            return "FIZZBUZZ";
        }else if(isMod3EqualZero(input)){
            return "FIZZ";
        }else if(isMod5EqualZero(input)){
            return "BUZZ";
        }
        return String.valueOf(input);
    }

    private boolean isMod5EqualZero(int input) {
        return input%5==0;
    }

    private boolean isMod3EqualZero(int input) {
        return input%3==0;
    }

    private boolean isMod3And5EqualZero(int input) {
        return input%3==0 && input%5==0;
    }
}
