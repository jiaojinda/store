package com.shxt.modual.customer.service.impl;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shxt.base.util.FileUpload;
import com.shxt.modual.customer.dao.CustomerDao;
import com.shxt.modual.customer.model.Customer;
import com.shxt.modual.customer.service.CustomerService;

/**
 * 用户业务层实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:50:55
 * @description
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    /** 数据访问层 */
    @Autowired
    private CustomerDao customerDao;
    
    
    /**
     * 登录
     *
     * @author
     * @date  下午6:14:37
     * @param account
     * @return Customer
     */
    @Override
    public Customer check(String account) {
        return customerDao.check(account);
    }

    
    /**
     * 添加用户
     *
     * @author
     * @date  下午6:52:28
     * @param i void
     */
    @Override
    public void add(Customer c, MultipartFile photoFile, HttpServletRequest request) {
        // id
        c.setC_id(UUID.randomUUID().toString());
        // photo
        FileUpload fu = new FileUpload();
        String newFileName = fu.uploadFile(photoFile, request);
        c.setPhoto(newFileName);
        customerDao.add(c);
    }
    
    /**
     * 根据主键查询用户
     *
     * @author
     * @date  下午6:14:37
     * @param id
     * @return Customer
     */
    @Override
    public Customer get(String c_id) {
        return customerDao.get(c_id);
    }
    
    /**
     * 修改用户
     *
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    @Override
    public void update(Customer c, MultipartFile photoFile, HttpServletRequest request) {
        // photo
        FileUpload fu = new FileUpload();
        String newFileName = fu.uploadFile(photoFile, request);
        c.setPhoto(newFileName);
        customerDao.update(c);
    }

    /**
     * 修改密码
     *
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    @Override
    public void pswUpdate(Customer c) {
        customerDao.pswUpdate(c);
    }

    
    /**
     * AJAX验证名称
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    @Override
    public String checkAccount(String account) {
        if(customerDao.checkAccount(account).isEmpty()){
            return "{\"account\":\""+account+"\",\"m\":\""+1+"\"}";
        }else{
            return "{\"account\":\""+account+"\",\"m\":\""+0+"\"}";
        }
    }

    /**
     * 查看用户
     *
     * @author
     * @date  下午7:50:46
     * @return List<Customer>
     */
    @Override
    public List<Customer> list() {
        return customerDao.list();
    }
    
    /**
     * 查看隐藏用户
     *
     * @author
     * @date  下午7:50:46
     * @return List<Customer>
     */
    @Override
    public List<Customer> hiddenList() {
        return customerDao.hiddenList();
    }

    /**
     * 隐藏用户
     *
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    @Override
    public void hide(String c_id) {
        customerDao.hide(c_id);
    }

    /**
     * 恢复用户
     *
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    @Override
    public void recover(String c_id) {
        customerDao.recover(c_id);
    }

    /**
     * 删除用户
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    @Override
    public void delete(String c_id) {
        customerDao.delete(c_id);
    }
}
