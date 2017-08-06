package com.wayne.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhanliquan on 17-8-6.
 * Description:
 */
@Controller
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
