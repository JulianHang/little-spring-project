package tech.zlia.study.example.autowire.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class TestFiveWay {

    /**
     * 第一种方式：注入所有Color的子类
     */
//    @Autowired
    private List<Color> colors;

    /**
     * 注入Map类型的字段，其中key是对象的名称，value是对象实例
     */
    private Map<String, Color> colorMap;

    /**
     * 第二种方式
     * @param colors /
     */
//    @Autowired
//    public TestFiveWay(List<Color> colors) {
//        this.colors = colors;
//    }
//
//    public TestFiveWay() {
//
//    }

    /**
     * 第三种方式
     * @param colors /
     */
    @Autowired
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    /**
     * 注入map类型
     * @param colorMap /
     */
    @Autowired
    public void setColorsOfMap(Map<String, Color> colorMap) {
        this.colorMap = colorMap;
    }

    @PostConstruct
    public void init() {
        for (Color color : colors) {
            color.hello("TestFiveWay init");
        }
    }

    /**
     * 为每个Color的子类加上Order或Priority注解或实现Ordered接口可进行排序
     * 以上这些虽然会影响注入的顺序，但其单例的启动顺序并不受影响
     * Priority注解不能用于方法上
     */
    @PostConstruct
    public void initByOrder() {
        for (Color color : colors) {
            color.hello("TestFiveWay initByOrder");
        }
    }

    @PostConstruct
    public void initColorMap() {
        colorMap.forEach((k, v) -> {
            v.hello("TestFiveWay initColorMap, name：" + k + ", v：");
        });
    }

}
