package br.com.cybercorp.model;

public class Funcionario {

    private String matricula;
    private String nome;
    private Departamento departamento;

    public Funcionario(String matricula, String nome, Departamento departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public Departamento getDepartamento() { return departamento; }

    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }

    @Override
    public String toString() {
        return matricula + " - " + nome;
    }
}
