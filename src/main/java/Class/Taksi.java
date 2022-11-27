package Class;
/**
 * Class Taksi dibuat dengan menggunakan konsep inheritance.
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
public class Taksi extends Kendaraan
{
    //Instance variabel
    private String nama;
    
    /**
     * Constructor method tanpa parameter untuk menciptakan objek Taksi.
     */
    public Taksi()
    {
        
    }
    
    /**
     * Constructor method dengan parameter.
     * @param asal merupakan variabel yang ada pada super class Kendaraan.
     * @param tujuan merupakan variabel yang ada pada super class Kendaraan.
     * @param waktu merupakan variabel yang ada pada super class Kendaraan.
     * @param harga merupakan variabel yang ada pada super class Kendaraan.
     */
    public Taksi (String asal, String tujuan, String waktu, int harga)
    {
        super(asal, tujuan, waktu, harga);
    }
    
    /**
     * getNamaKendaraan adalah bentuk override abstract method dari class Kendaraan.
     * Method ini berfungsi untuk mendapatkan nama kendaraan yaitu Taksi.
     * @return nama untuk mengembalikan informasi dasar dari nama kendaraan.
     */
    @Override
    public String getNamaKendaraan()
    {
        this.nama = "Taksi";
        return nama;
    }
}
