package strings;

import strings.comparators.*;
import strings.consumers.ImprimeNaLinha;

import java.util.*;

import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new java.util.ArrayList<>();

        palavras.add("Novas features do Java 8");
        palavras.add("Aprendendo");
        palavras.add("Java 8 e as novas maneiras de trabalho");
        Comparator<String> comparador = new ComparadorPorTamanho();
//        palavras.sort(comparador);

        // Nesse metodo utilizamos a Function, onde recebemos um Tipo(String) e retornamos um tamanho(Integer)
        // onde utilizamos o method reference do Objeto String que retorna o tamanho, que o java vai receber para cada
        // String fazer o metodo length
        palavras.sort(Comparator.comparing(String::length));


        // Nesse metodo utilizamos a Interface funcional, onde podemos substituir uma interface com apenas um metodo
        // abstrato sem retorno por uma lambda
        new Thread(() -> System.out.println(""));

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);

    }
}
