package pers.amcones.mobiletodo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName(value="users_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(value="user_id",type = IdType.AUTO)
    private Integer userId;
    private String userName;
    private String userPassword;
}
