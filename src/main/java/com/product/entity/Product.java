package com.product.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@Data
public class Product {

	@Id
	@GeneratedValue(generator="PRODUCT_SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="PRODUCT_SEQ",sequenceName="PRODUCT_SEQ", allocationSize = 1)
	@Column(name = "PRODUCT_ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COMPANY")
	private String company;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CODE")
	private String code;

	@Column(name = "BATCH")
	private String batch;

	@Column(name = "MFG_DATE")
	private LocalDate mfgDate;

	@Column(name = "EXPIRY_DATE")
	private LocalDate expiryDate;

	@Column(name = "PRICE")
	private Double price;

	@Column(name = "DEALER_PRICE")
	private Double dealerPrice;

	@Column(name = "MRP")
	private Double mrp;

	@Column(name = "QUANTITY")
	private Integer quantity;

}