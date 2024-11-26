package com.example.addtask.model

import com.example.addtask.addTask.AddTaskViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val addTaskModule: Module = module {

    viewModel { AddTaskViewModel(get()) }
}