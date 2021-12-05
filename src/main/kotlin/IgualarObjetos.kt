fun main() {
    val a = 1
    val b = 1

    if (a == b) {
        println("Enteros Iguales")
    } else {
        println("Enteros Diferentes")
    }

    val c = "Hola"
    val d = "Hola";

    if (c == d) {
        println("Strings Iguales")
    } else {
        println("Strings Diferentes")
    }

    val movie1 = Movie("El smoking", 10);
    val movie2 = Movie("El smoking", 30);

    if (movie1 == movie2) {
        println("Movies Iguales")
    } else {
        println("Movies Diferentes ${movie1.hashCode()} ${movie2.hashCode()}")
    }
}