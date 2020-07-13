package com.ioasys.dependencyinjectionwithhilt.ui.tasks.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ioasys.dependencyinjectionwithhilt.R
import com.ioasys.dependencyinjectionwithhilt.model.Task

class TasksAdapter(val myTasksList: List<Task>) : RecyclerView.Adapter<TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder =
        TaskViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        )

    override fun getItemCount() = myTasksList.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(myTasksList[position])
    }

}