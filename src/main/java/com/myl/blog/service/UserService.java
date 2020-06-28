package com.myl.blog.service;

import com.myl.blog.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
