package com.pav.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pav.application.entity.Cart;
import com.pav.application.entity.Product;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	@Query(value = "select t2.* from cart_products as t1  inner join product as t2 on t1.product_id = t2.product_id where t1.cart_id=?1" , 
			  nativeQuery = true)
	List<Product> getProductFromCadrtId(long cartId);
	

}
