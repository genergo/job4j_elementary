package ru.job4j.variable;

public class Massa {
        public static double manWeight(short height) {
            double rsl = (height - 100) * 1.15;
            return rsl;

        }

        public static double femanWeight(short height) {
            double rsl = (height - 110) * 1.15;
            return rsl;
                }

        public static void main(String[] args) {
            short manheight = 187;
            double man = Massa.manWeight(manheight);
            System.out.println("Мужчина при росте 187 см может иметь идеальный вес " + man + " кг ");
            short femanheight = 180;
            double feman = Massa.femanWeight(femanheight);
            System.out.println("Женщина при росте 180 см может иметь идеальный вес " + feman + " кг ");

        }
    }

