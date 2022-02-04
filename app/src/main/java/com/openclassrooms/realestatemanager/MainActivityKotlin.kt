package com.openclassrooms.realestatemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.openclassrooms.realestatemanager.interfaces.FragmentCommunicator

class MainActivityKotlin : AppCompatActivity(), FragmentCommunicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        val apartmentsFragment = ApartmentsFragment()
        supportFragmentManager.beginTransaction().replace(R.id.apartmentsFrameLayout,apartmentsFragment).commit()

    }

    override fun passData(apartmentID: String) {
    val bundle = Bundle()
        bundle.putString("apartmentID",apartmentID)
        val transaction = this.supportFragmentManager.beginTransaction()
        val apartmentDetailFragment = ApartmentDetailFragment()
        apartmentDetailFragment.arguments= bundle
        transaction.replace(R.id.apartmentDetailFrameLayout,apartmentDetailFragment)
        transaction.commit()


    }
}