package tech.zlia.study.example.autowire.demo5;

import org.springframework.stereotype.Service;

import javax.annotation.Priority;

@Priority(3)
@Service
public class White implements Color {

    public void hello(String origin) {
        System.out.println(origin + " White hello");
    }

}
