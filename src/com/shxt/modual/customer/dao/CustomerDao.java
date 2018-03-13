package com.shxt.modual.customer.dao;

import java.util.List;

import com.shxt.modual.customer.model.Customer;

/**
 * 用户，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface CustomerDao {
    /**
     * 添加
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    void add(Customer c);
    
    /**
     * 登录
     * @author
     * @date  下午6:13:42
     * @param account
     * @return Customer;
     */
    Customer check(String account);
    
    /**
     * 根据主键查询一条数据
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Customer;
     */
    Customer get(String c_id);
    
    /**
     * 判断账号是否重复
     * @author
     * @date  下午6:13:42
     * @param account
     * @return Customer;
     */
    List<Customer> checkAccount(String account);
    
    /**
     * 修改用户
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    void update(Customer c);
    
    /**
     * 修改密码
     * @author
     * @date  下午6:30:00
     * @param c void
     */
    void pswUpdate(Customer c);
    
    /**
     * 查看用户
     * @author
     * @date  下午7:50:01
     * @return List<Customer>
     */
    List<Customer> list();
    
    /**
     * 查看隐藏用户
     * @author
     * @date  下午7:50:01
     * @return List<Customer>
     */
    List<Customer> hiddenList();
    
    /**
     * 隐藏用户
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Customer;
     */
    void hide(String c_id);
    
    /**
     * 恢复用户
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Customer;
     */
    void recover(String c_id);
    
    /**
     * 删除用户
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Customer;
     */
    void delete(String c_id);
}
