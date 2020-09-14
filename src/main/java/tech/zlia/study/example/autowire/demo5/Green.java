package tech.zlia.study.example.autowire.demo5;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(1)
@Service
public class Green implements Color {

    @Override
    public void hello(String origin) {
        System.out.println(origin + " Green hello");

    }
}
