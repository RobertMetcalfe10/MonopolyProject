package Monopoly;
import java.util.ArrayList;
import java.util.Random;

public class Card extends Variables{
	protected String text;
	protected int fine;
	
	Card()
	{
		
	}
	
	
	Card(int tax, String caption)
	{
		text=caption;
		fine=tax;
	}
	
	void DisplayCard(int CC)
	{
//		Random rand = new Random();
//		int R=rand.nextInt(10);
//		CardPane.setText(currentCard.get(R).text);
		
		if(CC==7||CC==22||CC==36)//Chance card
		{
			String cardText;
			cardText="\tYou've Pickd Up Card\n";
			cardText+=ChanceCard.get(0).text;
			CardPane.setText(cardText);
		}
		else//community chest card
		{
			String cardText;
			cardText="\tYou've Pickd Up Card\n";
			cardText+=CommunityCard.get(0).text;
			CardPane.setText(cardText);
		}
		
	}
	
	boolean AllowCardPickUp(int rand)
	{
		switch(UserChooser)
		{
		case 1:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 2:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 3:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 4:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 5:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 6:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		
		default:
			return false;
		}
		return false;
		
	}
	
}
