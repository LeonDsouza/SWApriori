/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swapriori;

import com.google.common.collect.Multimap;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Leon
 */
public class SWapriori {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        List<Triple> listOfTriples = reader.readCsv();
        ConvertToObjectInfo convert = new ConvertToObjectInfo();
        Map<String, Multimap> ObjectInfo = convert.convert(listOfTriples);
        Generate2LargeItemSets generate = new Generate2LargeItemSets();
        generate.generateLargeItemSets(ObjectInfo, 0);
    }

//    public static void readDataFile() throws FileNotFoundException, IOException {
//        BufferedReader br = new BufferedReader(new FileReader("C:/Users/leons/Desktop/sample1.csv"));
//        String s = br.readLine();
////        List<String> subjectList;
////        HashMap<String, List<String>> list = new HashMap();
////        Map<String, Multimap> ObjectInfo = new LinkedHashMap(100);
////        Map<String, Multimap> ObjectInfo1 = new LinkedHashMap(100);
//        List<Triple> listOfTriples = new ArrayList<>(100);
//        while (s != null && s.length() != 0) {
//            String[] splitArray = s.split(",");
//            listOfTriples.add(new Triple(splitArray[0], splitArray[1], splitArray[2]));
//            s = br.readLine();
//        }
//        System.out.println(listOfTriples.size());
//
//        //make object list
////        Set<String> objectSet = new LinkedHashSet(100);
////        Set<String> predicateSet = new LinkedHashSet(10);
////        for (Triple t : listOfTriples) {
////            objectSet.add(t.object);
////        }
////        System.out.println(objectSet);
////        List<Triple> pullOut = null;
////
////        //Multimap<String, String> multiMap = ArrayListMultimap.create();
////        //remove all triples with some object
////        for (String iterObject : objectSet) {
////            Multimap<String, String> multiMap = ArrayListMultimap.create();
////            Multimap<String, String> multiMap1 = ArrayListMultimap.create();
////            for (Triple t1 : listOfTriples) {
////                if (t1.getObject().equals(iterObject)) {
////                    multiMap.put(t1.getPredicate(), t1.getSubject());
////                    multiMap1.put(t1.getPredicate(), t1.getSubject());
////                }
////                //System.out.println(multiMap);
////            }
////            System.out.println(multiMap);
////            ObjectInfo.put(iterObject, multiMap1);
////            ObjectInfo1 = new LinkedHashMap(ObjectInfo);
////            System.out.println(ObjectInfo);
////            System.out.println("Clearing");
////            multiMap.clear();
////        }
////        //System.out.println(multiMap + " " + "final");
////        System.out.println(ObjectInfo1 + "Final");
//    }

}
