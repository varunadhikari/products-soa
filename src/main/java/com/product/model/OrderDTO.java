package com.product.model;

import com.product.repository.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class OrderDTO {

	private Integer id;
	private String userId;
	private LocalDate orderDate;
	private OrderStatus status;
	private Double totalAmount;
	private Double tax;
    private List<OrderDetailDTO> orderDetailList;

}
