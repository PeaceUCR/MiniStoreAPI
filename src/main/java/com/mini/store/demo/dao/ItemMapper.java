package com.mini.store.demo.dao;

import com.mini.store.demo.model.Item;

import java.util.List;
public interface ItemMapper {
    List<Item> listItem();
    List<Item> listItemWithLimit(Integer limit);
    List<Item> listItemByCategory(String category);
    List<Item> listItemByName(String itemName);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int deleteByPrimaryKey(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int insert(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int insertSelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    Item selectByPrimaryKey(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbg.generated Sun Mar 08 17:44:28 CST 2020
     */
    int updateByPrimaryKey(Item record);
}
