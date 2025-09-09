package ua.com.kisit.unit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {

    static int x = 5;
    static int y = 10;

    public static void main(String[] args) {

        int c = x + y;

        System.out.println(c);

        //
        byte b = 1;
        System.out.println(b);

        short s = 1;
        System.out.println(s);

        int i = 1;
        System.out.println(i);

        long l = 100000000000L;
        System.out.println(l);

        float f = 1.1f;
        System.out.println(f);

        double d = 1.2;
        System.out.println(d);

        boolean logic = false;
        System.out.println(logic);

        char ch = 'a';
        System.out.println(ch);

        String str = "Hello Student!!";
        System.out.println(str.hashCode());
//        str = "Hello World!!"+"!!";
//        System.out.println(str.hashCode());

        String str2 = "Hello Student!!";
        System.out.println(str2.hashCode());

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        String str3 = new String(Arrays.toString(arr));

        int[] array1 = {1,2,3,4};
        int[] array2 = new int[10];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        array2[6] = 7;
        array2[7] = 8;
        array2[8] = 9;
        array2[9] = 10;


        System.out.println(array2.length);
        // for
        // while
        // do-while


        System.out.println("\nfor");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + ", ");
        }

        System.out.println("\nfor");
        // 1,..,10 [10]
        int j = 0;
        for (; j < array2.length;) {
            System.out.print(array2[j] + ", ");
            j++;
        }

        System.out.println("\nwhile");
        j = 0;
        while (j < array2.length) {
            System.out.print(array2[j] + ", ");
            j++;
        }

        j=0;
        System.out.println("\ndo-while");
        do {
            System.out.print(array2[j] + ", ");
            j++;
        } while (j < array2.length);




//        for (;;) {
//            System.out.print(array2[j] + ", ");
//            j++;
//        }


        System.out.println("\nprint Arrays");
        // sout
        System.out.print(Arrays.toString(array2));

        System.out.println("\nstream");
        // stream
        Arrays.stream(array2).forEach(System.out::print);

        System.out.println("\nprint - forEach");
        // forEach
        for (int el : array2) {
            System.out.print(el + ", ");
        }

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.forEach(System.out::print);


        int[][] arrays2 = new int[5][5];

        arrays2[0][0] = 1;
        arrays2[0][1] = 2;
        arrays2[0][2] = 3;
        arrays2[0][3] = 4;
        arrays2[0][4] = 5;

        int[][] arrays3 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };

        System.out.println();

        for (int k = 0; k < arrays3.length; k++) {
            System.out.println(Arrays.toString(arrays3[k]));
        }

        for (int k = 0; k < arrays3.length; k++) {
            for (int m = 0; m < arrays3[k].length; m++) {
                System.out.print(arrays3[k][m] + ", ");
            }
            System.out.println();
        }

        // IF ELSE
        if(logic == false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        String operation  = "+";

        if (operation.equals("+")) {
            System.out.println("add");
        } else if (operation.equals("-")) {
            System.out.println("subtract");
        } else {
            System.out.println("any");
        }


        switch (operation) {
            case "+":
                System.out.println("add");
                break;
            case "-":
                System.out.println("sub");
                break;
            case "*":
                System.out.println("multiply");
                break;
            case "/":
                System.out.println("divide");
        }

        int [] array4 = {1,2,3,4,5};

        for (int k = 0; k < array4.length; k++) {
            if(array4[k] > 2) break;
            System.out.print(array4[k] + ", ");
        }

        for (int k = 0; k < array4.length; k++) {
            if(array4[k] < 3) continue;
            System.out.print(array4[k] + ", ");
        }


    }
}
