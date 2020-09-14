package tech.zlia.study.example.autowire.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
public class TestOneWay {

    /**
     * 若有多个构造函数则必须要指定其中一个
     * @param p /
     */
    @Autowired
    public TestOneWay(Person p) {
        p.hello("TestOneWay");
    }

    public TestOneWay(Children c) {
        c.hello("TestOneWay");
    }

}
