package com.mycompany.aula03_lista_ligada;

public class ProgramaClientes {
    public static void main (String [] args){
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        clientes.adicionar(new Cliente("123","Gustavo"));
        clientes.adicionar(new Cliente("456","Julia"));
        clientes.adicionar(new Cliente("789","Delmonte"));
    
    System.out.println("Tamanho: " + clientes.getTamanho());
         for (int i=0; i < clientes.getTamanho(); i++){
           System.out.println(clientes.get(i).getValor());
         }
    
    }
    
    
}
