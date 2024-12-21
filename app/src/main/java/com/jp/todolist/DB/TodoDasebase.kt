package com.jp.todolist.DB

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.jp.todolist.Converters
import com.jp.todolist.Todo

@Database(entities = [Todo::class], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDasebase:RoomDatabase(){

    companion object{
        const val NAME="Todo_DB"
    }
    abstract fun getTodoDao():TodoDao
}