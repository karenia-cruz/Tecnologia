package com.example.tecnologia.fragments

import AdapterProducto
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tecnologia.R
import com.example.tecnologia.databinding.FragmentProductosBinding
import com.example.tecnologia.utils.productList

class FragmentProductos : Fragment() {
    private var _binding: FragmentProductosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = AdapterProducto(
            requireContext(),
            R.layout.cardview_list_item,
            productList
        )

        //binding.listViewProductos.adapter = adapter

        binding.listViewProductos.setOnItemClickListener { parent, view, position, id ->
            // Manejar clics en elementos de la lista
            val producto = productList[position]
            // Mostrar detalles o realizar acción
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}