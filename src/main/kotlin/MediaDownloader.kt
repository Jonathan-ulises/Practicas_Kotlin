class MediaDownloader {

    interface DownloadListener {
        fun onDownloadFinished(media: Media);
    }

    fun downloadMedia(downloadListener: DownloadListener) {
        val thread = Thread(Runnable {
            println("Download Started")
            Thread.sleep(5000);
            println("Download Finish")

            val downloadedMovie = Movie("Ace Ventura", 5);
            downloadListener.onDownloadFinished(downloadedMovie);
        })

        thread.start()
    }

//    fun downloadMedia(onDownloadFinishedWithLambda: (media: Media) -> Unit) {
    fun downloadMedia(onDownloadFinishedWithLambda: (media: Media) -> Boolean) {
        val thread = Thread(Runnable {
            println("Download Started")
            Thread.sleep(5000);
            println("Download Finish")
            val downloadedMovie = Movie("Ace Ventura", 5);
            val success = onDownloadFinishedWithLambda(downloadedMovie);
        })
        thread.start()
    }
}