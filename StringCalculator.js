const StringCalculator = (args) => {
    const inputs = args.split(" ");

    const calculator = (number, input) => {
        if (number === 0) return Number.parseInt(input[number]);

        return branchMethod(number, input);
    };

    const branchMethod = (number, input) => {
        switch (input[number]) {
            case "+":
                return add(number, input);
            case "-":
                return subtract(number, input);
            case "*":
                return multiply(number, input);
            case "/":
                return divide(number, input);
            default:
                return number;
        }
    };


};

console.log(StringCalculator("1 + 2"));
