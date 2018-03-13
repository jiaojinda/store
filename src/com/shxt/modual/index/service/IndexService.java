package com.shxt.modual.index.service;

import java.util.List;

import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.index.model.Index;

/**
 * 主页，业务层接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:51:03
 * @description
 */
public interface IndexService {
    
    /**
     * 主页商品
     * @author
     * @date  下午7:50:46
     * @return List<Index>
     */
    List<Goods> list() ;

    /**
     * 购物车信息
     * @author
     * @date  下午7:50:46
     * @return List<Cart>
     */
    List<Cart> getCart(String c_id) ;

    /**
     * 主页布局
     *
     * @author
     * @date  下午6:14:37
     * @param id
     * @return Index
     */
    Index get();

}
