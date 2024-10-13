public class Impiegato extends Dipendente {

    //attributi
    private Dipendente boss;

    //costruttore
    public Impiegato(String nome, double pagaOraria, Dipendente boss) {
        super(nome, pagaOraria);
        this.boss = boss;
    }

    @Override
    public double calcolaRAL() {
        double tredicesima = pagaMese() * 0.8;
        double pagaAnno = pagaMese() * 12;
        return pagaAnno + tredicesima;
    }
}
