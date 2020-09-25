package DAY4;
import java.util.Scanner;
public class Main3 {
	
	 /**
	 * @param args
	 * @param cardnumber
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        System.out.println("Select the Card"+"\n"+"1.Payback Card"+"\n"+"2.Membership Card");
        int choice=scanner.nextInt();
        scanner.nextLine();
        switch(choice)
        {
        case 1:
        	PaybackCard p=new PaybackCard();
            System.out.println("Enter the Card Details:");
            p.setHolderName(scanner.nextLine());
            p.setCardNumber(scanner.nextLine());
            p.setExpiryDate(scanner.nextLine());
            System.out.println("Enter points in card");
            p.setPointsEarned(scanner.nextInt());
            System.out.println("Enter Amount");
            p.setTotalAmount(scanner.nextDouble());
        	System.out.println(p.getHolderName()+"'s Payback Card Details:");
        	System.out.println("Card Number "+p.getCardNumber());
        	System.out.println("Points Earned "+p.getPointsEarned());
        	System.out.println("Total Amount "+p.getTotalAmount());
        	break;
       
        case 2:
        	MembershipCard m=new MembershipCard();
        	System.out.println("Enter the Card Details:");
        	m.setHolderName(scanner.nextLine());
            m.setCardNumber(scanner.nextLine());
            m.setExpiryDate(scanner.nextLine());
            System.out.println("Enter rating");
        	m.setRating(scanner.nextInt());
        	System.out.println(m.getHolderName()+"'s Payback Card Details:");
        	System.out.println("Card Number "+m.getCardNumber());
        	System.out.println("Rating "+m.getRating());
        	break;
        }

	}

}
