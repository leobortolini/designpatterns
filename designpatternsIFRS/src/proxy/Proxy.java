package proxy;


public class Proxy {

    public static void main(String[] args) {
        Universidade universidade = new UniversidadeProxy("errado");
        System.out.println("Login Incorreto");
        System.out.println(universidade.getNomeInstituicao());
        System.out.println(universidade.getNomeCurso());
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        universidade = new UniversidadeProxy("correto");
        System.out.println("Login válido");
        System.out.println(universidade.getNomeInstituicao());
        System.out.println(universidade.getNomeCurso());
    }

}
