package com.mini.store.demo.controller;

import com.mini.store.demo.dto.SignInRequest;
import com.mini.store.demo.dto.SignUpRequest;
import com.mini.store.demo.dto.UserViewModal;
import com.mini.store.demo.dto.WechatLogInRequest;
import com.mini.store.demo.error.BusinessError;
import com.mini.store.demo.error.BusinessException;
import com.mini.store.demo.model.User;
import com.mini.store.demo.response.CommonReturnType;
import com.mini.store.demo.security.JwtIgnore;
import com.mini.store.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @JwtIgnore
    @PostMapping("/signup")
    public void signUp(@RequestBody SignUpRequest signUpRequest) throws Exception{
        userServiceImpl.signUp(signUpRequest);
    }

    @JwtIgnore
    @PostMapping("/signin")
    public String signIn(@RequestBody SignInRequest signInRequest) throws Exception{
        return userServiceImpl.signIn(signInRequest);
    }

    @JwtIgnore
    @PostMapping("/wechatLogin")
    public String wechatLogin(@RequestBody WechatLogInRequest wechatLogInRequest) throws Exception{
        return userServiceImpl.wechatLogin(wechatLogInRequest);
    }


    @GetMapping("/current")
    public UserViewModal getCurrentUSer() throws Exception{
        User user = userServiceImpl.getCurrentUser();
        return UserViewModal.builder()
                .userName(user.getUserName())
                .userAvatarUrl(user.getUserAvatarUrl())
                .phone(user.getPhone())
                .build();
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
