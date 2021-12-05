class Movie(name: String, duration: Int, trailer: Trailer? = null, available: Boolean = true): Media(name, duration, trailer, available) {

    var wonOscar: Boolean = false;

    override fun toString(): String {
        return "$name: $duration min"
    }

    override fun play(): Boolean {
        if (available) {
            if (duration > 0) {
                for (i in 0..duration) {
                    println("Playing movie $name");
                }
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
        println("Playing Trailer")
    }

    override fun pause() {
        println("Movie Paused")
    }
}