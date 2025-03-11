package com.slade66.picnest.controller;

import com.slade66.picnest.common.BaseResponse;
import com.slade66.picnest.common.ResultUtils;
import com.slade66.picnest.exception.ErrorCode;
import com.slade66.picnest.exception.ThrowUtils;
import com.slade66.picnest.model.dto.UserRegisterRequest;
import com.slade66.picnest.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        ThrowUtils.throwIf(userRegisterRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }

}

