package tech.zlia.study.example.autowire.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestFourWay {

    private PersonExt p;

    /**
     * 由于PersonExt接口有两个子类，所以若这里没有指定泛型的话是会报错的
     * @param p
     */
    @Autowired
    public TestFourWay(PersonExt<Integer> p) {
        this.p = p;
    }

    @PostConstruct
    public void init() {
        p.hello("TestFourWay");
    }

}
