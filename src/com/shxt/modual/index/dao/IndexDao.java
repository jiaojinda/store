package com.shxt.modual.index.dao;

import java.util.List;

import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.index.model.Index;

/**
 * 主页，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface IndexDao {

    /**
     * 查看主页
     * @author
     * @date  下午7:50:01
     * @return List<Index>
     */
    List<Goods> list();

    /**
     * 购物车信息
     * @author
     * @date  下午7:50:01
     * @return List<Cart>
     */
    List<Cart> getCart(String c_id);


    /**
     * 根据主键查询一条数据
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Index;
     */
    Index get();

}
