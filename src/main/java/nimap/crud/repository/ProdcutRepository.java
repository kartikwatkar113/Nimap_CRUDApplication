package nimap.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nimap.crud.model.Product;

public interface ProdcutRepository  extends JpaRepository<Product, Long>{

}
