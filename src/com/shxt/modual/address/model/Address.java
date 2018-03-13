package com.shxt.modual.address.model;

/**
 * 地址
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:47:34
 * @description
 */
/**
 * @author
 * @ClassName: Address
 * @Version 1.0
 * @Copyright
 * @date  下午6:12:21
 * @description
 */
public class Address {
    private Integer a_id;
    private String c_id;
    private String province;
    private String city;
    private String street;
    private String postcode;
    private String name;
    private String phone;
    public Integer getA_id() {
        return a_id;
    }
    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }
    public String getC_id() {
        return c_id;
    }
    public void setC_id(String c_id) {
        this.c_id = c_id;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Address [a_id=" + a_id + ", c_id=" + c_id + ", province=" + province + ", city=" + city + ", street="
                + street + ", postcode=" + postcode + ", name=" + name + ", phone=" + phone + "]";
    }
    
}
