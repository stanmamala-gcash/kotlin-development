package ph.gcash.cadet.stan.mamala.notella

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.gcash.cadet.stan.mamala.notella.R
import android.content.Intent
import android.widget.ImageView
import ph.gcash.cadet.stan.mamala.notella.CreateNoteActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageAddNoteMain = findViewById<ImageView>(R.id.imageAddNoteMain)
        imageAddNoteMain.setOnClickListener {
            startActivityForResult(
                Intent(applicationContext, CreateNoteActivity::class.java),
                REQUEST_CODE_ADD_NOTE
            )
        }
    }

    companion object {
        const val REQUEST_CODE_ADD_NOTE = 1
    }
}