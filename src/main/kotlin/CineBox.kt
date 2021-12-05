fun main() {
//    val cineBoxPlayer = CineBoxPlayer();
    val mediaDownloader = MediaDownloader()

   /* mediaDownloader.downloadMedia(object : MediaDownloader.DownloadListener{
        override fun onDownloadFinished(media: Media) {
            TODO("Not yet implemented")
        }

    })*/

    mediaDownloader.downloadMedia {
        /*media ->
        media.play()*/
        val success: Boolean = it.play()
        success
    }
}
