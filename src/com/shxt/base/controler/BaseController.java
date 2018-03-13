package com.shxt.base.controler;

import java.beans.PropertyEditorSupport;
import java.util.Date;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.shxt.base.util.DateUtils;


/**
 * 公共的控制器,所有各模块的控制器需要继承此类
 * @author 矫金达
 * @Version 1.0
 * @Copyright 四海兴唐
 * @date 2016年6月5日 下午6:13:19
 * @description 
 */
public class BaseController {
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport(){
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                setValue(DateUtils.parseDate(text));
            }
            
        });
    }  
}
