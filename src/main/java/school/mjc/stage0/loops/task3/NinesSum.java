package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String result ="";
        int resultLast = 0;
        for (int i =1;i<=lengthOfLastNumber;i++){
            result+="9";
            resultLast+=Integer.parseInt(result);

        }
        System.out.println(resultLast);
    }
}
