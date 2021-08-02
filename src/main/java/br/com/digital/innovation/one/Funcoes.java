package br.com.digital.innovation.one;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {


        Function<String,String> retorNarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retorNarNomeAoContrario.apply("aguinaldo"));
    }
}
