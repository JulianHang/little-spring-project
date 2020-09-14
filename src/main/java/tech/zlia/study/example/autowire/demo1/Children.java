package tech.zlia.study.example.autowire.demo1;

import org.springframework.stereotype.Service;

@Service
public class Children{

    public void hello(String origin) {
        System.out.println(origin + " Children hello");
    }

}
