package com.ioasys.dependencyinjectionwithhilt.ui.tasks.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ioasys.dependencyinjectionwithhilt.model.Task
import com.ioasys.dependencyinjectionwithhilt.ui.hide
import com.ioasys.dependencyinjectionwithhilt.ui.show
import kotlinx.android.synthetic.main.item_task.view.*

class TaskViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(task: Task) {
        view.apply {
            task_title.text = task.title
            when(task.completed){
                true -> ic_done.show()
                else -> ic_done.hide()
            }
        }
    }
}