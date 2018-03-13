package com.shxt.modual.firstClass.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.firstClass.service.FirstClassService;

/**
 * 一级分类控制层
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:15:40
 * @description
 */
@Controller
@RequestMapping("/firstClass")
public class FirstClassController {
    //业务层对象
    @Autowired
    private FirstClassService firstClassService;


    /**
     * 显示添加页面
     * @author
     * @date  下午6:22:13
     * @return ModelAndView
     */
    @RequestMapping("/addShow")
    public ModelAndView addShow() {
        return new ModelAndView("firstClass/add");
    }

    /**
     * 添加一级分类
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    public String add(FirstClass f) {
        firstClassService.add(f);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/firstClass/list";
    }

    /**
     * 查看一级分类
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("firstClass/list");

        List<FirstClass> list = firstClassService.list();
        mav.addObject("list", list);

        return mav;
    }

    /**
     * 显示修改页面
     * @author
     * @date  下午6:09:52
     * @return ModelAndView
     */
    @RequestMapping("/updateShow")
    public ModelAndView updateShow(String f_id) {
        ModelAndView mav = new ModelAndView("firstClass/update");
        FirstClass f = firstClassService.get(f_id);

        mav.addObject("f",f);

        return mav;
    }

    /**
     * 删除一级分类
     * @author
     * @date  下午6:09:52
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public String delete(String f_id) {
        firstClassService.delete(f_id);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/firstClass/list";
    }

    /**
     * 修改一级分类
     * @author
     * @date  下午6:26:42
     * @param r
     */
    @RequestMapping("/update")
    public String update(FirstClass f) {
        firstClassService.update(f);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/firstClass/list";
    }

    /**
     * AJAX验证名称
     * @author
     * @title: getName
     * @date  下午5:53:43
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException String
     */
    @RequestMapping(value="/checkName")
    @ResponseBody
    public  void checkName(String name,HttpServletRequest request,HttpServletResponse response) {
        String m = firstClassService.checkName(name);
        response.setContentType("text/json;charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        out.print(m);

        out.flush();
        out.close();
    }
}
