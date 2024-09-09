open class Vehicle(var name: String = "Транспорт", var velocity: Int = 0) {
    open fun start() {
        println("$name начал движение ($velocity км/ч)")
    }

    // Метод для остановки
    open fun stop() {
        println("$name остановился")
    }
}

class Boat(name: String = "Лодка", velocity: Int = 4) : Vehicle(name, velocity){
    override fun start(){
        println("$name начал плыть ($velocity км/ч)")
    }

    override fun stop() {
        println("$name сбросила якорь")
    }
}

class Plane(name: String = "Самолет", velocity: Int = 100) : Vehicle(name, velocity){
    override fun start(){
        println("$name взлетел ($velocity км/ч)")
    }

    override fun stop() {
        println("$name сел на посадку")
    }
}

class Tank(name: String = "Танк", velocity: Int = 50) : Vehicle(name, velocity){
    override fun start(){
        println("$name начал выдвигаться на позицию ($velocity км/ч)")
    }

    override fun stop() {
        println("$name занял позицию")
    }
}

fun main(){
    while(true){
        println("Выберите задание");
        println("1. Лодка");
        println("2. Самолёт");
        println("3. Танк");
        print("Выбор: ");
        val userChoice = readLine();
        if (userChoice != null){
            if (userChoice == "1"){
                var boat: Boat = Boat();
                boat.start();
                boat.stop();
            }
            else if (userChoice == "2"){
                var plane: Plane = Plane();
                plane.start()
                plane.stop()
            }
            else if (userChoice == "3"){
                var tank: Tank = Tank();
                tank.start();
                tank.stop();
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