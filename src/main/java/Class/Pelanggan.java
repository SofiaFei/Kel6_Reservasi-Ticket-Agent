package Class;
/**
 * class Pelanggan .
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
public class Pelanggan
{
    private String nama;
    private int ktp;
    private String noHP;
    
    /**
     * Constructor for objects of class Pelanggan
     */
    public Pelanggan()
    {
        
    }

    /**
     * Constructor untuk membuat Pelanggan baru dengan parameter
     * 
     * @param nama nama dari pelanggan
     * @param ktp  ktp dari pelanggan
     */
    public Pelanggan(String nama, int ktp) {
        this.nama = nama;
        this.ktp = ktp;
    }

    /**
     * Method ini berfungsi untuk mengembalikan nama dari pelanggan
     *
     * @return nama String yang merepresentasikan nama pelanggan
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Method ini berfungsi untuk menetapkan nama dari pelanggan
     *
     * @param namabaru nama baru dari pelanggan
     */
    public void setNama(String namabaru) {
        this.nama = namabaru;
    }

    /**
     * Method ini berfungsi untuk mengembalikan ktp dari pelanggan
     *
     * @return ktp int yang merepresentasikan ktp pelanggan
     */
    public int getKtp() {
        return this.ktp;
    }

    /**
     * Method ini berfungsi untuk menetapkan ktp dari pelanggan
     *
     * @param ktpbaru ktp baru dari pelanggan
     */
    public void setKtp(int ktpbaru) {
        this.ktp = ktpbaru;
    }
    
    public String getNoHP() {
        return this.noHP;
    }

    /**
     * Method ini berfungsi untuk menetapkan ktp dari pelanggan
     *
     * @param ktpbaru ktp baru dari pelanggan
     */
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}
