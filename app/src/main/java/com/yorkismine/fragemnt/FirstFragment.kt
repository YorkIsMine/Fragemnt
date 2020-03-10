package com.yorkismine.fragemnt

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(), FirstView {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = layoutInflater.inflate(R.layout.fragment_first, container, false)
        val btn = view.findViewById<Button>(R.id.add_note_btn)

        btn.setOnClickListener {
            val activity = activity as MainActivity
            activity.presenter.sendData()
        }

        return view
    }

    override fun addNewNote() {
        Log.d("TESTING", "addNewNote()")
        val preferences = view!!.context.getSharedPreferences("PREFS", Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putBoolean("addItem", true)
        editor.apply()
    }
}