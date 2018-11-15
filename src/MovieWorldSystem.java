public class MovieWorldSystem {
    private Inventory inv;

    public MovieWorldSystem() {
    }

    public void buyTitle(String title, int id) {
        InventoryManager.buy(inv, title, id);
    }

    public void rentTitle(String title, int id) {
        InventoryManager.rent(inv, title, id);
    }

    public double returnAndCheckFees(String title, int id, boolean isDamaged) {
        return InventoryManager.returnAndCheckFees(inv, title, id, isDamaged);
    }
}
