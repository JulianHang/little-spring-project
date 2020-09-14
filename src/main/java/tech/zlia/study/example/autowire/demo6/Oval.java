package tech.zlia.study.example.autowire.demo6;

import org.springframework.stereotype.Service;

@Service
public class Oval {

    public void hello(String origin) {
        System.out.println(origin + " Oval hello");
    }
}
