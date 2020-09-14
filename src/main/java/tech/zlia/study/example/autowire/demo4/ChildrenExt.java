package tech.zlia.study.example.autowire.demo4;

import org.springframework.stereotype.Service;

@Service
public class ChildrenExt implements PersonExt<String> {

    @Override
    public void hello(String origin) {
        System.out.println(origin + " ChildrenExt hello");
    }
}
