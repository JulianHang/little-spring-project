package tech.zlia.study.example.autowire.demo4;

import org.springframework.stereotype.Service;

@Service
public class ChildrenOneExt implements PersonExt<Integer> {

    @Override
    public void hello(String origin) {
        System.out.println(origin + " ChildrenOneExt hello");
    }
}
