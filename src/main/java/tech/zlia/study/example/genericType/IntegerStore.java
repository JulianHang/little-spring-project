package tech.zlia.study.example.genericType;

import org.springframework.stereotype.Service;

@Service
public class IntegerStore implements Store<Integer>{

    @Override
    public void hello() {
        System.out.println("IntegerStore hello");
    }
}
