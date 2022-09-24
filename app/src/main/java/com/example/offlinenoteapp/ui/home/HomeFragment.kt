package com.example.offlinenoteapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.offlinenoteapp.R
import com.example.offlinenoteapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _bindingHome:FragmentHomeBinding? = null
    private val bindingHome get() = _bindingHome!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _bindingHome= FragmentHomeBinding.inflate(inflater,container,false)
        return bindingHome.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

    }
}