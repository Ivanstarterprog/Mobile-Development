import java.util.Scanner;

fun FirstTask(){
    val scanner = Scanner(System.`in`);

    print("Введите первое число: ");
    val num1 = scanner.nextDouble();
    print("Введите второе число: ");
    val num2 = scanner.nextDouble();
    print("Введите знак операции (+, -, *, /): ");
    val operation = scanner.next();

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Ошибка: Деление на ноль");
                return
            }
            num1 / num2
        }

        else -> {
            println("Ошибка: Неизвестная операция.");
            return
        }
    }

    // Вывод результата
    println("Ответ: $result");
}

fun SecondTask(){
    var words: Array<String?> = arrayOf("Ты кто?", null, "Я никто", null, null, "Я никто");

    words.forEach {
        if (it != null){
            println("if: ${it.replaceFirstChar(Char::titlecase)}")
        }

        println("?: ${it?.replaceFirstChar(Char::titlecase)}")

        it.let {
            println("let: ${it?.replaceFirstChar(Char::titlecase) }")
        }

        val elvisValue = it?.replaceFirstChar(Char::titlecase) ?: "А чо так пусто"
        println("Элвис: ${elvisValue}")
    }
}

fun main(){
    while(true){
        println("Выберите задание");
        println("1. Калькулятор");
        println("2. Проверка списка");
        print("Выбор: ");
        val userChoice = readLine();
        if (userChoice != null){
            if (userChoice == "1"){
                FirstTask();
            }
            else if (userChoice == "2"){
                SecondTask();
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