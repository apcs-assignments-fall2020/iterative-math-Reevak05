import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 2;
        double m = 1;
        while (Math.abs(m-n)>=0.0001) {
            n=m;
            m = (n+(x/n))/2;
           
            System.out.println("n="+n);
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        if (x==0) return 1;
        
        int a = 1;
        for (int i = 1; i <= x; i++) a = a*i;
        return a;
        
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        int j = 0;
        while (Math.E-e>=0.00001) {
            e = e + (1/factorial(j));
            j++;
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        double entry = scan.nextDouble();
        System.out.println("The sqaure root of your number is approximately" + babylonian(entry) + ".");
        System.out.println("The value of e is approximately " + calculateE() + ".");


        

        scan.close();
    }
}
