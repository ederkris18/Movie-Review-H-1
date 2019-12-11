package at.fh.swengb.eder

object MovieRepository {
    private val movies: List<Movie>

    init {
        val lecturerBloder = Person("Lukas Bloder", "13.6.1990")
        val lecturerIllis = Person("Sanja Illes", "13.2.1990")
        movies = listOf(
            Movie("0",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("1",
                "Forrest Gump",
                "1994",
                "ABC",
                MovieGenre.ACTION,
                lecturerIllis,
                listOf( lecturerIllis ),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}