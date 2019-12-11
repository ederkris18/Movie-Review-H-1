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
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("2",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("3",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("4",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("5",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("6",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("7",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("8",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("9",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("10",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("11",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("12",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("13",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("6",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("14",
                "Avengers: End Game",
                "2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("15",
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