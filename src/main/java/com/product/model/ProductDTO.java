package com.product.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class ProductDTO {

	private Integer id;
	private String name;
	private String company;
	private String description;
	private Double price;
	private Integer quantity;
	private String code;
	private String batch;
	private LocalDate mfgDate;
	private LocalDate expiryDate;
	private Double dealerPrice;
	private Double mrp;
}