package cheng.controller;

import cheng.beans.company;
import cheng.service.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
@Controller
@RequestMapping("/company")
public class companyControll {
    @Autowired
    services services;

    @RequestMapping("/getcompany")
    public String  getcompany(){
        System.out.print("22222");
        int id=1;
        company getcompany = services.getcompany(id);
        System.out.print(getcompany.toString());
        System.out.print("111111");
        return "list";

    }




}
