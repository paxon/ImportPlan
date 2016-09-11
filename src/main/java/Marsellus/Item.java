package Marsellus;

/**
 * Created by HP on 03.09.2016.
 */
public class Item
{
    private long idItem;
    private String sku;
    private String model;
    private long itemGroup;
    private float malfRate;
    private float unitW;
    private float unitL;
    private float unitH;
    private int pcsMbox;
    private float mboxW;
    private float mboxL;
    private float mboxH;
    private int mboxPplt;

    public float getPieceVol()
    {
        return unitW*unitL*unitH;
    }
}
