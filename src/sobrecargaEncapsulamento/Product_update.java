package sobrecargaEncapsulamento;

public class Product_update {

    //region Atributos
    private String name;
    private int quantity;
    private double price, valor_total;
    //endregion

    //region Constructor
    public Product_update(String name, int quantity, double price){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //endregion

    //region Getters
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getValor_total() {
        this.valor_total = this.quantity * this.price;
        return valor_total;
    }

    //endregion

    public void retirada(int num){
        this.quantity -= num;
        this.valor_total = this.quantity * this.price;
    }

    public void entrada(double num){
        this.quantity += num;
        this.valor_total = this.quantity * this.price;
    }

    public String toString() {
        return name + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units,  Total: $"
                + String.format("%.2f", getValor_total());
    }
}
