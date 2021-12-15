package Model;

public class Tshirt {


    private String Merk;
    private String Warna;
    private String Ukuran;
    private String Bahan;
    private boolean LenganPendek;
    private String AksesorisBaju; //kancing,resleting,tali,
    private boolean Kerah;
    private int HargaBaju;
    private int quantity;
    private int JmlProduksi;

    public Tshirt(String mMerk, String mWarna, String mUkuran,
                  String mBahan, String mAksesorisBaju, boolean mModelKerah,
                  boolean mLenganpendek, int mHargaBaju, int mQuantity, int produksi){


        this.Merk = mMerk;
        this.Warna = mWarna;
        this.Ukuran = mUkuran;
        this.Bahan = mBahan;
        this.LenganPendek = mLenganpendek;
        this.AksesorisBaju = mAksesorisBaju;
        this.Kerah = mModelKerah;
        this.HargaBaju = mHargaBaju;
        this.quantity = mQuantity;
        this.JmlProduksi = produksi;


    }
    public static int HitungTotalModal(int Harga1Baju , int jumlahProduksi){
        return Harga1Baju * jumlahProduksi;
    }
    public void Produksi(){
        String Lengan;
        String Kerah;
        if(this.LenganPendek){
          Lengan =  "Lengan Pendek";
        }else {
            Lengan = "Lengan Panjang";
        }

        if(this.Kerah){
            Kerah =  "Berkerah";
        }else {
            Kerah = "Tidak Berkerah";
        }
        int totalModal = HitungTotalModal(this.HargaBaju,this.JmlProduksi);


        System.out.println(
                "Merk               : "+ this.Merk+"\n"+
                "Warna              : "+ this.Warna+"\n"+
                "Ukuran             : "+ this.Ukuran +"\n"+
                "Bahan              : "+ this.Bahan+"\n"+
                "Model Lengan       : "+ Lengan+"\n"+
                "Aksesoris          : "+ this.AksesorisBaju+"\n"+
                "Kerah              : "+ Kerah+"\n"+
                "Harga Baju         : "+ this.HargaBaju+"\n"+
                "quantity           : "+ this.quantity+"\n"+
                "jumlah produksi    : "+ this.JmlProduksi+"\n"+
                "Total Modal        : "+totalModal);




    }
}
