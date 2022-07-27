package vendingMachine;

public class Machine {

	Item[][] Items;

	public Item getItems(int row, int spot) {
		return new Item(this.Items[row][spot]);
	}

	public void setItems(Item item, int row, int spot) {
		this.Items[row][spot] = new Item(item);
	}
	
	public Machine(Item[][] items) {
		this.Items = new Item[items.length][items[0].length];
		
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length; j++) {
				this.Items[i][j] = new Item(items[i][j]);
			}
		}
	}
	
    /**
     * Method name: dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     *
     * Inside the method:
     *  1. Checks if the requested item has a quantity bigger than 0.
     * 		- if so: decreases its quantity by one and returns true.
     * 		- otherwise: returns false.
     */
	
	public boolean dispense(int row, int spot) {
		if (this.Items[row][spot].getQuantity() > 0) {
			this.Items[row][spot].setQuantity(this.Items[row][spot].getQuantity() - 1);
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		
		String menu = "\n\t";
		for (int i = 0; i < Items.length; i++) {
			for (int j = 0; j < Items[i].length; j++) {
				menu += this.Items[i][j].toString() + " ";
			}
			menu += "\n\n\t";
		}
		menu += "************************************************\n";
		return menu;
	}
}
