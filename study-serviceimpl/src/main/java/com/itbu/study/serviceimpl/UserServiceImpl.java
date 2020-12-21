package com.itbu.study.serviceimpl;

import com.itbu.study.common.bean.UserBean;
import com.itbu.study.mapper.UserMapper;
import com.itbu.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBean> getAll() {
        return userMapper.getAll();
    }
}
