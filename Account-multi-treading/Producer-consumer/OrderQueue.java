import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    
    private int limit = 3;

    private final Queue<Order> q = new LinkedList<>();

    public synchronized void produceOrder(Order order) throws InterruptedException {
        while (q.size() >= limit) {
            wait();
        }

        q.add(order);
        notifyAll();
    }

    public synchronized Order consumeOrder() throws InterruptedException {
        while (q.isEmpty()) {
            wait();
        }

        Order order = q.remove();
        notifyAll();
        return order;
    }

    public synchronized int getLimit() {
        return limit;
    }

    public synchronized void setLimit(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Queue limit must be greater than zero");
        }

        this.limit = limit;
        notifyAll();
    }

    public synchronized int getQueueSize() {
        return q.size();
    }

}
