package beratbadan;
public class BeratBadan {
    private float beratbadan, tinggibadan, imt;
    private String kriteria;
    public BeratBadan(float beratbadan, float tinggibadan){
        this.beratbadan = beratbadan;
        this.tinggibadan = tinggibadan;
    }
    public float imt(){
        return beratbadan / tinggibadan * tinggibadan;
    }
    public void Output(){
        imt = imt();
        if(imt >= 40){
            kriteria = "Sangat Gemuk";
        }else if(imt >- 30){
            kriteria = "Gemuk";
        }else if(imt >= 25){
            kriteria = "Berat Badan Lebih";
        }else if(imt >= 18.5){
            kriteria = "Berat Badan Ideal";
        }else{
            kriteria = "Berat Badan Kurang";
        }
        System.out.println("Kriteria Berat Badan Anda : "+kriteria);
    }
}
