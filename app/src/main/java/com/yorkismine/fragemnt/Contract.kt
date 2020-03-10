package com.yorkismine.fragemnt

interface FirstView {
    fun addNewNote()
}

interface SecondView {
    fun displayNewNote()
}

interface Presenter {
    fun sendData()
}