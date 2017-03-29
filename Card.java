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
	
	int DisplayCard(int CC)
	{
		Random rand = new Random();
		int R=rand.nextInt(10);
		
		if(CC==7||CC==22||CC==36)//Chance card
		{
			String cardText;
			cardText="\tYou've Pickd Up Card\n";
			cardText+=ChanceCard.get(0).text;
			CardPane.setText(cardText);
			return R;
		}
		else//community chest card
		{
			String cardText;
			cardText="\tYou've Pickd Up Card\n";
			cardText+=CommunityCard.get(0).text;
			CardPane.setText(cardText);
			return R;
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
	
	
	public void cards(int R)
	{
		
			switch(UserChooser)
			{
			case 1:balanceA.withdraw(ChanceCard.get(0).fine);break;
			case 2:balanceA.withdraw(ChanceCard.get(R).fine);break;
			case 3:balanceA.withdraw(ChanceCard.get(R).fine);break;
			case 4:balanceA.withdraw(ChanceCard.get(R).fine);break;
			case 5:balanceA.withdraw(ChanceCard.get(R).fine);break;
			case 6:balanceA.withdraw(ChanceCard.get(R).fine);break;
			}
		
	}
	
}
