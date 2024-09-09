fun square(number: Double): Double {
    return number * number
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val disc = discriminant(a, b, c)
    return when {
        disc > 0 -> 2
        disc == 0.0 -> 1
        else -> 0
    }
}

private fun quadraticRoot(a: Double, b: Double, c: Double) {
    val disc = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val root1 = (-b + square(disc)) / (2 * a)
            val root2 = (-b - square(disc)) / (2 * a)
            println("Корни уравнения: x1 = $root1, x2 = $root2")
        }

        1 -> {
            val root = -b / (2 * a)
            println("Единственный корень уравнения: x = $root")
        }

        0 -> {
            println("Нет действительных корней.")
        }
    }
}

fun main(){
    while(true){
        println("Выберите задание");
        println("1. Квадрат числа");
        println("2. Квадратные корни уравнения");
        print("Выбор: ");
        val userChoice = readLine();
        if (userChoice != null){
            if (userChoice == "1"){
                print("Введите число: ")
                val squareValue = readln().toDouble();
                println("Квадрат числа ${square(squareValue)}: ${square(squareValue)}")
            }
            else if (userChoice == "2"){
                print("Введите коэффициент a: ")
                val a = readln().toDouble();
                print("Введите коэффициент b: ")
                val b = readln().toDouble();
                print("Введите коэффициент c: ")
                val c = readln().toDouble();
                println("Дискриминант уравнения: ${discriminant(a, b, c)}")
                println("Количество корней: ${rootsNumber(a, b, c)}")
                quadraticRoot(a, b, c)
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