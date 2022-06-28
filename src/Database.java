import java.util.ArrayList;

public class Database {
    private ArrayList<Personaggio> listaPersonaggi;

    public Database(){
        listaPersonaggi= new ArrayList<>();
    }

    public void addPersonaggio(Personaggio p1){
        listaPersonaggi.add(p1);
    }

    public Personaggio getPersonaggio(int i){
        return listaPersonaggi.get(i);
    }

    public int sizeListaPersonaggi(){
        int n= listaPersonaggi.size();
        return n;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0; i<listaPersonaggi.size(); i++){
            s+= listaPersonaggi.get(i)+"\n";
        }
        return s;
    }
}
