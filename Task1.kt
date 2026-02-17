// Задача 1
/*
fun main() {
    println("Привет, Kotlin!")
    println("Моя первая программа")
}
*/

// Задача 2
/*
fun main() {
    // Неизменяемая переменная
    val name: String = "Ваньк"

    // Изменяемая переменная
    var age: Int = 17

    // Вывод строки
    println("Меня зовут $name, мне $age лет.")

    // Изменение возраста
    age = age + 1
    // или: age++
    println("Меня зовут $name, мне $age лет.")
}
*/

// Задача 3
fun main() {
    // Шестнадцатеричное число
    val hexNumber: Int = 0xFF

    // Двоичное число
    val binaryNumber: Int = 0b1010

    // Long с разделителем
    val longNumber: Long = 100_000L

    // Float
    val floatNumber: Float = 3.14f

    // Вывод всех переменных
    println("hexNumber: $hexNumber")
    println("binaryNumber: $binaryNumber")
    println("longNumber: $longNumber")
    println("floatNumber: $floatNumber")
}
