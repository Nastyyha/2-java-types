package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String str = String.valueOf(x);
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(0)) % 2 != 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
