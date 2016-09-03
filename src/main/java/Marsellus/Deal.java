package Marsellus;

/**
 * Created by HP on 03.09.2016.
 */
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
        float moneyCost = Marsellus.Wallace.adjLocalRate*this.customer.pmtDelay-this.customer.factRate;
        float procsCost = this.customer.unitProcCost + Marsellus.Wallace.volProcCost;

        return qty*(price/(vatFactor)*(1-moneyCost)-cost/(vatFactor)-procsCost);
    }


}
