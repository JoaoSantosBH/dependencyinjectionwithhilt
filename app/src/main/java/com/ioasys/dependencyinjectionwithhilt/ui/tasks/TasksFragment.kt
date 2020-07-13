package com.ioasys.dependencyinjectionwithhilt.ui.tasks

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.ioasys.dependencyinjectionwithhilt.R
import com.ioasys.dependencyinjectionwithhilt.presentation.register.RegisterViewModel
import com.ioasys.dependencyinjectionwithhilt.presentation.tasks.TasksViewModel
import com.ioasys.dependencyinjectionwithhilt.ui.getColorCompat
import com.ioasys.dependencyinjectionwithhilt.ui.hide
import com.ioasys.dependencyinjectionwithhilt.ui.show
import com.ioasys.dependencyinjectionwithhilt.ui.tasks.adapter.TasksAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_tasks.*
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TasksFragment : Fragment() {

    private val adapter by lazy { createTaskAdapter() }
    private val registerViewModel: RegisterViewModel by viewModels()
    private val viewModel: TasksViewModel by viewModels()
    private fun createTaskAdapter() = TasksAdapter(viewModel.myTasks)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getTasks()
        getLastUserAdded()
    }

    private fun getTasks() = lifecycleScope.launch {
        viewModel.getTasks()
        setupAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loading.show()
        setUpName()
    }

    private fun getLastUserAdded()  = lifecycleScope.launch {
        registerViewModel.getUser()
    }
    private fun setUpName() {
        registerViewModel.myUser?.let {
            val spanString =
                SpannableString(String.format(getString(R.string.welcome_msg), it.name))
            spanString.setSpan(
                ForegroundColorSpan(getColorCompat(R.color.colorPrimary)),
                spanString.length - it.name.length - 1,
                spanString.length - 1,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            tv_welcome.text = spanString
        }
    }
    private fun setupAdapter() {
        myTaskRecycler.adapter = adapter
        loading.hide()

    }
}