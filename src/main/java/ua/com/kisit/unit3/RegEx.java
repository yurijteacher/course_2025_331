package ua.com.kisit.unit3;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        String str = "I study Java!";

        String pattern = "[ IJa-z]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        if(m.matches()){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        System.out.println(m.matches() ? true : false);

        /*
        [0-9]
         */

        String str1 = "123123";
        Pattern p1 = Pattern.compile("[0-9]+");
        Matcher m1 = p1.matcher(str1);

        System.out.println(m1.matches() ? true : false);

        /*
        [0-9]+
        \d [0-9]
        \D [^0-9]
        \w [a-zA-Z0-9_]
        \W [^a-zA-Z0-9_]
        \b
        \B
        \t
        \f
        \n
        \r
        \s [\t\f\n\r]
        \S
         [a-z]
         [A-Z]
         [0-9]
         */

        String str2 = "att";

        Pattern p2 = Pattern.compile("[abc]");
        Matcher m2 = p2.matcher(str2);

        System.out.println(m2.matches() ? true : false);

        // "[]+" 1>
        // "[]{n,m}" від n по m
        // "[n,]" n>2
        // "[]?" 1 або відсутнжє

        String email = "vasya.pypkin.s@12kneu.edu.ua";

        String pattern2 = "[a-zA-Z]+[\\.\\w]+@[\\w]+[\\.\\w]+[\\a-zA-Z]{2,}";

        Pattern p3 = Pattern.compile(pattern2);
        Matcher m3 = p3.matcher(email);
        System.out.println(m3.matches() ? true : false);


    }




}
