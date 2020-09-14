package tech.zlia.study.example.autowire.demo5;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

@Service
public class Black implements Color, Ordered {

    @Override
    public void hello(String origin) {
        System.out.println(origin + " Black hello");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
