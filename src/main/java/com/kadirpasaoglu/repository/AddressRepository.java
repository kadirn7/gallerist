package com.kadirpasaoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kadirpasaoglu.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{

}
