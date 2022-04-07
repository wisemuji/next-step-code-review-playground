public class StringCalculator {




    public int result(String input) {
        String[] inputs = input.split(" ");
        return calculator(inputs.length -1, inputs);
    }

    public int calculator(int number, String[] input) {
        if (number == 0) {
            return Integer.parseInt(input[number]);
        }

        return branchMethod(number, input);
    }

    private int branchMethod(int number, String[] input) {
        switch (input[number]) {
            case "+" : return add(number, input);
            case "-" : return subtract(number, input);
            case "*" : return multiply(number, input);
            case "/" : return divide(number, input);
            default: return number;
        }
    }

    private int add(int number, String[] input) {
        return calculator(number -1, input) + Integer.parseInt(input[number + 1]);
    }

    private int subtract(int number, String[] input) {
        return calculator(number -1, input) - Integer.parseInt(input[number + 1]);
    }

    private int divide(int number, String[] input) {
        return calculator(number -1, input) / Integer.parseInt(input[number + 1]);
    }

    private int multiply(int number, String[] input) {
        return calculator(number -1, input) * Integer.parseInt(input[number + 1]);
    }
}
