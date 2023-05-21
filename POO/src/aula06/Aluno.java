package aula06;

import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import javax.print.attribute.standard.DateTimeAtCompleted;
// NOTA -> em vez de chamar o LocalDateTime sempre que o porgrama for corrido, a guarda não vai ser guardada!!!!!!!
public class Aluno extends Pessoa{

    private DateYMD datainsc;
    private static int NMecAtribuition = 100;
    private int NMec;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD datainsc) {
        super(nome, cc, dataNasc);
        this.datainsc = datainsc;
        this.NMec = ++NMecAtribuition;
    }

    public Aluno(String nome, int cc, DateYMD dataNasc) {
        super(nome, cc, dataNasc);
        this.NMec = ++NMecAtribuition;
    }
 
    int getNMec() {
        return NMecAtribuition;
    }   
    
    public void setNome(String n) {
        this.nome = n;
    }

    public void setCC(int cc) {
        if (cc > 10000000 && cc < 99999999)
        {  
            this.cc = cc;
        }
    }

    public void setData(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public int getCC() {
        return cc;
    }

    public DateYMD getDate() {
        return dataNasc;
    }

    public void setDataInsc(DateYMD datainsc) {
        this.datainsc = datainsc;
    }

    // data atual:
    //     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    //    LocalDateTime now = LocalDateTime.now();  
    //    System.out.println(dtf.format(now));  

    public String toString() {
        if (datainsc != null)
            return super.toString() + " data insc " + LocalDateTime.now() + " num mecan: " + NMec;
        else
            return super.toString() + " data insc " + datainsc + " num mecan: " + NMec;
    }

    public String getName() {
        return nome;
    }
    
} 
