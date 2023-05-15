package jframemusica;

import java.io.*;
import java.util.*;

public class Controller {

    public static boolean exists(int id, String artista, String disco, int ap) {
        boolean exists = false;
        for (Model m : VentanaPrincipal.discos_al) {
            if (m.getId() == (id)
                    && m.getArtista().equalsIgnoreCase(artista)
                    && m.getDisco().equalsIgnoreCase(disco)
                    && m.getAp() == (ap)) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean exists(int id) {
        boolean exists = false;
        for (Model m : VentanaPrincipal.discos_al) {
            if (m.getId() == (id)) {
                exists = true;
                break;
            }
        }
        return exists;

    }

    public static List<Model> read(String nra) {
        List<Model> discos_al = new ArrayList<Model>();
        String file = "";
        File f;
        FileReader fr;
        BufferedReader br;
        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            while ((file = br.readLine()) != null) {
                if (i != 0) {
                    String[] campo = file.split(";");

                    Model m = new Model(Integer.parseInt(campo[0]), campo[1], campo[2], Integer.parseInt(campo[3]));
                    discos_al.add(m);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }

        return discos_al;
    }

    public static void write(List<Model> discos_al) {
        File f = new File(VentanaPrincipal.nra);
        try {
            FileWriter fw = new FileWriter(f, false);
            BufferedWriter bw = new BufferedWriter(fw);
            int i = 0;
            for (Model m : discos_al) {
                if (i == 0) {
                    bw.write("ID;ARTISTA;DISCO;AÑO_PUBLICACION\n");

                }
                bw.write(m.getId() + ";" + m.getArtista() + ";" + m.getDisco() + ";" + m.getAp() + "\n");
                bw.flush();
                i++;
            }
        } catch (IOException ex) {
            System.out.println("ERROR DE ESCRITURA");
        }
    }

    public static boolean isBlank(String str) {
        boolean i = str.length() > 0;

        return i;
    }
}
