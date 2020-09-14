package tech.zlia.study.example.autowire.demo5;

import org.springframework.stereotype.Service;

import javax.annotation.Priority;

@Priority(2)
@Service
public class Red implements Color {
    @Override
    public void hello(String origin) {
        System.out.println(origin + " Red hello");
    }
}
