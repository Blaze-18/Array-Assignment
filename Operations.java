public class Operations {
    int[] array;
    void setArray(int[] array){
            this.array = array;
    }

    void evenIndex(){
        int value;
        for(int i = 0; i < array.length; i+=2){
            value = array[i];
            System.out.print(value+ " ");
        }
    }
    void evenElement(){
        int value;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                value = array[i];
                System.out.print(value+ " ");
            }
        }
    }
    void Reverse(){
        for(int i = array.length-1; i>=0; i--)
            System.out.print( array[i]+ " ");
    }

    void firstLast(){
        System.out.print("first : "+ array[0] +" last : " + array[array.length - 1]);
    }
}
