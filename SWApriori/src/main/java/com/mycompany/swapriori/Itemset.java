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
public class Itemset {
    List<Items> listOfItems;
    float support;

    public Itemset(List<Items> listOfItems, float support) {
        this.listOfItems = listOfItems;
        this.support = support;
    }

    public List<Items> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<Items> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public float getSupport() {
        return support;
    }

    public void setSupport(float support) {
        this.support = support;
    }
}
