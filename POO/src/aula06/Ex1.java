package aula06;

public class Ex1 {

    public static void main(String[] args) {

        // DateYMD d = new DateYMD(5, 10, 1988); 
        // Pessoa p = new Pessoa("Ana Santos", 98012244, d);
        // System.out.println(p);        

        // Aluno n = new Aluno("Diogo", 10000000, d);
        // System.out.println(n);

        // Aluno a = new Aluno("Ana", 10900000, d);
        // System.out.println(a);

        // Aluno b = new Aluno("Jonhy", 8900089, d, d);
        // System.out.println();

        Aluno al = new Aluno ("Andreia Melo", 9855678, 
        new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018)); 
        Professor p1 = new Professor("Jorge Almeida", 3467225, new DateYMD(13, 3, 1967),  "Associado", "Informática"); 
        Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new DateYMD(11, 5, 1985), p1, 900); 
        bls.setBolsa(1050); 
   
        System.out.println("Aluno: " + al.getName()); 
        System.out.println(al); 
        
        System.out.println("Bolseiro: " + bls.getName() + ", NMec: "  
            + bls.getNMec() + ", Bolsa: " +  bls.getBolsa() + ", Orientador: " +  
        bls.getOrientador()); 
        System.out.println(bls);
    }
    
}
