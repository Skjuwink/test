/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tm.test.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 *
 * @author RadimKindl
 */
public class TestGeneratorBll implements IntSupplier{
    
    private int jj = 1;
    private int i = 1;
    
    @Override
    public int getAsInt(){
        i++;
        return i * i;
    }
    
    public int next() {
        this.i = this.i++;
        return i*i;
    }
    
    public List<Integer> generateNSquares(int n) {
        
        List<Integer> l = new ArrayList<>();
        
        for (int j = 0; j < n ; j++) {
            l.add(next());
        }
        
        return l;
    }
    
    public void test() {
        //IntStream - strema integeru
        //rangeClosed - nastavi rozsah
        IntStream.rangeClosed(1, 10).map(i -> i * i).forEach(System.out::println);
        
        //-----------------------------------------------------------------------------//
        
        IntStream myStream = IntStream.iterate(1, i -> i + 1);
        myStream.limit(10).map(i -> i * i).forEach(System.out::println);
        
        //-----------------------------------------------------------------------------//
        
        TestGeneratorBll sqSupplier = new TestGeneratorBll();
        IntStream myStream1 = IntStream.generate(sqSupplier);
        myStream.limit(10).forEach(System.out::println);
    }
    
}
