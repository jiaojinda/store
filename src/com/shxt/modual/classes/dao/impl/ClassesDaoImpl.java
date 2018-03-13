package com.shxt.modual.classes.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shxt.base.dao.impl.BaseDaoImpl;
import com.shxt.modual.classes.dao.ClassesDao;
import com.shxt.modual.classes.model.Classes;

/**
 * 二级分类，数据访问层，实现类
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:58:55
 * @description
 */
@Repository("classesDao")
public class ClassesDaoImpl extends BaseDaoImpl implements ClassesDao {

    /**
     * 查看二级分类
     * @author
     * @date  下午7:50:01
     * @return List<Classes>
     */
    @Override
    public List<Classes> secondClassList() {
        SqlSession session = getSqlSession();

        List<Classes> list = session.selectList(Classes.class.getName() + ".secondClassList");
        return list;
    }

    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:01
     * @return List<Classes>
     */
    @Override
    public List<Classes> firstClassList() {
        SqlSession session = getSqlSession();

        List<Classes> list = session.selectList(Classes.class.getName() + ".firstClassList");
        return list;
    }

}
