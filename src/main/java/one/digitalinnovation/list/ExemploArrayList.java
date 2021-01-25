package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        //Cria a a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adiciona 4 estudantes para a coleção
        estudantes.add("Juliana");
        estudantes.add("Pedro");
        estudantes.add("Carlos");
        estudantes.add("Larissa");
        estudantes.add("João");


        System.out.println("posição 1 -->" + estudantes.get(1));
        System.out.println(estudantes.remove("João"));
        System.out.println("João removido --> " + estudantes);

        //Trocar Carlos por Roberto
        estudantes.set(2,"Roberto");
        System.out.println("Carlos foi trocado por Roberto --> " + estudantes);

        System.out.println("A quantidade de itens nessa lista é " + estudantes.toArray().length);


        System.out.println("Contém Juliano na lista? " + estudantes.contains("Juliano"));
        //Altera um estudante no índice 2
        estudantes.set(2, "Rafinha");


        //Altera dado estudante
        estudantes.set(estudantes.indexOf("Pedro"), "Pedrinho");


        //Remove um estudante no índice 0
        estudantes.remove(0);


        //Recupera um estudante no índice 2;
        String estudante = estudantes.get(2);


        /*for (String nomeEstudante: estudantes) {
            System.out.println(" navegando --->" + nomeEstudante);
        }*/

        Iterator<String> iterator = estudantes.iterator();

       /* while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

    }

}
