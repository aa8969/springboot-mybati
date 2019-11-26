package com.example.springbootmybatis;

import com.example.springbootmybatis.javebean.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Test
    void contextLoads() {

        User user = User.builder().id(1).user("zhangsn").password("lisi").build();
        System.out.println(user);
    }

}
