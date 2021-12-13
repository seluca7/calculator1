public class LogicalOp {
    public int checkBiggerNumber(int first, int second){
        if(first>second){
            return first;
        }
        else if(second>first){
            return second;
        }
        else return first;
    }

    public int max(int a, int b){
        if(a>b){
            return a;
        }
        else return b;
    }

    public void problema1(int number){
        if(number==100){
            System.out.println("number can't be 100");
        }
        else if(number<100){
            for(int i = number;i<=100;i++){
                System.out.println(i);
            }
        }
        else {
            for(int i = number;i>=100;i--){
                System.out.println(i);
            }
        }
    }

    public void problema2(int number){
        if(number == -100){
            System.out.println("number can't be -100");
        }
        else if(number< -100){
            for(int i = number; i<= -100; i++){
                System.out.println(i);
            }
        }
        else{
            for (int i = number; i>= -100; i--){
                System.out.println(i);
            }
        }
    }

    public void problema3(int first, int second){
        if(first == second){
            System.out.println(first);
        }
        else if(first<second){
            for(int i = first; i<=second;i++){
                System.out.println(i);
            }
        }
        else {
            for(int i = first; i>=second; i--){
                System.out.println(i);
            }
        }
    }

    public void problema4(int first, int second){
        if(first>second){
            for(int i = second; i<=first; i++){
                System.out.println(i);
            }
        }
        else {
            for(int i = first; i<= second; i++){
                System.out.println(i);
            }
        }
    }

    public void problema5(){
        for(int i = 0; i<=100; i+=2){
            System.out.println(i);
        }
    }

    public void problema6(){
        for(int i = 1; i<=100; i+=2){
            System.out.println(i);
        }
    }

    public double problema8(int number){
        int nr = 0;
        int suma = 0;
        if(number > 100){
            System.out.println("numarul trebuie sa fie <=100");
            return 0;
        }
        else {
            for (int i = number; i<100; i++){
                nr++;
                suma+=i;
            }
        }

        return suma/nr;
    }

    public int problema7(int number){
        int suma = 0;
        if(number > 100){
            System.out.println("numarul trebuie sa fie <=100");
            return 0;
        }
        else {
            for (int i = number; i<100; i++){
                suma+=i;
            }
        }

        return suma;
    }

    public void problema9(int number) {
        int stars = number;
        if (number > 0) {
            for (int i = number; i >= 0; i--){
                for(int j = 0; j<= stars; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
                stars--;
            }

        }
    }

    public void whileProblema1(int number){
        if(number>100){
            System.out.println("number has to be <=100");
        }
        else {
            int i = number;
            while(i<=100){
                System.out.println(i);
                i++;
            }
        }
    }

    public void whileProblema2(int number){
        if(number>-100){
            System.out.println("number has to be <=-100");
        }
        else {
            int i = number;
            while(i<=-100){
                System.out.println(i);
                i++;
            }
        }
    }

    public void whileProblema3(int first, int second){
        if(first>second){
            int i = first;
            while(i>=second){
                System.out.println(i);
                i--;
            }
        }
        else {
            int i = first;
            while(i<=second){
                System.out.println(i);
                i++;
            }
        }
    }

    public void whileProblema4(int first, int second){
        if(first>second){
            int i = second;
            while(i<=first){
                System.out.println(i);
                i++;
            }
        }
        else{
            int i = first;
            while(i<=second){
                System.out.println(i);
                i++;
            }
        }
    }

    public void whileProblema5(){
        int i = 0;
        while(i<=100){
            System.out.println(i);
            i+=2;
        }
    }
    public void whileProblema6(){
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i+=2;
        }
    }

    public void whileProblema7(){
        double count = 0;
        double suma = 0;
        int i = 111;

        while(i<=8899){
            suma+= i;
            count++;
            i++;
        }
        System.out.println("suma este: " + suma);
        System.out.println("media este: " + suma/count);
    }

    public double whileProblema8(int first, int second){
        double suma = 0;
        double count = 0;
        if(first>second){
            int i = second;
            while(i<=first){
                if(i%7==0){
                    suma+=i;
                    count++;
                }
                i++;
            }
        }
        else{
            int i = first;
            while(i<=second){
                if(i%7==0){
                    suma+=i;
                    count++;
                }
                i++;
            }
        }
        System.out.println("suma numerelor este " + suma );
        System.out.println("sunt "  + count + " numere divizibile cu 7 in acest interval");
        return suma/count;
    }

    public void whileProblema9(){
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i = 2;
        int count = 20;

        while(i<count){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            i++;
        }
    }

    public void cozaLozaWoza(){
        int i = 1;
        int count = 0;
        while (i<=110){
            boolean mult3 = false;
            boolean mult5 = false;
            boolean mult7 = false;

            count++;

            if(i%3 == 0){
                mult3 = true;
            }
            if(i%5 == 0){
                mult5 = true;
            }
            if(i%7 == 0){
                mult7 = true;
            }

            if(mult3 & mult5 & mult7){
                System.out.print("CozaLozaWoza ");
            }
            else if(mult3 & mult5){
                System.out.print("CozaLoza ");
            }
            else if(mult3 & mult7){
                System.out.print("CozaWoza ");
            }
            else if(mult5 & mult7){
                System.out.print("WozaLoza ");
            }
            else if(mult3){
                System.out.print("Coza ");
            }
            else if(mult5){
                System.out.print("Loza ");
            }
            else if(mult7){
                System.out.print("Woza ");
            }
            else {System.out.print(i + " ");}

            if(count == 11){
                System.out.println(" ");
                count = 0;
            }
            i++;
        }

    }

}
