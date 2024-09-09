import kotlin.math.sqrt

open class FirstTask(val numberArr: IntArray){
    fun arraySum(): Int{
        var resultNumber:Int = 0;
        numberArr.forEach {
            if (it > 0) {
                resultNumber += it;
            }
        }
        return resultNumber;
    }

    fun arrayMultiply(): Int{
        var resultNumber:Int = 1;
        numberArr.forEach {
            resultNumber *= it;
        }
        return resultNumber;
    }

    fun arithmeticMean(): Int{
        var resultNumber:Int = 1;
        numberArr.forEach {
            resultNumber += it;
        }
        resultNumber /= numberArr.size;
        return resultNumber;
    }
}

open class SecondTask(numberArr: IntArray) : FirstTask(numberArr){
    var sum: Int = 0
        get(){
            var sum: Int = 0;
            numberArr.forEach {
                sum += it;
            }
            return sum
        }

    fun doublesAboveZero(): IntArray{
        val resultArr: IntArray = IntArray(numberArr.size);
        for(i in numberArr.indices){
            resultArr[i] = numberArr[i];
            if (resultArr[i] % 2 == 0){
                resultArr[i] *= 2;
            }
        }
        return resultArr;
    }

    fun arrayMax(): Int{
        var max: Int = numberArr[0];
        numberArr.forEach {
            if (it > max){
                max = it
            }
        }
        return max;
    }

    fun arrayMin(): Int{
        var min: Int = numberArr[0];
        numberArr.forEach {
            if (it < min){
                min = it
            }
        }
        return min;
    }
}

class Vector(val listOfCoord: List<Double>){
    var x = listOfCoord[0];
    var y = listOfCoord[1];
    var z = listOfCoord[2]

    fun vectorLength(): Double{
        val length = sqrt(x * x + y * y + z * z);
        return length;
    }

    fun firstScalar(vectorEnemy: Vector) : Double{
        var scalar = x * vectorEnemy.x + y * vectorEnemy.y + z * vectorEnemy.z;
        return scalar;
    }

    infix fun infixScalar(vectorEnemy: Vector){
        println(x * vectorEnemy.x + y * vectorEnemy.y + z * vectorEnemy.z);
    }

    operator fun times(vectorEnemy: Vector): Double{
        return x * vectorEnemy.x + y * vectorEnemy.y + z * vectorEnemy.z;
    }
}

fun scalar(vectorOne: Vector, vectorTwo: Vector): Double{
    return vectorOne * vectorTwo;
}

fun main(){
    while(true){
        println("Выберите задание");
        println("1. Классы в котлин");
        println("2. Ввод чисел");
        println("3. Перегрузка методов");
        print("Выбор: ");
        val userChoice = readLine();
        if (userChoice != null){
            if (userChoice == "1"){
                val numberArray = FirstTask(intArrayOf(-1,2,-3,4,5))
                println(numberArray.arraySum());
                println(numberArray.arrayMultiply())
                println(numberArray.arithmeticMean());
            }
            else if (userChoice == "2"){
                val secondTask = SecondTask(intArrayOf(1,2,3,4,5));
                println(secondTask.doublesAboveZero().contentToString());
                println(secondTask.arrayMax());
                println(secondTask.arrayMin());
                println(secondTask.sum);
            }
            else if (userChoice == "3"){
                var Vector1 = Vector(listOfCoord = listOf(2.0, 2.0, 2.0))
                var Vector2 = Vector(listOfCoord = listOf(2.0, 2.0, 2.0))
                println(Vector1.vectorLength());
                println(Vector1.firstScalar(Vector2));
                Vector1 infixScalar Vector2
                println(Vector1 * Vector2);
                println(scalar(Vector1, Vector2));
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