package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Danzo");

    //Считаем площадь квадрата
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    //Считаем площадь прямоугольника
    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    //Домашка - функция считает расстояние между двумя точками на плоскости
    Point p = new Point(-1,3,6,2);
    System.out.println("Расстояние между точками A(" + p.p1 + ";" + p.p2 + ") и B(" + p.p3 + ";" + p.p4 + ") на плоскости = " + p.distance());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}