public class Square extends Figure{

    private static double height = 5;
    private static double length = 5;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double square() {
        return height * length;
    }

    @Override
    void draw() {

    }

    @Override
    String generationRandomColor() {
        return super.generationRandomColor();
    }
}
