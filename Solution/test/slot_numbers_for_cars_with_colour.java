
import java.lang.reflect.Method;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import solution.ParkingLotInstance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Welcome
 */
public class slot_numbers_for_cars_with_colour
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String message = "1, 2, 4";
    
    @Test
    public void testPrintMessage()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("getSlotNumbersFromColor", String.class);
            String result=method.invoke(parkingLotInstance, "White").toString();
            assertEquals(message, result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
