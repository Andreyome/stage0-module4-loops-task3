package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        if(number<0){
            number=number*-1;
        }
        String string="";
        string+=number;
        int result=0;
        for(int i =0;i<= string.length();i++ ){
            result+=number%10;
            number=number/10;
        }
        System.out.println(result);
    }
}
