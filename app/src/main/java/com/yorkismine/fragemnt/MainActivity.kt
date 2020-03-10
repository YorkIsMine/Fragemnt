package com.yorkismine.fragemnt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = FirstFragment()
        val fragment2 = SecondFragment()

        presenter = MainPresenter(fragment1, fragment2)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container1, fragment1)
            .replace(R.id.container2, fragment2)
            .commit()
    }

}
