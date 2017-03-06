/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swapriori;

import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Leon
 */
public class Generate2LargeItemSets {

    public void generateLargeItemSets(Map<String, Multimap> ObjectInfo, float minSup) {
        List<String> objectSet = new ArrayList(ObjectInfo.keySet());
        //for each Ob1, ob2 in object info list
        for (int i = 0; i < objectSet.size(); i++) {
            for (int j = i + 1; j < objectSet.size(); j++) {
                System.out.println(objectSet.get(i) + " " + objectSet.get(j));
                
                //get list of predicate and corresponding subjects
                Multimap<String, String> predicateSubject1 = ObjectInfo.get(objectSet.get(i));
                Multimap<String, String> predicateSubject2 = ObjectInfo.get(objectSet.get(j));
                System.out.println(predicateSubject1);
                System.out.println(predicateSubject2);
                
                
                //get list of predicates to get subjects from Multimap
                List<String> predicateKeySet1 = new ArrayList(predicateSubject1.keySet());
                List<String> predicateKeySet2 = new ArrayList(predicateSubject2.keySet());
                
                //for each r1 in ob1
                for (int i1 = 0; i < predicateKeySet1.size(); i1++) {
                    // for each r2 in ob2
                    for (int j1 = 0; j < predicateKeySet2.size(); j1++) {
                        //get SS1 and SS2
                        Set<String> subjectList1 = new LinkedHashSet(predicateSubject1.get(predicateKeySet1.get(i1)));
                        Set<String> subjectList2 = new LinkedHashSet(predicateSubject2.get(predicateKeySet2.get(j1)));
                        
                        //get intersection of subject lists
                        subjectList1.retainAll(subjectList2);
                        
                        //get count of intersections
                        System.out.println(subjectList1.size());
                        int intersectionCount = subjectList1.size();
                    }
                }

            }
        }
    }

}
