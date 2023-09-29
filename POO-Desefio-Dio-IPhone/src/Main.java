import Controller.IPhone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.ligar();
        iphone.atender();

        iphone.iniciarCorrerioVoz(true);

        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}