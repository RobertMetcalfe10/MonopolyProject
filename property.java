package Monopoly;

public class Property extends Variables{
	
	protected static int propertyID;
	protected static String propertyName;
	protected static int propertyPrice;
	protected static int propertyRent;
	protected static int housePrice;
	protected static int mortgageValue;
	protected static String propertyColour;
	protected static boolean propertyOwned;
	protected static int propertyHouse;
	
	void propertyDisplay (){
		
		if (propertyOwned == false){
			propertyDets += "You don't own any property";
		}else {
			propertyDets += 	"Property ID - " + propertyID + "\n" +
								"Property Name - " + propertyName + "\n" +
								"Property Colour - " + propertyColour + "\n" +
								"Property Price - " + propertyPrice + "\n";	
		}
	}
	void buyProperty(){
		
	}
	
	void payRent(){
		
	}
	
	void buildHouse(){
		
	}
	
	
}
