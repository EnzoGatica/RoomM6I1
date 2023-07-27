package com.example.roomm6i1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla tarea")
data class Tarea(val nombre: String, val fecha:String)
@PrimaryKey(autoGenerate = true) var id : Long = 1