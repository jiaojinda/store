package com.shxt.modual.classes.dao;

import java.util.List;

import com.shxt.modual.classes.model.Classes;

/**
 * 二级分类，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface ClassesDao {

    /**
     * 查看二级分类
     * @author
     * @date  下午7:50:01
     * @return List<Classes>
     */
    List<Classes> secondClassList();
    
    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:01
     * @return List<Classes>
     */
    List<Classes> firstClassList();
}
