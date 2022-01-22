package com.product.service;

import com.product.model.ProductDTO;
import com.product.entity.Product;
import com.product.mapper.ProductMapper;
import com.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO save(ProductDTO productDto) {
        Product entity = ProductMapper.INSTANCE.dtoToEntity(productDto);
        return ProductMapper.INSTANCE.entityToDTO(repository.save(entity));
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public ProductDTO findById(Integer id) {
        ProductDTO dto = ProductMapper.INSTANCE.entityToDTO(repository.findById(id).get());
        enrichProductDetails(Arrays.asList(dto));
        return dto;
    }

    public Page<ProductDTO> findByCondition(ProductDTO productDto, Pageable pageable) {
        Page<Product> entityPage = repository.findAll(pageable);
        List<Product> entities = entityPage.getContent();
        return new PageImpl<>(ProductMapper.INSTANCE.entityListToDTOList(entities), pageable, entityPage.getTotalElements());
    }

    public ProductDTO update(ProductDTO productDto, Integer id) {
        ProductDTO data = findById(id);
        Product entity = ProductMapper.INSTANCE.dtoToEntity(productDto);
        return save(ProductMapper.INSTANCE.entityToDTO(entity));
    }

    public List<ProductDTO> findAllProducts() {
        List<Product> products = repository.findAll();
        List<ProductDTO> productsDto = ProductMapper.INSTANCE.entityListToDTOList(products);
        enrichProductDetails(productsDto);
        return productsDto;
    }

    private void enrichProductDetails(List<ProductDTO> products) {
        for (ProductDTO product : products) {
            product.setCode(product.getName().substring(0,2).toUpperCase()+123);
            product.setBatch(product.getCode()+ LocalDate.now());
            product.setDealerPrice(product.getPrice()*1.30);
            product.setMrp(product.getPrice()*3);
        }
    }
}