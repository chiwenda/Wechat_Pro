package com.cwd.Mapper;

import com.cwd.Entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUserById(int id);
}
