package aula06;

public class Professor extends Pessoa{

    private String funcao;
    private String departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, String funcao, String departamento) {
        super(nome, cc, dataNasc);
        this.funcao = funcao;
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

    public void setFuncao(String f) {
        this.funcao = f;
    }

    public void setDepartamento(String d) {
        this.departamento = d;
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

    public String getFuncao() {
        return funcao;
    }

    public String getDepartamento() {
        return departamento;
    }
    
}
