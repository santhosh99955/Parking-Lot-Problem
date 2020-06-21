/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Welcome
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner
{

    public static void main(String[] args)
    {
        create();
        park();
        leave();
        status();
        park2();
        registration_numbers_for_cars_with_colour();
        slot_numbers_for_cars_with_colour();
        slot_number_for_registration_number();
    }

    static void create()
    {
        Result result = JUnitCore.runClasses(create.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    static void park()
    {
        Result result = JUnitCore.runClasses(park.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    static void leave()
    {
        Result result = JUnitCore.runClasses(leave.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    static void status()
    {
        Result result = JUnitCore.runClasses(status.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    static void park2()
    {
        Result result = JUnitCore.runClasses(park2.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    static void registration_numbers_for_cars_with_colour()
    {
        Result result = JUnitCore.runClasses(registration_numbers_for_cars_with_colour.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    static void slot_numbers_for_cars_with_colour()
    {
        Result result = JUnitCore.runClasses(slot_numbers_for_cars_with_colour.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    static void slot_number_for_registration_number()
    {
        Result result = JUnitCore.runClasses(slot_number_for_registration_number.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
