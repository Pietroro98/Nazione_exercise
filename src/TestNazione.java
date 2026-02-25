public class TestNazione {
    public static void main(String[] args) {
        System.out.println( " *** Test se una nazione è più estesa di un'altra ***");
        Nazione italia = new Nazione("Italia", 301338, 60461826);
        Nazione spagna = new Nazione("Spagna", 505990, 46754778);
        System.out.println("Atteso true se nazione 1 è più estesa di nazione 2, altrimenti false");
        System.out.println(italia.piuEstesaDi(spagna));
        System.out.println("*** Test End ***");




    }
}
