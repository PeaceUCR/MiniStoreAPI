package com.mini.store.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Order {

    private Delivery delivery;
    private List<OrderItemAssociation> orderItemAssociationList;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.total_amount
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private Long totalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.discount
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private Long discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.create_date
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.update_date
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.status
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.tracking_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    private String trackingId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_id
     *
     * @return the value of orders.order_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_id
     *
     * @param orderId the value for orders.order_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.total_amount
     *
     * @return the value of orders.total_amount
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.total_amount
     *
     * @param totalAmount the value for orders.total_amount
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.discount
     *
     * @return the value of orders.discount
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public Long getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.discount
     *
     * @param discount the value for orders.discount
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.create_date
     *
     * @return the value of orders.create_date
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.create_date
     *
     * @param createDate the value for orders.create_date
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.update_date
     *
     * @return the value of orders.update_date
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.update_date
     *
     * @param updateDate the value for orders.update_date
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.status
     *
     * @return the value of orders.status
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.status
     *
     * @param status the value for orders.status
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.tracking_id
     *
     * @return the value of orders.tracking_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.tracking_id
     *
     * @param trackingId the value for orders.tracking_id
     *
     * @mbg.generated Thu Apr 02 21:30:14 CST 2020
     */
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId == null ? null : trackingId.trim();
    }
}
