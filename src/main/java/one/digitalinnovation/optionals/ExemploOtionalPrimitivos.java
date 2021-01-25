package one.digitalinnovation.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Locale;
import java.util.Optional;

public class ExemploOtionalPrimitivos {

    public static void main(String[] args) {

        System.out.println("***Valor inteiro opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor decimal opcional***");
        OptionalDouble.of(55.0).ifPresent(System.out::println);

        System.out.println("***Valor longo opcional***");
        OptionalLong.of(23L).ifPresent(System.out::println);

        Optional<String> optionalString = Optional.empty();



        Optional<String> stringValorosa = Optional.of("Tem valor aqui carai!");

        Optional<String> stringNull = Optional.ofNullable("oi");

        Optional<Object> stringValorosa2 = stringValorosa.empty();
        System.out.println("empty -->" + stringNull);


        System.out.println("Está presente? --> " + optionalString.isPresent());
        System.out.println("Está vazia? --> " + optionalString.isEmpty());

        System.out.println("------Valor p/ uppercase");
        stringValorosa.ifPresentOrElse((valor) -> System.out.println(valor.toUpperCase(Locale.ROOT)),
                () -> System.out.println("Valor não está presente"));

        System.out.println("------Valor filtrado! tiltado");
        stringValorosa.ifPresentOrElse((valor) -> System.out.println(valor.replace("valor","porra")),
                () -> System.out.println("Valor não está presente"));

        if (optionalString.isPresent()) {
            String valor = optionalString.get();

            System.out.println(valor);
        }



    }

}
