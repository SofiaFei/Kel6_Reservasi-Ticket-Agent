package Class;
/**
 * class MiniBus dibuat dengan menggunakan konsep inheritance.
 * Dalam konsep inheritance, class ini berperan sebagai subclass.
 * Class ini mewarisi method yang ada di class Kendaraan sehingga hanya perlu dibuat method constructornya.
 *
 * @author (Sofia-2108107010006)
 * @author (Ayu Aulia-2108107010038)
 * @author (Dhaifina Alifa Putri-2108107010018)
 * @author (Putri Ulfayani-2108107010004)
 * @author (Siti Nurrahmasita-2108107010015)
 *
 * @version (11-11-2022)
 * @since (10-10-2022)
 */
public class MiniBus extends Kendaraan
{
    private String nama;
    public MiniBus()
    {
        
    }
    
    public MiniBus (String t, int h, String k)
    {
        super(t, h, k);
    }
    public String getNamaKendaraan(){
        this.nama = "Minibus";
        return nama;
    }
}
