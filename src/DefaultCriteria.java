public class DefaultCriteria implements Criteria {

    @Override
    public boolean isApply(int number) {
        return true;
    }

    @Override
    public String print(int number) {
        return "Divided " + number + " by 3\n" + "Divided " + number + " by 5";
    }
}
