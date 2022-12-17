package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0;
        int second =1;
        System.out.println(0);
        System.out.println(1);
        for (int i=2;i<lastFibonacci;i++){
            int result=first+second;
            System.out.println(result);
            first=second;
            second = result;
        }

    }
}
