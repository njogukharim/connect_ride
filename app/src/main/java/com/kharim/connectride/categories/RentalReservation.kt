package com.kharim.connectride.categories

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kharim.connectride.R
import com.kharim.connectride.databinding.FragmentRentalReservationBinding
import com.kharim.connectride.vehicle.Vehicle

class RentalReservation : Fragment() {

    companion object {
        fun newInstance() = RentalReservation()
    }

    private lateinit var viewModel: RentalReservationViewModel
    private lateinit var binding: FragmentRentalReservationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRentalReservationBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button6.setOnClickListener {
            startActivity(Intent(this@RentalReservation.requireContext(), Vehicle::class.java))
        }
        return binding.root
    }


}