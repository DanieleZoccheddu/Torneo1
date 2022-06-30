import java.util.ArrayList;
import java.util.Random;

public class Personaggio {
    private String nome;
    private double puntiVita;
    private int forzaFisica;
    private double resistenzaFisica;
    private double schivata;
    private ArrayList<Attacco> listaAttacchi;
    private Attacco attaccoBase;

    private double puntiVitaIniziali;


    private final Enum <Razza> razza;

    public Personaggio(String nome, double puntiVita, int forzaFisica, double resistenzaFisica, double schivata, Enum<Razza>razza){
        Random rand= new Random();
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.forzaFisica = forzaFisica;
        this.resistenzaFisica = resistenzaFisica;
        this.schivata = schivata;
        this.razza=razza;
        this.puntiVitaIniziali = puntiVita;
        listaAttacchi= new ArrayList<>();
        attaccoBase= new Attacco("Attacco Base", this.forzaFisica, 0.4+rand.nextDouble()*0.3);
    }

    @Override
    public String toString() {
        String s="";
        return  s+="Nome" + nome+ " Attacco base: "+attaccoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(double puntiVita) {
        this.puntiVita = puntiVita;
    }

    public int getForzaFisica() {
        return forzaFisica;
    }

    public void setForzaFisica(int forzaFisica) {
        this.forzaFisica = forzaFisica;
    }

    public double getResistenzaFisica() {
        return resistenzaFisica;
    }

    public void setResistenzaFisica(double resistenzaFisica) {
        this.resistenzaFisica = resistenzaFisica;
    }

    public double getSchivata() {
        return schivata;
    }

    public void setSchivata(double schivata) {
        this.schivata = schivata;
    }

    public ArrayList<Attacco> getListaAttacchi() {
        return listaAttacchi;
    }

    public void setListaAttacchi(Attacco a) {

        this.listaAttacchi.add(a);
    }

    public Attacco getAttaccoBase() {
        return attaccoBase;
    }

    public void setAttaccoBase(Attacco attaccoBase) {
        this.attaccoBase = attaccoBase;
    }

    public Enum<Razza> getRazza() {
        return razza;
    }

    public double getPuntiVitaIniziali() {
        return puntiVitaIniziali;
    }

    public void attacca(Personaggio p2){
        double percentualeRiuscita = attaccoBase.getProbabilitaASegno() * p2.schivata;
        boolean riesce; //l'attacco va a segno
        boolean attaccoBase;
        Random random = new Random();
        System.out.println("Sta attaccando: " + nome);
        attaccoBase = random.nextBoolean();

        if(attaccoBase){
            //scaglia l'attacco base
            System.out.println(nome + " sta usando l'attacco base");
            if(random.nextDouble() < percentualeRiuscita){
                System.out.println("L'attacco va a segno");
                p2.setPuntiVita((p2.getPuntiVita() - (forzaFisica * p2.getResistenzaFisica())));
                System.out.println("Danno ricevuto " + forzaFisica * p2.getResistenzaFisica() );
                System.out.println("Vita di " + p2.getNome() + ": " + p2.getPuntiVita()+"\n");
            }
            else
            {
                System.out.println("Attacco fallito\n");
            }

        }
        else{
            //scaglia attacco speciale
            System.out.println(nome + " sta usando l'attacco speciale");

            int scegliMossa = random.nextInt(4);
            percentualeRiuscita = listaAttacchi.get(scegliMossa).getProbabilitaASegno() * p2.schivata;

            if(random.nextDouble() < percentualeRiuscita){
                System.out.println("L'attacco " + listaAttacchi.get(scegliMossa).getNome() +  " va a segno");
                p2.setPuntiVita((p2.getPuntiVita() - (listaAttacchi.get(scegliMossa).getQuantitaDanno() * p2.getResistenzaFisica())));
                System.out.println("Danno ricevuto " + listaAttacchi.get(scegliMossa).getQuantitaDanno() * p2.getResistenzaFisica() );
                System.out.println("Vita di " + p2.getNome() + ": " + p2.getPuntiVita()+"\n");
            }
            else
            {
                System.out.println("Attacco fallito\n");
            }

        }

    }
}
