import com.google.gson.Gson;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.setMarca("Fiat");
        carro.setModelo("Argo");
        carro.setAnoFabricacao(2020);
        carro.setPreco(53000.00);

        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(carro);

        System.out.println("Objeto veículo serializado para JSON: ");
        System.out.println(jsonVeiculo);
    }
}
