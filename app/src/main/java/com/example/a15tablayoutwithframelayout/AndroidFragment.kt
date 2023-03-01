package com.example.a15tablayoutwithframelayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class AndroidFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_android, container, false)
        Toast.makeText(context,"Android Fragment",Toast.LENGTH_SHORT).show()
        return view
    }


}