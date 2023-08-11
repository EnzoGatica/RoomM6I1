package com.example.roomm6i1

import androidx.lifecycle.LiveData

class Repositorio(private val tareaDao: TareaDao) {
    suspend fun insertTask(tarea: Tarea){
        tareaDao.insertarTareas(tarea) //Insertar tarea

    }

    fun getTareas(): LiveData<List<Tarea>> {
        return tareaDao.getTareas() //obtener tarea
    }
}