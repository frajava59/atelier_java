/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class VariablesTest {

//    @Test
//    public void testVariablesObjets () {
//        // on teste
//        String txt1 = new String("couCOU");
//        String txt2 = new String("CouCOU");
//        
//        System.out.println(txt1);
//        System.out.println(txt2);
//        
//        Boolean b;
//        if (txt1.toUpperCase() == txt2.toUpperCase()) {
//            b= true;
//            System.out.println("b est à true");
//        }
//    }
//    
//    @Test
//    public void test1 () {
//        String a = "Jamaique";
//        String b = "Kingston";
//        
//        System.out.println(b.toUpperCase() + ", " + a.toUpperCase());
//    }
//    
//    @Test
//    public void test2 () {
//        int a = 123;
//        int a2 = 12;
//        String b = "Coucou",c,d;
//        c = a+a2 + " "+ b;
//        d = b + a;
//        
//        System.out.println(c);
//        System.out.println(d);
//        
//    }
//
//        @Test
//    public void test3 () {
//        String a = "123";
//        int b = 12;
//        int c;
//        c = b + Integer.parseInt(a);
//        System.out.println(c);
//    }
    public int puiss(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b > 1) {
            return a * puiss(a, b - 1);
        } else {
            return a;
        }
    }

//    @Test
//    // test fonction puissance
//    public void testPuiss () {
//        System.out.println(puiss(0,0));
//        System.out.println(puiss(0,4));
//        System.out.println(puiss(4,0));
//        System.out.println(puiss(4,2));
//        System.out.println(puiss(2,3));
//        System.out.println(puiss(5,2));
//    }
    public class CPasBonException extends Exception {

        public CPasBonException(String s) {
            super(s);
        }
        
       public CPasBonException() {
            super();
        }
    }

    public int fact(int x) throws CPasBonException 
    {
        if (x < 0) {
            throw new CPasBonException("C'est pas bon du tout, cherchez vous-même");
            //throw new Exception();
        }
        if (x <= 1) {
            return 1;
        }
        if (x > 1) {
            return x * fact(x - 1);
        }
        return 0;
    }

    @Test
    // test fonction fact
    public void testFact() throws Exception {
        //try {
            System.out.println(fact(-5));
        /* } 
        catch (CPasBonException e)
        {
            System.out.println("erreur");
        }*/
    }
    
    public int carre(int i) {
        return i*i;
    }
    
   

}
