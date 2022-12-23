package pers.amcones.mobiletodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.amcones.mobiletodo.entity.Result;
import pers.amcones.mobiletodo.entity.TodoDTO;
import pers.amcones.mobiletodo.service.TodoService;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;
    @GetMapping("/getTodo")
    @CrossOrigin
    public Result getTodo(int userId){
        return todoService.getTodo(userId);
    }
    @PostMapping("/addTodo")
    @CrossOrigin
    public Result addTodo(@RequestBody TodoDTO todoDTO){
        return todoService.addTodo(todoDTO);
    }
    @PatchMapping("/updateTodo")
    @CrossOrigin
    public Result updateTodo(@RequestBody TodoDTO todoDTO){
        return todoService.updateTodo(todoDTO);
    }
}
