package com.example.roomm6i1

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TareaDao {
    @Insert
    suspend fun insertarTareas(tarea: Tarea)
    @Query("SELECT * FROM tabla_tarea order by id ASC")
    fun getTareas() : LiveData<List<Tarea>>
}