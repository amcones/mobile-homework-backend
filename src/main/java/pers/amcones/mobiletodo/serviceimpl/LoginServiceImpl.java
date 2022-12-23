package pers.amcones.mobiletodo.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pers.amcones.mobiletodo.entity.LoginDTO;
import pers.amcones.mobiletodo.entity.Result;
import pers.amcones.mobiletodo.entity.User;
import pers.amcones.mobiletodo.mapper.UserMapper;
import pers.amcones.mobiletodo.service.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Result login(LoginDTO loginDTO){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",loginDTO.getUser_name());
        User user=userMapper.selectOne(wrapper);
        if(user!=null&&user.getUserPassword().equals(loginDTO.getUser_password())){
            return new Result(200,"",user);
        }
        return new Result(400,"用户名或密码错误","");
    }
}
