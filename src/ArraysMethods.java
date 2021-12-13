import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArraysMethods {

    public void displayArray(Object[] array){
        for(Object i:array){
            System.out.println(i);
        }
    }

    public void displayArray(int[] array){
        for(int i:array){
            System.out.println(i);
        }
    }
    public void oneLineDisplay(String[] array){
        for(String i:array){
            System.out.print(i);
        }
    }

    public int[] problema3(){
        int[] array = new int[50];
        int nextEven = 2;

        for(int i= 0 ; i<50; i++){
            array[i] = nextEven;
            nextEven+=2;
        }
        return array;
    }

    public double problema4(int[] arr){
        int count = 0;
        int sum = 0;

        for(int i:arr){
            sum+= i;
            count++;
        }
        return sum/count;
    }

    public boolean problema5(String[] arr, String str){
        for(String i:arr){
            if(i.equals(str)){
                return true;
            }
        }
        return false;
    }

    public boolean problema6(int[] arr, int nr){
        for(int i:arr){
            if(i == nr){
                return true;
            }
        }
        return false;
    }

    public void problema7(){
        String[] arr = new String[20];
        for(int i = 0; i<20; i++){
            if(i%2==0){
                arr[i] = " ";
            }
            else {
                arr[i] = "-";
            }
        }

        for(int i = 0; i<10; i++){
            this.oneLineDisplay(arr);
            System.out.println(" ");
        }
    }

    public Integer[] problema8(int number, Integer[] arr){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        Collections.addAll(intList, arr);
        Integer[] result = intList.stream()
                .filter(v -> v != number)
                .toArray(Integer[]::new);
        return result;
    }

    public int problema9(int[] array){
        int lowest, second;

        if(array.length<2){
            System.out.println("array must have at least 2 elements");
            return 0;
        }
        else {
            lowest = Integer.MAX_VALUE;
            second = Integer.MAX_VALUE;

            for(int i = 0 ; i<array.length; i++){
                if(array[i] < lowest){
                    second = lowest;
                    lowest = array[i];
                }

                else if(array[i] < second & array[i] != lowest){
                    second = array[i];
                }
            }
        }
        return second;

    }

    public void problema10(int[] arr1, int[] arr2){
        if(arr1.length > arr2.length){
            System.out.println("can't copy all of the elements, array 2 is not long enough");
            return;
        }
        else {
            for(int i = 0; i<arr1.length ; i++){
                arr2[i] = arr1[i];
            }

        }
    }
}
