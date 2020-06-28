package com.myl.blog;

import com.myl.blog.dao.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BlogApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Test
    void contextLoads() {
    }

}
