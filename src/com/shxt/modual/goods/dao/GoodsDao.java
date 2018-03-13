package com.shxt.modual.goods.dao;

import java.util.List;

import com.shxt.base.util.Page;
import com.shxt.modual.classes.model.Classes;
import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.goods.model.Select;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 商品，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface GoodsDao {
    
    /**
     * 查看商品
     * @author
     * @date  下午7:50:01
     * @return List<Goods>
     */
    List<Goods> list();
    
    /**
     * 分页查看读者
     * @author 韩老师
     * @date  下午7:50:01
     * @return List<Reader>
     */
    List<Goods> page(Page page,Select s);
    
    /**
     * 根据主键查询一条数据
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Goods;
     */
    Goods get(String g_id);
    
    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:01
     * @return List<Classes>
     */
    List<Classes> firstClassList();

    /**
     * 查看二级分类
     * @author
     * @date  下午7:50:01
     * @return List<Classes>
     */
    List<Classes> secondClassList(String f_id);
    
    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:01
     * @return List<FirstClass>
     */
    List<FirstClass> b_firstClassList();
    
    /**
     * 查看二级分类
     * @author
     * @date  下午7:50:01
     * @return List<SecondClass>
     */
    List<SecondClass> b_secondClassList(String f_id);
    
    /**
     * 获得f_id
     * @author
     * @date  下午7:50:01
     * @return String
     */
    String getF_id(String g_id);
    
    /**
     * 添加
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    void add(Goods g);
    
    /**
     * 查看隐藏商品
     * @author
     * @date  下午7:50:01
     * @return List<Goods>
     */
    List<Goods> hiddenList();
    
    
    /**
     * 获得id
     * @author
     * @date  下午6:13:42
     */
    Goods getId();
    
    
    /**
     * 修改商品
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    void update(Goods g);
    
    /**
     * 隐藏商品
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Goods;
     */
    void hide(String g_id);
    
    /**
     * 恢复商品
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Goods;
     */
    void recover(String g_id);
    
    /**
     * 删除商品
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Goods;
     */
    void delete(String g_id);
}
