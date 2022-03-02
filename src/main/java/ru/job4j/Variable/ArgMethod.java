package ru.job4j.Variable;

public class ArgMethod {
        public static void hello(String name){
        System.out.println("Hello, " + name + ", age =6 ");
        }

        public static void main(String[] args){
        String name  = "Jodd";
        int age = 6;
        ArgMethod.hello(name);
        ArgMethod.hello(name);
        ArgMethod.hello(name);
        ArgMethod.hello(name);
        }
}
