package com.shxt.modual.secondClass.dao;

import java.util.List;

import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 二级分类，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface SecondClassDao {
    /**
     * 添加
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    void add(SecondClass s);

    /**
     * 查看二级分类
     * @author
     * @date  下午7:50:01
     * @return List<SecondClass>
     */
    List<SecondClass> list();
    
    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:01
     * @return List<FirstClass>
     */
    List<FirstClass> firstClassList();
    /**
     * 根据主键查询一条数据
     * @author
     * @date  下午6:13:42
     * @param id
     * @return SecondClass;
     */
    SecondClass get(String s_id);

    /**
     * 判断名称是否重复
     * @author
     * @date  下午6:13:42
     * @param account
     * @return SecondClass;
     */
    List<SecondClass> checkName(String name);

    /**
     * 修改二级分类
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    void update(SecondClass s);

    /**
     * 删除二级分类
     * @author
     * @date  下午6:13:42
     * @param id
     * @return SecondClass;
     */
    void delete(String s_id);
}
