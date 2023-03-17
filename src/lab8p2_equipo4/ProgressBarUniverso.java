package lab8p2_equipo4;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class ProgressBarUniverso extends Thread {

    private int SeresVivos, SeresVivosSubido;
    private javax.swing.JProgressBar progressBar;
    boolean pausa, vivo;

    public ProgressBarUniverso(int SeresVivos, int SeresVivosSubido, JProgressBar progressBar) {
        this.SeresVivos = SeresVivos;
        this.SeresVivosSubido = SeresVivosSubido;
        this.progressBar = progressBar;
        vivo = true;
        pausa = false;
    }

    public int getSeresVivos() {
        return SeresVivos;
    }

    public void setSeresVivos(int SeresVivos) {
        this.SeresVivos = SeresVivos;
    }

    public int getSeresVivosSubido() {
        return SeresVivosSubido;
    }

    public void setSeresVivosSubido(int SeresVivosSubido) {
        this.SeresVivosSubido = SeresVivosSubido;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public void run() {
        while (vivo) {
            while (!pausa) {
                while (SeresVivosSubido < this.SeresVivos) {
                    progressBar.setMaximum(this.SeresVivos);
                    progressBar.setValue(SeresVivosSubido);
                    SeresVivosSubido++;
                    if (SeresVivosSubido <= SeresVivos) {
                        vivo = false;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProgressBarUniverso.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBarUniverso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProgressBarUniverso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
