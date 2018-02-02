package app.mybeaconapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn_new_activity = findViewById<Button>(R.id.myButton)

        btn_new_activity.setOnClickListener {
            val intent = Intent(this.applicationContext, MonitoringActivity::class.java)
            startActivity(intent)
        }
    }
}
