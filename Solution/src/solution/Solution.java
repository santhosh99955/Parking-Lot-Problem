/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.io.DataInputStream;
import java.lang.reflect.Method;

/**
 *
 * @author Welcome
 */
public class Solution
{

    static ParkingLotInstance parkingLotInstance = new ParkingLotInstance();
    static ParkingLotObject parkingLotObject;

    public static void main(String[] args)
    {
        DataInputStream in = new DataInputStream(System.in);
        parkingLotObject = new ParkingLotObject();
        while (true)
        {
            try
            {
                String inputString = in.readLine();
                if (inputString.equalsIgnoreCase("exit"))
                {
                    break;
                } else
                {
                    parseInput(inputString.split(" "));
                }

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    static void parseInput(String[] input) throws Exception
    {
        String command = input[0];
        Method method = parkingLotObject.input.get(command);
        switch (input.length)
        {
            case 1:
                System.out.println(method.invoke(parkingLotInstance));
                break;
            case 2:
                System.out.println(method.invoke(parkingLotInstance, input[1]));
                break;
            case 3:
                System.out.println(method.invoke(parkingLotInstance, input[1], input[2]));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
