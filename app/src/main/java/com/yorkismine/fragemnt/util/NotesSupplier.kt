package com.yorkismine.fragemnt.util

import com.yorkismine.fragemnt.model.Note

fun supplyNotes(): MutableList<Note> {
    val list: MutableList<Note> = mutableListOf()
    for (i in 0..100){
        list.add(i, Note("Title $i", "Desc $i"))
    }

    return  list
}