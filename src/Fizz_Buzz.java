public class Fizz_Buzz implements Criteria {
    @Override
    public boolean isApply(int number) {
        return number > 7;
    }

    @Override
    public String print(int number) {
        return "Fizz-Buzz";
    }
}
