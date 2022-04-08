package ru.job4j.Variable;

public class Film {
    public static String permission(int age) {
       String answer = age >= 18 ? "Пожалуйста, проходите" : "СТОП, вам НЕЛЬЗЯ";
        return answer;
    }
       public static void main(String[] args) {
        String msg = Film.permission(18);
        System.out.println(msg);

    }
}
