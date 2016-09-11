package Marsellus;

import javax.swing.*;
import java.util.*;

/**
 * Created by HP on 28.08.2016.
 */

/**
 * This is a simple plan for computer related stuff wholesaler. It transforms consumption requests from customers of
 * different levels to purchase plan. Some basic production, logistic and financial conditions are considered at the
 * beginning of this small tutorial project. An attempt to consider end-user behaviour is also made.
 *
 * We are a wholesaler who tries to run an eye over our plan of importing electronic goods. We will try to account
 * profits and expenses.
 */

public class Marsellus {

    public static void main(String[] args)
    {
        Wallace marcellus = new Wallace();

        JFrame mainForm = new JFrame();


    }

    public static class Wallace
    {
        public static float adjLocalRate;
        public static float adjIntnlRate;
        public static float volProcCost;
    }





    public class ItemGroup
    {
        String name;
        float vatPrc;
        int prodTime;
        float tollPrc;
    }

    private class Container
    {
        private List<Container> contMap = new ArrayList<Container>();
    }

    public class Dimension
    {
        float width;
        float length;
        float height;
    }




    /**
     * Each deal is sorted through freightage process backwards
     * Freight cost is summed and have not to exceed coef * Pe
     *
     */


    public static double getFwdEffect()
    {
        // cost*qty*intlIntRate*fracPayedFOB*(Underway - GracePriuod) + FwdRate*Volume + Insurance
        return 0;
    }

    public static double finalRealProfit()
    {
        //Pe - CustomClearanceRate*Cost*Qty - localInboundRate*Vol - chosenFwdEffect
        return 0;
    }

    public static void stockBusynessCount(HashSet<Order> deals, HashMap<Date,Float> busySched)
    {

    }

}
