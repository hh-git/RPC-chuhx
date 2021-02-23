package com.chuhx.helloserver;

import com.chuhx.RpcServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.chuhx.zookeeper.ZookeeperServiceRegistry;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloserverApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(HelloserverApplication.class, args);
        ZookeeperServiceRegistry zookeeperServiceRegistry = new ZookeeperServiceRegistry("127.0.0.1:2181");
        RpcServer rpcServer = new RpcServer("127.0.0.1:8000",zookeeperServiceRegistry);
        rpcServer.setApplicationContext(context);
        rpcServer.afterPropertiesSet();
    }

}
