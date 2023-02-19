package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i=2;
        while (i<=printToInclusive){
            boolean checker=true;
            int j=2;
            while (j<i){
                if(i%j==0) {
                    checker = false;
                    break;

                }
                j++;
            }
            if(checker) System.out.println(i);
            i++;
        }
    }
}
