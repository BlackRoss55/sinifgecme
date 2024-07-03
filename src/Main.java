import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mat, fiz, kim, tur, muz, ort;
        int count=5;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = sc.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = sc.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = sc.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = sc.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = sc.nextDouble();

        if(mat<0 || mat >100){
            count--;
            mat = 0;
        }
        if(fiz<0 || fiz>100){
            count--;
            fiz = 0;
        }
        if(kim<0 || kim >100){
            count--;
            kim=0;
        }
        if(tur<0 || tur >100){
            count--;
            tur=0;
        }
        if(muz<0 || muz>100){
            count--;
            muz =0;
        }
        ort = (mat+kim+fiz+tur+muz) / count;
        if(ort>= 55){
            System.out.println("Tebrikler sınıfı geçtiniz!\nNot ortalamanız:"+ ort);
        }
        else{
            System.out.println("Sınıfta kaldınız!\nNot ortalamanız:"+ ort);
        }

    }
}