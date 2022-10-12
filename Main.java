import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int length = 10;
        int[] array = new int[length];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }

        Arrays.sort(array);
        Operations obj = new Operations();
        
        System.out.println("Smallest array element : "+ array[0]);
        System.out.println("Sum of element without smallest : " + obj.getsum1(array));
        
        int sumation1 = obj.getsum1(array);
        System.out.println("Upadating smallest element...");
        
        Random rd = new Random();
        array[0] = rd.nextInt(20);
        
        Arrays.sort(array);
        
        System.out.println("new smallest element : " + array[0]);
        System.out.println("Sum of element after updating and excluding the smallest : " + obj.getsum2(array));
        
        int sumation2 = obj.getsum2(array);
        System.out.println("Diffrence between 2 sums = " + (sumation1 - sumation2) );
   
    }
}