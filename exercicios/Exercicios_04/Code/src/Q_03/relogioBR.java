package Q_03;

public class relogioBR extends Relogio {

    public relogioBR(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void sincronizarHorario(Relogio outroRelogio) {
        setHora(outroRelogio.getHora());
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());
    }
}
