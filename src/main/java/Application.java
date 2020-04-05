
/*Необходимо описать задачу с применением принципов ООП.
Условие тестовой задачи:
Дано объекты-фигуры следующих видов: квадрат, треугольник, круг, трапеция.
Каждую фигуру можно нарисовать, получить ее площадь и цвет.
Также фигуры имеют уникальные методы, например: вернуть радиус, длину гипотенузы, длину стороны и т. д.
Нам необходимо сгенерировать случайный набор фигур, количество объектов в наборе также заранее неизвестно.
После генерации массива нужно вывести весь список объектов, которые у нас имеются, например:

 Фигура: квадрат, площадь: 25 кв. ед., длина стороны: 5 ед., цвет: синий
 Фигура: треугольник, площадь: 12,5 кв.ед., гипотенуза: 7.1 ед., цвет: желтый*/

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Trapezoid trapezoid = new Trapezoid();

        System.out.println(trapezoid.getClass() + " " + trapezoid.square() + " " + " " + trapezoid.generationRandomColor());
        System.out.println(circle.getClass() + " " + circle.square() + " " + " " + circle.generationRandomColor());
        System.out.println(square.getClass() + " " + square.square() + " " + " " + square.generationRandomColor());
        System.out.println(triangle.getClass() + " " + triangle.square() + " " + " " + triangle.generationRandomColor());


    }

}
