public class FizzCriteria implements Criteria {

    @Override
    public boolean isApply(int number) {
        return number % 3 == 0;
    }

    @Override
    public String print(int number) {
        return "Fizz";
    }
}
