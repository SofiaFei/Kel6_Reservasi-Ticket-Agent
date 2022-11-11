
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
public abstract class Kendaraan
{
    // instance variables - replace the example below with your own
    private String noPolisi;
    private int harga;
    
    public abstract void ketTempat();
    
    public String getNoPolisi(){
        return this.noPolisi;
    }
    
    public void setNoPolisi(String noPolisi){
        this.noPolisi = noPolisi;
    }
    
    public int getHarga(){
        return this.harga; 
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    
    
}
