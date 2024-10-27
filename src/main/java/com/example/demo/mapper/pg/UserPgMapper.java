package com.example.demo.mapper.pg;


import com.example.demo.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserPgMapper {

    @Select("select * from \"user\";")
    List<UserModel> selectAll();

}
