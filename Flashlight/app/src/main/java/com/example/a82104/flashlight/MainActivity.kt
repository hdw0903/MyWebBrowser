package com.example.a82104.flashlight

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        flashSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                startService(intentFor<TorchService>().setAction("on"))
            } else {
                startService(intentFor<TorchService>().setAction("off"))
            }
        }
    }
}
