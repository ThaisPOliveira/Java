package exercicio;

import javax.swing.JOptionPane;

public class Exercicio {

    public static void main(String[] args) {
    String nome;
    String mensagem="";
    double peso,altura,imc;
    JOptionPane.showMessageDialog (null,"Ola, bem-vindo a calculadora de IMC");
    JOptionPane.showMessageDialog (null,"Nela, calculamos se seu peso esta adequado para sua altura");
    nome=(JOptionPane.showInputDialog ("Para Iniciamos, digite o seu nome:"));
    peso=Double.parseDouble(JOptionPane.showInputDialog ("Disso, digite seu peso:"));
    altura=Double.parseDouble(JOptionPane.showInputDialog ("E para finalizar,digite sua altura:"));
    
    //Calculo do IMC usando os valores recebidos de "peso" e "altura"
    imc = (peso) / (altura * altura);
    //conclusao do calculo feito para descobrir o IMC do usuario
    if (imc<=0) {
        mensagem= "ovalor do seu peso ou altura esta incorreto, tente novamente";
    }
    else if (imc<= 18.4) {
        mensagem=", seu IMC e abaixo do peso";
    } else if (imc>= 18.5 && imc<=24.9) {
        mensagem=", seu imc e de peso normal";
    } else if (imc>= 15.0 && imc<=29.9) {
        mensagem=", seu imc e sobrepeso";
    } else if (imc>= 30.0 && imc<=34.9) {
        mensagem=", seu imc e de obesidade grau 1 ";
    } else if (imc>= 35.0 && imc<=39.9) {
        mensagem=", seu imc e de obesidade grau 2";
    } else {
        mensagem=", seu imc e de obesidade grau 3";
    }
        JOptionPane.showMessageDialog(null, nome+ "voce esta com"+imc + mensagem);
    String mesangen1= String.format(nome +" voce esta com %2f|n", imc);
        JOptionPane.showMessageDialog (null, mesangen1 + mensagem);
    }
    }
    
