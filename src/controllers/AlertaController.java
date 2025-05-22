package controllers;

import services.AlertaService;

public class AlertaController {
    private AlertaService alertaService = null;

    public AlertaController() {
        this.alertaService = alertaService;
    }
    public void criarAlerta(String descricao){
        alertaService.criarAlerta(descricao);
    }
    public void listarAlertas(){
        alertaService.listarAlertas();
    }
}
