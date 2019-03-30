/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import java.util.Scanner;

/**
 *
 * @author Amandinha
 */
public class Fisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double vetor[]={0,0.06,0.3,0.055,0.37,0.255,0.9,0.007,0.0035,6.8};
    String itens[]={"00","tv","computador","ventilador","maquina de lavar","geladeira","microondas","lampada","celular","chuveiro"};
    Scanner sc = new Scanner(System.in);
    int horas, op;
    double soma = 0, item, kw, preco, preco_total;
    System.out.println("Digite 0 de horas para itens que não foram utilizados");
       for (int i =1; i<10;i++){
           System.out.println(" ");
           System.out.println(i +"-" +itens[i]);
           System.out.println("Digite a quantidade de horas de utilização");
           horas =sc.nextInt();
           item = vetor[i]*horas;
           preco = item *0.545010;
           System.out.println(" ");
           System.out.println("Consumo desse item: "+item +"KW");
           System.out.println("Gasto do item: R$"+preco);
           soma= soma+item;
    }
       System.out.println("Existe mais algum item para gasto de energia? 0 para continuar");
        op = sc.nextInt();
       while(op==0){
           System.out.println(" ");
           System.out.println("Digite o gasto em Kw do objeto");
           kw = sc.nextDouble();
           System.out.println("Digite a quantidade de horas de utilização");
           horas =sc.nextInt();
           item = kw*horas;
            preco = item *0.545010;
           System.out.println(" ");
           System.out.println("Consumo desse item: "+item);
           System.out.println("Gasto do item: R$"+preco);
           soma= soma+item;
           System.out.println(" ");
        System.out.println("Existe mais algum item para gasto de energia? 0 para continuar");
        op = sc.nextInt();
       }
       System.out.println(" ");
        System.out.println("A soma total de energia é: "+soma);
        preco_total = soma * 0.545010;
        System.out.println("O valor esperado da conta é: "+preco_total);
    
}
}
