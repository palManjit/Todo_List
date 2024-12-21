package com.jp.todolist

import android.app.Application
import androidx.room.Room
import com.jp.todolist.DB.TodoDasebase

class MainApplication : Application() {

    companion object{
       lateinit  var todoDatabase:TodoDasebase
    }

    override fun onCreate() {
        super.onCreate()
       todoDatabase= Room.databaseBuilder(
            applicationContext,TodoDasebase::class.java,
           TodoDasebase.NAME
        ).build()
    }
}