import java.io.*;

public class Main {
    public static void main(String args[]) {

        double firstStart;
        double firstEnd;
        double myAccuracy = 0.02;
        double functionValue1;
        double functionValue2;
        int counter;

        double x1 = 0;
        double x2 = 18;
        double x3 = 63;
        double x4 = 7;
        double prib = 0.005;

        Fib findMinFib = new Fib(0, 0);
        Gold findMinGold = new Gold(0, 0);
        Dif findMin = new Dif(0, 0);
        //Otrezok findOtrez = new Otrezok(1, 0.002);

        /*try(FileWriter writer = new FileWriter("F:\\Idea Intellij\\Projects\\OptimMethods\\src\\Dif.txt", true))
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
        }*/

       /* try(FileWriter writer1 = new FileWriter("F:\\Idea Intellij\\Projects\\OptimMethods\\src\\Gold.txt", true))
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
        }*/

        /*double[] resPart2;

        resPart2 = findOtrez.findMinOtr();

        double finalRes = (resPart2[0] - resPart2[1])/2;
        System.out.println("Min is = " + finalRes);
        System.out.println("x1 - h = " + resPart2[0]);
        System.out.println("x1 + h = " + resPart2[1]);*/

        try (FileWriter writer3 = new FileWriter("F:\\Idea Intellij\\Projects\\OptimMethods\\src\\LastFile.txt", true)) {

            double f = 100 * (x2 - x1 * x1) * (x2 - x1 * x1) + (1 - x1) * (1 - x1) + 90 * (x4 - x3 * x3) + (1 - x3) * (1 - x3) + 10.2 * (x2 - 1) * (x2 - 1) + (x4 - 1) * (x4 - 1) + 19.8 * (x2 - 1) * (x4 - 1);
            int check = 1;
            Spusk iteration = new Spusk();
            double[] res1 = new double[10];
            res1 = iteration.findMin1(x1, x2, x3, x4, f);
            while (Math.abs(res1[4] - res1[9]) > prib) {

                res1 = iteration.findMin1(res1[0], res1[1], res1[2], res1[3], res1[4]);
                check++;

            }

            double minVal1 = (res1[0] - res1[5])/2;
            double minVal2 = (res1[1] - res1[6])/2;
            double minVal3 = (res1[2] - res1[7])/2;
            double minVal4 = (res1[3] - res1[8])/2;

            double resultLast = 100*(minVal2-minVal1*minVal1)*(minVal2-minVal1*minVal1)+(1-minVal1)*(1-minVal1)+90*(minVal4-minVal3*minVal3)+(1-minVal3)*(1-minVal3)+10.2*(minVal2-1)*(minVal2-1)+(minVal4-1)*(minVal4-1)+19.8*(minVal2-1)*(minVal4-1);

            writer3.write("начальное приближение: х0("+x1+","+x2+","+x3+","+x4+")"+"\n");
            writer3.write("точность: "+prib+"\n");
            writer3.write("итераций: "+check+"; найденная точка: x("+minVal1+","+minVal2+","+minVal3+","+minVal4+")"+"; f(x)="+resultLast+";"+"\n"+"\n");


        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
