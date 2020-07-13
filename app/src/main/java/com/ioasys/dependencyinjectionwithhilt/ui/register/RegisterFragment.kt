package com.ioasys.dependencyinjectionwithhilt.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.ioasys.dependencyinjectionwithhilt.R
import com.ioasys.dependencyinjectionwithhilt.model.User
import com.ioasys.dependencyinjectionwithhilt.presentation.register.RegisterViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RegisterFragment: Fragment() {

     private val viewModel: RegisterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        btn_register.setOnClickListener {
            register(edt_username.text.toString())
        }
    }

     fun register(text: String) = lifecycleScope.launch {
        val user = User(null, text)
        viewModel.saveUser(user)
         findNavController().navigate(R.id.action_loginFragment_to_tasksFragment)
    }

}