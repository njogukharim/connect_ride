package com.kharim.connectride.user

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kharim.connectride.R
import com.kharim.connectride.databinding.FragmentCreateAccountBinding

class CreateAccount : Fragment() {

    companion object {
        fun newInstance() = CreateAccount()
    }

    private lateinit var viewModel: CreateAccountViewModel
    private lateinit var binding: FragmentCreateAccountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateAccountBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button4.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_createAccount_to_login)
        }
        return binding.root
    }


}