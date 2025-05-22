package services;

import entities.Alerta;
import repositories.AlertaRepository;

public class AlertaService {
    private final AlertaRepository alertaRepository;

    public AlertaService(AlertaRepository alertaRepository) {
        this.alertaRepository = alertaRepository;

    }
    public void criarAlerta(String descricao){
        Alerta alerta = new Alerta(descricao);
        alertaRepository.salvar(alerta);
        System.out.println("Alerta feito com sucesso");
    }

    public void listarAlertas(){
        for (Alerta alerta: alertaRepository.listarTodos()){
            System.out.println(alerta);
        }
    }


}
