package br.com.digital.innovation.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Aguinaldo", "Americo","Dos","Santos"};
        Integer[] numeros = {1,2,3,4,5};
       // imprimirNomesFiltrados(nomes);
       // imprimirTodosNomes(nomes);
        //imprimirODobroDeCadaItemDaLista(numeros);


        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("testador");
        profissoes.add("gerente de projeto");
        profissoes.add("gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){

        String nomesParaImprimir = "";
        for (int i =0; i < nomes.length; i++){
            if (nomes[i].equals("Aguinaldo")){
                nomesParaImprimir += "" +nomes[i];
            }
        }


        System.out.println("Nomes do for :" + nomesParaImprimir);



        String nomesparaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Aguinaldo"))
                .collect(Collectors.joining());

        System.out.println("Nomes do stream :" + nomesparaImprimirDaStream);
    }

    public static void imprimirTodosNomes(String... nomes){
        for (String nome : nomes){
            System.out.println("imprimido pelo for: " + nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("imprimido pelo forEach: " + nome));
    }

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero -> numero*2)
                .forEach(System.out::println);
    }
}
