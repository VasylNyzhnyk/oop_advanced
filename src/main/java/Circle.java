public class Circle extends Figure {
    private static double r = 5;
    private static double Pi = 3.14;

    public static double getR() {
        return r;
    }

    public static void setR(double r) {
        Circle.r = r;
    }

    public static double getPi() {
        return Pi;
    }

    public static void setPi(double pi) {
        Pi = pi;
    }

    @Override
    double square() {
        return r*r*Pi;
    }

    @Override
    void draw() {

    }
    @Override
    String generationRandomColor() {
        return super.generationRandomColor();
    }
}
