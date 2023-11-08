public interface Worker {
    default void work() {
        System.out.println("Worker is working");
    }
    public void getMoney();
    public void leave();
}
