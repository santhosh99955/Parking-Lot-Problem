/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.HashMap;
import java.lang.reflect.Method;
import solution.ParkingLotInstance;

/**
 *
 * @author Welcome
 */
class ParkingLotObject
{

    static HashMap<String, Method> input;
    static Class clas = ParkingLotInstance.class;

    ParkingLotObject()
    {
        input = new HashMap<String, Method>();
        try
        {
            input.put("create_parking_lot", clas.getMethod("createParkingLot", String.class));
            input.put("park", clas.getMethod("park", String.class, String.class));
            input.put("leave", clas.getMethod("leave", String.class));
            input.put("status", clas.getMethod("status"));
            input.put("registration_numbers_for_cars_with_colour", clas.getMethod("getRegistrationNumbersFromColor", String.class));
            input.put("slot_numbers_for_cars_with_colour", clas.getMethod("getSlotNumbersFromColor", String.class));
            input.put("slot_number_for_registration_number", clas.getMethod("getSlotNumberFromRegNo", String.class));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
