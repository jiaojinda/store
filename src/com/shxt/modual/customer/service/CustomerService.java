package com.shxt.modual.customer.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.shxt.modual.customer.model.Customer;

/**
 * 用户，业务层接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:51:03
 * @description
 */
public interface CustomerService {
    
    /**
     * 登录
     * @author
     * @date  下午6:52:28
     * @param account
     * @return Customer
     */
    Customer check(String account);
    
    /**
     * 添加用户
     * @author
     * @date  下午6:52:28
     * @param e void
     */
    void add(Customer c,MultipartFile photoFile,HttpServletRequest request);
    
    /**
     * 根据主键查询用户
     * @author
     * @date  下午6:14:37
     * @param id
     * @return Customer
     */
    Customer get(String c_id) ;
    
    /**
     * 修改用户
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void update(Customer c,MultipartFile photoFile,HttpServletRequest request);
    
    /**
     * 修改密码
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void pswUpdate(Customer c);
    
    /**
     * 验证账号
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    String checkAccount(String account);
    /**
     * 查看用户
     * @author
     * @date  下午7:50:46
     * @return List<Customer>
     */
    List<Customer> list() ;
    
    /**
     * 查看隐藏用户
     * @author
     * @date  下午7:50:46
     * @return List<Customer>
     */
    List<Customer> hiddenList() ;
    
    /**
     * 隐藏用户
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void hide(String c_id);
    
    /**
     * 恢复用户
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void recover(String c_id);
    
    /**
     * 删除用户
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void delete(String c_id);
}
