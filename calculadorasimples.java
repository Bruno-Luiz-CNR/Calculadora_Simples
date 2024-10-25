package src.acadmey.devdojo.javacore.introducaoclasses.teste;

import java.util.Scanner;

public class calculadorasimples {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        String num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = ler.nextLine();
        System.out.println("Digite a operação");
        String oper = ler.nextLine();
        System.out.println("Digite o segundo numero");
        num2 = ler.nextLine();
        if (num1.isEmpty() || num2.isEmpty() || !isNumeric(num1) || !isNumeric(num2)){
            System.out.println("Os numeros não podem ser vazios ou não serem numeros");
        }else{
            Double nume1 = Double.parseDouble(num1);
            Double nume2 = Double.parseDouble(num2);
            switch (oper){
                case "/":

                    System.out.println(nume1 / nume2);
                    break;
                case "-":

                    System.out.println(nume1 - nume2);
                    break;
                case "+":

                    System.out.println(nume1 + nume2);
                    break;
                case "*":
                    System.out.println(nume1 * nume2);
                    break;
                case "%":
                    System.out.println( nume2 * nume1 / 100);
                    break;
            }
        }
        ler.close();
    }
    public static boolean isNumeric(String str){
        try {
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
