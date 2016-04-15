package com.thd.spring.spring401;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    /**
     * 1. 使用 @RequestMapping 注解来映射请求的 URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于 InternalResourceViewResolver 视图解析器, 会做如下的解析:
     * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图, 然会做转发操作
     *
     * @return /WEB-INF/views/helloWorld.jsp
     */
    @RequestMapping("/helloWorld")
    public String hello() {
        return "helloWorld";
    }

}
