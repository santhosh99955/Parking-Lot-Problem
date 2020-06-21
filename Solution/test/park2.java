
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
public class park2
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String message = "Allocated slot number: ";
    
    @Test
    public synchronized void test1()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("park", String.class, String.class);
            String result = method.invoke(parkingLotInstance, "KA-01-P-333", "White").toString();
            assertEquals("Allocated slot number: 4", result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public synchronized void test2()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("park", String.class, String.class);
            String result = method.invoke(parkingLotInstance, "DL-12-AA-9999", "White").toString();
            assertEquals("Sorry, parking lot is full", result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
