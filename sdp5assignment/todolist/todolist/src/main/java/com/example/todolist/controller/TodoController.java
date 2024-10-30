package com.example.todolist.controller;

import com.example.todolist.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todos")
public class TodoController {
    private final List<Todo> todos = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping
    public String listTodos(Model model) {
        model.addAttribute("todos", todos);
        return "todos";
    }

    @PostMapping
    public String addTodo(@RequestParam String task) {
        todos.add(new Todo(nextId++, task));
        return "redirect:/todos";
    }

    @PostMapping("/delete")
    public String deleteTodo(@RequestParam Long id) {
        todos.removeIf(todo -> todo.getId().equals(id));
        return "redirect:/todos";
    }
}
