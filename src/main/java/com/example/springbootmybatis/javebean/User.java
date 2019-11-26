package com.example.springbootmybatis.javebean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class User {

    private Integer id;

    private String user;

    private String password;

    private Integer gender;

    private Integer dId;

    public User() {

    }

    public User(Integer id, String user, String password, Integer gender, Integer dId) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.gender = gender;
        this.dId = dId;
    }
}
