package com.example.addtask.addTask

import com.example.domain.model.TaskModel


data class TaskUI(
    val id: Int,
    val taskName: String,
    val taskDate: String,
    val taskImage: String
)

fun TaskUI.toDomain() = TaskModel(id, taskName, taskDate, taskImage)
fun TaskModel.toUI() = TaskUI(id, taskName, taskDate, taskImage)