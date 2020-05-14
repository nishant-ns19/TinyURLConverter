package com.nishant.app;


import com.mongodb.client.MongoClients;
import org.bson.types.ObjectId;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Helper {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public Helper(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    public void saveToDB(URLs urLs)
    {
        mongoTemplate.save(urLs);
    }
    public URLs findById(String id)
    {
            ObjectId objectId = new ObjectId(id);
            URLs obj=null;
            obj= mongoTemplate.findById(objectId,URLs.class,"table");
            return obj;
    }
    public URLs findByUrl(String url)
    {
        Query query=new Query();
        query.addCriteria(Criteria.where("url").is(url));
        URLs obj=null;
        obj = mongoTemplate.findOne(query,URLs.class,"table");
        return obj;
    }
    public List<URLs> findAll()
    {
        return mongoTemplate.findAll(URLs.class,"table");
    }
}