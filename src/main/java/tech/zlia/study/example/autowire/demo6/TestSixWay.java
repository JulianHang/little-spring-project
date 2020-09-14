package tech.zlia.study.example.autowire.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSixWay {

//    /**
//     * 该构造函数第一个被执行
//     * @param r /
//     * @param s /
//     * @param oval /
//     */
//    @Autowired(required = false)
//    public TestSixWay(Round r, Square s, Oval oval) {
//        r.hello("TestSixWay Round、Square、Oval入参：");
//        s.hello("TestSixWay Round、Square、Oval入参：");
//        oval.hello("TestSixWay Round、Square、Oval入参：");
//    }

    public TestSixWay() {
        System.out.println("TestSixWay 默认构造函数");
    }

    /**
      * 该构造函数有1个入参，同下面的2个构造函数一样，通过观察互换代码的编写顺序的结果可知，spring优先执行靠前的构造函数，即当前构造函数
      * 若没有提到的构造函数，则该构造函数被执行
      * @param r /
      */
    @Autowired(required = false)
    public TestSixWay(Round r) {
        r.hello("TestSixWay 只有Round入参：");
    }

    @Autowired(required = false)
    public TestSixWay(Square s) {
        s.hello("TestSixWay 只有Square入参：");
    }

    @Autowired(required = false)
    private TestSixWay(Oval oval) {
        oval.hello("TestSixWay 只有Oval入参：");
    }

//    /**
//     * 该构造函数有2个入参，同下面的构造函数一样，通过观察互换代码的编写顺序的结果可知，spring优先执行靠后的构造函数，即TestSixWay(Round r, Square s)
//     * 若没有提到的构造函数，则该构造函数被执行
//     * @param r /
//     * @param oval /
//     */
//    @Autowired(required = false)
//    public TestSixWay(Round r, Oval oval) {
//        r.hello("TestSixWay Round、Oval入参：");
//        oval.hello("TestSixWay Round、Oval入参：");
//    }
//
//    /**
//     * 若没有TestSixWay(Round r, Square s, Oval oval)构造函数，则该构造函数被执行
//     * @param r /
//     * @param s /
//     */
//    @Autowired(required = false)
//    public TestSixWay(Round r, Square s) {
//        r.hello("TestSixWay Round、Square入参：");
//        s.hello("TestSixWay Round、Square入参：");
//    }

}
