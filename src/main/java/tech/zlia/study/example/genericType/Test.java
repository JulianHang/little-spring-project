package tech.zlia.study.example.genericType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Test {

    /**
     * 虽然已经指定了type类型为Store，但却有StringStore/IntegerStore两个子类，所以要通过name进行匹配
     * 但这两个子类却都没有匹配，所以按照这种写法启动时会报错
     */
//    @Autowired
//    private Store store1;

    /**
     * 第一种写法，通过name进行匹配到
     */
//    @Autowired
//    private Store stringStore;

//    @Autowired
//    private Store integerStore;

    /**
     * 第二种写法，如果非要取不同的name，可以加上Qualifier，但是换汤不换药啊
     */
//    @Autowired
//    @Qualifier("stringStore")
//    private Store s1;

//    @Autowired
//    @Qualifier("integerStore")
//    private Store s2;

    /**
     * 第三种写法，spring4支持，通过加上泛型隐式代表限定符的格式，简单来说就是指定了注入了哪个实例，可以随便取名字了
     * 推荐这种写法，不过版本有要求
     */
    @Autowired
    private Store<String> s3;

    @Autowired
    private Store<Integer> s4;

    @PostConstruct
    public void init() {
        s4.hello();
        s3.hello();
    }
}
