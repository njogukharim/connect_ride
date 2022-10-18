package com.kharim.connectride.vehicle

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kharim.connectride.R
import com.kharim.connectride.databinding.FragmentUploadsBinding

class Uploads : Fragment() {

    companion object {
        fun newInstance() = Uploads()
    }

    private lateinit var viewModel: UploadsViewModel
    private lateinit var binding: FragmentUploadsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUploadsBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button7.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_uploads_to_amendVehicleDetails)
        }
        return binding.root
    }


}