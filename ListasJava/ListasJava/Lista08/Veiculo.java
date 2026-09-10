package br.com.cybercorp.model;

public class Veiculo {

    private String placa;
    private String modelo;
    private Funcionario dono;

    public Veiculo(String placa, String modelo, Funcionario dono) {
        this.placa = placa;
        this.modelo = modelo;
        this.dono = dono;
    }

    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public Funcionario getDono() { return dono; }

    public void setPlaca(String placa) { this.placa = placa; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setDono(Funcionario dono) { this.dono = dono; }

    @Override
    public String toString() {
        return placa + " - " + modelo;
    }
}
