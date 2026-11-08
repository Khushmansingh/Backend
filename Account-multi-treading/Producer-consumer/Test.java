public class Test {

    public static void main(String[] args) throws InterruptedException {
        OrderQueue orderQueue = new OrderQueue();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    Order order = new Order(i, "Customer " + i);
                    orderQueue.produceOrder(order);
                    System.out.println("Produced: " + order.getOrderid()
                            + " - " + order.getName());
                }
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    Order order = orderQueue.consumeOrder();
                    System.out.println("Consumed: " + order.getOrderid()
                            + " - " + order.getName());
                }
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        if (orderQueue.getQueueSize() != 0) {
            throw new AssertionError("Queue should be empty after consuming all orders");
        }

        System.out.println("Test passed.");
    }
}
