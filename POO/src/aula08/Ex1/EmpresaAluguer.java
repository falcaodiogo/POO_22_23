package aula08.Ex1;

public class EmpresaAluguer {

    private String nome;
    private String codigoPostal;
    private String email;

    public EmpresaAluguer(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    // verifica se está no formato XXXX-YYY
    public void setCodigoPostal(String CP) {
        if (CP.matches("[0-9]{4}-[0-9]{3}")) {
            this.codigoPostal = CP;
        } else {
            System.out.println("Codigo postal inválido");
        }
    }

    public void setEmail(String e) {
        this.email = e;
    }

    @Override
    public String toString() {
        return "Empresa de aluguer: " + nome + ", codigo postal: " + codigoPostal + ", email: " + email;
    }
    
}
