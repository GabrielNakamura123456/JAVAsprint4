package services;

import entities.Notificacao;
import repositories.NotificacaoRepository;

public class NotificacaoService {
    private final NotificacaoRepository notificacaoRepository;

    public NotificacaoService(NotificacaoRepository notificacaoRepository) {
        this.notificacaoRepository = notificacaoRepository;
    }
    public void  configurarNotificacao(String metodo){
        Notificacao notificacao = new Notificacao(metodo,"Configuracoes atualizadas com sucesso");
        notificacaoRepository.salvar(notificacao);
        System.out.println("Notificacao foi configurada para :" + metodo);

    }
    public void consultarNotificacao(){
        for (Notificacao notificacao: notificacaoRepository.listarTodas()){
            System.out.println(notificacao);
        }
    }
}
