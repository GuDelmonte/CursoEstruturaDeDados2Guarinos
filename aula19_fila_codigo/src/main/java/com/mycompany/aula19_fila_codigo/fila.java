package com.mycompany.aula19_fila_codigo;

public class fila {

private ListaLigada lista;

public fila(){
    this.lista = new ListaLigada();
}

public void adicionar (String novoValor){
    this.lista.adicionar(novoValor);
}

public void remover(){
    this.lista.remover(this.get());
}

public String get(){
    return this.lista.getPrimeiro().getValor();
}

}