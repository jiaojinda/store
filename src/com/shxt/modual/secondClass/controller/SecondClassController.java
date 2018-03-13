package com.shxt.modual.secondClass.controller;

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
import com.shxt.modual.secondClass.model.SecondClass;
import com.shxt.modual.secondClass.service.SecondClassService;


/**
 * 二级分类 ，控制层
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:15:40
 * @description
 */
@Controller
@RequestMapping("/secondClass")
public class SecondClassController {
    //业务层对象
    @Autowired
    private SecondClassService secondClassService;


    /**
     * 显示添加页面
     * @author
     * @date  下午6:22:13
     * @return ModelAndView
     */
    @RequestMapping("/addShow")
    public ModelAndView addShow() {
        ModelAndView mav = new ModelAndView("secondClass/add");

        List<FirstClass> list = secondClassService.firstClassList();
        mav.addObject("list", list);

        return mav;
    }

    /**
     * 添加二级分类
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    public String add(SecondClass s) {
        secondClassService.add(s);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/secondClass/list";
    }

    /**
     * 查看二级分类
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("secondClass/list");

        List<SecondClass> list = secondClassService.list();
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
    public ModelAndView updateShow(String s_id) {
        ModelAndView mav = new ModelAndView("secondClass/update");
        SecondClass s = secondClassService.get(s_id);

        List<FirstClass> list = secondClassService.firstClassList();
        mav.addObject("list", list);

        mav.addObject("s",s);

        return mav;
    }

    /**
     * 删除二级分类
     * @author
     * @date  下午6:09:52
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public String delete(String s_id) {
        secondClassService.delete(s_id);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/secondClass/list";
    }

    /**
     * 修改二级分类
     * @author
     * @date  下午6:26:42
     * @param r
     */
    @RequestMapping("/update")
    public String update(SecondClass s) {
        secondClassService.update(s);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/secondClass/list";
    }

    /**
     * AJAX验证名称
     * @author
     * @title: getAccount
     * @date  下午5:53:43
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException String
     */
    @RequestMapping(value="/checkName")
    @ResponseBody
    public  void checkName(String name,HttpServletRequest request,HttpServletResponse response) {
        String m = secondClassService.checkName(name);
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
