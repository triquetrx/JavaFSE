package com.cts.rainbowjewellers.test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

import com.cts.rainbowjewellers.service.*;
import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
    
    private double gram;
    private double expectedgoldprice;
    
    public RainbowJewellersParameterizedTest(double gram,double expectedgoldprice){
        this.gram=gram;
        this.expectedgoldprice=expectedgoldprice;
    }
    
    @Parameters
    public static Collection inputs(){
        return Arrays.asList(new Object[][]{
           {9.6,48401.76},
           {56,282343.6},
           {24.5,123525.325},
           {0,0.0},
           {-1,-5041.85}
        });
    }
    
    @Test
	public void testCalculateGoldPrice() {
	
	     //fill code here
		RainbowJewellersService rjs = new RainbowJewellersService();
		assertTrue(expectedgoldprice==rjs.calculategoldprice(gram));
	}

}
