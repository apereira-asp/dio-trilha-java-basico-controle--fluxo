package exceptions;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);  // Passa a mensagem para o construtor da classe Exception
    }

}