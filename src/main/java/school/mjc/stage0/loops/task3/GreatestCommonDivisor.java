package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result =0;
        if (first==0||second==0){
            System.out.println(first+second);
        }
        else{
        for (int i=1;(i<=first) && (i<=second);i++){
            if(first%i==0 && second %i==0){
                result=i;
            }
        }
        System.out.println(result);}
    }
}
