public class BuzzCriteria implements Criteria {

    @Override
    public boolean isApply(int number) {
        return number % 5 == 0;
    }

    @Override
    public String print(int number) {
        return "Buzz";
    }
}
