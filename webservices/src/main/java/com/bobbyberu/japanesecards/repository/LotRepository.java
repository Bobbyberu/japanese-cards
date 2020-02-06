package com.bobbyberu.japanesecards.repository;

import com.bobbyberu.japanesecards.models.Lot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotRepository extends CrudRepository<Lot, Integer> {

    Lot findFirstByOrderByCreationDateDesc();
}
