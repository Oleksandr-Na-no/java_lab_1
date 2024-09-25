public class Fibonachi {

    private int N;
    private int fib;
    private int fib_sum = 1;

    Fibonachi(int N){
        this.N = N;
        fibonachi_SQ();
    }

    void fibonachi_SQ(){
        if(N == 1){
            fib  = 1;
        }
        int a = 1, b = 1;
        for (int i = 2; i < N; i++) {
            fib = a + b;
            a = b;
            b = fib;
            fib_sum += fib * fib;
        }
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
        fibonachi_SQ();
    }

    public int getFib() {
        return fib;
    }

    public int getFib_sum() {
        return fib_sum;
    }
}
