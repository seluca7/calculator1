public class Assignment_methods {

    public void printName(){
        System.out.println("Hello");
        System.out.println("Luci");
    }

    public void sumOfTwo(int a, int b){
        System.out.println(a+b);
    }

    public void divideTwo(double a, double b){
        System.out.println(a/b);
    }

    public void multipleOperations(char option){
        switch(option){
            case 'a' : {System.out.println(-5+8*6);
            break;}
            case 'b' : {System.out.println((55+9)%9);
            break;}
            case 'c' : {System.out.println(20+(-3)*5/8);
            break;}
            case 'd' : {System.out.println(5 + 15/3*2 - 8%3);
            break;}
            default: System.out.println("Not a valid option");
        }

    }

    public void pattern(){
        System.out.println("   J    a   v     v  a   ");
        System.out.println("   J   a a   v   v  a a   ");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a ");
    }

    public double average(double first, double second, double third){
        double avg = (first + second + third)/3;
        return avg;
    }

    public double farenheitToCelsius(double f){
        double celsius = 5.0/9.0 * (f-32);
        return celsius;
    }

    public double inchToMeters(double inch){
        double meters = inch * 0.0254;
        return meters;
    }

    public void speed(double distance, double hours, double minutes, double seconds){
        double kilometers = distance/1000;
        double miles = kilometers/1.609;
        double sec = seconds + minutes*60 + hours * 3600;
        double hr = hours + minutes/60 + seconds/3600;


        System.out.println(distance/sec + " meters/second");
        System.out.println(kilometers/hr + " kilometers/hour");
        System.out.println(miles/hr + " miles/hour");
    }


}
