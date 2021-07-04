package com.dbf.repository;

import com.dbf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//自定义规范类 继承 JpaRepository 来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {
}
