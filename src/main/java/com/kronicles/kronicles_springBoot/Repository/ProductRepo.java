package com.kronicles.kronicles_springBoot.Repository;

import com.kronicles.kronicles_springBoot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ProductRepo implements JpaRepository<Product, Integer> {
}