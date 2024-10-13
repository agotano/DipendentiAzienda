public class Stagista extends Impiegato{

    //attributi
    private double forfait;

    //costruttore
    public Stagista(String nome, Dipendente boss, double forfait) {
        super(nome, 0,boss);
        this.forfait = forfait;
    }

    @Override
    public double calcolaRAL() {
        return forfait * 12;
    }
}
