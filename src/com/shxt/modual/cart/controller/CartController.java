package com.shxt.modual.cart.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.cart.service.CartService;
import com.shxt.modual.customer.model.Customer;
import com.shxt.modual.goods.model.Goods;

/**
 * 购物车控制层
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:15:40
 * @description
 */
@Controller
@RequestMapping("/cart")
public class CartController {
    //业务层对象
    @Autowired
    private CartService cartService;
    
    /**
     * 显示购物车
     * @author
     * @date  下午6:45:52
     * @return ModelAndView
     */
    @RequestMapping("/list")
    public ModelAndView list(String c_id) {
        ModelAndView mav = new ModelAndView("cart/list");
        
        List<Address> addressList = cartService.addressList(c_id);
        mav.addObject("addressList", addressList);
        
        List<Goods> list = cartService.list(c_id);
        mav.addObject("list", list);
        
        return mav;
    }
    
    /**
     * AJAX删除
     * @author
     * @title: delete
     * @date  下午5:53:43
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException String
     */
    @RequestMapping(value="/delete")
    @ResponseBody
    public  void delete(String g_id,HttpServletRequest request,HttpServletResponse response) {
        Customer c =  (Customer) request.getSession().getAttribute("customer");
        
        Cart cart = new Cart();
        cart.setC_id(c.getC_id());
        cart.setG_id(g_id);
        
        cartService.delete(cart);
    }
    
    
    /**
     * AJAX清空
     * @author
     * @title: empty
     * @date  下午5:53:43
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException String
     */
    @RequestMapping(value="/empty")
    @ResponseBody
    public  void empty(HttpServletRequest request,HttpServletResponse response) {
        Customer c =  (Customer) request.getSession().getAttribute("customer");
        cartService.delete(c.getC_id());
    }
    
    /**
     * AJAX添加
     * @author
     * @title: add
     * @date  下午5:53:43
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException String
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public  void add(String g_id,HttpServletRequest request,HttpServletResponse response) {
        Customer c =  (Customer) request.getSession().getAttribute("customer");
        
        Cart cart = new Cart();
        cart.setC_id(c.getC_id());
        cart.setG_id(g_id);
        
        Cart checkCart = cartService.get(cart);
        if(checkCart==null){
            cartService.add(cart);
        }else{
            cart.setNum(checkCart.getNum()+1);
            cartService.update(cart);
        }
    }
    
    /**
     * AJAX减少
     * @author
     * @title: subtract
     * @date  下午5:53:43
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException String
     */
    @RequestMapping(value="/subtract")
    @ResponseBody
    public  void subtract(String g_id,HttpServletRequest request,HttpServletResponse response) {
        Customer c =  (Customer) request.getSession().getAttribute("customer");
        
        Cart cart = new Cart();
        cart.setC_id(c.getC_id());
        cart.setG_id(g_id);
        
        Cart checkCart = cartService.get(cart);
        if(checkCart.getNum()==1){
            cartService.delete(cart);
        }else{
            cart.setNum(checkCart.getNum()-1);
            cartService.update(cart);
        }
    }
}
