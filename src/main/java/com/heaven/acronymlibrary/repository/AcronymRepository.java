package com.heaven.acronymlibrary.repository;

import com.heaven.acronymlibrary.models.Acronym;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AcronymRepository extends MongoRepository<Acronym,String> {

    Acronym findBy_id(ObjectId _id);

    Acronym findByacronymName(String name);


}
