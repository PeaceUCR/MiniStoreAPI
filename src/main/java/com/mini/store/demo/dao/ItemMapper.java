package com.mini.store.demo.dao;

import com.mini.store.demo.model.Item;

public interface ItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Fri Mar 06 00:57:54 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Fri Mar 06 00:57:54 CST 2020
     */
    int insert(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Fri Mar 06 00:57:54 CST 2020
     */
    int insertSelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Fri Mar 06 00:57:54 CST 2020
     */
    Item selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Fri Mar 06 00:57:54 CST 2020
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Fri Mar 06 00:57:54 CST 2020
     */
    int updateByPrimaryKey(Item record);
}