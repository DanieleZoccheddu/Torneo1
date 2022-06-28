import java.util.ArrayList;
import java.util.Random;

public class Personaggio {
    private String nome;
    private int puntiVita;
    private int forzaFisica;
    private double resistenzaFisica;
    private double schivata;
    private ArrayList<Attacco> listaAttacchi;
    private Attacco attaccoBase;

    private final Enum <Razza> razza;

    public Personaggio(String nome, int puntiVita, int forzaFisica, double resistenzaFisica, double schivata, Enum<Razza>razza){
        Random rand= new Random();
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.forzaFisica = forzaFisica;
        this.resistenzaFisica = resistenzaFisica;
        this.schivata = schivata;
        this.razza=razza;
        listaAttacchi= new ArrayList<>();
        attaccoBase= new Attacco("Attacco Base", this.forzaFisica, 0.4+rand.nextDouble(0.3));
    }

    @Override
    public String toString() {
        String s="";
        return  s+="Nome" + nome+ " Attacco base: "+attaccoBase;
    }
}
