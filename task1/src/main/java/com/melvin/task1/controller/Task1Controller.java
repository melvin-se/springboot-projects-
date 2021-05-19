package com.melvin.task1.controller;

import com.melvin.task1.entity.CalcEntity;
import com.melvin.task1.repo.Task1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class Task1Controller {

    @Autowired
    Task1Repo task1Repo;

    @ResponseBody
    @RequestMapping("/calc")
    public int Calc(@RequestBody CalcEntity calc)
    {
//        @RequestParam int inp1,@RequestParam int inp2,@RequestParam String operator
//        int inp1=8;
//        int inp2=4;
//        String operator="-";
        String operator=calc.getOperator();
        int inp1=calc.getInp1();
        int inp2= calc.getInp2();
        int result=calc.getResult();
        if(operator.equals("+")) {
            result = inp1 + inp2;
        }
        if(operator.equals("-")) {
            result = inp1 - inp2;
        }
        if(operator.equals("/")) {
            result = inp1 / inp2;
        }
        if(operator.equals("*")) {
            result = inp1 * inp2;
        }
        CalcEntity calcu=new CalcEntity(inp1,inp2,operator,result);
        task1Repo.save(calcu);
        return result;
    }
//    @RequestMapping("/home")
//    public String home()
//    {
//        return "input";
//    }
}
