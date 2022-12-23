package pers.amcones.mobiletodo.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.amcones.mobiletodo.entity.*;
import pers.amcones.mobiletodo.mapper.TodoMapper;
import pers.amcones.mobiletodo.mapper.UserMapper;
import pers.amcones.mobiletodo.service.TodoService;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoMapper todoMapper;

    @Override
    public Result getTodo(int userId) {
        QueryWrapper<Todo> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",userId);
        List<Todo> todos=todoMapper.selectList(wrapper);
        return new Result(200,"",todos);
    }

    @Override
    public Result addTodo(TodoDTO todoDTO) {
        Todo todo=new Todo();
        todo.setUserId(todoDTO.getUser_id());
        todo.setTodoContent(todoDTO.getTodo_content());
        todo.setTodoCompleted(todoDTO.getTodo_completed());
        todoMapper.insert(todo);
        return new Result(200,"",todo);
    }
    @Override
    public Result updateTodo(TodoDTO todoDTO){
        Todo todo=new Todo();
        todo.setTodoId(todoDTO.getTodo_id());
        todo.setTodoContent(todoDTO.getTodo_content());
        todo.setTodoCompleted(todoDTO.getTodo_completed());
        System.out.println(todo);
        todoMapper.updateById(todo);
        return new Result(200,"",todo);
    }
}
