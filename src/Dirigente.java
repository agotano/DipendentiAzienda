public class Dirigente extends Dipendente{

    // attributi
    private double bonus;

    // costruttore


    public Dirigente(String nome, double pagaOraria, double bonus) {
        super(nome, pagaOraria);
        this.bonus = bonus;
    }

    @Override
    public double calcolaRAL() {
        double tredicesima = pagaMese() * 0.8;
        double pagaAnno = pagaMese() * 12;
        double pagaAnnoNoBonus = pagaAnno + tredicesima;
        double pagaAnnoBonus = pagaAnnoNoBonus * (bonus / 100);
        return pagaAnnoNoBonus + pagaAnnoBonus;
    }
}
