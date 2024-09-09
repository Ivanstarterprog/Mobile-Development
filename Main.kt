import kotlin.math.min;
import kotlin.math.max;
import kotlin.math.sqrt


fun firstTask() {
    print("Введите количество простых чисел (n): ")
    val numberOfPrime = readln().toInt()

    var count = 0
    var number = 2

    while (count < numberOfPrime) {
        if (isPrime(number)) {
            count++
            println("${count}-е число: $number")
        }
        number++
    }
}

fun secondTask() {
    val numberArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 3, 4, 5)

    print("Использование цикла for:\n")
    for (numberIndex in 1 until numberArray.size - 1) {
        if (numberArray[numberIndex] > numberArray[numberIndex - 1] && numberArray[numberIndex] > numberArray[numberIndex + 1]) {
            print("${numberArray[numberIndex]} ")
        }
    }
    println()

    print("Использование цикла while:\n")
    var numberIndex = 1
    while (numberIndex < numberArray.size - 1) {
        if (numberArray[numberIndex] > numberArray[numberIndex - 1] && numberArray[numberIndex] > numberArray[numberIndex + 1]) {
            print("${numberArray[numberIndex]} ")
        }
        numberIndex++
    }
    println()

    print("Использование оператора forEach:\n")
    numberArray.forEachIndexed { numberIndex, element ->
        if (numberIndex in 1 until numberArray.size - 1 && element > numberArray[numberIndex - 1] && element > numberArray[numberIndex + 1]) {
            print("$element ")
        }
    }
    println()
}

fun thirdTask(){
    val array = intArrayOf(1, 2, 3, 4, 5, 3, 4, 5)

    var resultFor = 1
    var minFor = array[0]
    var maxFor = array[0]
    for (i in array.indices) {
        resultFor *= array[i]
        minFor = min(minFor, array[i])
        maxFor = max(maxFor, array[i])
    }
    println("Цикл for: Произведение = $resultFor, min = $minFor, max = $maxFor")

    var whileResult = 1
    var minWhile = array[0]
    var maxWhile = array[0]
    var i = 0
    while (i < array.size) {
        whileResult *= array[i]
        minWhile = min(minWhile, array[i])
        maxWhile = max(maxWhile, array[i])
        i++
    }
    println("Цикл while: Произведение = $whileResult, min = $minWhile, max = $maxWhile")

    val reduceResult = array.reduce { acc, element -> acc * element }
    val minReduce = array.reduce { acc, element -> min(acc, element) }
    val maxReduce = array.reduce { acc, element -> maxOf(acc, element) }
    println("Функция reduce(): Произведение = $reduceResult, min = $minReduce, max = $maxReduce")

    var forEachResult = 1
    var minForEach = array[0]
    var maxForEach = array[0]
    array.forEach { element ->
        forEachResult *= element
        minForEach = min(minForEach, element)
        maxForEach = max(maxForEach, element)
    }
    println("Оператор forEach: Произведение = $forEachResult, min = $minForEach, max = $maxForEach")

    val min = array.minOrNull() ?: 0
    val max = array.maxOrNull() ?: 0
    println("Функции min() и max(): min = $min, max = $max")
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main(){
    while(true){
        println("Выберите задание");
        println("1. Простые числа");
        println("2. Элементы больше соседних");
        println("3. Min и Max");
        print("Выбор: ");
        val userChoice = readLine();
        if (userChoice != null){
            if (userChoice == "1"){
                firstTask();
            }
            else if (userChoice == "2"){
                secondTask();
            }
            else if (userChoice == "3"){
                thirdTask();
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