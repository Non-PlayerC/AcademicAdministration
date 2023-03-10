package com.ye.back.service.impl;

import com.ye.back.entity.User;
import com.ye.back.mapper.UserMapper;
import com.ye.back.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjy
 * @since 2023-03-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
