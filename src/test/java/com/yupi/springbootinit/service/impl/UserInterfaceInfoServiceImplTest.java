package com.yupi.springbootinit.service.impl;

import com.yupi.springbootinit.service.UserInterfaceInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserInterfaceInfoServiceImplTest {

    @Resource
    UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount() {
        boolean b = userInterfaceInfoService.invokeCount(1, 1);
        assertTrue(b);
    }
}