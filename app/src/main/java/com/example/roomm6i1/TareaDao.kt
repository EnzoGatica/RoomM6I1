package com.example.roomm6i1

import androidx.room.Insert

interface TareaDao {
    @Insert
    suspend fun insertarTareas(tarea: Tarea)
}