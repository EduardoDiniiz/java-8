package stream;

import entities.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class ExemplosCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.forEach(curso -> System.out.println(curso.getNome()));

        int somaDeAlunos = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();

        System.out.println(somaDeAlunos);

        Map<String, Integer> map = cursos.stream().filter(curso -> curso.getAlunos() > 100)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));

        System.out.println(map);

        cursos.parallelStream().filter(curso -> curso.getAlunos() > 100)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos)).forEach((nome, qtdAluno) ->
                        System.out.println(nome + " tem " + qtdAluno + " alunos"));
    }
}
