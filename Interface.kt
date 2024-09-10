package FigureInterface

import kotlin.math.PI

interface InterfaceFigure{
    fun area(): Double;
    fun perimeter(): Double;
}

class RectangleInterface(val width: Double, val height: Double): InterfaceFigure{
    override fun area(): Double {
        return width * height;
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class SquareInterface(val side: Double): InterfaceFigure{
    override fun area(): Double {
        return side * side;
    }

    override fun perimeter(): Double {
        return side * 4
    }
}

class CircleInterface(val radius: Double): InterfaceFigure{
    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}