import java.util.Random;

public class Combattimento {
    private Personaggio p1;
    private Personaggio p2;

    private Random random = new Random();
    public Combattimento(Personaggio p1, Personaggio p2){
        this.p1 = p1;
        this.p2 = p2;

    }

    public void combatti(){
        boolean chiInizia;
        chiInizia = random.nextBoolean();

        while (p1.getPuntiVita() > 0 && p2.getPuntiVita() > 0 ){
            if(chiInizia){
                p1.attacca(p2);    //attacca p1

            }
            else{
                p2.attacca(p1);    //attacca p2
            }

            chiInizia = !chiInizia;

        }
        if(p1.getPuntiVita() > 0){
            System.out.println("Ha vinto: " + p1.getNome());
        }
        else{
            System.out.println("Ha vinto: " + p2.getNome());
        }

        p1.setPuntiVita(p1.getPuntiVitaIniziali());
        p2.setPuntiVita(p2.getPuntiVitaIniziali());

    }



}
