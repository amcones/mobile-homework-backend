package pers.amcones.mobiletodo.entity;

import lombok.Data;

@Data
public class TodoDTO {
    private Integer todo_id;
    private Integer user_id;
    private String todo_content;
    private Boolean todo_completed;
}
