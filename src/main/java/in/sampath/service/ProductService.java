package in.sampath.service;

import java.util.List;

import in.sampath.entity.productEntity;

public interface ProductService {

	public String upsert(productEntity product);
	
	public productEntity getById(Integer PId);
	
	public List<productEntity> getAllProducts();
	
	public String deleteById(Integer PId);
	
	
}
