package Class;
/**
 * Class Kendaraan dibuat dengan menggunakan konsep inheritance. 
 * Dalam konsep inheritance, class ini berperan sebagai superclass.
 * Class ini berisi method yang diwariskan kepada class Bus, MiniBus, dan Taksi.
 *
 * @author Sofia (2108107010006)
 * @author Ayu Aulia (2108107010038)
 * @author Dhaifina Alifa Putri (2108107010018)
 * @author Putri Ulfayani (2108107010004)
 * @author Siti Nurrahmasita(2108107010015)
 *
 * @version (27-11-2022)
 * @since (10-11-2022)
 */
public abstract class Kendaraan
{
    //instance variable
    private String asal;
    private String tujuan;
    private String waktu;
    private int harga;
    
    /**
     * Constructor method untuk menginisialisasi variabel asal adalah Banda Aceh.
     */
    public Kendaraan()
    {
        this.asal = "Banda Aceh";
    }
    
    /**
     * Contructor method dengan parameter.
     * @param asal untuk memberi nilai awal pada variabel asal kendaraan.
     * @param tujuan untuk memberi nilai awal pada variabel tujuan kendaraan.
     * @param waktu untuk memberi nilai awal pada variabel waktu berangkatnya kendaraan.
     * @param harga untuk memberi nilai awal pada variabel harga tiket kendaraan.
     */
    public Kendaraan(String asal, String tujuan, String waktu, int harga)
    {
        this.asal = asal;
        this.tujuan = tujuan;
        this.waktu = waktu;
        this.harga = harga;
    } 
    
    /**
     * Method ini berfungsi untuk mendapatkan asal kendaraan.
     * @return this.asal untuk mengembalikan informasi dasar dari asal kendaraan.
     */
    public String getAsal()
    {
        return this.asal;
    }
    
    /**
     * setAsal berfungsi untuk mengatur asal kendaraan.
     * @param asal untuk mengubah asal kendaraan.
     */
    public void setAsal(String asal)
    {
        this.asal = asal;
    }
    
    /**
     * Method ini berfungsi untuk mendapatkan tujuan kendaraan.
     * @return this.tujuan untuk mengembalikan informasi dasar dari tujuan kendaraan.
     */
    public String getTujuan()
    {
        return this.tujuan; 
    }
    
    /**
     * setTujuan berfungsi untuk mengatur tujuan kendaraan.
     * @param tujuan untuk mengubah tujuan kendaraan.
     */
    public void setTujuan(String tujuan)
    {
        this.tujuan = tujuan;
    }
    
    /**
     * Method ini berfungsi untuk mendapatkan harga tiket kendaraan.
     * @return this.harga untuk mengembalikan informasi dasar dari harga tiket kendaraan.
     */
    public int getHarga()
    {
        return this.harga; 
    }
    
    /**
     * setHarga berfungsi untuk mengatur harga tiket kendaraan.
     * @param harga untuk mengubah harga tiket kendaraan.
     */
    public void setHarga(int harga)
    {
        this.harga = harga;
    }
    
    /**
     * Method ini berfungsi untuk mendapatkan waktu berangkatnya kendaraan.
     * @return this.waktu untuk mengembalikan informasi dasar dari waktu berangkatnya kendaraan.
     */
    public String getWaktu()
    {
        return this.waktu;
    }
    
    /**
     * setWaktu berfungsi untuk mengatur waktu berangkatnya kendaraan.
     * @param waktu untuk mengubah waktu berangkatnya kendaraan.
     */
    public void setWaktu(String waktu)
    {
        this.waktu = waktu;
    }
    
    /**
     * getNamaKendaraan berfungsi untuk mendapatkan nama kendaaraan.
     * Method ini akan dioverride pada setiap subclass, yaitu: class bus, minibus dan taksi.
     * @return String yang merupakan data type dari variabel nama pada setiap subclass.
     */
    public abstract String getNamaKendaraan();
}