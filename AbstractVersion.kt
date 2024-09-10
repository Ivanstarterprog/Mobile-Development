package AbstractFigure

import kotlin.math.PI
import kotlin.math.sqrt

abstract class Figure() {
    abstract fun area(): Double;
    abstract fun perimeter(): Double;
}

class Rectangle(val width: Double, val height: Double): Figure(){
    override fun area(): Double {
        return width * height;
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class Square(val side: Double): Figure(){
    override fun area(): Double {
        return side * side;
    }

    override fun perimeter(): Double {
        return side * 4
    }
}

class Circle(val radius: Double) : Figure() {
    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}