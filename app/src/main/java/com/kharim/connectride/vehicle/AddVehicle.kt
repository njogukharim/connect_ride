package com.kharim.connectride.vehicle

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kharim.connectride.R
import com.kharim.connectride.databinding.FragmentAddVehicleBinding

class AddVehicle : Fragment() {

    companion object {
        fun newInstance() = AddVehicle()
    }

    private lateinit var viewModel: AddVehicleViewModel
    private lateinit var binding: FragmentAddVehicleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddVehicleBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button2.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_addVehicle_to_uploads)
        }

        return binding.root
    }

}