
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
public class leave
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String pos="4";
    String message = "Slot number "+pos+" is free";
    @Test
    public void testPrintMessage()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("leave", String.class);
            String result=method.invoke(parkingLotInstance, pos).toString();
            assertEquals(message, result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
