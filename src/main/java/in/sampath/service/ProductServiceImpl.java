package in.sampath.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.entity.productEntity;
import in.sampath.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;

	@Override
	public String upsert(productEntity product) {
		repo.save(product);
		return "success";
	}

	@Override
	public productEntity getById(Integer PId) {

		Optional<productEntity> byId = repo.findById(PId);

		if (byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public List<productEntity> getAllProducts() {
		List<productEntity> all = repo.findAll();
		return all;
	}

	@Override
	public String deleteById(Integer PId) {

		if (repo.existsById(PId)) {
			repo.deleteById(PId);
			return "Record Deleted success";
		} else {
			return "No records found";
		}

	}

}
