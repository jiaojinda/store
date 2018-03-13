package com.shxt.modual.cart.dao;

import java.util.List;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.goods.model.Goods;

/**
 * 购物车，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface CartDao {
    /**
     * 添加购物车
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    void add(Cart c);

    /**
     * 查看购物车
     * @author
     * @date  下午7:50:01
     * @return List<Goods>
     */
    List<Goods> list(String c_id);
    
    /**
     * 查看地址
     * @author
     * @date  下午7:50:01
     * @return List<Address>
     */
    List<Address> addressList(String c_id);

    /**
     * 查询购物车
     * @author
     * @date  下午6:14:37
     * @return Cart
     */
    Cart  get(Cart c) ;

    /**
     * 修改购物车
     * @author
     * @date  下午6:30:00
     */
    void update(Cart c);

    /**
     * 清空购物车
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Cart;
     */
    void delete(String  c_id);

    /**
     * 删除购物车
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Cart;
     */
    void delete(Cart c);
}
