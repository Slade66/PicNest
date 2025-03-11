package com.slade66.picnest.service;

import com.slade66.picnest.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author slade
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-03-11 14:26:24
 */
public interface UserService extends IService<User> {

    long userRegister(String userAccount, String userPassword, String checkPassword);

    String getEncryptPassword(String userPassword);

}
