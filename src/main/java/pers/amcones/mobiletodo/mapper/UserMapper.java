package pers.amcones.mobiletodo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pers.amcones.mobiletodo.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
