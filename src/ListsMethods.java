import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListsMethods {

    public void problema1(ArrayList<Integer> list){
        for(Integer i:list){
            System.out.println(i);
        }
    }

    public void problema2(ArrayList<Integer> list, Integer a){
        list.add(a);
    }

    public void problema3(ArrayList<Integer> list, Integer a){
        boolean display = false;
        for(Integer i:list){
            if (i == a){
                display = true;
            }

            if(display){
                System.out.println(i);
            }
        }

        if(!display){
            System.out.println("the element does not exist in the list");
        }
    }

    public void problema4(ArrayList<Integer> list){
        for(int i = list.size() - 1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }

    public void problema5(ArrayList<String> list, String toInsert, int index){
        if(index>=list.size() || index<0){
            System.out.println("the index does not exist");
        }
        else {
            list.set(index, toInsert);
        }
    }

    public void problema6(ArrayList<Integer> list, Integer x){
        list.add(0,x);
    }

    public void problema7(ArrayList<Integer> list){
        for(int i = 0; i<list.size();i++){
            System.out.println("Pe pozitia " + i + " valoarea este " + list.get(i));
        }
    }

    public Integer problema8(ArrayList<Integer> list){
        Integer max = list
                .stream()
                .mapToInt(v -> v)
                .max()
                .orElseThrow(NoSuchElementException::new);
        return max;
    }
}
