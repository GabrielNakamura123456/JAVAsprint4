package entities;

import java.time.LocalDateTime;

public class Alerta {
    private static int contadorId=1;
    private int id;
    private String descricao;
    private LocalDateTime dataHora;

    public Alerta(int id, String descricao, LocalDateTime dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    public Alerta(String descricao) {
    }

    public static int getContadorId() {
        return contadorId;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Alerta{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }

    public void add(Alerta alerta) {
    }
}
