package com.shxt.modual.firstClass.dao;

import java.util.List;

import com.shxt.modual.firstClass.model.FirstClass;

/**
 * 一级分类，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface FirstClassDao {
    /**
     * 添加
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    void add(FirstClass f);

    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:01
     * @return List<FirstClass>
     */
    List<FirstClass> list();

    /**
     * 根据主键查询一条数据
     * @author
     * @date  下午6:13:42
     * @param id
     * @return FirstClass;
     */
    FirstClass get(String f_id);

    /**
     * 判断名称是否重复
     * @author
     * @date  下午6:13:42
     * @param account
     * @return FirstClass;
     */
    List<FirstClass> checkName(String name);

    /**
     * 修改一级分类
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    void update(FirstClass f);

    /**
     * 删除一级分类
     * @author
     * @date  下午6:13:42
     * @param id
     * @return FirstClass;
     */
    void delete(String f_id);
}
