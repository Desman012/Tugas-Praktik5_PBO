package mahasiswa;
public class Mahasiswa {
    private String nama, npm, grade, keterangan;
    private float kehadiran, tugas, uts, uas, akhir;
    public Mahasiswa(String nama, String npm, float kehadiran, float tugas, float uts, float uas){
        this.nama = nama;
        this.npm = npm;
        this.kehadiran = kehadiran;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }
    public float nilaiAkhir(){
        return ((kehadiran*10/100)+(tugas*20/100)+(uts*30/100)+(uas*40/100));
    }
    public void getGrade(){
        akhir = nilaiAkhir();
        if(akhir >= 76){
            grade = "A";
            keterangan = "ISTIMEWA";
        }else if(akhir>= 66){
            grade = "B";
            keterangan = "BAIK";
        }else if(akhir >= 56){
            grade = "C";
            keterangan = "CUKUP";
        }else if(akhir >= 46){
            grade = "D";
            keterangan = "KURANG";
        }else{
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
    }
    public void Output(){
        getGrade();
        System.out.println("\n\nNPMMahasiswa\t: "+npm);
        System.out.println("Nama Mahasiswa\t: "+nama);
        System.out.println("Nilai Rata-rata\t: "+akhir);
        System.out.println("Grade\t\t: "+grade);
        System.out.println("Keterangan\t: "+keterangan);
    }
}
