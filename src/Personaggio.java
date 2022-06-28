public class Personaggio {
    private String nome;
    private int puntiVita;
    private int forzaFisica;
    private float resistenzaFisica;
    private float schivata;

    private final Enum <Razza> razza;

    public Personaggio(String nome, int puntiVita, int forzaFisica, float resistenzaFisica, float schivata, Enum<Razza>razza){
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.forzaFisica = forzaFisica;
        this.resistenzaFisica = resistenzaFisica;
        this.schivata = schivata;
        this.razza=razza;
    }

}
