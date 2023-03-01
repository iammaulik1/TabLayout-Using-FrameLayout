package com.example.a15tablayoutwithframelayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast




class JavaFragment : Fragment() {

    lateinit var androidButton: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_java, container, false)
        Toast.makeText(context,"Java Fragment",Toast.LENGTH_SHORT).show()
        return view
    }




}


