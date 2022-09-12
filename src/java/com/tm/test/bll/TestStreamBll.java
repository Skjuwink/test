/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tm.test.bll;

/**
 *
 * @author RadimKindl
 */
public class TestStreamBll {
    
    //Stream neni datova struktura. Nemeni originalni data.  Kazda operaci vraci Stream so it can be pipelined.
    
    /*
    Intermediate Operations:
    
        map - vraci stream , ktery aplikuje funkci na prvky streamu
            List number = Arrays.asList(2,3,4,5);
            List square = number.stream().map(x->x*x).collect(Collectors.toList());
    
        filter - Vraci stream filtrovany dle argumentu
            List names = Arrays.asList("Reflection","Collection","Stream");
            List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
    
        sorted - sortuje stream
            List names = Arrays.asList("Reflection","Collection","Stream");
            List result = names.stream().sorted().collect(Collectors.toList());
    
    Terminal Operations:
    
        collect: Vrati stream s vysledky aplikovanymi na stream
            List number = Arrays.asList(2,3,4,5,3);
            Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
    
        forEach: iteruje pres vsechny elementy streamu
            List number = Arrays.asList(2,3,4,5);
            number.stream().map(x->x*x).forEach(y->System.out.println(y));
    
        reduce:
    */
}
