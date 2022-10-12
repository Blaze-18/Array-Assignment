import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int length = 10;
        int x;

        ArrayList <Integer> secondArray = new ArrayList<Integer>(length);
        ArrayList <Integer> Permutation = new ArrayList<Integer>(length); 
        
        for(int i = 1; i<= 10; i++){
            secondArray.add(i);
        }

        Random rd = new Random();

        for(int i = 0 ; i < 10 ; i++){
            x = rd.nextInt(10-i);
            Permutation.add(secondArray.get(x));
            secondArray.remove(x);
        }

        System.out.println(Permutation);
        
    }
}
