import task1.ArcTg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double c = ArcTg.arctg(0);
        System.out.println(c);
        Random random = new Random();
        System.out.print("{");
        ArrayList array = new ArrayList<Integer>();
        String line = "{";
        for (int i = 0; i < 1000; i++) {
            int a = random.nextInt(1000 );

            array.add(a);

            System.out.print(array.get(i)+ ", ");
        }
        line = line + '\n';
        String line2 = " {";
        System.out.println("");
        System.out.print("{");

        Collections.sort(array);

        for (int i = 0; i < 1000; i++) {

            System.out.print(array.get(i)+ ", ");
        }








    }
}
