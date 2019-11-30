import java.text.DecimalFormat;

public class Spusk {

    public double[] findMin1(double x1, double x2, double x3, double x4, double f){
        double[] res1 = new double[10];
        double fx11 = 200*(x2-x1*x1)*(-2*x1)-2*(1-x1);
        double fx21 = 200*(x2-x1*x1)+10.2*2*(x2-1)+19.8*(x4-1);
        double fx31 = 90*(-2*x3)-2*(1-x3);
        double fx41 = 90+2*(x4-1)+19.8*(x2-1);

        double ch1, ch2, ch3, ch4;

        double h;

        double[] arr = new double[102];

        int i = 0;

        for(h = 0; h <=1.01 ; h = h + 0.01) {

            ch1 = x1 - h * fx11;
            ch2 = x2 - h * fx21;
            ch3 = x3 - h * fx31;
            ch4 = x4 - h * fx41;

            double f1 = 100*(ch2-ch1*ch1)*(ch2-ch1*ch1)+(1-ch1)*(1-ch1)+90*(ch4-ch3*ch3)+(1-ch3)*(1-ch3)+10.2*(ch2-1)*(ch2-1)+(ch4-1)*(ch4-1)+19.8*(ch2-1)*(ch4-1);
            arr[i] = f1;
            i++;

        }

        double minH = arr[i-1];
        int num = i;

        while (i>0){
            if(minH > arr[i-1]){
                minH = arr[i-1];
                num = i-1;
            }
            i--;
        }

        double H = num/100;

        double x11 = x1 - H*fx11;
        double x21 = x2 - H*fx21;
        double x31 = x3 - H*fx31;
        double x41 = x4 - H*fx41;

        double f2 = 100*(x21-x11*x11)*(x21-x11*x11)+(1-x11)*(1-x11)+90*(x41-x31*x31)+(1-x31)*(1-x31)+10.2*(x21-1)*(x21-1)+(x41-1)*(x41-1)+19.8*(x21-1)*(x41-1);

        res1[0] = x11;
        res1[1] = x21;
        res1[2] = x31;
        res1[3] = x41;
        res1[4] = f2;

        res1[5] = x1;
        res1[6] = x2;
        res1[7] = x3;
        res1[8] = x4;
        res1[9] = f;

        return res1;
    }




}
