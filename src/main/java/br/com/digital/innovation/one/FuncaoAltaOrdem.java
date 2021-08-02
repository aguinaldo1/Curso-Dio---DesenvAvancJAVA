package br.com.digital.innovation.one;

/*O paradigma funcional fala o que ele vai ter que receber, qual sera
    o comportamento dele  */

public class FuncaoAltaOrdem {
    public static void main (String [] args){
        Calculo soma = (a,b) -> a+b;
        System.out.println(executarOperacao(soma,1,3));
    }



    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculor(a,b);
    }
}


interface Calculo{
    public int calculor (int a, int b);
}


