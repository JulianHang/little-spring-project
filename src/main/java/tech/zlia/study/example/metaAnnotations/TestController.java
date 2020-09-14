package tech.zlia.study.example.metaAnnotations;

import org.springframework.web.bind.annotation.RestController;


/**
 * 虽然使用了自定义注解，但是该注解没有经过，所以最终是调不到的
 */
@RestController
@CustomerPath("/test")
public class TestController {

    @CustomerPath(urls = "/hello")
    public void hello(){
        System.out.println("Hello world");
    }

}
