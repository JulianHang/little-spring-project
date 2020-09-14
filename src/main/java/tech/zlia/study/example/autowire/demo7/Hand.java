package tech.zlia.study.example.autowire.demo7;

import org.springframework.stereotype.Service;

@Service
public class Hand {

    public void hello(String origin) {
        System.out.println(origin + " Hand hello");
    }
}
