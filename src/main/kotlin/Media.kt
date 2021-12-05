abstract class Media(protected var name: String, var duration: Int, var trailer: Trailer? = null, var available: Boolean = true) {

    //open == heredar

    companion object {
        private const val FRAME_RATE_HD = 60;
        private const val FRAME_RATE_SD = 24;
        private const val SECONDS_IN_A_MINUTE = 60

        fun getTotalFrame(duration: Int, isHD: Boolean): Int {
            if(isHD) {
                return FRAME_RATE_HD * SECONDS_IN_A_MINUTE * duration;
            } else {
                return FRAME_RATE_SD * SECONDS_IN_A_MINUTE * duration;
            }
        }
    }

    abstract fun play(): Boolean

    abstract fun playTrailer()

    abstract fun pause()

    override fun equals(other: Any?): Boolean {
        return other != null && other is Media && other.name == this.name && other.duration == this.duration
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + duration
        result = 31 * result + (trailer?.hashCode() ?: 0)
        result = 31 * result + available.hashCode()
        return result
    }
}