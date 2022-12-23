package pers.amcones.mobiletodo.service;

import org.apache.ibatis.annotations.Mapper;
import pers.amcones.mobiletodo.entity.Result;
import pers.amcones.mobiletodo.entity.TodoDTO;

@Mapper
public interface TodoService {
    public Result getTodo(int userId);
    public Result addTodo(TodoDTO todoDTO);
    public Result updateTodo(TodoDTO todoDTO);
}
