package com.manhlee.productspringmvc.repository;

import com.manhlee.productspringmvc.entities.ImageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<ImageEntity, Integer> {
}
