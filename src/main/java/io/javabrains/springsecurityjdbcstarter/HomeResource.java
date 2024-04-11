package io.javabrains.springsecurityjdbcstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HomeResource {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/user")
    public String user() {
        return "user";
    }
    
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    
}
