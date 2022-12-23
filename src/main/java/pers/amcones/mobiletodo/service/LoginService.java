package pers.amcones.mobiletodo.service;

import org.apache.ibatis.annotations.Mapper;
import pers.amcones.mobiletodo.entity.LoginDTO;
import pers.amcones.mobiletodo.entity.Result;

@Mapper
public interface LoginService {
    public Result login(LoginDTO loginDTO);
}
