package com.example.formapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.formapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentLoginBinding.inflate(inflater)
        toComplaint()
        return binding.root
    }

    private fun toComplaint() {
        binding.SignIn.setOnClickListener {
            binding.root.findNavController().navigate(LoginFragmentDirections.actionToMarketing())
        }
    }
}