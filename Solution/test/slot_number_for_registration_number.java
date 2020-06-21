
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
public class slot_number_for_registration_number
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String message = "6";
    String message1 = "Not found";
    
    @Test
    public void testPrintMessage()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("getSlotNumberFromRegNo", String.class);
            String result=method.invoke(parkingLotInstance, "KA-01-HH-3141").toString();
            assertEquals(message, result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
