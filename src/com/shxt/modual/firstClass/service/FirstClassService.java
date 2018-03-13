package com.shxt.modual.firstClass.service;

import java.util.List;

import com.shxt.modual.firstClass.model.FirstClass;

/**
 * 一级分类，业务层接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:51:03
 * @description
 */
public interface FirstClassService {

    /**
     * 添加一级分类
     * @author
     * @date  下午6:52:28
     * @param e void
     */
    void add(FirstClass f);

    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:46
     * @return List<FirstClass>
     */
    List<FirstClass> list() ;

    /**
     * 根据主键查询一级分类
     * @author
     * @date  下午6:14:37
     * @param id
     * @return FirstClass
     */
    FirstClass get(String f_id) ;

    /**
     * 修改一级分类
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void update(FirstClass f);

    /**
     * 删除一级分类
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void delete(String f_id);

    /**
     * 验证名称
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    String checkName(String name);
}
