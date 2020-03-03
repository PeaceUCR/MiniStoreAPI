package com.mini.store.demo.dao;

import com.mini.store.demo.model.ItemStock;

public interface ItemStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Mar 02 00:57:54 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Mar 02 00:57:54 CST 2020
     */
    int insert(ItemStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Mar 02 00:57:54 CST 2020
     */
    int insertSelective(ItemStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Mar 02 00:57:54 CST 2020
     */
    ItemStock selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Mar 02 00:57:54 CST 2020
     */
    int updateByPrimaryKeySelective(ItemStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Mar 02 00:57:54 CST 2020
     */
    int updateByPrimaryKey(ItemStock record);
}