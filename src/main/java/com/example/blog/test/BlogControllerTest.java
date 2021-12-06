package com.example.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //스프링이 com.example.test 패키지 이하를 스캔해서 특정 어노테이션이 붙어있는 클래스 파일들울 new해서 컨테이너에서 관리해줌
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello() {
        return "<h1>hello spring boot</h1>";
    }

}
