package com.yorkismine.fragemnt

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yorkismine.fragemnt.model.Note

class NoteAdapter(
     var list: MutableList<Note>
) : RecyclerView.Adapter<NoteAdapter.NoteHolder>() {

    fun addNote(note: Note){
        Log.d("TESTING", "addNote() called")
        list.add(note)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)

        return NoteHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        val note = list[position]
        holder.title.text = note.title
        holder.desc.text = note.description
    }

    class NoteHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title)
        val desc: TextView = view.findViewById(R.id.desc)
    }
}