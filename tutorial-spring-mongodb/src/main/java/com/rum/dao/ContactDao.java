package com.rum.dao;


import com.rum.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDao {

    @Autowired
    private MongoOperations mongoOperations;

    public void save(Contact contact){
        mongoOperations.save(contact);
    }

    public Contact get(String id){
        return mongoOperations.findOne(Query.query(Criteria.where("id").is(id)),Contact.class);
    }

    public List<Contact> getAll(){
        return mongoOperations.findAll(Contact.class);
    }




}
