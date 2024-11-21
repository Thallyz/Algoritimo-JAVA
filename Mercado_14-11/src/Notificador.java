abstract class Notificador {
    public abstract boolean enviar(String mensagem);
}

class Email extends Notificador {
    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
        return true;
    }
}