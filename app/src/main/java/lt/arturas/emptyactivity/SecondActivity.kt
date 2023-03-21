package lt.arturas.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val myTextView : TextView = findViewById(R.id.myTextViewSecond)
        val closeButton: Button = findViewById(R.id.closeButton)

    }


}