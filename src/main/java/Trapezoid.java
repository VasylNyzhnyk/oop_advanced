public class Trapezoid extends Figure {
    private static double height = 10;
    private static double averageLine = 8;

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Trapezoid.height = height;
    }

    public static double getAverageLine() {
        return averageLine;
    }

    public static void setAverageLine(double averageLine) {
        Trapezoid.averageLine = averageLine;
    }

    @Override
    double square() {
        return height * averageLine;
    }

    @Override
    void draw() {

    }

    @Override
    String generationRandomColor() {
        return super.generationRandomColor();
    }
}

