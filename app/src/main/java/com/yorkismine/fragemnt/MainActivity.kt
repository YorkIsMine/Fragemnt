package com.yorkismine.fragemnt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val fragmentTag = "fragment2_bs"

    lateinit var presenter: MainPresenter
    private lateinit var fragment2: SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = FirstFragment()
        fragment2 = if (supportFragmentManager.backStackEntryCount != 0) {
            (supportFragmentManager.findFragmentByTag(fragmentTag) as SecondFragment?) ?: SecondFragment()
        } else {
            SecondFragment()
        }

        presenter = MainPresenter(fragment1, fragment2)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container1, fragment1)
            .replace(R.id.container2, fragment2, fragmentTag)
            .addToBackStack(fragmentTag)
            .commit()
    }

}
