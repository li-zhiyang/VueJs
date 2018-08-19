package cn.hfutlzy.vuejs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : lzyli
 * CreateDate : 2018/8/19 16:42
 * Description :
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String getIndex() {
        return "/index.html";
    }

}
