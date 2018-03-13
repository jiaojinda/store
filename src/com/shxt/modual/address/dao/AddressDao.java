package com.shxt.modual.address.dao;

import java.util.List;

import com.shxt.modual.address.model.Address;
import com.shxt.modual.address.model.Place;

/**
 * 地址，数据访问层,接口
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:59:08
 * @description
 */
public interface AddressDao {
    /**
     * 添加
     * @author
     * @date  下午7:02:38
     * @param r void
     */
    void add(Address a);
    
    /**
     * 查看地址
     * @author
     * @date  下午7:50:01
     * @return List<Address>
     */
    List<Address> list(String c_id);

    /**
     * 查看省份
     * @author
     * @date  下午7:50:46
     * @return List<Place>
     */
    List<Place> provinceList() ;
    
    /**
     * 查看省份
     * @author
     * @date  下午7:50:46
     * @return List<Place>
     */
    List<Place> cityList(String p_id) ;

    /**
     * 获得id
     * @author
     * @date  下午7:50:01
     * @return List<Address>
     */
    List<Address> getId();
    
    /**
     * 删除地址
     * @author
     * @date  下午6:13:42
     * @param id
     * @return Address;
     */
    void delete(String a_id);
}
