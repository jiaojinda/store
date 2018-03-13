package com.shxt.modual.firstClass.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shxt.base.dao.impl.BaseDaoImpl;
import com.shxt.modual.firstClass.dao.FirstClassDao;
import com.shxt.modual.firstClass.model.FirstClass;

/**
 * 一级分类，数据访问层，实现类
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:58:55
 * @description
 */
@Repository("firstClassDao")
public class FirstClassDaoImpl extends BaseDaoImpl implements FirstClassDao {

    /**
     * 添加
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    @Override
    public void add(FirstClass f) {
        SqlSession session = getSqlSession();

        session.insert(FirstClass.class.getName() + ".add", f);
    }

    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:01
     * @return List<FirstClass>
     */
    @Override
    public List<FirstClass> list() {
        SqlSession session = getSqlSession();

        List<FirstClass> list = session.selectList(FirstClass.class.getName() + ".list");
        return list;
    }

    /**
     * 根据主键查询一条数据
     * @author
     * @date  下午6:13:42
     * @param id
     * @return FirstClass
     */
    @Override
    public FirstClass get(String f_id) {
        SqlSession session = getSqlSession();
        FirstClass f = session.selectOne(FirstClass.class.getName() + ".get", f_id);
        return f;
    }

    /**
     * 判断账是否重复
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    @Override
    public List<FirstClass> checkName(String name) {
        SqlSession session = getSqlSession();

        List<FirstClass> list = session.selectList(FirstClass.class.getName() + ".check",name);
        return list;
    }

    /**
     * 修改一级分类
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    @Override
    public void update(FirstClass f) {
        SqlSession session = getSqlSession();

        session.update(FirstClass.class.getName() + ".update", f);
    }

    /**
     * 删除一级分类
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    @Override
    public void delete(String f_id) {
        SqlSession session = getSqlSession();
        session.delete(FirstClass.class.getName() + ".delete", f_id);
    }
}
