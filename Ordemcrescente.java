/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ordemcrescente {
    public static void main(String[] args) {
        // Todo code application logic here
        Scanner leia= new Scanner(System.in);
        int intinc=0;
        int intfim=0;
        int x,troca,x1,x2;
        int intervalo=0;
        double total=0;
        int opcao=5;
        while(opcao!= 0){
        System.out.println("ordem sequencial");
        System.out.println("mostrando os numeros sequencias");
        do{
            System.out.println("escolha a ordem");
            System.out.println("3-TODOS");
            System.out.println("2-PAR");
            System.out.println("1-IMPAR");
            System.out.println("0-SAIR");
            opcao =leia.nextInt();
        }while((opcao<0)||(opcao>3));
        //acerto do intervalo
        if (opcao == 0) {
        break;
        }else if (opcao ==3){
        intervalo=1;
        }else{
        intervalo=2;
        }
        System.out.println("digite o valor inicial");
        intinc =leia.nextInt();
        System.out.println("digite o valor final");
        intfim =leia.nextInt();
        System.out.println("mostrando os valores entre os intervalos");
        if(intinc>intfim){
        System.out.println("acertando o intervalo");
        troca = intinc;
        intinc = intfim;
        intfim = troca;
        }
        else
        { 
        System.out.println("intervalo correto");
        }
        //acerto o inicialização
        if(((opcao==1) && (intinc % 2 == 0))||((opcao==2)&&(intinc % 2 ==1))){
        intinc++;
        }
        System.out.print("FEITO COM PARA - FOR");
        for (x=intinc;x<=intfim;x=x+intervalo){
        System.out.print(" "+x);
        System.out.println();
        System.out.println("FEITO COM ENQUANTO - WHILE");
        x1= intinc;
        while(x1<=intfim){
           System.out.print(" "+x1);
           x1=x1+intervalo;
        }
        System.out.println();
        System.out.println("FEITO COM REPITA - DO WHILE");
        x2= intinc;
        do{ 
            System.out.print(" "+x2);
            x2=x2+intervalo;
        }while(x2<=intfim);
        System.out.println();
        }
        }       
        }
        
        }
    

