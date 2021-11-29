// imports java.util class in order to allow us to use ArrayList class data type
import java.util.ArrayList;
/**
 * Write a description of class LoyaltyCardList here.
 *
 * @author (Mateus Goncalves De Ouro)
 * @version (15/11/2018)
 */
public class LoyaltyCardList
{
    //sets up ArrayList "loyaltyCards"
    private ArrayList <LoyaltyCard> loyaltyCards ;
    // sets up variable x with LoyaltyCard class as data type
    private LoyaltyCard x;
    /**
     * Constructor for objects of class LoyaltyCardList
     * Allows us to create our ArrayList
     */
    public LoyaltyCardList()
    {
        // creates new ArrayList
        loyaltyCards = new <LoyaltyCard> ArrayList() ; 

    }

    /**
     * 
     *
     *Adds a loyaltyCard object of LoyaltyCard data class type to our loyaltyCards ArrayList 
     *  
     *  @param loyaltyCard object of LoyaltyCard class type to be added to our
     *  ArrayList loyaltyCards
     */
    public void addLoyaltyCard(LoyaltyCard loyaltyCard)
    {
        loyaltyCards.add(loyaltyCard); 

    }

    /**
     *  gets all loyaltyCards present in ArrayList and displays them 
     * @param loyaltyCardEntry provides us with position of a loyaltyCard in ArrayList
     */
    public void getAllLoyaltyCards()
    {

       
        for( int loyaltyCardEntry= 0; loyaltyCardEntry <loyaltyCards.size(); loyaltyCardEntry++) 
        {

            getLoyaltyCard(loyaltyCardEntry) ;

        }

    }
    /**
     * displays loyaltyCard's info based on its position given in ArrayList index
     *  @param loyaltyCardEntry position given to loyaltyCard in ArrayList
     *  
     */
    public void getLoyaltyCard(int loyaltyCardEntry)
    {

        LoyaltyCard loyaltyCard = loyaltyCards.get(loyaltyCardEntry);

        if ( loyaltyCardEntry < 0)
        {
            System.out.println(" Error Loyalty card not found or invalid");
        }

        loyaltyCard.printCustomerDetails();
    }

    /**
     *  @return presents us with number of LoyaltyCards available in loyaltyCards ArrayList
     */
    public int getNumberOfLoyaltyCards()
    {

        return loyaltyCards.size();
    }

    /**
     * removes loyaltyCard from loyaltyCards ArrayList based on its cardNumber
     * 
     * @return true if cardNumber input matches cardNumber in the ArrayList, 
     * and hence removes this from ArrayList
     * @param cardNumber number associated with card
     * 
     */
    public boolean removeLoyaltyCard(String cardNumber)
    {

        
        if (cardNumber != x.getCardNumber())
        {
            return false ;
        }

        loyaltyCards.remove(cardNumber);
        return true;

            
         
    }

    /**
     * 
     * @param loyaltyCardEntry position given to card in ArrayList
     * 
     * removes loyaltyCard based on its index position in loyaltyCards ArrayList
     */
    public void removeLoyaltyCard( int loyaltyCardEntry)
    {
        if(loyaltyCardEntry < 0)
        {
            System.out.println("no loyaltyCard was found");   
        }
        loyaltyCards.remove(loyaltyCardEntry);
    }

    /**
     * Uses cardNumber in order to search for LoyaltyCard and then displays 
     * loyaltyCard info
     * @return -1 if cardNumber invalid or index value is equal to or lower than -1
     * this hence providing you with info that the loyaltyCard with that specified 
     * cardNumber is not present in ArrayList
     * @return size of list showing how many objects are in ArrayList
     * specified 
     * 
     * 
     * @param cardNumber number associated with card 
     * 
     * 
     */
    public int search(String cardNumber)
    {


        LoyaltyCard loyaltyCard;
        
       
        for (int loyaltyCardEntry = 0;  loyaltyCardEntry <loyaltyCards.size(); loyaltyCardEntry++)
        {
            if (x.getCardNumber().equals( cardNumber))
            {
                x.printCustomerDetails();
                break;
            } 
            else
            {
                return -1 ;
            }

        }

         
        return loyaltyCards.size();

    }
}
