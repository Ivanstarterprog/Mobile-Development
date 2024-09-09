fun firstTask() {
    print("Введите целое число: ");
    val number:String? = readLine();
    if (number != null){
        val resultNumber:Int = number.first().digitToInt() + number.last().digitToInt()
        println("Сумма первой и последней цифры числа $number равно $resultNumber");
    }
}

fun secondTask(){
    var resultNumber:Int = 0;
    while(true){
        print("Введите целое число: ")
        val number:String? = readLine();
        if (number != null && number != "0"){
            resultNumber += number.toInt();
        }
        else if (number == "0"){
            break
        }
    }
    println("Результат сложения чисел: $resultNumber");
}

fun thirdTask(){
    print("Угадай, какое число от 0 до 10 я загадал: ");
    val nowYouSeeMee = (0..10).random();
    val userChoice = readLine();
    if (userChoice != null){
        val userChoiceNumber = userChoice.toInt();
        if (userChoiceNumber > -1 && userChoiceNumber < 11 ){
            if(userChoiceNumber == nowYouSeeMee){
                println("Угадал");
            }
            else if (userChoiceNumber > nowYouSeeMee){
                println("Много");
            }
            else{
                println("Угадал");
            }
        }
        else {
            println("Сказано же - число больше 0 и меньше 10!");
        }
    }
}

fun main(){
    while(true){
        println("Выберите задание");
        println("1. Основы текстового ввода-вывода");
        println("2. Ввод чисел");
        println("3. Получение рандомных чисел в котлин");
        print("Выбор: ");
        val userChoice = readLine();
        if (userChoice != null){
            if (userChoice == "1"){
                firstTask()
            }
            else if (userChoice == "2"){
                secondTask()
            }
            else if (userChoice == "3"){
                thirdTask()
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