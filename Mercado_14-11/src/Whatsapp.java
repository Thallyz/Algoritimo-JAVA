class WhatsApp extends Notificador {
    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Mensagem pelo WhatsApp enviada: " + mensagem);
        return true;
    }
}
