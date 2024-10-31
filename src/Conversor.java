import com.google.gson.annotations.SerializedName;

public class Conversor {
    @SerializedName("base_code")
    private String moneda;

    @SerializedName("target_code")
    private String segundaMoneda;

    @SerializedName("conversion_rate")
    private String valor;

    @SerializedName("conversion_result")
    private String result;

    public Conversor() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getSegundaMoneda() {
        return segundaMoneda;
    }
    public void setSegundaMoneda(String segundaMoneda) {
        this.segundaMoneda = segundaMoneda;
    }

    @Override
    public String toString() {
        return "\nEl valor de la tasa de conversión es de: " + valor +" "+segundaMoneda+
                "\nConversión: " + result +" "+segundaMoneda+"\n";
    }
}
