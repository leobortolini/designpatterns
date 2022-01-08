package proxy;


public class Proxy {

    public static void main(String[] args) {
    	//chamando o construtor proxy de universidade, que verifica os parametros antes de instanciar uma Universidade
    	//esse parametro, com base nas regras implementadas, nao permite a criação da universidade
        Universidade universidade = new UniversidadeProxy("errado");
        System.out.println("Login Incorreto");
        System.out.println(universidade.getNomeInstituicao());
        System.out.println(universidade.getNomeCurso());
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
      //chamando o construtor proxy de universidade, que verifica os parametros antes de instanciar uma Universidade
    	//esse parametro, com base nas regras implementadas, permite a criação da universidade
        universidade = new UniversidadeProxy("correto");
        System.out.println("Login válido");
        System.out.println(universidade.getNomeInstituicao());
        System.out.println(universidade.getNomeCurso());
    }

}
