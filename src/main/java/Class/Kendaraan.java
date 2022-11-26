package Class;
/**
 * class Kendaraan dibuat dengan menggunakan konsep inheritance dan interface. 
 * Dalam konsep inheritance, class ini berperan sebagai superclass.
 * Class ini berisi method yang mengoverride method dari interface Struk. (konsep interface)
 * Class ini juga berisi method yang diwariskan kepada class Bus, MiniBus, dan Taksi.
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
public abstract class Kendaraan  implements Struk
{
    private String asal;
    private String tujuan;
    private String waktu;
    private int harga;
    
    public Kendaraan()
    {
        this.asal = "Banda Aceh";
    }
    
    public Kendaraan(String asal, String tujuan, String waktu, int harga)
    {
        this.asal = asal;
        this.tujuan = tujuan;
        this.waktu = waktu;
        this.harga = harga;
    } 
    
    @Override
    public String getAsal()
    {
        return this.asal;
    }
    
    public void setAsal(String asal)
    {
        this.asal = asal;
    }
    
    @Override
    public String getTujuan()
    {
        return this.tujuan; 
    }
    
    public void setTujuan(String tujuan)
    {
        this.tujuan = tujuan;
    }
    
    @Override
    public int getHarga()
    {
        return this.harga; 
    }
    
    public void setHarga(int harga)
    {
        this.harga = harga;
    }
    
    @Override
    public String getWaktu()
    {
        return this.waktu;
    }
    
    public void setWaktu(String waktu)
    {
        this.waktu = waktu;
    }
    
    public abstract String getNamaKendaraan();
}