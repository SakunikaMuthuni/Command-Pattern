public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abStock);
        SellStock sellStockOrder = new SellStock(abStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
