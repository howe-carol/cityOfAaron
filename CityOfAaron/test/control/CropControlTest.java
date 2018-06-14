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
    
    /**
     * Test of setOffering() method, of class CropControl.
     */
    @Test
        public void testsetOffering1()
        {
            System.out.println("setOffering1");
            CropData theCrops = new CropData();
            theCrops.setHarvest(100);
            int percent = 10;
            int expResult = 10;
            int result = CropControl.setOffering(percent, theCrops);
            assertEquals(expResult, result);
    }
    @Test
        public void testsetOffering2()
        {
            System.out.println("setOffering2");
            CropData theCrops = new CropData();
            theCrops.setHarvest(100);
            int percent = (-10);
            int expResult = -1;
            int result = CropControl.setOffering(percent, theCrops);
            assertEquals(expResult, result);
    }
    @Test
        public void testsetOffering3()
        {
            System.out.println("setOffering3");
            CropData theCrops = new CropData();
            theCrops.setHarvest(100);
            int percent = 0;
            int expResult = -1;
            int result = CropControl.setOffering(percent, theCrops);
            assertEquals(expResult, result);
    }
    @Test
        public void testsetOffering4()
        {
            System.out.println("setOffering4");
            CropData theCrops = new CropData();
            theCrops.setHarvest(100);
            int percent = 100;
            int expResult = 0;
            int result = CropControl.setOffering(percent, theCrops);
            assertEquals(expResult, result);
    }
        @Test
        public void testsetOfferingBoundary1()
        {
            System.out.println("setOfferingBoundary1");
            CropData theCrops = new CropData();
            theCrops.setHarvest(0);
            int percent = 0;
            int expResult = -1;
            int result = CropControl.setOffering(percent, theCrops);
            assertEquals(expResult, result);
    }
        @Test
        public void testsetOfferingBoundary2()
        {
            System.out.println("setOfferingBoundary2");
            CropData theCrops = new CropData();
            theCrops.setHarvest(1);
            int percent = 100;
            int expResult = 0;
            int result = CropControl.setOffering(percent, theCrops);
            assertEquals(expResult, result);
    }
    
     /**
     * Test of plantCrop method, of class CropControl.
     */
    @Test
    public void testPlantCrop() {
        System.out.println("plantCrop");
        int cropYield = 0;
        CropData cropData = null;
        int acresOwned = 0;
        int acresPlanted = 0;
        int expResult = 0;
        int result = CropControl.plantCrop(cropYield, cropData, acresOwned, acresPlanted);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testPlantCrop1() {
        System.out.println("PlantCrop1");
        int cropYield = 45;
        CropData cropData = null;
        int acresOwned = 500;
        int acresPlanted = 40;
        int expResult = -1;
        int result = CropControl.plantCrop(cropYield, cropData, acresOwned, acresPlanted);
        assertEquals(expResult, result);

    }
    
      @Test
    public void testPlantCrop3() {
        System.out.println("PlantCrop3");
        int cropYield = 550;
        CropData cropData = null;
        int acresOwned = 500;
        int acresPlanted = 25;
        int expResult = -1;
        int result = CropControl.plantCrop(cropYield, cropData, acresOwned, acresPlanted);
        assertEquals(expResult, result);
    }
        @Test
    public void testPlantCrop4() {
        System.out.println("PlantCrop4");
        int cropYield = 400;
        CropData cropData = null;
        int acresOwned = 500;
        int acresPlanted = 510;
        int expResult = -1;
        int result = CropControl.plantCrop(cropYield, cropData, acresOwned, acresPlanted);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testPlantCrop5() {
        System.out.println("PlantCrop5");
        int cropYield = 500;
        CropData cropData = null;
        int acresOwned = 500;
        int acresPlanted = 500;
        int expResult = 0;
        int result = CropControl.plantCrop(cropYield, cropData, acresOwned, acresPlanted);
        assertEquals(expResult, result);
    }
}
