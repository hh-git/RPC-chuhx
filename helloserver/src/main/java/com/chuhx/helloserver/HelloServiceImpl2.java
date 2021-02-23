package com.chuhx.helloserver;

import com.chuhx.HelloService;
import com.chuhx.RpcService;

@RpcService(interfaceName = HelloService.class, serviceVersion = "helloServiceImpl2")
public class HelloServiceImpl2 implements HelloService {

    @Override
    public String hello(String name) {
        return name + " GoodBye from " + "HelloServiceImpl2" ;
    }
}
