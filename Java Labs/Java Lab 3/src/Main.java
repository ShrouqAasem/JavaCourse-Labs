import function.ConvertTemp;
import function.calculateRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("the value of temp in Celsius ");
        float temp = input.nextFloat();
        System.out.println("Temp is " + temp +"C or " + new ConvertTemp().apply(temp) + " F");



        Double []arr = new Double[3] ;
        Scanner inputForArray = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        calculateRoot calculateRoot = new calculateRoot();
        calculateRoot.apply(arr);


    }

}