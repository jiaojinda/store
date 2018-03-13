package com.shxt.modual.goods.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.shxt.base.util.Page;
import com.shxt.modual.classes.model.Classes;
import com.shxt.modual.firstClass.model.FirstClass;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.goods.model.Select;
import com.shxt.modual.secondClass.model.SecondClass;

/**
 * 商品，业务层接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:51:03
 * @description
 */
public interface GoodsService {
    
    /**
     * 查看商品
     * @author
     * @date  下午7:50:46
     * @return List<Goods>
     */
    List<Goods> list() ;

    /**
     * 分页查看商品
     * @author
     * @date  下午7:50:46
     * @return List<Goods>
     */
    List<Goods> page(Page page,Select s) ;

    /**
     * 根据主键查询商品
     *
     * @author
     * @date  下午6:14:37
     * @param id
     * @return Goods
     */
    Goods get(String g_id);

    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:46
     * @return List<Classes>
     */
    List<Classes> firstClassList() ;

    /**
     * 获得二级分类json
     * @author
     * @date  下午7:50:46
     * @return String
     */
    String secondClassList(String f_id) ;

    /**
     * 查看一级分类
     * @author
     * @date  下午7:50:46
     * @return List<FirstClass>
     */
    List<FirstClass> b_firstClassList() ;

    /**
     * 查看二级分类
     * @author
     * @date  下午7:50:46
     * @return List<FirstClass>
     */
    List<SecondClass> getSecondClassList(String f_id) ;

    /**
     * 获得f_id
     * @author
     * @date  下午7:50:46
     * @return String
     */
    String  getF_id(String g_id) ;


    /**
     * 添加商品
     *
     * @author
     * @param photoFile3
     * @param photoFile2
     * @date  下午6:52:28
     * @param e
     *            void
     */
    void add(Goods g, MultipartFile photoFile, MultipartFile photoFile2, MultipartFile photoFile3, HttpServletRequest request) ;


    /**
     * 查看隐藏商品
     * @author
     * @date  下午7:50:46
     * @return List<Goods>
     */
    List<Goods> hiddenList() ;


    /**
     * 修改商品
     *
     * @author
     * @date  下午6:30:42
     * @param e
     *            void
     */
    void update(Goods g,MultipartFile photoFile1,MultipartFile photoFile2,MultipartFile photoFile3, HttpServletRequest request);

    /**
     * 隐藏商品
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void hide(String g_id);

    /**
     * 恢复商品
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void recover(String g_id);

    /**
     * 删除商品
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void delete(String g_id);
}
