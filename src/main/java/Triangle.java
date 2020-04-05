public class Triangle extends Figure {
    private static double height = 5;
    private static double length = 10;

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Triangle.height = height;
    }

    public static double getLength() {
        return length;
    }

    public static void setLength(double length) {
        Triangle.length = length;
    }

    @Override
    double square() {
        return length * height / 2;
    }

    @Override
    void draw() {

    }

    @Override
    String generationRandomColor() {
        return super.generationRandomColor();
    }
}



