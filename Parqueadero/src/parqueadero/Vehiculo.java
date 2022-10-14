package parqueadero;

public class Vehiculo {
    
    private String placa;
    private String modelo;
    private String marca;
    private Duenio duenio;
        
    public Vehiculo(String placa, String modelo, String marca, Duenio duenio){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.duenio = duenio;
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

}
