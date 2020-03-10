package com.yorkismine.fragemnt

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yorkismine.fragemnt.model.Note
import com.yorkismine.fragemnt.util.supplyNotes

class SecondFragment : Fragment(), SecondView {

    private lateinit var adapter: NoteAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler)
        adapter = NoteAdapter(supplyNotes())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity)

        return view
    }

    override fun displayNewNote() {
        val preferences = view!!.context.getSharedPreferences("PREFS", Context.MODE_PRIVATE)
        val value = preferences.getBoolean("addItem", false)

        Log.d("TESTING", "value is $value")

        if (value){
            Log.d("TESTING", "IT IS TRUE")
            adapter.addNote(Note("121212", "3131"))
        }
    }

}