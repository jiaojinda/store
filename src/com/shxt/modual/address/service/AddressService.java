package com.shxt.modual.address.service;

import java.util.List;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.address.model.Place;

/**
 * 地址，业务层接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:51:03
 * @description
 */
public interface AddressService {

    /**
     * 添加地址
     * @author
     * @date  下午6:52:28
     * @param e void
     */
    void add(Address a);

    /**
     * 查看地址
     * @author
     * @date  下午7:50:46
     * @return List<Address>
     */
    List<Address> list(String c_id) ;

    /**
     * 查看省份
     * @author
     * @date  下午7:50:46
     * @return List<Place>
     */
    List<Place> provinceList() ;

    /**
     * 删除地址
     * @author
     * @date  下午6:30:42
     * @param e void
     */
    void delete(String a_id);
    
    /**
     * 获得二级分类json
     * @author
     * @date  下午7:50:46
     * @return String
     */
    String cityList(String p_id) ;
}
