/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tm.test.bll;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author RadimKindl
 */
public class TestIteratorBll {
    //Iterator prochazi data kolekce, umi porovnat objekty, odtranovat objekty...
    
    public ArrayList<Integer> iterateAndUpdateToSquare(ArrayList<Integer> testList) throws Exception {        
        
        ArrayList<Integer> testList1 = new ArrayList();
        Iterator <Integer> intIterator = testList.iterator();
        
        while (intIterator.hasNext()) {
            int i = intIterator.next();
            testList1.add(i*1);
        }
        
        return testList1;
    }
    
}
