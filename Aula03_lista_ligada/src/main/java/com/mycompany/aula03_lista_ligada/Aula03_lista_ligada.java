package com.mycompany.aula03_lista_ligada;

public class Aula03_lista_ligada {

    public static void main(String[] args) {
        
       ListaLigada<String> lista = new ListaLigada<String>();
       lista.adicionar("AC");
       lista.adicionar("SP");
       lista.adicionar("CE");
       lista.adicionar("BA");
       System.out.println("Tamanho: " + lista.getTamanho());
       System.out.println("Primeiro : " + lista.getPrimeiro().getValor());
       System.out.println("Ultimo : " + lista.getUltimo().getValor());
       
       
       for (int i=0; i < lista.getTamanho(); i++){
           System.out.println(lista.get(i).getValor());
       }
       
       lista.remover("CE");
        System.out.println("Removeu o estado CE");
      
       for (int i=0; i < lista.getTamanho(); i++){
           System.out.println(lista.get(i).getValor());
       }
        
    }
}
