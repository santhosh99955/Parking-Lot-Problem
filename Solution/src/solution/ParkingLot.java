/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Welcome
 */
public class ParkingLot
{

    ParkingLot()
    {
        availableSlotList = new ArrayList<Integer>();
        carMap = new HashMap<String, Car>();
        reg_noMap = new HashMap<String, String>();
        colorMap = new HashMap<String, ArrayList<String>>();
    }
    private ArrayList<Integer> availableSlotList;
    private HashMap<String, Car> carMap;
    private HashMap<String, String> reg_noMap;
    private HashMap<String, ArrayList<String>> colorMap;

    ArrayList<Integer> getSlotListInstance()
    {
        return availableSlotList;
    }

    HashMap<String, Car> getCarInstance()
    {
        return carMap;
    }

    HashMap<String, String> getRegNoInstance()
    {
        return reg_noMap;
    }

    HashMap<String, ArrayList<String>> getColorInstance()
    {
        return colorMap;
    }
}
