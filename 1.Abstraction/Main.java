import java.util.Scanner;
import java.text.DecimalFormat;

// Abstraction Class
abstract class abs_class {
    // Abstract Method
    public abstract void Nilai(double nilai_tugas, double nilai_UTS, double nilai_UAS);
    public abstract void Grade();
    // Deklarasi Atribute
    double n_tugas, n_UTS, n_UAS, n_akhir;
    String grade;
}

// Subclass (Perwarisan dari class abs_class)
class perhitungan extends abs_class {
    // Methode Nilai
    public void Nilai(double nilai_tugas, double nilai_UTS, double nilai_UAS){
        this.n_tugas    = nilai_tugas*0.30;
        this.n_UTS      = nilai_UTS*0.35;
        this.n_UAS      = nilai_UAS*0.35;
        
        // Format Angka Double
        DecimalFormat n_akhirD = new DecimalFormat("#.##");
        this.n_akhir    = this.n_tugas + this.n_UTS + this.n_UAS;
        System.out.println("Nilai Akhir anda : " + n_akhirD.format(this.n_akhir));
    }
    // Method Grade
    public void Grade(){
        if(this.n_akhir>=90){
            this.grade = "A";
        }else if(this.n_akhir>=80){
            this.grade = "B";
        }else if(this.n_akhir>=70){
            this.grade = "C";
        }else if(this.n_akhir>=60){
            this.grade = "D";
        }else{
            this.grade = "E";
        }
        System.out.println("Grade anda : " + this.grade);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukan Nilai Tugas anda : ");
        double Nilai_Tugas = inp.nextFloat();
        System.out.print("Masukan Nilai UTS anda : ");
        double Nilai_UTS = inp.nextFloat();
        System.out.print("Masukan Nilai UAS anda : ");
        double Nilai_UAS = inp.nextFloat();
        
        // Create Object
        perhitungan hitung = new perhitungan();
        hitung.Nilai(Nilai_Tugas, Nilai_UTS, Nilai_UAS);
        hitung.Grade();
    }
}