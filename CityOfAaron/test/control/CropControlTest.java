/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import byui.cit260.CityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
        public void testSellLand()
        {
            System.out.println("sellLand");
            CropData theCrops = new CropData();
            theCrops.setWheatInStore(1000);
            theCrops.setAcresOwned(2800);
            int toSell = 10;
            int price = 20;
            int expResult = 2790;
            int result = CropControl.sellLand(price, toSell, theCrops);
            assertEquals(expResult, result);
    }
   
        //Test Input 2
        @Test
        public void testSellLand2()
        {
            System.out.println("sellLand2");
            CropData theCrops = new CropData();
            theCrops.setWheatInStore(1000);
            theCrops.setAcresOwned(2800);
            int toSell = (-5);
            int price = 20;
            int expResult = (-1);
            int result = CropControl.sellLand(price, toSell, theCrops);
            assertEquals(expResult, result);
    }
         //Test Input 3
        @Test
        public void testSellLand3()
        {
            System.out.println("sellLand3");
            CropData theCrops = new CropData();
            theCrops.setWheatInStore(1000);
            theCrops.setAcresOwned(2800);
            int toSell = 3000;
            int price = 20;
            int expResult = (-1);
            int result = CropControl.sellLand(price, toSell, theCrops);
            assertEquals(expResult, result);
    }
         //Test Input 4
        @Test
        public void testSellLand4()
        {
            System.out.println("sellLand4");
            CropData theCrops = new CropData();
            theCrops.setWheatInStore(1000);
            theCrops.setAcresOwned(2000);
            int toSell = 2000;
            int price = 10;
            int expResult = 0;
            int result = CropControl.sellLand(price, toSell, theCrops);
            assertEquals(expResult, result);
    }
 //Test Input boundary
        @Test
        public void testSellLandBoundary()
        {
            System.out.println("sellLandBoundary");
            CropData theCrops = new CropData();
            theCrops.setWheatInStore(1000);
            theCrops.setAcresOwned(2800);
            int toSell = (-5);
            int price = 20;
            int expResult = (-1);
            int result = CropControl.sellLand(price, toSell, theCrops);
            assertEquals(expResult, result);
    }
      
    
}
