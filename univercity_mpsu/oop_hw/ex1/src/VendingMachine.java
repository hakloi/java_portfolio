public interface VendingMachine {
    
    public abstract void getDrink(Integer id, Integer volume, Integer temperature);

    public abstract void addHotDrink(HotDrink hotDrink);

}