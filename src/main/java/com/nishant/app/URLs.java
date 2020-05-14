package com.nishant.app;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "table")
public class URLs {
    @Id
    private String id;
    @Indexed(direction = IndexDirection.ASCENDING,unique = true)
    private String url;
    public URLs() {

    }
    @Override
    public String toString() {
        return "URLs{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    public URLs(String id, String url) {
        this.id = id;
        this.url = url;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
