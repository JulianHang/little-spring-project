package tech.zlia.study.example.genericType;

import org.springframework.stereotype.Service;

@Service
public class StringStore implements Store<String> {

    public void hello() {
        System.out.println("StringStore hello");
    }

}
