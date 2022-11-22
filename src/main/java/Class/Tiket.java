package Class;
/**
 * class Tiket dibuat dengan menggunakan konsep interface. 
 * Class ini berisi method yang mengoverride method dari interface Struk.
 *
 * @author (Sofia-2108107010006))
 * @author (Ayu Aulia-2108107010038)
 * @author (Dhaifina Alifa Putri-2108107010018)
 * @author (Putri Ulfayani-2108107010004)
 * @author (Siti Nurrahmasita-2108107010015)
 *
 * @version (11-11-2022)
 * @since (10-10-2022)
 */
public class Tiket implements Struk
{
    private String asal;
    private String waktu;
    private int harga;
    private String tujuan;
    
    @Override
    public String getAsal()
    {
        return this.asal;
    }
    
    @Override
    public String getTujuan()
    {
        return this.tujuan;
    }
    
    @Override
    public String getWaktu()
    {
        return this.waktu;
    }
    
    @Override
    public int getHarga()
    {
        return this.harga;
    }
}
