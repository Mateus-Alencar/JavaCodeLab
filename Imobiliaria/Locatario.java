public class Locatario {
    private String nome;
    private boolean inadiplente;

    public Locatario(String nome, boolean inadiplente){
        this.nome = nome;
        this.inadiplente = inadiplente;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public boolean getInadiplente(){
        return inadiplente;
    }
    public void setInadiplente(boolean inadiplente){
        this.inadiplente = inadiplente;
    }

    public void marcarComoDevedor() {
        this.inadiplente = true;
    }
}
