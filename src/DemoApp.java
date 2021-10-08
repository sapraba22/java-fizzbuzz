import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DemoApp {

    List<Criteria> criteriaList = new ArrayList<>();

    DemoApp() {
        //   this.criteriaList.add(new Fizz_Buzz()); //Greater than 7 as discussed
        this.criteriaList.add(new FizzBuzzCriteria());
        this.criteriaList.add(new FizzCriteria());
        this.criteriaList.add(new BuzzCriteria());
        this.criteriaList.add(new DefaultCriteria());
    }

    public String evaluate(int number) {
        for (var criteria : criteriaList) {
            if (criteria.isApply(number))
                return criteria.print(number);
        }
        return null;
    }

    public static void main(String[] args) {
        DemoApp demo = new DemoApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Inputs in Integer");
        int length = scanner.nextInt();
        System.out.println("Enter the inputs one by one");
        List<String> lists = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            lists.add(scanner.next());
        }
        for (String str : lists) {
            if (StringUtils.isNumeric(str)) {
                System.out.println(demo.evaluate(Integer.parseInt(str)));
            } else {
                System.out.println("Invalid Item");
            }
        }
    }
}


