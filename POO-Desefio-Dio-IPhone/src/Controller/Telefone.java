package Controller;

public class Telefone {
    private boolean correioVoz;

    public Telefone() {
    }

    public void ligar(){
        System.out.println("Discando um numero e ligando.");
    }

    public void atender(){
        System.out.println("Alguém está ligando para vc, atendendo ligação!!");
    }

    public void iniciarCorrerioVoz(boolean correioVoz){
        if (correioVoz) {
            System.out.println("Você tem uma mensagem no correio de voz, iniciando a mensagem!!!");
        } else System.out.println("Você não tem uma mensagem gravada no correio de voz.");
    }
}
