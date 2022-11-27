package Class;
/**
 * Class Pelanggan berisi data yang berhubungan dengan pelanggan yang akan memesan tiket secara online pada agent tiket ini. 
 * Class ini diposisikan sebagai user dalam mengakses menu tiket.
 * 
 * @author (Sofia (2108107010006)
 * @author (Ayu Aulia (2108107010038)
 * @author (Dhaifina Alifa Putri (2108107010018)
 * @author (Putri Ulfayani (2108107010004)
 * @author (Siti Nurrahmasita(2108107010015)
 *
 * @version (27-11-2022)
 * @since (10-11-2022)
 */
public class Pelanggan
{
    //Instance variabel
    private String nama;
    private String ktp;
    private String noHP;
    
    /**
     * Constructor method tanpa parameter untuk menciptakan objek Pelanggan.
     */
    public Pelanggan()
    {
        
    }

    /**
     * Constructor untuk membuat Pelanggan baru dengan parameter.
     * @param nama untuk memberi nilai awal pada variabel nama pelanggan.
     * @param ktp  untuk memberi nilai awal pada variabel ktp pelanggan.
     * @param noHP untuk memberi nilai awal pada variabel nomor HP pelanggan.
     */
    public Pelanggan(String nama, String ktp, String noHP) 
    {
        this.nama = nama;
        this.ktp = ktp;
        this.noHP =noHP;
    }

    /**
     * getNama berfungsi untuk mengembalikan nama dari pelanggan.
     * @return nama String yang merepresentasikan nama pelanggan.
     */
    public String getNama() 
    {
        return this.nama;
    }

    /**
     * setNama berfungsi untuk menetapkan nama dari pelanggan.
     * @param namaBaru untuk mengubah nama baru pelanggan.
     */
    public void setNama(String namaBaru) 
    {
        this.nama = namaBaru;
    }

    /**
     * getKtp berfungsi untuk mengembalikan ktp dari pelanggan.
     * @return ktp String yang merepresentasikan ktp pelanggan.
     */
    public String getKtp() 
    {
        return this.ktp;
    }

    /**
     * setKtp berfungsi untuk menetapkan ktp dari pelanggan.
     * @param ktpBaru untuk mengubah nomor ktp baru pelanggan.
     */
    public void setKtp(String ktpBaru) 
    {
        this.ktp = ktpBaru;
    }
    
    /**
     * getNoHP berfungsi untuk mengembalikan nomor HP dari pelanggan.
     * @return noHP String yang merepresentasikan nomor HP pelanggan.
     */
    public String getNoHP() 
    {
        return this.noHP;
    }

    /**
     * setNoHP berfungsi untuk menetapkan nomor HP dari pelanggan.
     * @param noHP untuk mengubah nomor HP baru pelanggan.
     */
    public void setNoHP(String noHP) 
    {
        this.noHP = noHP;
    }
}
