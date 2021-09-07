package com.product.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="ORDERS")
public class Order {

	@Id
	@GeneratedValue(generator="ORDER_SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="ORDER_SEQ",sequenceName="ORDER_SEQ", allocationSize = 1)
	@Column(name = "ORDER_ID")
	private Integer id;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "ORDER_DATE")
	private Date orderDate;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	
	@Column(name = "TAX")
	private Double tax;
	
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetailList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
}
