public class Fib {

    double x1;
    double x2;

    public Fib(double x1, double x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void findPlaceFib(double start, double end, double accuracy){

        int[] fibNum;

        double searchKey = (end - start)/accuracy;
        fibNum = fibonachiNumber(1, 1, searchKey);
        x1 = start + fibNum[0]*(end - start)/fibNum[2];
        x2 = start + fibNum[1]*(end - start)/fibNum[2];
    }

    private int[] fibonachiNumber(int num1, int num2, double searchKey) {
        int[] lastThreeNumbers = new int[3];
        lastThreeNumbers[0] = num1;
        lastThreeNumbers[1] = num2;
        lastThreeNumbers[2] = num1 + num2;
        if (lastThreeNumbers[2] > searchKey) {
            return lastThreeNumbers;
        } else {
            return fibonachiNumber(lastThreeNumbers[1], lastThreeNumbers[2], searchKey);
        }
    }
}
