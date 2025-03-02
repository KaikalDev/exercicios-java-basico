package Q_03;

public class relogioEUA extends Relogio {

    private boolean isPM;

    public relogioEUA(int hora, int minuto, int segundo, boolean isPM) {
        super(hora, minuto, segundo);
        this.isPM = isPM;
    }

    public boolean isPM() {
        return isPM;
    }

    public void setPM(boolean PM) {
        isPM = PM;
    }

    @Override
    public void setHora(int hora) {
        if (hora >= 1 && hora <= 12) {
            setHora(hora);
        } else {
            throw new IllegalArgumentException("Hora inválida para o relógio americano!");
        }
    }

    @Override
    public void sincronizarHorario(Relogio outroRelogio) {
        int horaOutro = outroRelogio.getHora();

        if (horaOutro == 0) {
            setHora(12);
            this.isPM = false;
        } else if (horaOutro >= 1 && horaOutro <= 12) {
            setHora(horaOutro);
            this.isPM = false;
        } else {
            setHora(horaOutro - 12);
            this.isPM = true;
        }

        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());
    }

    @Override
    public String getHorario() {
        return String.format("%02d:%02d:%02d %s", getHora(), getMinuto(), getSegundo(), isPM ? "PM" : "AM");
    }
}
