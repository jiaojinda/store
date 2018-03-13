package com.shxt.modual.employee.dao;

import java.util.List;

import com.shxt.modual.employee.model.Employee;

/**
 * 员工，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface EmployeeDao {
    
    /**
     * 登录
     * @author
     * @date  下午6:13:42
     * @param account
     * @return Customer;
     */
    Employee check(String account);
    
    /**
     * 添加
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    void add(Employee e);
    
    /**
     * 查看员工
     * @author
     * @date  下午7:50:01
     * @return List<Employee>
     */
    List<Employee> list();
    
    /**
     * 查看隐藏员工
     * @author
     * @date  下午7:50:01
     * @return List<Employee>
     */
    List<Employee> hiddenList();
    
    
    /**
     * 根据主键查询一条数据
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Employee;
     */
    Employee get(String e_id);
    
    /**
     * 判断账号是否重复
     * @author
     * @date  下午6:13:42
     * @param account
     * @return Employee;
     */
    List<Employee> checkAccount(String account);
    
    /**
     * 修改员工
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    void update(Employee e);
    
    /**
     * 隐藏员工
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Employee;
     */
    void hide(String e_id);
    
    /**
     * 恢复员工
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Employee;
     */
    void recover(String e_id);
    
    /**
     * 删除员工
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Employee;
     */
    void delete(String e_id);
}
