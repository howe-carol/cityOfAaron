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
            int price = 15;
            int expResult = 2790;
            int result = CropControl.sellLand(price, toSell, theCrops);
            assertEquals(expResult, result);
    }
    
}
