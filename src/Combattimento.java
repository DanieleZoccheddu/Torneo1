import java.util.Random;

public class Combattimento {
    private Personaggio p1;
    private Personaggio p2;

    private Random random = new Random();
    public Combattimento(Personaggio p1, Personaggio p2){
        this.p1 = p1;
        this.p2 = p2;

    }

    public Personaggio combatti(){
        boolean chiInizia;
        chiInizia = random.nextBoolean();

        while (p1.getPuntiVita() > 0 && p2.getPuntiVita() > 0 ){
            if(chiInizia){
                //attacca p1

            }
            else{
                //attacca p2
            }

            chiInizia = !chiInizia;

        }

    }



}
