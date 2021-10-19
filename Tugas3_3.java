import java.util.Scanner;
public class ContohVariable {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        float suhu, celcius, reamur, fahrenheit, kelvin, r=0.8f, f=1.8f;
        System.out.println("Masukan suhu ; ");
        suhu = scan.nextInt();
        celcius = suhu;
        reamur = r * celcius;
        fahrenheit = f * celcius + 32;
        kelvin = celcius + 273;
        System.out.println("Celcius = " + celcius);
        System.out.println("Reamur = " + reamur);
        System.out.println("Fahrenheut = " + fahrenheit);
        System.out.println("Kelvin = " + kelvin);
}
}