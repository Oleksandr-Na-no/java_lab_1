import java.util.Scanner;

class Main {
    static int fib_sum = 1;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        Fibonachi fib = new Fibonachi(N, fibonachi_SQ(N));

        System.out.println("The " + fib.getN() + "'s number is: " + fib.getFib());
        System.out.println("The sum of squares of the Fibonacci numbers: " + fib_sum);

        fib_sum = 1;
        fib.setN(6);
        fib.setFib(fibonachi_SQ(6));

        System.out.println("The " + fib.getN() + "'s number is: " + fib.getFib());

    }

    static int fibonachi_SQ(int N){
        int fibonachi = 1;
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
        return fibonachi;
    }
}
