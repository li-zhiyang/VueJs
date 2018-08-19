package cn.hfutlzy.vuejs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lzyli
 * CreateDate : 2018/8/19 16:42
 * Description :
 */
@RestController
public class ViewController {

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

}
