public class Gold {

    double x1;
    double x2;

    public Gold(double x1, double x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void findPlaceGold(double start, double end){

        x1 = start + 0.381966011 * (end - start);
        x2 = start + 0.618003399 * (end - start);
    }
}
