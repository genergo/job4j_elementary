package ru.job4j.Variable;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-10);
        possibleDiv(-20);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println(number + " - Could not div 0.");
        }

        if (number < 0) {
            System.out.println(number + " - This is negativ numbers");
        }

        if (number > 0) {
            System.out.println(number + " - This is positive number");
        }
    }
}
