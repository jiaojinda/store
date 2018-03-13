package com.shxt.modual.cart.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shxt.base.dao.impl.BaseDaoImpl;
import com.shxt.modual.address.model.Address;
import com.shxt.modual.cart.dao.CartDao;
import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.goods.model.Goods;

/**
 * 购物车，数据访问层，实现类
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:58:55
 * @description
 */
@Repository("cartDao")
public class CartDaoImpl extends BaseDaoImpl implements CartDao {
    
    /**
     * 添加购物车
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    @Override
    public void add(Cart c) {
        SqlSession session = getSqlSession();
        
        session.insert(Cart.class.getName() + ".add", c);
    }
    
    /**
     * 查看购物车
     * @author
     * @date  下午7:50:01
     * @return List<Goods>
     */
    @Override
    public List<Goods> list(String c_id) {
        SqlSession session = getSqlSession();
        
        List<Goods> list = session.selectList(Cart.class.getName() + ".list",c_id);
        return list;
    }

    /**
     * 查看地址
     * @author
     * @date  下午7:50:01
     * @return List<Address>
     */
    @Override
    public List<Address> addressList(String c_id) {
        SqlSession session = getSqlSession();
        
        List<Address> list = session.selectList(Address.class.getName() + ".list",c_id);
        return list;
    }
    
    /**
     * 查询购物车
     * @author
     * @date  下午6:14:37
     * @return Cart
     */
    @Override
    public Cart  get(Cart c) {
        SqlSession session = getSqlSession();
        Cart cart = session.selectOne(Cart.class.getName() + ".get", c);
        return cart;
    }
    
    /**
     * 修改购物车
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    @Override
    public void update(Cart c) {
        SqlSession session = getSqlSession();
        
        session.update(Cart.class.getName() + ".update", c);
    }
    
    /**
     * 清空购物车
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    @Override
    public void delete(String c_id) {
        SqlSession session = getSqlSession();
        session.delete(Cart.class.getName() + ".deleteAll",c_id);
    }
    
    /**
     * 删除购物车
     * @author
     * @date  下午6:30:00
     * @param r void
     */
    @Override
    public void delete(Cart c) {
        SqlSession session = getSqlSession();
        session.delete(Cart.class.getName() + ".delete",c);
    }
}
