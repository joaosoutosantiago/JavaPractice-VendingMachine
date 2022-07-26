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
	
}
