package Q_01;

public abstract class Ingresso {
    private double valor;

    private String filme;

    private OpcaoAudio audio;

    public abstract Double getRealValor();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public OpcaoAudio getAudio() {
        return audio;
    }

    public void setAudio(OpcaoAudio audio) {
        this.audio = audio;
    }
}
