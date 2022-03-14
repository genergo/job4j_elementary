package ru.job4j.Variable;

public class ConverterPass {
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
            float in = 140;
            float expected = 2;
            float out = ConverterPass.rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 Euro. Результат : " + passed);
            float in1 = 160;
            float expected1 = 2;
            float out1 = ConverterPass.rubleToDollar(in1);
            boolean passed1 = expected1 == out1;
            System.out.println("160 rubles are 2 Dollar. Test result : " + passed1);
            float in2 = 160;
            float expected2 = 2;
            float out2 = ConverterPass.rubleToDenge(in2);
            boolean passed2 = expected2 == out2;
            System.out.println("160 rubles are 2 Dollar. Test result : " + passed2);
        }
    }
