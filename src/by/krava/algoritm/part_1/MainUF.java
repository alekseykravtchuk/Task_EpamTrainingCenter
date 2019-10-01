package by.krava.algoritm.part_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainUF {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\tinyUF.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int N = sc.nextInt();
        QuickFindUF uf = new QuickFindUF(N);
        while (sc.hasNext()) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                //System.out.println(p + " " + q);
            }
        }

        System.out.println(uf.connected(0, 5)); //true
        System.out.println(uf.connected(2, 3)); //false

    }
}
