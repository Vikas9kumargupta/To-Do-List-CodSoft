package com.example.project3

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
class Note (@ColumnInfo("text")val text: String){
            @PrimaryKey(true) var id = 0
}