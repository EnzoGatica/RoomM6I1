package com.example.roomm6i1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.roomm6i1.databinding.FragmentAgregarBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class Frag_agregar : Fragment() {

    lateinit var binding: FragmentAgregarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgregarBinding.inflate(layoutInflater,container,false)
        initListener()
        return binding.root
    }

    private fun initListener() {
        binding.btnAgregar.setOnClickListener {
            val texto = binding.editText.text.toString()
            guardarTexto(texto)
        }
    }

    private fun guardarTexto(text: String) {
        val dao = TareaBaseDatos.getDatabase(requireContext()).getTaskDao()
        val tarea = Tarea(text, " ")
        GlobalScope.launch { dao.insertarTareas(tarea) }

    }


}