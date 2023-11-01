package Hotel;

import java.time.Duration;

public class Service {
    private int anoOut;
    private int diaIn;
    private int mesIn;
    private int anoIn;
    private int mesOut;
    private int diaOut;
    private int duracao;

    public Service(int diaIn, int mesIn, int anoIn, int diaOut, int mesOut, int anoOut) {
        // Check-In
        this.diaIn = diaIn;
        this.mesIn = mesIn;
        this.anoIn = anoIn;
        // Check-Out
        this.diaOut = diaOut;
        this.mesOut = mesOut;
        this.anoOut = anoOut;
        Duration(diaIn, mesIn, anoIn, diaOut, mesOut, anoOut);

    }

    public void calMes() {
        if (mesIn - mesOut != 0 || mesOut - mesIn != 0) {
        }
    }

    public void Duration(int diaIn, int mesIn, int anoIn, int diaOut, int mesOut, int anoOut) {

    }
}
