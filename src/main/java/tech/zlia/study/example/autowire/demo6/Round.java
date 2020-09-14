package tech.zlia.study.example.autowire.demo6;

import org.springframework.stereotype.Service;

@Service
public class Round {

    public void hello(String origin) {
        System.out.println(origin + " Round hello");
    }

}
