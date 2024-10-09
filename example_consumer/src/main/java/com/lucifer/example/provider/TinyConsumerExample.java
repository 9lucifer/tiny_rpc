package com.lucifer.example.provider;

import com.lucifer.example.common.model.User;
import com.lucifer.example.common.service.UserService;
import com.lucifer.tiny_rpc.proxy.ServiceProxyFactory;

/**
 * 提供服务
 */
public class TinyConsumerExample {
    public static void main(String[] args) {

        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("lucifer");
        // 调用
        User newUser = userService.getUser(user);

        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }

}
