public class Inventory {
    private RentalObject[] inventory;

    public RentalObject[] getInventory() {
        return inventory;
    }

    public boolean checkAvailability(String title, int id) {
        return true;
    }
}
