package br.com.digital.innovation.one.aula1_2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {

        //criando uma lambda pra verificar se o valor esta vazio
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Aguinaldo"));
    }
}
