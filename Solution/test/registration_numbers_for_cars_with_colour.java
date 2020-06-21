
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
public class registration_numbers_for_cars_with_colour
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String message = "KA-01-HH-1234, KA-01-HH-9999, KA-01-P-333";
    
    @Test
    public void testPrintMessage()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("getRegistrationNumbersFromColor", String.class);
            String result=method.invoke(parkingLotInstance, "White").toString();
            assertEquals(message, result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
