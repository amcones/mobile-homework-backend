package pers.amcones.mobiletodo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName(value="todos_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @TableId(value="todo_id",type= IdType.AUTO)
    private Integer todoId;
    private Integer userId;
    private String todoContent;
    private Boolean todoCompleted;
}
