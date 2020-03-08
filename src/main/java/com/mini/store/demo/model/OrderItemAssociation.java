package com.mini.store.demo.model;

import java.util.Date;

public class OrderItemAssociation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_items.order_id
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_items.item_id
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    private Integer itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_items.quantity
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_items.create_date
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_items.update_date
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_items.order_id
     *
     * @return the value of orders_items.order_id
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_items.order_id
     *
     * @param orderId the value for orders_items.order_id
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_items.item_id
     *
     * @return the value of orders_items.item_id
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_items.item_id
     *
     * @param itemId the value for orders_items.item_id
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_items.quantity
     *
     * @return the value of orders_items.quantity
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_items.quantity
     *
     * @param quantity the value for orders_items.quantity
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_items.create_date
     *
     * @return the value of orders_items.create_date
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_items.create_date
     *
     * @param createDate the value for orders_items.create_date
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_items.update_date
     *
     * @return the value of orders_items.update_date
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_items.update_date
     *
     * @param updateDate the value for orders_items.update_date
     *
     * @mbg.generated Sun Mar 08 02:18:11 CST 2020
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}