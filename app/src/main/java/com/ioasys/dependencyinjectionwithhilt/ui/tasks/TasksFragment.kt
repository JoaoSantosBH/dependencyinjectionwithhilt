package com.ioasys.dependencyinjectionwithhilt.ui.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.ioasys.dependencyinjectionwithhilt.R
import com.ioasys.dependencyinjectionwithhilt.model.Task
import com.ioasys.dependencyinjectionwithhilt.presentation.tasks.TasksViewModel
import com.ioasys.dependencyinjectionwithhilt.ui.tasks.adapter.TasksAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_tasks.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TasksFragment : Fragment() {

    private val adapter by lazy { createTaskAdapter() }
    private val viewModel: TasksViewModel by viewModels()
    private fun createTaskAdapter() = TasksAdapter(viewModel.myTasks)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getTasks()

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


    private fun setupAdapter() {
        myTaskRecycler.adapter = adapter

    }
}