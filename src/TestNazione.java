public class TestNazione {
    public static void main(String[] args) {
        System.out.println( "\n *** Test se una nazione è più estesa di un'altra ***");
        Nazione italia = new Nazione("Italia", 301338, 60461826);
        Nazione spagna = new Nazione("Spagna", 505990, 46754778);
        System.out.println("Atteso true se nazione 1 è più estesa di nazione 2, altrimenti false");
        System.out.println(italia.piuEstesaDi(spagna));
        System.out.println("*** Test End ***");




        System.out.println( "\n *** Test se una nazione è più popolosa di un'altra ***");
        Nazione francia = new Nazione("Francia", 602500, 64513242);
        Nazione germania = new Nazione("Germania", 357522, 83783942);
        System.out.println("Atteso true se nazione 1 è più popolosa di nazione 2, altrimenti false");
        System.out.println(francia.piuPopolosaDi(germania));
        System.out.println("*** Test End ***");




        System.out.println("\n *** Test se esiste una nazione piu estesa di tutte le altre *** ");
        Nazione portogallo = new Nazione("Portogallo", 92212, 10300000);
        Nazione svizzera = new Nazione("Svizzera", 41285, 8800000);
        Nazione norvegia = new Nazione("Norvegia", 385207, 5500000);
        Nazione svezia = new Nazione("Svezia", 450295, 10500000);

        Nazione[] nazioni = { portogallo, svizzera, norvegia, svezia };
        System.out.println("Atteso true se esiste una nazione piu estesa di tutte le altre, altrimenti false");
        System.out.println(svizzera.esisteAlmenoUnaPiuEstesa(nazioni));


        System.out.println("\n *** Test sul conteggio di quante nazioni sono piu popolose di un altra ***");
        Nazione canada = new Nazione("Canada", 9984670, 40000000);
        Nazione giappone = new Nazione("Giappone", 377975, 30000000);
        Nazione australia = new Nazione("Australia", 7692024, 20000000);
        Nazione messico = new Nazione("Messico", 1964375, 10000000);
        Nazione[] nazioni2 = { canada, giappone, messico };

        System.out.println("Atteso un numero > 0 se esiste una nazione piu popolosa di tutte le altre, altrimenti 0");
        System.out.println(australia.dimmiQuanteSonoPiuPopolose(nazioni2));
        System.out.println("*** Test End ***");


        System.out.println("\n *** Test sul controllo se la nazione ha più abitanti di tutte le altre ***");
        Nazione brasile = new Nazione("Brasile", 8515767, 203000000);
        Nazione egitto = new Nazione("Egitto", 1002450, 11200);
        Nazione argentina = new Nazione("Argentina", 2780400, 46000000);
        Nazione[] nazioni3 = { brasile, argentina };
        System.out.println("Atteso true se questa nazione è la più popolosa, altrimenti false");
        System.out.println(egitto.haPiuAbitantiDiTutteLeAltre(nazioni3));
        System.out.println("*** Test End ***");



        System.out.println("\n *** Test se tutte le nazioni hanno la stessa iniziale ***");
        Nazione italia2 = new Nazione("Italia", 301338, 60461826);
        Nazione irlanda = new Nazione("Irlanda", 70273, 5300000);
        Nazione islanda = new Nazione("Islanda", 103000, 380000);
        Nazione[] nazioni4 = { irlanda, islanda };

        System.out.println("Atteso true se tutte iniziano con la stessa lettera, altrimenti false");
        System.out.println(italia2.hannoTutteLaMiaStessaIniziale(nazioni4));
        System.out.println("*** Test End ***");




        System.out.println("\n *** Test se la superficie è sopra la media ***");
        Nazione cina = new Nazione("Cina", 9596961, 1410000000);
        Nazione belgio = new Nazione("Belgio", 30528, 11700000);
        Nazione olanda = new Nazione("Olanda", 41850, 17500000);
        Nazione grecia = new Nazione("Grecia", 131957, 10400000);
        Nazione[] nazioni5 = { belgio, olanda, grecia };

        System.out.println("Atteso true se cina ha superficie sopra la media, altrimenti false");
        System.out.println(cina.eAlDiSopraDellaMediaComeSuperficie(nazioni5));
        System.out.println("*** Test End ***");
    }
}
