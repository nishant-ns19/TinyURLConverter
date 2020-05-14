package com.nishant.app;

import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class SpringConfig {
    @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(MongoClients.create(),"webApp");
    }
}
