package repositories;

import entities.Alerta;

import java.util.ArrayList;
import java.util.List;

public class AlertaRepository {
    private List<Alerta> alertas = new ArrayList<>();

    public void salvar(Alerta alerta){
        alerta.add(alerta);
    }
    public List<Alerta> listarTodos(){
        return alertas;
    }
}
