package task1;
import java.lang.Math.*;
import java.util.Scanner;

public class ArcTg {
    public static double arctg(double x){

        if (Math.abs(x) > 1 ){
            return Double.NaN;
        }

        int n = 1;

        double result = 0;
        double tmp = 1;
        while (Math.abs(tmp )> 0.00000001){

            tmp = Math.pow(-1, n-1)*((Math.pow(x, 2*n-1))/(2*n - 1));

            result += tmp;
            n++;

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(arctg(Double.parseDouble(scanner.next())));

    }
}

