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
            theCrops.setAcresOwned(2000);
            int toSell = 0;
            int price = 10;
            int expResult = 2000;
            int result = CropControl.sellLand(price, toSell, theCrops);
            assertEquals(expResult, result);
    }

 

    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int bushels = 3;
        int wheatForPeople = 3;
        CropData cropData = null;
        int wheatInStore = 10;
        int expResult = 7;
        int result = CropControl.feedPeople(bushels, wheatForPeople, cropData, wheatInStore);
        assertEquals(expResult, result);
       
    }
    
      @Test
    public void testFeedPeople1() {
        System.out.println("feedPeople");
        int bushels = 0;
        int wheatForPeople = 3;
        CropData cropData = null;
        int wheatInStore = 10;
        int expResult = 10;
        int result = CropControl.feedPeople(bushels, wheatForPeople, cropData, wheatInStore);
        assertEquals(expResult, result);

    }
    
      @Test
    public void testFeedPeople3() {
        System.out.println("feedPeople");
        int bushels = -3;
        int wheatForPeople = 3000;
        CropData cropData = null;
        int wheatInStore = 100000;
        int expResult = -1;
        int result = CropControl.feedPeople(bushels, wheatForPeople, cropData, wheatInStore);
        assertEquals(expResult, result);
    }
        @Test
    public void testFeedPeople4() {
        System.out.println("feedPeople");
        int bushels = 600;
        int wheatForPeople = 0;
        CropData cropData = null;
        int wheatInStore = 300;
        int expResult = -1;
        int result = CropControl.feedPeople(bushels, wheatForPeople, cropData, wheatInStore);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testFeedPeople5() {
        System.out.println("feedPeople");
        int bushels = 500;
        int wheatForPeople = 500;
        CropData cropData = null;
        int wheatInStore = 500;
        int expResult = 0;
        int result = CropControl.feedPeople(bushels, wheatForPeople, cropData, wheatInStore);
        assertEquals(expResult, result);
    }
}
