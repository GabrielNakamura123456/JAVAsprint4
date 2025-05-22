package controllers;


import services.NotificacaoService;

public class NotificacaoController {
    private final NotificacaoService notificacaoService = null;

    public NotificacaoController() {
    }
    public void configurarNotificacao(String metodo){
        notificacaoService.configurarNotificacao(metodo);
    }
    public void consultarNotificacao(){
        notificacaoService.consultarNotificacao();
    }
}
