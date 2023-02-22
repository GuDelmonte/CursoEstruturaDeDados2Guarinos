
package com.mycompany.aula19_fila_codigo;

public class Aula19_fila_codigo {

    public static void main(String[] args) {
        
        fila Fila = new fila();
        
        Fila.adicionar("Jão");
        Fila.adicionar("Gustavo");
        Fila.adicionar("Moreira");
        Fila.adicionar("Delmonte");
        Fila.adicionar("Raze");
        
        System.out.println("Primeiro da fila: " + Fila.get());
        Fila.remover();
        
        System.out.println("Novo Primeiro da fila: " + Fila.get());
        Fila.remover();
        
        System.out.println("Mais novo Primeiro da fila: " + Fila.get());
        Fila.remover();
        
        System.out.println("Mais novo que todos Primeiro da fila: " + Fila.get());
        Fila.remover();
    }
}
