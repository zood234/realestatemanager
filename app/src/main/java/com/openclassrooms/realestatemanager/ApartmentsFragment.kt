package com.openclassrooms.realestatemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.openclassrooms.realestatemanager.interfaces.FragmentCommunicator
import kotlinx.android.synthetic.main.fragment_apartments.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class ApartmentsFragment : Fragment() {
private  lateinit var communicator: FragmentCommunicator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_apartments, container, false)
        communicator = activity as FragmentCommunicator
        view.sendBtns.setOnClickListener {
            communicator.passData(view.messageInput.text.toString())
        }


        return view
    }


}