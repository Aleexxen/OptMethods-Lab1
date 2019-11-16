public class Otrezok {
    double x0;
    double h;

    public Otrezok(double x0, double h){

        this.x0 = x0;
        this.h = h;

    }

    public double getH() {
        return h;
    }

    public double getX0() {
        return x0;
    }

    public double[] findMinOtr( ){

        double x1 = 1;
        double step = 1;

        double[] otr = new double[2];

        if(Math.exp(x0) > Math.exp(x0 + h)){
            x1 = x0 + h;
            step = h;
        }

        if(Math.exp(x0) > Math.exp(x0 - h)){
            x1 = x0 - h;
            step = -h;
        }

        step = step*2;

        while(Math.exp(x1) > Math.exp(x1 + step)) {

            step = step * 2;
            x1 = x1 + step;

        }

        otr[0] = x1 - step;
        otr[1] = x1 + step;

        return otr;

    }
}
