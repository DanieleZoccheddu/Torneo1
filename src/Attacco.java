public class Attacco {
    private String nome;
    private int quantitaDanno;
    private double probabilitaASegno;
    private String tipo;

    public Attacco(String nome, int quantitaDanno, double probabilitaASegno){
        this.nome= nome;
        this.quantitaDanno= quantitaDanno;
        this.probabilitaASegno= probabilitaASegno;
    }

    @Override
    public String toString() {
        return "Attacco{" +
                "nome='" + nome + '\'' +
                ", quantitaDanno=" + quantitaDanno +
                ", probabilitaASegno=" + probabilitaASegno +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
