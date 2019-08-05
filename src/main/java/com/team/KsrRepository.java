package com.team;

import com.team.Ksr;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KsrRepository extends MongoRepository<Ksr, String> {
  Ksr findBy_id(ObjectId _id);
}