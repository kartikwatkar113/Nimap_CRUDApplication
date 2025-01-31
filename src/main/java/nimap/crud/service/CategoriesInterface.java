package nimap.crud.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import nimap.crud.dto.CategoriesDTO;
import nimap.crud.model.Categories;

public interface CategoriesInterface {

	public  boolean  addCategories(CategoriesDTO dCtegoriesDTO);

	public boolean deleteCategoriesById(long id);

	public boolean updateCategories(CategoriesDTO categoriesDTO, long id);

	public Categories findbyCategoriesId(long id);

	Page<Categories> getAllCategories(Pageable pageable);
	
}
