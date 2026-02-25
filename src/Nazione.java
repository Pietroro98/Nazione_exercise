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

}
