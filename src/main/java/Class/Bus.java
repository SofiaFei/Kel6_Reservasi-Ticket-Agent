package Class;
/**
 * Class Bus dibuat dengan menggunakan konsep inheritance.
 * Dalam konsep inheritance, class ini berperan sebagai subclass.
 * Class ini mewarisi method yang ada di class Kendaraan sehingga hanya perlu dibuat method constructornya.
 *
 * @author Sofia (2108107010006)
 * @author Ayu Aulia (2108107010038)
 * @author Dhaifina Alifa Putri (2108107010018)
 * @author Putri Ulfayani (2108107010004)
 * @author Siti Nurrahmasita (2108107010015)
 *
 * @version (27-11-2022)
 * @since (10-11-2022)
 */
public class Bus extends Kendaraan
{
    //instance variable
    private String nama;
    
    /**
     * Constructor method tanpa parameter untuk menciptakan objek Bus.
     */
    public Bus()
    {
        
    }
    
    /**
     * Constructor method dengan parameter.
     * @param asal merupakan variabel yang ada pada super class Kendaraan.
     * @param tujuan merupakan variabel yang ada pada super class Kendaraan.
     * @param waktu merupakan variabel yang ada pada super class Kendaraan.
     * @param harga merupakan variabel yang ada pada super class Kendaraan.
     */
    public Bus (String asal, String tujuan, String waktu, int harga)
    {
        super(asal, tujuan, waktu, harga);
    }
    
    /**
     * getNamaKendaraan adalah bentuk override abstract method dari class Kendaraan.
     * Method ini berfungsi untuk mendapatkan nama kendaraan yaitu Bus.
     * @return nama untuk mengembalikan informasi dasar dari nama kendaraan.
     */
    @Override
    public String getNamaKendaraan()
    {
        this.nama = "Bus";
        return nama;
    }
}
