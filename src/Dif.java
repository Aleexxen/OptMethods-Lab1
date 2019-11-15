
public class Dif {

    double x1;
    double x2;

    public Dif(double x1, double x2){
        this.x1 = x1;
        this.x2 = x2;
        }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void findPlaceDif(double start, double end, double accuracy){

        double distance;
        distance = Math.random() * accuracy/2;
        while (distance == 0){
            distance = Math.random() * accuracy/2;
        }

        x1 = (start + end)/2 - distance;
        x2 = (start + end)/2 + distance;
    }
}
