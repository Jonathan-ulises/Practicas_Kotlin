import kotlin.math.pow

fun main(args: Array<String>) {
    //PROBLEMA 1
    val largo = 15;
    val ancho = 23;
    val alto = 12;

    println(String.format("Volumen = %d", (largo * ancho * alto)));

    //PROBLEMA 2
    val m = 12; //MASA
    val v = 3.0; //VELOCIDAD
    val ec = (m*(v.pow(2))) * (1.0/2.0);

    println(ec);
}