package lab8p2_equipo4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AdminSerVivos {

    private ArrayList<Servivo> SeresVivos = new ArrayList();
    private File archivo = null;

    public AdminSerVivos(String Ruta) {
        File archivo = new File(Ruta);
    }

    public void setListaPersonas(ArrayList<Servivo> SeresVivos) {
        this.SeresVivos = SeresVivos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAlumno(Servivo a) {
        SeresVivos.add(a);
    }

    public ArrayList<Servivo> getListaUniverso() {
        return SeresVivos;
    }

    public void cargarArchivo() {
        try {
            SeresVivos = new ArrayList();
            Servivo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Servivo) objeto.readObject()) != null) {
                        SeresVivos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Servivo t : SeresVivos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
