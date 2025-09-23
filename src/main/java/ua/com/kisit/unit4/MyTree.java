package ua.com.kisit.unit4;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {

    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<>(Comparator.naturalOrder());
        tree.add(7);
        tree.add(8);
        tree.add(9);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        System.out.println(tree);

        TreeSet<Integer> tree2 = new TreeSet<>(Comparator.reverseOrder());
        tree2.add(10);
        tree2.add(8);
        tree2.add(9);
        tree2.add(2);
        tree2.add(3);
        tree2.add(4);
        tree2.add(5);

        System.out.println(tree2);

        // відмінна область
        TreeSet<Integer> tree3 = new TreeSet<>(tree2);
        tree3.removeAll(tree);
        System.out.println(tree3);

        // cпільна область
        TreeSet<Integer> tree4 = new TreeSet<>(tree2);
        tree4.retainAll(tree);
        System.out.println(tree4);






    }

}
