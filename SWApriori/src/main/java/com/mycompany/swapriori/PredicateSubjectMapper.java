/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swapriori;

import java.util.List;

/**
 *
 * @author Leon
 */
public class PredicateSubjectMapper {
    int predicateId;
    List<String> subjectList;

    public PredicateSubjectMapper(int predicateId, List<String> subjectList) {
        this.predicateId = predicateId;
        this.subjectList = subjectList;
    }

    public int getPredicateId() {
        return predicateId;
    }

    public void setPredicateId(int predicateId) {
        this.predicateId = predicateId;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    
    
    
    
}
