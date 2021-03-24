package ru.javawebinar.topjava;

public class Main1 {
    public static void main(String[] args) {
        String k = new String("email:ekaterinka.pichueva@yandex.ru;name:Екатерина Пичуевва");
        //String k1= Substr
        String s = new String("Мама мыла раму");
        String s1 = s.substring(0, s.indexOf(" "));
        String s2 = s.substring(1 + s.indexOf(" "), s.lastIndexOf(" "));
        String s3 = s.substring(1 + s.lastIndexOf(" "));
        String s4 = s.substring(s.indexOf(" "));
        String s5 = s.substring(s.indexOf(" ") + 1);
        String p1;
        String p2;
        String p3;

        String[] split = s.split(" ");
        if (split.length == 3) {
            p1 = split[0];
            p2 = split[1];
            p3 = split[2];
        } else {
            p1 = split[0];
            p2 = split[1];
            System.out.println(p1);
            System.out.println(p2);
        }
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s5);
//        System.out.println(s.lastIndexOf(" "));
//        System.out.println(s.indexOf(" "));
    }
}
