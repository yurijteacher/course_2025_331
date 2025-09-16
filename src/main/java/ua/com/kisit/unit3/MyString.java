package ua.com.kisit.unit3;

import java.util.Arrays;

public class MyString {

    public static void main(String[] args) {

        String str1 = "abc";
        System.out.println(str1.hashCode());

        str1 = str1 + " 123";
        System.out.println(str1.hashCode());

        String str2 = "abc 123";
        System.out.println(str2.hashCode());

        System.out.println(str1==str2); // false

        System.out.println(str1.equals(str2)); // true

        String str3 = new String("abc 123");

        System.out.println(str3==str2);
        System.out.println(str3.equals(str2));

        char[] arr1 = str3.toCharArray();

        for (char ch : arr1) {
            System.out.println(ch);
        }

        for (char ch : arr1) {
            if(ch=='a'){
                ch = 'b';
            }
        }

        String text = "I study OOP with my teacher!!";

        System.out.println(text.toUpperCase().trim());
        System.out.println(text.toLowerCase().trim());

        boolean logic = text.startsWith("I study"); // true
        System.out.println(logic);

        logic = text.endsWith("I study"); // false
        System.out.println(logic);

        System.out.println(text.replace('O', 'J'));

        text = text.replace('O', 'J');

        System.out.println(text);


        String text2 = "I,study.OOP,with.my_teacher!!";

        String[] text3 = text2.split("\\.|\\,|_");
        for (String el : text3) {
            System.out.print(el + ", ");
        }

        System.out.println();
        String text4 = new String(text.toCharArray(), 0,4);
        System.out.println(text4);


        StringBuilder stringBuilder = new StringBuilder("I study OOP with my teacher!!!!!");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("!!!");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.hashCode());

        StringBuffer stringBuffer = new StringBuffer("I");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append("I study OOP with my teacher!!!!!");
        System.out.println(stringBuffer.hashCode());




    }

}
