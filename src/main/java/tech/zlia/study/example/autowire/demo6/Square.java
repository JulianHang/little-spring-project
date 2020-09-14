package tech.zlia.study.example.autowire.demo6;

import org.springframework.stereotype.Service;

@Service
public class Square {

    public void hello(String origin) {
        System.out.println(origin + " Square hello");
    }
}
