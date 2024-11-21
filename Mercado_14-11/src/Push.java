class Push extends Notificador {
    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Notificação push enviada: " + mensagem);
        return true;
    }
}