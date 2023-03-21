package lt.arturas.emptyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val myTextView: TextView = findViewById(R.id.myTextViewSecond)
        val closeButton: Button = findViewById(R.id.closeButton)

        myTextView.setText(R.string.SecondAtivity_text_view)
        closeButton.setText(R.string.SecondAtivity_button_close)

        closeButton.setOnClickListener {
            //Log.i(TAG, "onCreate: just clicked OPEN button")
            finish()
        }
    }
}