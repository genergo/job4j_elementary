package ru.job4j.variable;

public class Cinema {
         public static void access(int age) {
            System.out.println("The age of the customer is : " + age);
             if (age <= 16) {
                 System.out.println("It is not for you.");
             } else {
                 System.out.println("Welcome to the cinema.");
             }
         }

        public static void main(String[] args) {
            Cinema.access(21);
            Cinema.access(16);
            Cinema.access(45);
            Cinema.access(66);

        }
    }

