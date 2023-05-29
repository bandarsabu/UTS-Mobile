package com.example.uts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val youtube = findViewById<Button>(R.id.button)
        youtube.setOnClickListener {
            val url = "https://www.youtube.com/@dapurnyanenys3931"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val resep = intent.getParcelableExtra<ResepClass>(MainActivity.INTENT_PARCELABLE)

        val resepimg = findViewById<ImageView>(R.id.image)
        val resepname = findViewById<TextView>(R.id.food_name)
        val resepdate = findViewById<TextView>(R.id.time)
        val resepauthor = findViewById<TextView>(R.id.pembuat)
        val reseprate = findViewById<TextView>(R.id.food_rating)
        val ratingbar = findViewById<RatingBar>(R.id.ratingbar)
        val resepdesc = findViewById<TextView>(R.id.description)

        resepimg.setImageResource(resep?.resepimg!!)
        resepname.text = resep.resepname
        resepdate.text = resep.resepdate
        resepauthor.text = resep.resepauthor
        reseprate.text = resep.reseprate
        ratingbar.rating = resep.ratingbar.toFloat()
        resepdesc.text = resep.resepdesc
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}