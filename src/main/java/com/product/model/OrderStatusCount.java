package com.product.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderStatusCount {
    Integer approved = 0;
    Integer pending = 0;
    Integer rejected = 0;
    Integer total = 0;
}
