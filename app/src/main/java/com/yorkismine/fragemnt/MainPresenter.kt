package com.yorkismine.fragemnt

class MainPresenter(
    private val firstView: FirstView,
    private val secondView: SecondView
) : Presenter {
    override fun sendData() {
        firstView.addNewNote()
        secondView.displayNewNote()
    }

}