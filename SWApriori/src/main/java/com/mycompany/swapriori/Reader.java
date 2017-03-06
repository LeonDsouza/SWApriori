/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swapriori;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leon
 */
public class Reader {
    public List<Triple> readCsv() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/leons/Desktop/sample1.csv"));
        String s = br.readLine();
        List<Triple> listOfTriples = new ArrayList<>(100);
        while (s != null && s.length() != 0) {
            String[] splitArray = s.split(",");
            listOfTriples.add(new Triple(splitArray[0], splitArray[1], splitArray[2]));
            s = br.readLine();
        }
        //System.out.println(listOfTriples.size());
        return listOfTriples;
    }
}
