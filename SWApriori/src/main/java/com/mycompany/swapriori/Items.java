/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swapriori;

/**
 *
 * @author Leon
 */
public class Items {
    String objectId;
    String predicateId;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getPredicateId() {
        return predicateId;
    }

    public void setPredicateId(String predicateId) {
        this.predicateId = predicateId;
    }

    public Items(String objectId, String predicateId) {
        this.objectId = objectId;
        this.predicateId = predicateId;
    }
    
    
    
}
