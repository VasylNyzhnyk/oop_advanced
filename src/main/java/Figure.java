public abstract class Figure {
    abstract double square();

    abstract void draw();

    String generationRandomColor() {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            return "red";
        } else if (i == 1) {
            return "orange";
        } else if (i == 2) {
            return "blue";
        } else return "black";

    }
}



