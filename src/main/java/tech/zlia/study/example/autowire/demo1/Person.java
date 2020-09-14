package tech.zlia.study.example.autowire.demo1;

import org.springframework.stereotype.Service;

@Service
public class Person {

    public void hello(String origin) {
        System.out.println(origin + " Person hello");
    }

}
