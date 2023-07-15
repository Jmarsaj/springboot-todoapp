package com.jmarsaj.springboottodoapp.controller

import com.jmarsaj.springboottodoapp.model.TodoEntity
import com.jmarsaj.springboottodoapp.service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime

@Controller
@RequestMapping("/todos")
class TodoController(val todoService: TodoService) {

    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("todos", todoService.getList())
        return "index"
    }

//    @GetMapping("/")
//    fun root(): String {
//        return "redirect:/todo"
//    }

    @GetMapping("/add")
    fun createTodoForm(model: Model): String {
        val todo = TodoEntity()
        model.addAttribute("todo", todo)
        return "add-todo"
    }

    @PostMapping
    fun saveTodo(@ModelAttribute("todo") todo: TodoEntity): String {
        todo.createdDatetime = LocalDateTime.now()
        todoService.saveTodo(todo)
        return "redirect:/todos"
    }

    @GetMapping("/{id}/edit")
    fun editTodoForm(@PathVariable id: Long, model: Model): String {
        model.addAttribute("todo", todoService.getTodoById(id))
        return "edit-todo"
    }

    @PostMapping("/{id}")
    fun updateTodo(
        @PathVariable id: Long,
        @ModelAttribute("todo") todo: TodoEntity,
        //model: Model
    ): String {
        val existingTodo = todoService.getTodoById(id)
        existingTodo?.let {
            it.content = todo.content
            it.completed = todo.completed

            if (todo.completed == true) it.completedDatetime = LocalDateTime.now()
            else it.completedDatetime = null

            todoService.saveTodo(it)
        }

        return "redirect:/todos"
    }

    @GetMapping("/{id}")
    fun deleteTodo(@PathVariable id: Long): String {
        todoService.deleteTodo(id)
        return "redirect:/todos"
    }
}