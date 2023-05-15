package jframemusica;

public class Model {

    private int id;
    private String artista;
    private String disco;
    private int ap;

    public Model() {
    }

    public Model(int id, String artista, String disco, int ap) {
        this.id = id;
        this.artista = artista;
        this.disco = disco;
        this.ap = ap;
    }

    public Model(int id) {
        this.id = id;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    @Override
    public String toString() {
        return "Model{" + "id=" + id + ", artista=" + artista + ", disco=" + disco + ", ap=" + ap + '}';
    }

    public static String cabecera() {
        String cabecera = String.format  ("%7s  %-25s  %-30s  %18s  \n", "IDDISCO", "ARTISTA", "DISCO", "AÑO DE PUBLICACIÓN" );
        String subrrayado = String.format("%7s  %-25s  %-30s  %18s \n","-------", "-------", "-----", "------------------" );
        return cabecera + subrrayado;

    }
    
        public String cuerpo() {
   
        String cuerpo = String.format("%7d  %-25s  %-30s  %18d\n", id, artista, disco, ap);
        return cuerpo;
    }
}
