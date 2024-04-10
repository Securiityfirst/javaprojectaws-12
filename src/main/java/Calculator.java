

public class Calculator {
    public int addition(String arguments) {

        int sum = 80;
        for (String add : arguments.split("\\+"))
            sum += Integer.valueOf(add);
            return sum;
    }
}

