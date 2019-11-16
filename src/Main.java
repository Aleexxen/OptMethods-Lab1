import java.io.*;

public class Main {
    public static void main(String args[]){

        double firstStart;
        double firstEnd;
        double myAccuracy = 0.02;
        double functionValue1;
        double functionValue2;
        int counter;

        Fib findMinFib = new Fib(0, 0);
        Gold findMinGold = new Gold(0, 0);
        Dif findMin = new Dif(0, 0);
        Otrezok findOtrez = new Otrezok(30, 0.004);

        try(FileWriter writer = new FileWriter("F:\\Idea Intellij\\Projects\\OptimMethods\\src\\Dif.txt", true))
        {
            firstStart = 0;
            firstEnd = 100;
            counter = 0;
            while((firstEnd - firstStart) >= myAccuracy) {
                findMin.findPlaceDif(firstStart, firstEnd, myAccuracy);

                functionValue1 = Math.exp(findMin.getX1());
                functionValue2 = Math.exp(findMin.getX2());

                if (functionValue1 == functionValue2) {
                firstStart = findMin.getX1();
                firstEnd = findMin.getX2();
                }

                if (functionValue1 < functionValue2) {
                firstEnd = findMin.getX2();
                }

                if (functionValue1 > functionValue2) {
                firstStart = findMin.getX1();
                }

                counter ++;
                double x1 = findMin.getX1();
                double x2 = findMin.getX2();

                writer.write(counter + " итерация; " + "x1 = " + x1 + "; x2 = " + x2 + "; a = " + firstStart + "; b = " + firstEnd + "; f(x1) = " + functionValue1 + "; f(x2) = " + functionValue2 + "\n");
        }

            double x = (firstEnd - firstStart)/2 + firstStart;

            writer.write("Результат:" + "\n");
            writer.write("Количество итераций = " + counter + "\n");
            writer.write("Точка минимума: х = " + x);
            writer.write("\n");


            writer.flush();

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileWriter writer1 = new FileWriter("F:\\Idea Intellij\\Projects\\OptimMethods\\src\\Gold.txt", true))
        {
            firstStart = 0;
            firstEnd = 100;
            counter = 0;
            while((firstEnd - firstStart) >= myAccuracy) {
                findMinGold.findPlaceGold(firstStart, firstEnd);

                functionValue1 = Math.exp(findMinGold.getX1());
                functionValue2 = Math.exp(findMinGold.getX2());

                if (functionValue1 == functionValue2) {
                    firstStart = findMinGold.getX1();
                    firstEnd = findMinGold.getX2();
                }

                if (functionValue1 < functionValue2) {
                    firstEnd = findMinGold.getX2();
                }

                if (functionValue1 > functionValue2) {
                    firstStart = findMinGold.getX1();
                }

                counter ++;
                double x1 = findMinGold.getX1();
                double x2 = findMinGold.getX2();

                writer1.write(counter + " итерация; " + "x1 = " + x1 + "; x2 = " + x2 + "; a = " + firstStart + "; b = " + firstEnd + "; f(x1) = " + functionValue1 + "; f(x2) = " + functionValue2 + "\n");
            }

            double x = (firstEnd - firstStart)/2 + firstStart;

            writer1.write("Результат:" + "\n");
            writer1.write("Количество итераций = " + counter + "\n");
            writer1.write("Точка минимума: х = " + x);
            writer1.write("\n");


            writer1.flush();

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileWriter writer2 = new FileWriter("F:\\Idea Intellij\\Projects\\OptimMethods\\src\\Fib.txt", true))
        {
            firstStart = 0;
            firstEnd = 100;
            counter = 0;
            while((firstEnd - firstStart) >= myAccuracy) {
                findMinFib.findPlaceFib(firstStart, firstEnd, myAccuracy);

                functionValue1 = Math.exp(findMinFib.getX1());
                functionValue2 = Math.exp(findMinFib.getX2());

                if (functionValue1 == functionValue2) {
                    firstStart = findMinFib.getX1();
                    firstEnd = findMinFib.getX2();
                }

                if (functionValue1 < functionValue2) {
                    firstEnd = findMinFib.getX2();
                }

                if (functionValue1 > functionValue2) {
                    firstStart = findMinFib.getX1();
                }

                counter ++;
                double x1 = findMinFib.getX1();
                double x2 = findMinFib.getX2();

                writer2.write(counter + " итерация; " + "x1 = " + x1 + "; x2 = " + x2 + "; a = " + firstStart + "; b = " + firstEnd + "; f(x1) = " + functionValue1 + "; f(x2) = " + functionValue2 + "\n");
            }

            double x = (firstEnd - firstStart)/2 + firstStart;

            writer2.write("Результат:" + "\n");
            writer2.write("Количество итераций = " + counter + "\n");
            writer2.write("Точка минимума: х = " + x);
            writer2.write("\n");


            writer2.flush();

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        double[] resPart2;

        resPart2 = findOtrez.findMinOtr();

        double finalRes = (resPart2[1] - resPart2[0])/2;
        System.out.println("Min is = " + finalRes);

    }
}
