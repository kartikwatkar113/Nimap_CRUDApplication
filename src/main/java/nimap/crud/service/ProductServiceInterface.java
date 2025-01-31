package nimap.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import nimap.crud.dto.ProdcutDTO;
import nimap.crud.model.Product;

public interface ProductServiceInterface {

	public boolean addProductDetails(ProdcutDTO prodcutDTO);

	Page<Product> getAllProducts(Pageable pageable);

	public Optional<Product> findByProductId(long id);

	public boolean deleteByProductId(long id);


   
}
