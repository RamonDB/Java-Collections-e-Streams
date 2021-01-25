package one.digitalinnovation.optionals;

import java.util.Locale;
import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.empty();

        Optional<String> stringValorosa = Optional.of("Tem valor aqui carai!");

        Optional<String> stringNull = Optional.ofNullable(null);

        System.out.println("Está presente? --> " + optionalString.isPresent());
        System.out.println("Está vazia? --> " + optionalString.isEmpty());

        System.out.println("------Valor p/ uppercase");
        optionalString.ifPresentOrElse((valor) -> System.out.println(valor.toUpperCase(Locale.ROOT)),
                () -> System.out.println("Valor não está presente"));

        if (optionalString.isPresent()) {
            String valor = optionalString.get();

            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        System.out.println(optionalString.orElseThrow(IllegalStateException::new));

    }

}
