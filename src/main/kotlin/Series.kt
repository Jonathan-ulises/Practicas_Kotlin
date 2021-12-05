class Series(name: String, duration: Int, trailer: Trailer? = null, available: Boolean = true): Media(name, duration, trailer, available), Comparable<Series> {

    var totalEpisodes = 0;
    var totalSeason = 0;
    var episodeDuration = 0;

    init {
        episodeDuration = duration;
    }

    override fun play(): Boolean {
        val realDuration = episodeDuration * totalEpisodes
        if (available) {
            if (realDuration > 0) {
                println("Playing movie $name");
                /*for (i in 0 until realDuration) {
                    println("Playing movie $name");
                }*/
                return true;
            } else {
                println("Movie $name duration is less than zero")

                return false
            }
        } else {
            println("Movie $name is not available")

            return false
        }
    }

    override fun playTrailer() {
        println("Playing Trailer from series")
    }

    override fun pause() {
        println("Pausing series")
    }

    override fun toString(): String {
        return name
    }

    override fun compareTo(other: Series): Int {
//        return this.name.compareTo(other.name)
        return this.totalEpisodes - other.totalEpisodes
    }
}