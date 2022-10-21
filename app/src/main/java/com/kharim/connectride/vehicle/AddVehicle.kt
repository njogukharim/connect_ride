package com.kharim.connectride.vehicle

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.findNavController
import com.kharim.connectride.R
import com.kharim.connectride.databinding.FragmentAddVehicleBinding

class AddVehicle : Fragment() {

    companion object {
        fun newInstance() = AddVehicle()
    }

    private lateinit var viewModel: AddVehicleViewModel
    private lateinit var binding: FragmentAddVehicleBinding
    override fun onResume() {
        super.onResume()

        val brandNames = resources.getStringArray(R.array.brand_names)
        val brandNamesArrayAdapter = ArrayAdapter(requireContext(),R.layout.dropdown_item,brandNames)
        binding.brandAutoCompleteTextView.setAdapter(brandNamesArrayAdapter)

        val categories = resources.getStringArray(R.array.categories)
        val categoriesArrayAdapter = ArrayAdapter(requireContext(),R.layout.dropdown_item,categories)
        binding.categoryAutoCompleteTextView.setAdapter(categoriesArrayAdapter)

        val transmissions = resources.getStringArray(R.array.transmission)
        val transmissionArrayAdapter = ArrayAdapter(requireContext(),R.layout.dropdown_item,transmissions)
        binding.transmissionAutoCompleteTextView.setAdapter(transmissionArrayAdapter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddVehicleBinding.inflate(inflater)
        binding.lifecycleOwner = this

        return binding.root
    }

}