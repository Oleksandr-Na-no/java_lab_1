import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter N: ");
        int N = sc.nextInt();

        Fibonachi fib = new Fibonachi(N);

        System.out.println("The sum of squares of the Fibonacci numbers: " + fib.getFib_sum());

        fib.setN(6);
        System.out.println("The sum of squares of number 6 is : " + fib.getFib_sum());

        System.out.println("The " + fib.getN() + "'s number is: " + fib.getFib());

    }
}
