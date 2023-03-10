package com.ye.back;

import com.ye.back.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.prefs.BackingStoreException;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EducationBackApplication.class)
class EducationBackApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testMapper() {
        System.out.println(userMapper.selectById(1));
    }

}
