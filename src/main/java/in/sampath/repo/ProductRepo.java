package in.sampath.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.productEntity;

public interface ProductRepo extends JpaRepository<productEntity, Serializable> {

}
