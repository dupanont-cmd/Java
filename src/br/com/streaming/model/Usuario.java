package br.com.streaming.model;

// TODO: Importar List e ArrayList

public class Usuario {
    // TODO: Aula 3 - Criar constante NOME_PLATAFORMA (static final)
    // TODO: Aula 3 - Criar contadorUsuarios (static)

    private String email;
    private String nome;
    private boolean ativo;
    // TODO: Associação 1..* - Criar Lista de Videos (historicoAssistidos)

    public Usuario(String email, String nome) {
        this.email = email;
        this.nome = nome;
        this.ativo = true;
        contadorUsuarios++;
        // TODO: Instanciar a lista de vídeos e incrementar o contador
    }

    public void assistirVideo(Video v) {
        // TODO: Adicionar o vídeo na lista de histórico
    }
    // TODO: Gerar Getters, Setters, equals(), hashCode() e toString()


    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Usuario [email=" + email + ", nome=" + nome + ", ativo=" + ativo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + (ativo ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ativo != other.ativo)
            return false;
        return true;
    }

   public static final String NOME_PLATAFORMA = "JavaFlix";
   public static int contadorUsuarios = 0;
   
    
}
