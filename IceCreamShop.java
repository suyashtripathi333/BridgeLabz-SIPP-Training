

class IceCream{
	String flavour;
	int netsales;
	
	IceCream(String flavour, int netsales){
		this.flavour = flavour;
		this.netsales = netsales;
	}
	
	
	public IceCream() {
		// TODO Auto-generated constructor stub
	}


	void display() {
        System.out.println("Flavour: " + flavour + ", Net Sales: " + netsales);
	}
}

class IceCreamParlour{
	
	void sortBySales(IceCream[] arr) {
		int n = arr.length;
		
		
		for(int i =0; i<n-1;i++) {
			for(int j =0; j<n-i-1;j++) {
				if(arr[j].netsales<arr[j+1].netsales) {
					IceCream temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
				}
			}
		}
	}
	
	 void displayAll(IceCream[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            arr[i].display();
	        }
	    }
}
public class IceCreamShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IceCream sc = new IceCream();
        IceCream[] flavours = new IceCream[5];
        flavours[0] = new IceCream("Vanilla", 120);
        flavours[1] = new IceCream("Chocolate", 200);
        flavours[2] = new IceCream("Mango", 180);
        flavours[3] = new IceCream("Strawberry", 90);
        flavours[4] = new IceCream("Butterscotch", 150);

        IceCreamParlour parlour = new IceCreamParlour();

        System.out.println("Before Sorting:");
        parlour.displayAll(flavours);

        parlour.sortBySales(flavours);

        System.out.println("\nAfter Sorting by Net Sales (Descending):");
        parlour.displayAll(flavours);

	}

}
