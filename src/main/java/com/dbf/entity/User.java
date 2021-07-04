package com.dbf.entity;

//使用jpa的注解配置映射关系

import javax.persistence.*;

@Entity   // 是一个实体类，和数据表去映射
@Table(name = "jpa_user")  // 指定对应的数据表。如果没有指定。默认表名user
public class User {
    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增主键
    private  Integer id;

    //对应数据表中一个字段（对应一个列） last_name  varchar(50)
    @Column(name = "last_name",length = 40)
    private String lastName;

    @Column // 默认数据名就是属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
