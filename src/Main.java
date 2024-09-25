import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        Fibonachi fib = new Fibonachi(N, fibonachi(N));

        System.out.println("The " + fib.getN() + "'s number is: " + fib.getFib());
        System.out.println("The sum of squares of the Fibonacci numbers: " + fibonachi_sum(fib.getN()));

        fib.setN(6);
        fib.setFib(fibonachi(6));

        System.out.println("The " + fib.getN() + "'s number is: " + fib.getFib());

    }

    /**
     *Generates a Fibonacci number
     */
    static int fibonachi(int N){
        int fibonachi = 1;
        if(N == 1){
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 2; i < N; i++) {
            fibonachi = a + b;
            a = b;
            b = fibonachi;
        }
        return fibonachi;
    }

    /**
     *Generates the sum of the squares of the Fibonacci numbers
     */
    static int fibonachi_sum(int N){
        int fib_sum = 1;
        int fibonachi;
        if(N == 1){
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 2; i < N; i++) {
            fibonachi = a + b;
            a = b;
            b = fibonachi;
            fib_sum += fibonachi * fibonachi;
        }
        return fib_sum;
    }
}
