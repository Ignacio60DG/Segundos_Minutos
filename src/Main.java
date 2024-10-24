import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg = sc.nextInt();
        int min = 0;

        if(seg<60 && seg>0){
            System.out.println( min+" minutos y "+seg+" segundos");
        }else if (seg>=60){

            while (seg>=60) {
                min = min+1;
                seg = seg-60;
            }
            System.out.println(min+" minutos y "+seg+" segundos");

        }else{
            System.out.println("Tiempo incorrecto, posible error numeros negativos o 0 segundos");
        }
    }
}