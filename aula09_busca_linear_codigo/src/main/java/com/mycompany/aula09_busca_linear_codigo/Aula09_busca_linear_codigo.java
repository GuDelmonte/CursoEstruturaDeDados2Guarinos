package com.mycompany.aula09_busca_linear_codigo;

import java.util.Scanner;

public class Aula09_busca_linear_codigo {

    public static void main(String[] args) {

    int[] vetor = new int [8];
    
    for (int i = 0; i< vetor.length;i++){
        vetor [i] = (int) (Math.random()*10);
        System.out.println(vetor[i]);
    }
    
        System.out.println("Qual número você quer buscar?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();
    
        
        boolean achou = false;
        for (int i = 0; i < vetor.length; i++){
            if(vetor [i] == buscado){
                achou = true;
                break;
            }
        }
        if (achou){
            System.out.println("Achou");
        }else{
            System.out.println("não achou");
        }
    }
}
