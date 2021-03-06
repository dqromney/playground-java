package com.dqrapps.spring.data.dynamodb.repositories;

import com.dqrapps.spring.data.dynamodb.model.ProductInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface ProductInfoRepository extends CrudRepository<ProductInfo, String> {
    List<ProductInfo> findById(String id);
}
