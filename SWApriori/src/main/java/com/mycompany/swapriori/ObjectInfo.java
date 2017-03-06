/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swapriori;

import java.util.LinkedList;

/**
 *
 * @author Leon
 */
public class ObjectInfo {
    int objectId;
    LinkedList<PredicateSubjectMapper> mapperList;

    public ObjectInfo(int objectId, LinkedList<PredicateSubjectMapper> mapperList) {
        this.objectId = objectId;
        this.mapperList = mapperList;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public LinkedList<PredicateSubjectMapper> getMapperList() {
        return mapperList;
    }

    public void setMapperList(LinkedList<PredicateSubjectMapper> mapperList) {
        this.mapperList = mapperList;
    }
    
}
