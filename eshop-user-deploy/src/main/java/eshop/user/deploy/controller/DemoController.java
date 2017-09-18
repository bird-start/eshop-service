package eshop.user.deploy.controller;

import eshop.user.biz.UserBiz;
import eshop.user.dal.dao.model.UserUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserBiz userBiz;

    @RequestMapping("/hello")
    public String  hello(){
        return "index";
    }

    @RequestMapping(value = "/selectUserById")
    public ModelMap selectUserById(@RequestParam("userId") String userId){
        UserUser userUser = userBiz.selectUserById(userId);

        ModelMap map = new ModelMap();
        map.addAttribute("user",userUser);

        return map;
    }

}
