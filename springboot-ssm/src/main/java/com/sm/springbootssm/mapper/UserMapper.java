package com.sm.springbootssm.mapper;

import com.sm.springbootssm.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUserById(@Param("id") Integer id);
}
