package ru.job4j.Variable;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 50;
        return rsl;
    }

    public static float rubleToDenge(float value) {
        float rsl = value / 50;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollar.");
        float Denge = Converter.rubleToDenge(300);
        System.out.println("200 rubles are " + Denge + " denge.");
    }
}
