package aula08.Ex1;

public class LigeiroEletrico extends Veiculo implements VeiculoEletrico{

    static int autonomia = 100;

    public LigeiroEletrico(String matricula, String marca, String modelo, int cv) {
        super(matricula, marca, modelo, cv);
    }

    @Override
    public int autonomia() {
        int n = 0;
        if (autonomia-50<0) {
            System.out.println("Sem autonomia!");
            return n;
        }
        autonomia -= 50;
        return autonomia-50;
    }

    @Override
    public void carregar(int percentagem) {
        if (autonomia < 0) {
            autonomia = percentagem;   
        }
        else {
            autonomia += percentagem;
        }        
    }

    @Override
    public String toString() {
        return "Carro elétrico:" + super.toString() + " ||| Autonomia: " + autonomia; 
    }
    
}
