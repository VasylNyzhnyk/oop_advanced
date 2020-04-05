
/*Необходимо описать задачу с применением принципов ООП.
Условие тестовой задачи:
Дано объекты-фигуры следующих видов: квадрат, треугольник, круг, трапеция.
Каждую фигуру можно нарисовать, получить ее площадь и цвет.
Также фигуры имеют уникальные методы, например: вернуть радиус, длину гипотенузы, длину стороны и т. д.
Нам необходимо сгенерировать случайный набор фигур, количество объектов в наборе также заранее неизвестно.
После генерации массива нужно вывести весь список объектов, которые у нас имеются, например:

 Фигура: квадрат, площадь: 25 кв. ед., длина стороны: 5 ед., цвет: синий
 Фигура: треугольник, площадь: 12,5 кв.ед., гипотенуза: 7.1 ед., цвет: желтый*/

import java.util.ArrayList;
import java.util.List;

public class CreateFigures {
    public static void createFigures() {

        List<Figure> figures = new ArrayList<>();
        figures.add(new Trapezoid());
        figures.add(new Circle());
        figures.add(new Square());
        figures.add(new Triangle());

        for (Figure figure : figures) {
            System.out.println("Figure : " + figure.getClass() + ", square - " + figure.square()+ "sq.m," + " color - " + figure
                    .generationRandomColor());
        }
    }
}
