/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swapriori;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Leon
 */
public class ConvertToObjectInfo {

    public Map<String, Multimap> convert(List<Triple> listOfTriples) {
        Map<String, Multimap> ObjectInfo = new LinkedHashMap(100);
        Map<String, Multimap> ObjectInfo1 = new LinkedHashMap(100);
        //List<Triple> listOfTriples = new ArrayList<>(100);
        Set<String> objectSet = new LinkedHashSet(100);
        for (Triple t : listOfTriples) {
            objectSet.add(t.object);
        }
        //System.out.println(objectSet);
        List<Triple> pullOut = null;

        //Multimap<String, String> multiMap = ArrayListMultimap.create();
        //remove all triples with some object
        for (String iterObject : objectSet) {
            Multimap<String, String> multiMap = ArrayListMultimap.create();
            Multimap<String, String> multiMap1 = ArrayListMultimap.create();
            for (Triple t1 : listOfTriples) {
                if (t1.getObject().equals(iterObject)) {
                    multiMap.put(t1.getPredicate(), t1.getSubject());
                    multiMap1.put(t1.getPredicate(), t1.getSubject());
                }
                //System.out.println(multiMap);
            }
            //System.out.println(multiMap);
            ObjectInfo.put(iterObject, multiMap1);
            ObjectInfo1 = new LinkedHashMap(ObjectInfo);
            //System.out.println(ObjectInfo);
            //System.out.println("Clearing");
            multiMap.clear();
        }
        //System.out.println(multiMap + " " + "final");
        //System.out.println(ObjectInfo1 + "Final");
        return ObjectInfo1;
    }
}
