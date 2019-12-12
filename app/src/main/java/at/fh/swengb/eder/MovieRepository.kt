package at.fh.swengb.eder

object MovieRepository {
    private val movies: List<Movie>

    init {
        val actorDowney = Person("Robert Downey Jr", "4.41965")
        val actorEvans = Person("Chris Evans", "13.6.1981")
        val actorLarson = Person("Brie Larson", "1.10.1989")
        val actorCumberbatch = Person("Benedict Cumberbatch", "19.7.1976")
        val actorHolland = Person("Tom Holland", "1.6.1996")
        val actorHemsworth = Person("Chris Hemsworth", "11.8.1983")
        val actorPratt = Person("Chris Pratt", "21.6.1979")
        val actorCooper = Person("Bradley Cooper", "5.1.1975")
        val actorMcAdams = Person("Rachel McAdams", "17.11.1978")
        val actorHiddleston = Person("Tom Hiddleston", "9.2.1981")
        val actorPaltrow = Person("Gwyneth Paltrow", "27.9.1972")
        val directorRusso = Person("Russo Brothers", "1.1.1960")
        val directorGunn = Person("James Gunn", "5.8.1966")
        val directorFavreau = Person("Jon Favreau", "19.10.1966")
        movies = listOf(
            Movie("0",
                "Iron Man",
                "2008",
                "In Iron Man, Tony Stark is an industrialist and master engineer who builds a mechanized suit of armor and becomes the superhero Iron Man. The film had been in development since 1990 at Universal Pictures, 20th Century Fox, and New Line Cinema at various times, before Marvel Studios reacquired the rights in 2006.",
                MovieGenre.ACTION,
                directorFavreau,
                listOf( actorDowney, actorEvans ),
                mutableListOf()
            ),
            Movie("1",
                "Iron Man 2",
                "2010",
                "In Iron Man, Tony Stark is an industrialist and master engineer who builds a mechanized suit of armor and becomes the superhero Iron Man. The film had been in development since 1990 at Universal Pictures, 20th Century Fox, and New Line Cinema at various times, before Marvel Studios reacquired the rights in 2006.",
                MovieGenre.ACTION,
                directorFavreau,
                listOf( actorDowney, actorEvans ),
                mutableListOf()
            ),
            Movie("2",
                "Thor",
                "2011",
                "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders. ... Thor is cast out of Asgard by his father Odin (Sir Anthony Hopkins) and sent to Midgard (Earth) as punishment for his arrogance and disobedience in his battle.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorHemsworth, actorHiddleston ),
                mutableListOf()
            ),
            Movie("3",
                "Captain America: The First Avenger",
                "2011",
                "Set predominantly during World War II, the film tells the story of Steve Rogers, a sickly man from Brooklyn who is transformed into the super-soldier Captain America and must stop the Red Skull, who intends to use an artifact called the Tesseract as an energy-source for world domination.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorDowney, actorEvans ),
                mutableListOf()
            ),
            Movie("4",
                "Marvel's The Avengers",
                "2012",
                "S.H.I.E.L.D. has located the mysterious Tesseract device and the Army's super soldier Captain America. The Tesseract is actually a gateway to an entirely new world called Asgard. A mysterious being known as Loki arrives on earth and immediately assumes that he can rule all human beings.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorDowney, actorEvans ),
                mutableListOf()
            ),
            Movie("5",
                "Iron Man 3",
                "2013",
                "Marvel's \"Iron Man 3\" pits brash-but-brilliant industrialist Tony Stark/Iron Man against an enemy whose reach knows no bounds. When Stark finds his personal world destroyed at his enemy's hands, he embarks on a harrowing quest to find those responsible. This journey, at every turn, will test his mettle.",
                MovieGenre.ACTION,
                directorFavreau,
                listOf( actorDowney, actorPaltrow ),
                mutableListOf()
            ),
            Movie("6",
                "The Return of the First Avenger",
                "2014",
                "Captain America: The Winter Soldier (2014) As Steve Rogers struggles to embrace his role in the modern world, he teams up with a fellow Avenger and S.H.I.E.L.D agent, Black Widow, to battle a new threat from history: an assassin known as the Winter Soldier.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorDowney, actorEvans ),
                mutableListOf()
            ),
            Movie("7",
                "Guardians of the Galaxy",
                "2014",
                "A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe. After stealing a mysterious orb in the far reaches of outer space, Peter Quill from Earth is now the main target of a manhunt led by the villain known as Ronan the Accuser.",
                MovieGenre.COMEDY,
                directorGunn,
                listOf( actorPratt, actorCooper ),
                mutableListOf()
            ),
            Movie("8",
                "Avengers: Age of Ultron",
                "2015",
                "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's mightiest heroes to stop the villainous Ultron from enacting his terrible plan.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorDowney, actorEvans ),
                mutableListOf()
            ),
            Movie("9",
                "Doctor Strange",
                "2016",
                "Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats. Inspired by stories of black magic and Chandu the Magician, Strange was created during the Silver Age of Comic Books to bring a different kind of character and themes of mysticism to Marvel Comics.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorCumberbatch, actorMcAdams ),
                mutableListOf()
            ),
            Movie("10",
                "The First Avenger: Civil War",
                "2016",
                "Captain America: Civil War is a 2016 superhero film, based on the Marvel Comics superhero of the same name. It is a sequel to Captain America: The First Avenger, Captain America: The Winter Soldier, Avengers: Age of Ultron and Ant-Man, and well as the thirteenth film in the Marvel Cinematic Universe and the first film of Phase Three. The film was released internationally on April 27, 2016 and on May 6, 2016 in the United States.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorDowney, actorEvans ),
                mutableListOf()
            ),
            Movie("11",
                "Guardians of the Galaxy Vol. 2",
                "2017",
                "Guardians of the Galaxy Vol. 2 is a 2017 superhero fantasy adventure film, based on the Marvel Comics superhero team of the same name. It is the sequel to Guardians of the Galaxy and the fifteenth film in the Marvel Cinematic Universe, as well as the third film of Phase Three.",
                MovieGenre.COMEDY,
                directorGunn,
                listOf( actorPratt, actorCooper ),
                mutableListOf()
            ),
            Movie("12",
                "Spider-Man: Homecoming",
                "2017",
                "Spider-Man: Homecoming is a 2017 superhero film, based on the Marvel Comics superhero of the same name. A reboot of the Spider-Man franchise, the film is a sequel to Captain America: Civil War and is the sixteenth film in the Marvel Cinematic Universe, as well as the fourth film of Phase Three.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorHolland, actorDowney ),
                mutableListOf()
            ),
            Movie("13",
                "Captain Marvel",
                "2019",
                "Brie Larson as Carol Danvers / Vers / Captain Marvel: An ex-U.S. Air Force fighter pilot and member of an elite Kree military unit called Starforce. She was imbued with superhuman strength, energy projection, and flight after exposure to Tesseract energy.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorLarson, actorDowney),
                mutableListOf()
            ),
            Movie("14",
                "Avengers: End Game",
                "2019",
                "It is the sequel to 2012's The Avengers, 2015's Avengers: Age of Ultron, and 2018's Avengers: Infinity War, and the twenty-second film in the Marvel Cinematic Universe (MCU). ... In the film, the surviving members of the Avengers and their allies attempt to reverse the damage caused by Thanos in Infinity War.",
                MovieGenre.ACTION,
                directorRusso,
                listOf( actorDowney, actorEvans ),
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