package samplerepo;
import java.util.*;
public class Sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        System.out.println("Sum: "+sum);
    }
}
