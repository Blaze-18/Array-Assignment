import java.util.Random;

public class Main {
    public static void main(String args[]){

        Random rd = new Random();
        final int length = 10;
        int[] array = new int[length];
        int companion = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(100);
            companion++;
        }
        System.out.println("The array : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        Operations ar = new Operations();
        ar.setArray(array);
        System.out.println("\nElement on even index ");
        ar.evenIndex();
        System.out.println("\neven element ");
        ar.evenElement();
        System.out.println("\nReverse order");
        ar.Reverse();
        System.out.println("\nFirst and last element ");
        ar.firstLast();
    }
}
