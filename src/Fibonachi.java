public class Fibonachi {

    private int N;
    private int fib;

    /**
     *Function to create the class
     */
    Fibonachi(int N, int fib) {
        this.N = N;
        this.fib = fib;
    }

    /**
     *Returns the value of N
     */
    public int getN() {
        return N;
    }

    /**
     *Updates the value of N
     */
    public void setN(int n) {
        N = n;
    }

    /**
     *Returns the value of the Fibonacci number
     */
    public int getFib() {
        return fib;
    }

    /**
     *Updates the value of the Fibonacci number
     */
    public void setFib(int fib) {
        this.fib = fib;
    }

}
