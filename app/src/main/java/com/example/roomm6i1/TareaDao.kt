package com.example.roomm6i1

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TareaDao {
    @Insert
    suspend fun insertarTareas(tarea: Tarea)
}