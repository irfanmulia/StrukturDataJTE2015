import java.math.BigInteger;
/**
 * Write a description of class Tumpukan here.
 * 
 * Bahan Bacaan reading HEAD
 * Hasil diskusi bersama teman (Reza Muttaqien)
 */
public class Tumpukan
{   
     
    private Node atas;
    private Node bawah;
    
    public Tumpukan(){
        atas=null;
        bawah=null;
    }
    
    public void tumpuk(BigInteger data){
        Node baru = new Node (data);
        baru.berikut = null;
        if(atas == null)
        {
            bawah = baru;
            atas = baru;
        }
        else{
            atas.berikut=baru;
            atas=baru;
        }
    }
    
    public BigInteger ambil(){
        if (atas==null){
        return null;
    }else{
        BigInteger ambil = atas.data;
        Node sekarang = atas;
        while(sekarang.berikut!= null){
            sekarang = sekarang.berikut;
        }
        atas = sekarang;
        return ambil;
    }
    }
    
    public BigInteger atas(){
        if(atas==null)
        return null;
        else {
            return atas.data;
        }
    }
    
    public BigInteger bawah(){
        if(bawah!=null)
        return bawah.data;
        else{
            return null;
        }
    }
   
}
