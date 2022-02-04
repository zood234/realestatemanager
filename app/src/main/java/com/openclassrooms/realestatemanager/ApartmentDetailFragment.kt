package com.openclassrooms.realestatemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_apartment_detail.*
import kotlinx.android.synthetic.main.fragment_apartment_detail.view.*


class ApartmentDetailFragment : Fragment() {

    var apartmentId: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_apartment_detail, container, false)
        apartmentId = arguments?.getString("apartmentID")
        println("Apartment ID is : " + apartmentId)
            view.displayMeasage.text = apartmentId
        return view
    }

}