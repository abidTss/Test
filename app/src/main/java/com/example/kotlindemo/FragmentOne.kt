package com.example.kotlindemo

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {
    val TAG="FragmentOne"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("$TAG onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("$TAG onCreateView")
        return inflater.inflate(R.layout.fragment_fragment_one, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("$TAG onAttach")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("$TAG onActivityCreated")

    }

    override fun onStart() {
        super.onStart()
        println("$TAG onStart")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG onPause")
    }

    override fun onResume() {
        super.onResume()
        println("$TAG onResume")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG onDestroy")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("$TAG onDestroyView")

    }

    override fun onDetach() {
        super.onDetach()
        println("$TAG onDetach")

    }

}
