package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FoodFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val BTBack: Button = view.findViewById(R.id.Back2)


        BTBack.setOnClickListener {
            getActivity()?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }
    }


}