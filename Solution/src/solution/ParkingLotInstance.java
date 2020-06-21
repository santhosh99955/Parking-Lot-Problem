/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author Welcome
 */
import java.util.*;

public class ParkingLotInstance
{

    static int SLOTS = 0;
    static ParkingLot parking_instances;

    public String createParkingLot(String lotCount)
    {
        String ret_data = "";
        try
        {
            SLOTS = Integer.parseInt(lotCount);
        } catch (Exception e)
        {
            ret_data = "Invalid input";
        }

        parking_instances = new ParkingLot();

        for (int i = 1; i <= SLOTS; i++)
        {
            parking_instances.getSlotListInstance().add(i);
        }

        ret_data = "Created a parking lot with " + lotCount + " slots";
        return ret_data;
    }

    public synchronized String park(String regNo, String color)
    {
        String ret_data = "";
        if (SLOTS < 1)
        {
            ret_data = "parking lot is not created";
        } else
        {
            if (parking_instances.getCarInstance().size() == SLOTS)
            {
                ret_data = "Sorry, parking lot is full";
            } else
            {
                String slot = parking_instances.getSlotListInstance().get(0).toString();
                Car car = new Car(regNo, color);
                parking_instances.getCarInstance().put(slot, car);
                parking_instances.getRegNoInstance().put(regNo, slot);
                if (parking_instances.getColorInstance().containsKey(color))
                {
                    ArrayList<String> regNoList = parking_instances.getColorInstance().get(color);
                    //colorMap.remove(color);
                    regNoList.add(regNo);
                    parking_instances.getColorInstance().put(color, regNoList);
                } else
                {
                    ArrayList<String> regNoList = new ArrayList<String>();
                    regNoList.add(regNo);
                    parking_instances.getColorInstance().put(color, regNoList);
                }
                ret_data = "Allocated slot number: " + slot;
                parking_instances.getSlotListInstance().remove(0);
            }
        }
        return ret_data;
    }

    public static String leave(String slotNo)
    {
        String ret_data = "";
        if (SLOTS == 0)
        {
            ret_data = "parking lot is not created";
        } else
        {
            if (parking_instances.getColorInstance().size() > 0)
            {
                Car remove = (parking_instances.getCarInstance()).get(slotNo);
                if (remove != null)
                {
                    parking_instances.getCarInstance().remove(slotNo);
                    parking_instances.getRegNoInstance().remove(remove.regNo);
                    ArrayList<String> regNoList = parking_instances.getColorInstance().get(remove.color);
                    if (regNoList.contains(remove.regNo))
                    {
                        regNoList.remove(remove.regNo);
                    }
                    parking_instances.getSlotListInstance().add(Integer.parseInt(slotNo));
                    ret_data = "Slot number " + slotNo + " is free";
                } else
                {
                    ret_data = "Slot number " + slotNo + " empty";
                }
            } else
            {
                ret_data = "Parking lot is empty";
            }
        }
        return ret_data;
    }

    public static String status()
    {
        String ret_data = "";
        if (SLOTS == 0)
        {
            ret_data = "parking lot is not created";
        } else
        {
            if (parking_instances.getCarInstance().size() > 0)
            {
                ArrayList<String> status = new ArrayList<>();
                status.add(String.format("%-8s", "Slot No") + String.format("%-17s", "Registration No") + String.format("%-6s", "Color"));
                Car car;
                for (int i = 1; i <= SLOTS; i++)
                {
                    String key = Integer.toString(i);
                    if (parking_instances.getCarInstance().containsKey(key))
                    {
                        car = parking_instances.getCarInstance().get(key);
                        status.add(String.format("%-8s", i) + String.format("%-17s", car.regNo) + String.format("%-6s", car.color));
                        //status.add(i + "\t" + car.regNo + "\t" + car.color);
                    }
                }
                ret_data = String.join("\n", status);
            } else
            {
                ret_data = "Parking lot is empty";
            }
        }
        return ret_data;
    }

    public static String getRegistrationNumbersFromColor(String color)
    {
        String ret_data = "";
        if (SLOTS == 0)
        {
            ret_data = "parking lot is not created";
        } else
        {
            if (parking_instances.getColorInstance().containsKey(color))
            {
                ArrayList<String> regno = new ArrayList<>();
                for (int i = 0; i < parking_instances.getColorInstance().get(color).size(); i++)
                {
                    regno.add(parking_instances.getColorInstance().get(color).get(i));
                }
                ret_data = String.join(", ", regno);
            } else
            {
                ret_data = "Not found";
            }
        }
        return ret_data;
    }

    public static String getSlotNumbersFromColor(String color)
    {
        String ret_data = "";
        if (SLOTS == 0)
        {
            ret_data = "parking lot is not created";
        } else
        {
            if (parking_instances.getColorInstance().containsKey(color))
            {
                ArrayList<String> regNoList = parking_instances.getColorInstance().get(color);
                ArrayList<Integer> slotList = new ArrayList<Integer>();
                ArrayList<String> slotListId = new ArrayList<>();

                for (int i = 0; i < regNoList.size(); i++)
                {
                    slotList.add(Integer.valueOf(parking_instances.getRegNoInstance().get(regNoList.get(i))));
                }
                for (int j = 0; j < slotList.size(); j++)
                {
                    slotListId.add(slotList.get(j) + "");
                }
                ret_data = String.join(", ", slotListId);
            } else
            {
                ret_data = "Not found";
            }
        }
        return ret_data;
    }

    public static String getSlotNumberFromRegNo(String regNo)
    {
        String ret_data = "";
        if (SLOTS == 0)
        {
            ret_data = "parking lot is not created";
        } else
        {
            if (parking_instances.getRegNoInstance().containsKey(regNo))
            {
                ret_data = parking_instances.getRegNoInstance().get(regNo);
            } else
            {
                ret_data = "Not found";
            }
        }
        return ret_data;
    }
}
