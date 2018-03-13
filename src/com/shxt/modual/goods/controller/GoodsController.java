package com.shxt.modual.goods.controller;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.shxt.base.util.Page;
import com.shxt.modual.classes.model.Classes;
import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.goods.model.Select;
import com.shxt.modual.goods.service.GoodsService;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 商品控制层
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:15:40
 * @description
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    
    //业务层对象
    @Autowired
    private GoodsService goodsService;
    
    /**
     * 查看商品
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("index");
        
        List<Goods> list = goodsService.list();
        mav.addObject("list", list);
        return mav;
    }
    
    /**
     * 分页查看商品
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/paging")
    public ModelAndView paging(Page page,Select s) {
        page.setSize(8);
        ModelAndView mav = new ModelAndView("goods/list");
        
        if(s.getS_id()==null){
            s.setS_id("0");
        }
        if(s.getMaxPrice()==null){
            s.setMaxPrice("");
        }
        if(s.getMinPrice()==null){
            s.setMinPrice("");
        }
        
        List<Classes> firstClassList =goodsService.firstClassList();
        mav.addObject("firstClassList", firstClassList);
        
        List<Goods> list = goodsService.page(page,s);
        
        mav.addObject("s", s);
        mav.addObject("list", list);
        mav.addObject("page", page);
        
        return mav;
    }
    
    /**
     * 根据主键查询
     * @author
     * @date  下午6:09:52
     * @return ModelAndView
     */
    @RequestMapping("/get")
    public ModelAndView get(String g_id) {
        ModelAndView mav = new ModelAndView("goods/one");
        Goods g = goodsService.get(g_id);
        
        mav.addObject("g",g);
        
        return mav;
    }

    /**
     *  AJAX获得二级分类
     * @author
     * @title: secondClassList
     * @date  下午5:53:43
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException String
     */
    @RequestMapping(value="/secondClassList")
    @ResponseBody
    public  void secondClassList(String f_id,HttpServletRequest request,HttpServletResponse response) {
        String m = goodsService.secondClassList(f_id);
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
    
    /**
     * 显示添加页面
     * @author
     * @date  下午6:22:13
     * @return ModelAndView
     */
    @RequestMapping("/addShow")
    public ModelAndView addShow() {
        ModelAndView mav = new ModelAndView("goods/add");
        
        List<FirstClass> list =goodsService.b_firstClassList();
        mav.addObject("list", list);
        
        return mav;
    }
    
    /**
     * 添加商品
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    public String add(Goods g,MultipartFile photoFile1,MultipartFile photoFile2,MultipartFile photoFile3,HttpServletRequest request) {
        goodsService.add(g,photoFile1,photoFile2,photoFile3,request);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/goods/b_list";
    }
    
    /**
     * 查看隐藏商品
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/hiddenList")
    public ModelAndView hiddenList() {
        ModelAndView mav = new ModelAndView("goods/hiddenList");
        
        List<Goods> list = goodsService.hiddenList();
        mav.addObject("list", list);
        
        return mav;
    }
    
    /**
     * 查看商品
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/b_list")
    public ModelAndView b_list() {
        ModelAndView mav = new ModelAndView("goods/b_list");
        
        List<Goods> list = goodsService.list();
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
    public ModelAndView updateShow(String g_id) {
        ModelAndView mav = new ModelAndView("goods/update");
        Goods g = goodsService.get(g_id);
        
        mav.addObject("g",g);
        mav.addObject("f_id",goodsService.getF_id(g_id));
        
        List<FirstClass> firstClassList =goodsService.b_firstClassList();
        mav.addObject("firstClassList", firstClassList);

        List<SecondClass> secondClassList =goodsService.getSecondClassList(goodsService.getF_id(g_id));
        mav.addObject("secondClassList", secondClassList);
        
        return mav;
    }
    
    /**
     * 隐藏商品
     * @author
     * @date  下午6:09:52
     * @return ModelAndView
     */
    @RequestMapping("/hide")
    public String hide(String g_id) {
        goodsService.hide(g_id);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/goods/b_list";
    }
    
    /**
     * 恢复商品
     * @author
     * @date  下午6:09:52
     * @return ModelAndView
     */
    @RequestMapping("/recover")
    public String recover(String g_id) {
        goodsService.recover(g_id);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/goods/hiddenList";
    }
    
    /**
     * 删除商品
     * @author
     * @date  下午6:09:52
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public String delete(String g_id) {
        goodsService.delete(g_id);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/goods/hiddenList";
    }
    
    /**
     * 修改商品
     * @author
     * @date  下午6:26:42
     * @param g
     */
    @RequestMapping("/update")
    public String update(Goods g,MultipartFile photoFile1,MultipartFile photoFile2,MultipartFile photoFile3,HttpServletRequest request) {
        goodsService.update(g,photoFile1,photoFile2,photoFile3,request);
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX +  "/goods/b_list";
    }
    
}
