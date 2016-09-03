package Marsellus;

/**
 * Created by HP on 03.09.2016.
 */
public class Item
{
    int id;
    String model;
    float malfRate;
    Marsellus.Dimension unitDim;
    float unitsPerMBox;
    Marsellus.Dimension mboxDim;
    String vendor;
    Marsellus.ItemGroup itemGroup;

    public float getPieceVol()
    {
        return 0.01f;
    }
}
