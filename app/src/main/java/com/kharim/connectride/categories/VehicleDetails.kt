package com.kharim.connectride.categories

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kharim.connectride.R
import com.kharim.connectride.databinding.FragmentVehicleDetailsBinding

class VehicleDetails : Fragment() {

    companion object {
        fun newInstance() = VehicleDetails()
    }

    private lateinit var viewModel: VehicleDetailsViewModel
    private lateinit var binding: FragmentVehicleDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVehicleDetailsBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button8.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_vehicleDetails_to_rentalReservation)
        }
        return binding.root
    }


}