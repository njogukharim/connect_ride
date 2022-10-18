package com.kharim.connectride.user

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.kharim.connectride.R
import com.kharim.connectride.categories.CategoryView
import com.kharim.connectride.databinding.FragmentLoginBinding

class Login : Fragment() {

    companion object {
        fun newInstance() = Login()
    }

    private lateinit var viewModel: LoginViewModel
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        binding.lifecycleOwner = this

        binding.button5.setOnClickListener {
            startActivity(Intent(this@Login.requireContext(), CategoryView::class.java))
        }

        return binding.root
    }


}