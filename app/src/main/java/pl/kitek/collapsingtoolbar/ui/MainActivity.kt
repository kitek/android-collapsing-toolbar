package pl.kitek.collapsingtoolbar.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import pl.kitek.collapsingtoolbar.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        collapsingToolbar.title = getString(R.string.app_name)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SimpleRecyclerAdapter((1..30).map { "Item $it" })
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        Picasso.with(this)
                .load("https://scontent-waw1-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/17076375_1872277209709531_2063681319862272000_n.jpg")
                .noFade()
                .into(backdrop)
    }
}
