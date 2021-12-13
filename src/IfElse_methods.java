import java.util.ArrayList;
import java.util.NoSuchElementException;

public class IfElse_methods {
    public String compareText(String input){
        if (input.equals("FastTrackIT")){
            return "Learning text comparison";
        }
        else return "Got to try some more";
    }

    public String problem5(String str, int number){
        if(str.equals("FastTrackIT")& number<=3){
            return str + number;
        }
        else if(!str.equals("FastTrackIT") & number>=4){
            return number + str;
        }
        return "none of the 2 conditions";
    }

    public String problem6(int number){
        if(number>8 | number == 6){
            return "The amount of snow this winter was(cm): " + number;
        }
        else return "The forecast snow is(cm): " + number;
    }

    public String problem7(int number){
        if(number>3 & number !=4){
            return "The number is greater than 3 and not equal to 4";
        }
        else if(number == 4){
            return "The number is equal to 4";
        }
        else if(number < 3){
            return "The number is lower than 3";

        }
        return "none of the conditions are true";
    }
    public void problem8(int number){
        switch (number) {
            case 0: { System.out.println("the number is 0");
                break;}
            case 1: { System.out.println("the number is 1");
                break;}
            case 2: { System.out.println("the number is 2");
                break;}
            case 3: { System.out.println("the number is 3");
                break;}
            case 4: { System.out.println("the number is 4");
                break;}
            case 5: { System.out.println("the number is 5");
                break;}
            case 6: { System.out.println("the number is 6");
                break;}
            case 7: { System.out.println("the number is 7");
                break;}
            case 8: { System.out.println("the number is 8");
                break;}
            case 9: { System.out.println("the number is 9");
                break;}
            default: System.out.println("another number");

        }
    }
    public boolean isNumberEven(int number){
        if(number%2==0){
            return true;
        }
        else return false;
    }
    public boolean isEligibleToVote(int age){
        if(age >=18){
            return true;
        }
        else return false;
    }

    public int problema11(int first, int second, int third){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);

        Integer max = numbers.stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        return max;
    }
}
