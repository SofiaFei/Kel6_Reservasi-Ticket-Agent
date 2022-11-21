package Class;
/**
 * class Kendaraan .
 *
 * @author (Sofia (2108107010006)
 * @author (Ayu Aulia (2108107010038)
 * @author (Dhaifina Alifa Putri (2108107010018)
 * @author (Putri Ulfayani (2108107010004)
 * @author (Siti Nurrahmasita(2108107010015)
 *
 * @version (11-11-2022)   
 * @since (10-10-2022)
 */
public class Kendaraan  implements Struk
{
    private String asal;
    private String tujuan;
    private String ketTempat;
    private String waktu;
    private int harga;
    
    public Kendaraan(){
        this.asal = "Banda Aceh";
    }
    
    public Kendaraan(String t, int h, String k){
        this.tujuan = t;
        this.harga = h;
        this.ketTempat = k;
    } 
    
    public String getAsal(){
        return this.asal;
    }
    
    public void setAsal(String asal){
        this.asal = asal;
    }
    
    @Override
    public String getTujuan(){
        return this.tujuan; 
    }
    
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    
    @Override
    public int getHarga(){
        return this.harga; 
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public String getWaktu(){
        return this.waktu;
    }
    
    public void setWaktu(String waktu){
        this.waktu = waktu;
    }
    public String getketTempat(){
        return this.ketTempat; 
    }
    
    public void setketTempat(String ketTempat){
        this.ketTempat = ketTempat;
    }
    
    
}