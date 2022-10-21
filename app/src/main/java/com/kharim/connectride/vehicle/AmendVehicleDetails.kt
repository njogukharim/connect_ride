package com.kharim.connectride.vehicle

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kharim.connectride.R
import com.kharim.connectride.Welcome
import com.kharim.connectride.databinding.FragmentAmendVehicleDetailsBinding

class AmendVehicleDetails : Fragment() {

    companion object {
        fun newInstance() = AmendVehicleDetails()
    }

    private lateinit var viewModel: AmendVehicleDetailsViewModel
    private lateinit var binding: FragmentAmendVehicleDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAmendVehicleDetailsBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button3.setOnClickListener{
            startActivity(Intent(this@AmendVehicleDetails.requireContext(), Welcome::class.java))
        }
        return binding.root
    }

}