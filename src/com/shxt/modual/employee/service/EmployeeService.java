package com.shxt.modual.employee.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.shxt.modual.employee.model.Employee;

/**
 * 员工，业务层接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:51:03
 * @description
 */
public interface EmployeeService {
    
    /**
     * 登录
     * @author
     * @date  下午6:52:28
     * @param account
     * @return Customer
     */
    Employee check(String account);
    
    /**
     * 添加员工
     *
     * @author
     * @date  下午6:52:28
     * @param e
     *            void
     */
    public void add(Employee e, MultipartFile photoFile, HttpServletRequest request) ;
    
    /**
     * 查看员工
     * @author
     * @date  下午7:50:46
     * @return List<Employee>
     */
    List<Employee> list() ;
    
    /**
     * 查看隐藏员工
     * @author
     * @date  下午7:50:46
     * @return List<Employee>
     */
    List<Employee> hiddenList() ;
    
    /**
     * 根据主键查询员工
     *
     * @author
     * @date  下午6:14:37
     * @param id
     * @return Employee
     */
    public Employee get(String e_id);
    
    /**
     * 修改员工
     *
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    public void update(Employee e, MultipartFile photoFile, HttpServletRequest request);
    
    /**
     * 修改员工信息
     *
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    public void updateInfo(Employee e, MultipartFile photoFile, HttpServletRequest request);
    
    /**
     * 隐藏员工
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void hide(String e_id);
    
    /**
     * 恢复员工
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void recover(String e_id);
    
    /**
     * 删除员工
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void delete(String e_id);
    
    /**
     * 获得账号
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    public String getAccount(String name);
}
