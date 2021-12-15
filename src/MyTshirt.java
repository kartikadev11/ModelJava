import Model.Tshirt;

public class MyTshirt {
    public static void main(String[] args) {
        Tshirt A = new Tshirt("A","Biru","L","polo"
                ,"kancing",false,true
                ,200000,7,100);


        A.Produksi();

        Tshirt B = new Tshirt("B","Merah","XL","Hoodie"
                ,"Resleting",true,false
                ,250000,5,50);

        System.out.println("\n");
        B.Produksi();
    }
}
