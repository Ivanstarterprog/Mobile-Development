import AbstractFigure.*
import FigureInterface.*

fun main(){
    while(true){
        println("Выберите задание");
        println("1. Абстракция");
        println("2. Интерфейс");
        print("Выбор: ");
        val userChoice = readLine();
        if (userChoice != null){
            if (userChoice == "1"){
                var rect: Rectangle = Rectangle(5.0, 5.0);
                var sqr: Square = Square(4.5);
                var crcl: Circle = Circle(6.2);
                println("Прямоугольник с шириной 5 и высотой 5");
                println("Его площадь - ${rect.area()}");
                println("Его периметр - ${rect.perimeter()}");
                println("Квадрат со стороной 4.5");
                println("Его площадь - ${sqr.area()}");
                println("Его периметр - ${sqr.perimeter()}");
                println("Круг с площадью 6.2");
                println("Его площадь - ${crcl.area()}");
                println("Его периметр - ${crcl.perimeter()}");
            }
            else if (userChoice == "2"){
                var rect: RectangleInterface = RectangleInterface(5.0, 5.0);
                var sqr: SquareInterface = SquareInterface(4.5);
                var crcl: CircleInterface = CircleInterface(6.2);
                println("Прямоугольник с шириной 5 и высотой 5");
                println("Его площадь - ${rect.area()}");
                println("Его периметр - ${rect.perimeter()}");
                println("Квадрат со стороной 4.5");
                println("Его площадь - ${sqr.area()}");
                println("Его периметр - ${sqr.perimeter()}");
                println("Круг с площадью 6.2");
                println("Его площадь - ${crcl.area()}");
                println("Его периметр - ${crcl.perimeter()}");
            }
            else {
                println("Не задание!");
            }
        }
        println("Нажмите Enter для продолжения");
        readln();
        print("\u001b[2J");
    }

}