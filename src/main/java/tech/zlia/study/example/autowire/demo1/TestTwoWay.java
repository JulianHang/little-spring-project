package tech.zlia.study.example.autowire.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestTwoWay {

    private Person p;

    private Children c;

    /**
     * 应用到方法上，方法可以是任意的名字和任意的参数个数，只不过要求这些对象是被spring容器所管理
     * @param p
     */
    @Autowired
    public void setParent(Person p) {
        this.p = p;
    }

    @Autowired
    public void setParent(Person p, Children c) {
        this.p = p;
        this.c = c;
    }

    @PostConstruct
    public void init() {
        p.hello("TestTwoWay");
        c.hello("TestTwoWay");
    }

}
