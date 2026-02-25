public class Nazione {
    private String denominazione;
    private double superficieKmQ;
    private int numeroAbitanti;

    public Nazione(String denominazione, double superficieKmQ, int numeroAbitanti) {
        this.denominazione = denominazione;
        this.superficieKmQ = superficieKmQ;
        this.numeroAbitanti = numeroAbitanti;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public double getSuperficieKmQ() {
        return superficieKmQ;
    }

    public void setSuperficieKmQ(double superficieKmQ) {
        this.superficieKmQ = superficieKmQ;
    }

    public int getNumeroAbitanti() {
        return numeroAbitanti;
    }

    public void setNumeroAbitanti(int numeroAbitanti) {
        this.numeroAbitanti = numeroAbitanti;
    }

    @Override
    public String toString() {
        return "Nazione{" +
                "denominazione='" + denominazione + '\'' +
                ", superficieKmQ=" + superficieKmQ +
                ", numeroAbitanti=" + numeroAbitanti +
                '}';
    }

    /**
     * Verifica se la nazione corrente è più estesa di quella fornita come parametro.
     * @param input Nazione da confrontare
     * @return true se la nazione corrente è più estesa, altrimenti false.
     */
    public boolean piuEstesaDi(Nazione input) {
        if (input == null) {
            return false;
        }
        return this.superficieKmQ > input.superficieKmQ;
    }


    /**
     * Verifica se la nazione corrente è più popolosa di quella fornita come parametro.
     * @param input Nazione da confrontare
     * @return true se la nazione corrente è più popolosa, altrimenti false.
     */
    public boolean piuPopolosaDi(Nazione input){
        if (input == null) {
            return false;
        }
        return this.numeroAbitanti > input.numeroAbitanti;
    }
}
