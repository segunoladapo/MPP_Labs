package mum.mpp_lab.standard_exam.practice2;

public abstract class Department {
    private StringQueue queue = new StringQueue();

    public StringQueue getQueue() {
        return queue;
    }

    public void addMessage(String msg) {
        queue.enqueue(msg);
    }

    public String nextMessage() {
        String nextMessage;
        try {
            nextMessage = queue.dequeue();
        } catch (EmptyQueueException ex) {
            nextMessage = "No Message Available";
        }
        return nextMessage;
    }

    public abstract String getName();

}
