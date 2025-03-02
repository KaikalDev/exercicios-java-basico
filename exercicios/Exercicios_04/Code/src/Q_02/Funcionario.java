package Q_02;

public abstract class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private final boolean isAdmin;

    protected Funcionario(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void alteraSenha(String senha) {
        this.senha = senha;
    }

    public void alteraDados(Funcionario funcionario) {
        this.nome = funcionario.getNome();
        this.email = funcionario.getEmail();
    };

    public void Login() {}

    public void logoff() {}
}
