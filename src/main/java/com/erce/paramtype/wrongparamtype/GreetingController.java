package com.erce.paramtype.wrongparamtype;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiParam;

@RestController
public class GreetingController {
    
    @GetMapping("/one")
    public String one(@ApiParam("wrongparamtype") String wrongparamtype) {
        return "";
    }
    
    @GetMapping("/two")
    public String two(String correctparamtype) {
        return "";
    }
    
}