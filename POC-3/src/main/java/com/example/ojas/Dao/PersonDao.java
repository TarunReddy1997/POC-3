package com.example.ojas.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ojas.modelClasses.Person;
@Repository
public interface PersonDao extends MongoRepository<Person,Integer> {


}
