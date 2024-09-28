package diskon;
public class Diskon {
    private int total, potongan, jumlah;
    public Diskon(int total){
        this.total = total;
    }
    public void Output(){
        if(total >= 50000){
            potongan = total * 20/100;
        }else{
            potongan = total * 5/100;
        }
        jumlah = total - potongan;
        System.out.println("Besarnya potongan Rp."+potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp."+jumlah);
    }
}
