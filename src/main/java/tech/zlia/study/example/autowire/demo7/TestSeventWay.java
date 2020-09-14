package tech.zlia.study.example.autowire.demo7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class TestSeventWay {

    private Hand hand;

    private Eye eye;

    @Autowired
    public void setHand(Optional<Hand> optional){
        optional.ifPresent(hand -> this.hand = hand);
    }

    /**
     * 由于Eye并未加上@Service注解，所以spring容器中并没有该实例，所以eys的值为null
     * @param optional
     */
    @Autowired
    public void setEye(Optional<Eye> optional) {
        optional.ifPresent(eye -> this.eye = eye);
    }

    @PostConstruct
    public void initHand() {
        System.out.println("TestSeventWay initHand：" + hand);
    }

    @PostConstruct
    public void initEye() {
        System.out.println("TestSeventWay initEye：" + eye);
    }

}
