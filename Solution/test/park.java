
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
public class park
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    String message = "Allocated slot number: ";
    
    @Test
    public synchronized void test1()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("park", String.class, String.class);
            String result = method.invoke(parkingLotInstance, "KA-01-HH-1234", "White").toString();
            assertEquals(message + (1), result);
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
            String result = method.invoke(parkingLotInstance, "KA-01-HH-9999", "White").toString();
            assertEquals(message + (2), result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public synchronized void test3()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("park", String.class, String.class);
            String result = method.invoke(parkingLotInstance, "KA-01-BB-0001", "Black").toString();
            assertEquals(message + (3), result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public synchronized void test4()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("park", String.class, String.class);
            String result = method.invoke(parkingLotInstance, "KA-01-HH-7777", "Red").toString();
            assertEquals(message + (4), result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public synchronized void test5()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("park", String.class, String.class);
            String result = method.invoke(parkingLotInstance, "KA-01-HH-2701", "Blue").toString();
            assertEquals(message + (5), result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public synchronized void test6()
    {
        try
        {
            Method method = ParkingLotInstance.class.getMethod("park", String.class, String.class);
            String result = method.invoke(parkingLotInstance, "KA-01-HH-3141", "Black").toString();
            assertEquals(message + (6), result);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
