package com.shxt.modual.classes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shxt.modual.classes.model.Classes;
import com.shxt.modual.classes.service.ClassesService;


/**
 * 二级分类 ，控制层
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:15:40
 * @description
 */
@Controller
@RequestMapping("/classes")
public class ClassesController {
    //业务层对象
    @Autowired
    private ClassesService classesService;

    /**
     * 查看分类
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/classesShow")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("classes/classes");

        List<Classes> firstClassList = classesService.firstClassList();
        mav.addObject("firstClassList", firstClassList);

        List<Classes> secondClassList = classesService.secondClassList();
        mav.addObject("secondClassList", secondClassList);

        return mav;
    }

}