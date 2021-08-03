package br.com.digital.innovation.one.aula1_2;

/*O paradigma funcional fala o que ele vai ter que receber, qual sera
    o comportamento dele

    Função de alta ordem -> é uma função que retorna uma função
    ou que recebe uma função como parâmetro.*/



public class FuncaoAltaOrdem {
    public static void main (String [] args){
        Calculo soma = (a,b) -> a+b;
        Calculo subtracao = (a,b) -> a-b;
        Calculo divisao = (a,b) -> a/+b;
        Calculo mult = (a,b) -> a*b;


        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(subtracao,4,3));
        System.out.println(executarOperacao(divisao,4,2));
        System.out.println(executarOperacao(mult,7,3));
    }



    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculor(a,b);
    }
}

@FunctionalInterface
interface Calculo{
    public int calculor (int a, int b);
}


