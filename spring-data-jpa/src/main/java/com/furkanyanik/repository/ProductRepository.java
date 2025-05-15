package com.furkanyanik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furkanyanik.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
