package com.lucifer.example.provider;

import com.lucifer.example.common.service.UserService;
import com.lucifer.tiny_rpc.registry.LocalRegistry;
import com.lucifer.tiny_rpc.server.HttpServer;
import com.lucifer.tiny_rpc.server.VertxHttpServer;

/**
 * 提供服务
 */
public class TinyProviderExample {
    public static void main(String[] args) {
        //注册服务
        LocalRegistry.register(UserService.class.getName(),UserServiceImpl.class);

        //提供服务
        HttpServer server = new VertxHttpServer();
        server.doStart(8081);
    }
}
