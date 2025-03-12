package com.slade66.picnest.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.slade66.picnest.model.dto.user.UserQueryRequest;
import com.slade66.picnest.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.slade66.picnest.model.vo.LoginUserVO;
import com.slade66.picnest.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author slade
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-03-11 14:26:24
 */
public interface UserService extends IService<User> {

    long userRegister(String userAccount, String userPassword, String checkPassword);

    String getEncryptPassword(String userPassword);

    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    LoginUserVO getLoginUserVO(User user);

    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    User getLoginUser(HttpServletRequest request);

    boolean userLogout(HttpServletRequest request);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

}
