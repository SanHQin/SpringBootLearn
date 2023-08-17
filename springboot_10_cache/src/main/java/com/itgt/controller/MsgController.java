package com.itgt.controller;

import com.itgt.service.MsgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin("*")
@RequestMapping("/checkTel")
public class MsgController {
    @Autowired
    private MsgService msgService;
    @GetMapping("{tel}")
    public String getCode(@PathVariable String tel){
        return msgService.getCode(tel);
    }

    @GetMapping("{tel}/{code}")
    public Boolean checkCode(@PathVariable String tel,@PathVariable String code){
        return msgService.checkCode(tel,code);
    }

}
