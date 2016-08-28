import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by HP on 28.08.2016.
 */
public class Marsellus {

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Wallace marcellus = new Wallace();
    }

    public static class Wallace
    {
        public static float adjLocalRate;
        public static float adjIntnlRate;
        public static float volProcCost;
    }

    public class Customer
    {
        int id;
        String name;
        int pmtDelay;
        float factRate;
        float unitProcCost;

    }

    public class Item
    {
        int id;
        String model;
        float malfRate;
        Dimension unitDim;
        float unitsPerMBox;
        Dimension mboxDim;
        String vendor;
        ItemGroup itemGroup;

        public float getPieceVol()
        {
            return 0.01f;
        }
    }

    public class ItemGroup
    {
        String name;
        float vatPrc;
        int prodTime;
        float tollPrc;
    }

    private class Dimension
    {
        float width;
        float length;
        float height;
    }

    public class Deal
    {
        Customer customer;
        Item item;
        float qty;
        float price;
        float cost;


        public double getEstimatedProfit()
        {
            float vatFactor = 1+this.item.itemGroup.vatPrc;
            float moneyCost = Wallace.adjLocalRate*this.customer.pmtDelay-this.customer.factRate;
            float procsCost = this.customer.unitProcCost + Wallace.volProcCost;

            return qty*(price/(vatFactor)*(1-moneyCost)-cost/(vatFactor)-procsCost);
        }


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

    public static void stockBusynessCount(HashSet<Deal> deals, HashMap<Date,Float> busySched)
    {

    }

}
