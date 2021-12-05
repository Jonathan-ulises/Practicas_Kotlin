fun main(args: Array<String>) {
    /*val intArray = intArrayOf(1,4,5,90,100);
    val booleanArray = booleanArrayOf(true, false, true, true);

    println(intArray[0]);
    println(booleanArray[2]);

    val doubleArray = DoubleArray(3){50.0}
    println(doubleArray[1])

    intArray[2] = 10;*/

    val playList = arrayOf("Toy Story", "Iron man", "Lord of the Rings", "Harry Potter", "I am legend", "Back to the Future");

    for (movie in playList) {
        println(movie);
    }

    val intArray = intArrayOf(1,2,3,4,5);
    var total = 1;
    for (element in intArray) {
        println(element);
        total *= element;
    }
    println(total);
}