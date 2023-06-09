package lt.arturas.emptyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "my_super_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView : TextView = findViewById(R.id.myTextView)
        val myEditView : EditText = findViewById(R.id.myEditText)
        val openButton: Button = findViewById(R.id.openButton)

        Log.i(TAG, "onCreate: ${myTextView.text} : ")
        ///myTextView.visiblilty

        myTextView.setText(R.string.say_hello)
        openButton.visibility = View.INVISIBLE

        Log.i(TAG, "onCreate: ${R.string.say_hello} skaicius/id and ${getString(R.string.say_hello)} to id reiksme")

        lifecycleScope.launch{
            myTextView.setText(R.string.say_hello)
            delay(timeMillis = 5000)
            myTextView.setText("Second message")
            openButton.visibility = View.VISIBLE
        }
        
        openButton.setOnClickListener {
            //Log.i(TAG, "onCreate: just clicked OPEN button")
            val message : String = myEditView.text.toString()
            Log.i(TAG, "onCreate: asdsdsd")
            val openIntent = Intent(this, SecondActivity::class.java)
            openIntent.putExtra("message_key", message)
            startActivity(openIntent)
        }
    }
}