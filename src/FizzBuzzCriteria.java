public class FizzBuzzCriteria implements Criteria {

    @Override
    public boolean isApply(int number) {
        return number % 15 == 0;
    }

    @Override
    public String print(int number) {
        return "FizzBuzz";
    }
}
