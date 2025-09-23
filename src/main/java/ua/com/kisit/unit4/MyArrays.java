package ua.com.kisit.unit4;

import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = new int[] {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};

        Object[] arr4 = {1,'a',"asdsa",2.3,false};

        // Arrays
        System.out.println(Arrays.toString(arr));

        // for
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        // for
        for (Object el : arr4) {
            System.out.println(el);
        }

        int[][] arrays = new int[2][2];
        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[1][0] = 3;
        arrays[1][1] = 4;

        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]+",");
            }
            System.out.println();
        }

    }


}
