import java.util.*

fun main(args: Array<String>) {
    /*println("Me llamo ${args[0]} y soy ${args[1]}")

    println("Escribe tu nombre");
    val name = readLine()
    println("¿A que te dedicas?")
    val job = readLine()

    println("Me llamo $name y soy $job")*/
    val scanner = Scanner(System.`in`)

    println("Inserta un numero")
    val number = scanner.nextInt();
    val otherNumber = number + 10;
    println(otherNumber);
}