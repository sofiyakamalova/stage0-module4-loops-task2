package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i=1;
        int p=1;
        while (i-1<=printToInclusive){
            System.out.println(p);
            p*=i;
            i++;
        }
    }
}
