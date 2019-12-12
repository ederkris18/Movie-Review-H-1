package at.fh.swengb.eder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieId = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)

        if (movieId == null) {
            Toast.makeText(this, "No movieID given", Toast.LENGTH_SHORT).show()
            finish()
        } else {
            title_detail.text = MovieRepository.movieById(movieId)?.title
            director_content_detail.text =
                MovieRepository.movieById(movieId)?.director?.name?.toString()
            actors_content_detail.text =
                MovieRepository.movieById(movieId)?.actors?.map { it.name }?.joinToString()
            release_content_detail.text = MovieRepository.movieById(movieId)?.release
            genre_content_detail.text = MovieRepository.movieById(movieId)?.genre?.description
            avg_rating_bar_detail.rating =
                MovieRepository.movieById(movieId)?.ratingAverage()!!.toFloat()
            avg_rating_value_detail.text =
                MovieRepository.movieById(movieId)?.ratingAverage()!!.toString()
            rating_count_detail.text = MovieRepository.movieById(movieId)?.reviews?.size.toString()
            plot_content_detail.text = MovieRepository.movieById(movieId)?.plot

            open_movie_review.setOnClickListener {
                val intent = Intent(this, MovieReviewActivity::class.java)
                intent.putExtra("passing Movie ID", movieId)
                startActivity(intent)
            }
        }


    }
}
