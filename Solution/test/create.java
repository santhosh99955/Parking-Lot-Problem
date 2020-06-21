
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
public class create
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String message = "Created a parking lot with 6 slots";
    
    @Test
    public void testPrintMessage()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("createParkingLot", String.class);
            String result=method.invoke(parkingLotInstance, "6").toString();
            assertEquals(message, result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
