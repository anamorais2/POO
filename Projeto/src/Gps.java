import java.io.*;
/**
 * Classe para gerir a Localização
 * @author ferna
 * @version 1.0
 */
public class Gps implements Serializable {
    /**
     * Coordenada Latitude de uma Empresa
     */
    private float latitude;
    /**
     * Coordenada Longitude de uma Empresa
     */
    private float longitude;
    /**
     * Método Construtor Gps
     * @param latitude Latitude de uma Empresa
     * @param longitude Longitude de uma Empresa
     */
    public Gps(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    /**
     * Método de acesso externo á Latitude de uma Empresa
     * @return (float) Latitude de uma Empresa
     */
    public float getLatitude() {
        return latitude;
    }
    /**
     * Método Complementar de acesso externo á Latitude de uma Empresa
     * @param latitude Latitude de uma Empresa
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    /**
     * Método de acesso externo á Longitude de uma Empresa
     * @return (float) Longitude de uma Empresa
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Método Complementar de acesso externo á Longitude de uma Empresa
     * @param longitude (float) Longitude de uma Empresa
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    /**
     * Método que Retorna os Dados de uma Coordenada Gps
     * @return Dados de uma Coordenada Gps
     */
    @Override
    public String toString() {
        return "Coordenadas GPS:" + "\n" + latitude + "\n." + longitude;
    }
}