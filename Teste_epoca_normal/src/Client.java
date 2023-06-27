public class Client {

    private int numContribuinte;
    private String nome;
    private ClientType type;

    public Client(int numContribuinte, String nome, ClientType type) {
        this.numContribuinte = numContribuinte;
        this.nome = nome;
        this.type = type;
    }
    public int getNumContribuinte() {
        return numContribuinte;
    }
    public void setNumContribuinte(int numContribuinte) {
        this.numContribuinte = numContribuinte;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ClientType getType() {
        return type;
    }
    public void setType(ClientType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Client";
    }

    
}
