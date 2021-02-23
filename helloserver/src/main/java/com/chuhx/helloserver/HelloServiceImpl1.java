package com.chuhx.helloserver;

import com.chuhx.HelloService;
import com.chuhx.RpcService;

@RpcService(interfaceName = HelloService.class)
public class HelloServiceImpl1 implements HelloService {

    @Override
    public String hello(String name) {
        return name + " Hello from " + "HelloServiceImpl1" ;
    }
}
