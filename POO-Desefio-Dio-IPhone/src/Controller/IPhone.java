package Controller;

public class IPhone extends Telefone implements ReprodutorMusical, NavegadorInternet{

    @Override
    public void tocar() {
        selecionarMusica();
        System.out.println("Tocando a musica selecionada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma musica");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo uma pagina WEB");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova pagina WEB.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina WEB.");

    }
}
