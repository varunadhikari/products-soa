package com.product.service;

import com.product.entity.Order;
import com.product.entity.OrderDetail;
import com.product.entity.Product;
import com.product.mapper.OrderDetailMapper;
import com.product.mapper.OrderMapper;
import com.product.model.OrderDTO;
import com.product.repository.OrderRepository;
import com.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private EntityManager em;

    public OrderDTO save(OrderDTO orderDto) {
        Order entity = OrderMapper.INSTANCE.orderDTOToOrder(orderDto);
        entity.setOrderDetailList(OrderDetailMapper.INSTANCE.dtoListToEntityList(orderDto.getOrderDetailList()));
        if(!CollectionUtils.isEmpty(entity.getOrderDetailList())){
            entity.getOrderDetailList().forEach(o -> o.setOrder(entity));
        }
        return OrderMapper.INSTANCE.orderToOrderDTO(repository.save(entity));
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public OrderDTO findById(Integer id) {
        Order orderEntity = repository.findById(id).get();
        if(!CollectionUtils.isEmpty(orderEntity.getOrderDetailList())){
            List<Integer> productIds = orderEntity.getOrderDetailList().stream().map(OrderDetail::getProductId).collect(Collectors.toList());
            if(!CollectionUtils.isEmpty(productIds)){
               Map<Integer,Product> productsMap =  productRepository.findByIdIn(productIds).stream().collect(Collectors.toMap(Product::getId,p -> p));
                orderEntity.getOrderDetailList().forEach(o -> o.setProduct(productsMap.get(o.getProductId())));
            }
        }
        OrderDTO response = OrderMapper.INSTANCE.orderToOrderDTO(orderEntity);
        response.setOrderDetailList(OrderDetailMapper.INSTANCE.entityToDto(orderEntity.getOrderDetailList()));
        return response;
    }

    public OrderDTO update(OrderDTO orderDto, Integer id) {
        //OrderDTO data = findById(id);
        Order entity = OrderMapper.INSTANCE.orderDTOToOrder(orderDto);
        entity.getOrderDetailList().forEach( od ->{
            od.setOrder(entity);
        });
        return OrderMapper.INSTANCE.orderToOrderDTO(repository.saveAndFlush(entity));
    }

    public List<OrderDTO> findAllOrders(Integer days) {
        //List<Order> orders = repository.findAll();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Order> cq = cb.createQuery(Order.class);
        Root<Order> or = cq.from(Order.class);
        if(days!=0){
            Predicate datePredicate = cb.greaterThanOrEqualTo(or.get("orderDate"), LocalDate.now().minusDays(days));
            cq.where(datePredicate);
        }
        TypedQuery<Order> query = em.createQuery(cq);

        return OrderMapper.INSTANCE.orderListToOrderDTOList(query.getResultList());
    }

    public List<OrderDTO> findAllOrdersByUser(Integer days, String userId) {
        //List<Order> orders = repository.findByUserId(userId);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Order> cq = cb.createQuery(Order.class);
        Root<Order> or = cq.from(Order.class);
        if(days!=0){
            Predicate datePredicate = cb.greaterThanOrEqualTo(or.get("orderDate"), LocalDate.now().minusDays(days));
            cq.where(datePredicate);
        }
        Predicate idPredicate = cb.equal(or.get("userId"),userId);
        cq.where(idPredicate);
        TypedQuery<Order> query = em.createQuery(cq);
        return OrderMapper.INSTANCE.orderListToOrderDTOList(query.getResultList());
    }
}