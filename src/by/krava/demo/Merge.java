package by.krava.demo;

import java.util.*;

/**
 * написать эффективный метод объединения двух списков так, чтобы все элементы из
 * списка b оказались в списке а в отсортированном порядке. Списов b должен остаться
 * без ихменений.
 * void merge(List<Integer> a, List<Integer> b) {}
 */

public class Merge {
    private List<Integer> listA;
    private List<Integer> listB;

    Merge(List<Integer> a, List<Integer> b) {
        this.listA = a;
        this.listB = b;
    }

    void merge(List<Integer> a, List<Integer> b) {
        a.addAll(b);
        Set<Integer> set = new TreeSet<>(a);
        for (int i = 0; i < a.size(); i++) {

        }
    }

    public List<Integer> getListA() {
        return listA;
    }

    public List<Integer> getListB() {
        return listB;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 3, 5));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2, 6, 8));
        Merge obj = new Merge(list1, list2);
        obj.merge(obj.listA, obj.listB);
        System.out.println(list1);
    }


}
