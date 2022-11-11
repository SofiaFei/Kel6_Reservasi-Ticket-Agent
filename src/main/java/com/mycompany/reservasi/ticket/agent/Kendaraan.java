
/**
 * Write a description of class Kendaraan here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
