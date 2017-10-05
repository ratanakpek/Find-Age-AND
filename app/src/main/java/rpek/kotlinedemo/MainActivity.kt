package rpek.kotlinedemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onCalculate(v: View) {
        var age: Int = editText.text.toString().toInt()
        var calAge = Calendar.getInstance().get(Calendar.YEAR) - age
        textView.text = "Your age is : $calAge"

        when (calAge) {
            24 -> {
                tvResult.text = "You are handsome and good boy!"
            }
            else -> {
                tvResult.text = "You are bad boy!"
            }
        }

    }


}
