
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
public class status
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String message = "Slot No Registration No  Color \n"
            + "1       KA-01-HH-1234    White \n"
            + "2       KA-01-HH-9999    White \n"
            + "3       KA-01-BB-0001    Black \n"
            + "5       KA-01-HH-2701    Blue  \n"
            + "6       KA-01-HH-3141    Black ";

    @Test
    public void testPrintMessage()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("status");
            String result = method.invoke(parkingLotInstance).toString();
            assertEquals(message, result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
