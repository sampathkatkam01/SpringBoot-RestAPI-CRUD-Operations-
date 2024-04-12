package in.sampath.Restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.sampath.entity.productEntity;
import in.sampath.service.ProductService;

@RestController
public class Controller {

	@Autowired
	private ProductService service;

	@PostMapping(value = "/product")
	public ResponseEntity<String> createproduct(@RequestBody productEntity product) {
		String status = service.upsert(product);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping(value = "/product/{PId}")
	public ResponseEntity<productEntity> getproduct(@PathVariable Integer PId) {

		productEntity byId = service.getById(PId);
		return new ResponseEntity<>(byId, HttpStatus.OK);
	}
	
	@GetMapping(value = "/products")
	public ResponseEntity<List<productEntity>> getAllProducts(){
		List<productEntity> allProducts = service.getAllProducts();
		return new ResponseEntity<>(allProducts,HttpStatus.OK);
	}
	
	@PutMapping(value = "/product")
	public ResponseEntity<String> updateproducts(@RequestBody productEntity prodcut){
		String upsert = service.upsert(prodcut);
		return new ResponseEntity<>(upsert,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/product/{PId}")
	public ResponseEntity<String> deleteproduct(@PathVariable Integer PId){
		String status = service.deleteById(PId);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}

}
