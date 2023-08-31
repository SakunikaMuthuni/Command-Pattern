public class BuyStock implements Order {
    private Stock abStock;

    public BuyStock(Stock abStock) {
        this.abStock = abStock;
    }

    public void execute() {
        abStock.buy();
    }

}
