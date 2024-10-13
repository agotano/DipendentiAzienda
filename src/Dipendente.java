public abstract class Dipendente {


    // attributi
    private String nome;
    private double pagaOraria;

    // costruttore
    public Dipendente(String nome, double pagaOraria) {
        this.nome = nome;
        this.pagaOraria = pagaOraria;
    }

    // metodi
    public double pagaGiorno() {
        return pagaOraria * 8;
    }

    public double pagaMese() {
        return pagaGiorno() * 20;
    }

    public abstract double calcolaRAL();

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
