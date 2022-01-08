package proxy;

public class UniversidadeProxy extends Universidade {

    public String login;

    public UniversidadeProxy(String login) {
        this.login = login;
    }

    @Override
    public String getNomeInstituicao() {
        if (verificarLogin()) {
            return super.getNomeInstituicao();
        }
        return "Instituição inválida";
    }

    @Override
    public String getNomeCurso() {
        if (verificarLogin()) {
            return super.getNomeCurso();
        }
        return "Nome Inválido";
    }

    private boolean verificarLogin() {
        return login == "correto";
    }
}
