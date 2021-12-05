fun main() {
//    val media = Media("Hello", 10)

    val matrix = Movie("Matrix", 10)
    val jurassicPark = Movie("Jurassic Park", 10)
    val starWars = Movie("Star Wars", 10)
    val greatestShowman = Movie("Greatest Showman", 10)
    val alien = Movie("Alien", 10)
    val predator = Movie("Predator", 10)

    val movieList = listOf<Movie>(matrix, jurassicPark, starWars, greatestShowman, alien, predator)
    val movie = movieList[1]

    val breakingBad = Series("Breaking Bad", 1)
    val gameOfThrones = Series("Game Of Thrones", 1)
    val vikings = Series("Vikings", 1)
    val friends = Series("Friends", 1)
    val dark = Series("Dark", 1)

    breakingBad.totalEpisodes = 1
    gameOfThrones.totalEpisodes = 3
    vikings.totalEpisodes = 10
    friends.totalEpisodes = 5
    dark.totalEpisodes = 7

    val seriesList = mutableListOf<Series>()

    seriesList.addIfNotInList1(breakingBad);
    seriesList.addIfNotInList1(gameOfThrones);
    seriesList.addIfNotInList1(vikings);
    seriesList.addIfNotInList1(friends);
    seriesList.addIfNotInList1(dark);

    seriesList.sort()
//    playPlaylist(seriesList)

    val seriesMap = HashMap<Int, Series>()
    seriesMap[1] = breakingBad //.put(KEY, DATO) == [KEY] = DATO
    seriesMap[2] = gameOfThrones
    seriesMap[3] = vikings
    seriesMap[4] = friends
    seriesMap[5] = dark

    val series = seriesMap[3]
    println(series)
}

//Extenciones
fun MutableList<Series>.addIfNotInList1(series: Series) {
    if (!this.contains(series)) {
        this.add(series)
    } else {
        println("Series $series is already in playList")
    }
}

//Extencion generica
fun <T> MutableList<T>.addIfNotInList2(myObject: T) {
    if (!this.contains(myObject)) {
        this.add(myObject)
    } else {
        println("Series $myObject is already in playList")
    }
}

/*fun addIfNotInList(seriesList: MutableList<Series>, series: Series) {
    if (!seriesList.contains(series)) {
        seriesList.add(series)
    } else {
        println("Series $series is already in playList")
    }
}*/

fun playPlaylist(seriesList: MutableList<Series>) {
    for (series in seriesList) {
        series.play()
    }
}