public class Auto {
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public Auto(String marca, String modello){
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModello(){
        return modello;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public int getCilindrata(){
        return cilindrata;
    }

    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }

    public String getTarga(){
        return targa;
    }

    public void setTarga(String targa){
        this.targa = targa;
    }

}
