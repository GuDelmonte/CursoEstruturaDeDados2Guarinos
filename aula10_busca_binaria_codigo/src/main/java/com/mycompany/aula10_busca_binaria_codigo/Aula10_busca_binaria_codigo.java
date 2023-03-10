package com.mycompany.aula10_busca_binaria_codigo;

import java.util.Scanner;

public class Aula10_busca_binaria_codigo {

    public static void main(String[] args) {
        
        int [] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
        }
        
        boolean achou = false;
        System.out.println("Qual numero vc busca?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();
        
        
        int contador = 0;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while(inicio <= fim){
            meio = (int)((inicio + fim) /2);
            contador++; 
            if (vetor [meio] == buscado){
                achou = true;
                break;
            }else if (vetor[meio]<buscado){
                inicio = meio + 1;
            }else{
                fim = meio -1;
            }
            
        }
        System.out.println("Quantidade de testes: " + contador);
            if (achou == true){
                           System.out.println("Achou");
                       } else{
                           System.out.println("Não achou");
                       }
    }
}
