package com.product.entity;

import com.product.repository.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="ORDERS")
@Getter
@Setter
public class Order {

	@Id
	@GeneratedValue(generator="ORDER_SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="ORDER_SEQ",sequenceName="ORDER_SEQ", allocationSize = 1)
	@Column(name = "ORDER_ID")
	private Integer id;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "ORDER_DATE")
	private LocalDate orderDate;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;
	
	@Column(name = "TAX")
	private Double tax;
	
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetailList;

}
