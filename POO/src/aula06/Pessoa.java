package aula06;

public class Pessoa {
    
	protected String nome;
    protected int cc;
    protected DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
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

    @Override
    public String toString() {
        return "Pessoa c/nome: " + nome + ", cc: " + cc + " e data de nasc: " + dataNasc;
    }

}
