package com.mini.store.demo.dao;

import com.mini.store.demo.model.User;

public interface UserMapper {
    User selectByName(String name);
    User selectByOpenId(String wechatOpenId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int updateByPrimaryKey(User record);
}
