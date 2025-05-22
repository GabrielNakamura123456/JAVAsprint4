package entities;

public class Notificacao {
    private String metodo ;
    private String mensagem;

    public Notificacao(String metodo, String mensagem) {
        this.metodo = metodo;
        this.mensagem = mensagem;
    }

    public String getMetodo() {
        return metodo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Notificacao{" +
                "metodo='" + metodo + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
