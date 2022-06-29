public class Main {
    public static void main(String[] args) {
        Personaggio p1 = new Personaggio("Goku", 3000, 2000, 0.8, 0.5, Razza.SAYAN);
        Personaggio p2 = new Personaggio("Lunch", 3000000, 2000, 0.8, 0.5, Razza.UMANO);
        System.out.println(p1);
        Attacco a1 = new Attacco("Testata", 50, 0.5);
        Attacco a2 = new Attacco("Gomitata", 50, 0.5);
        Attacco a3 = new Attacco("Calcio nelle palle", 999, 0.5);
        Attacco a4 = new Attacco("Dito nell'occhio", 50, 0.5);
        Attacco a5 = new Attacco("Kamehameha", 600, 0.5);
        Attacco a6 = new Attacco("Coltellata", 5, 0.5);
        Attacco a7 = new Attacco("Starnuto", 50, 0.5);
        Attacco a8 = new Attacco("Rutto", 50, 0.5);

        p1.setListaAttacchi(a1);
        p1.setListaAttacchi(a2);
        p1.setListaAttacchi(a3);
        p1.setListaAttacchi(a4);
        p2.setListaAttacchi(a5);
        p2.setListaAttacchi(a6);
        p2.setListaAttacchi(a7);
        p2.setListaAttacchi(a8);


        Combattimento c = new Combattimento(p1,p2);
        c.combatti();
    }
}
