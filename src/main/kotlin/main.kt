/*
Metodo que ejecuta el proyecto de kotlin
 */
fun main(args: Array<String>) {
    println("Hola Mundo ");

    //Variables
    //Es innecesario agregar el tipo de variable, Kotlin infiere el tipo por la variable asignada.

    //VAR => VARIEBLA
    //VAL => CONSTANTE
    var age = 20;
    var altura = 1.800000;
    var peso = 80.500000f;
    var esMujer = true;
    var numeroSerie = 23542523425234L;


    //VARIABLES DE TIPO STRING
    var name: String = "Mia Khalifa";
    var nameLenght: Int = name.length;
    var nameIsEmpty: Boolean = name.isEmpty();
    var nameContains: Boolean = name.contains("Mia");
    var mySubstring: String = name.substring(2, 5);
    var myReplace: String = name.replace("a", "0");

    var descripcion = "Hola soy $name, tengo $age años y mi altura es de $altura y el peso es de $peso";

    /*
    STRING -> %s
    INT -> %d
    DOUBLE / FLOAT -> %f
     */
    var stringFormat = String.format("Hola soy %s, tengo %d años y mi altura es de %.2f y el peso es de %.4f", name, age, altura, peso);
}