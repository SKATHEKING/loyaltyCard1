
/**
 * this class is used to store the address on the loyalty card.
 *
 * @author (Mateus Goncalves De Ouro)
 * @version (25/10/2018)
 */
public class LoyaltyCardAddress 
{
    // instance variables - replace the example below with your own
    String postcode;
    String street;
    String town;

    /**
     * Constructor for objects of class LoyaltyCardAddress
     * @param street the street from customer
     * @param postcode the postcode from customer
     * @param town the town from customer
     */
    public LoyaltyCardAddress(String street, String postcode, String town)
    {
        // initialise instance variables
        this.street = street;
        this.postcode = postcode;
        this.town = town;
    }

    /**
     * returns postcode
     *
     * 
     * @return   gives costumer's postcode 
     */
    public String getPostcode()
    {
        
        return postcode;
    }
    /**
     * returns street
     * @return gives costumer's street
     */
    public String getStreet()
    {
        
        return street;
        
    }
    /**
     *  returns town
     *  @return gives costumer's town
     * 
     */
    public String getTown()
    {
        return town;
    }
    /**
     * returns full address in order and well listed and separated
     * 
     * @return street , gives us the street
     * @return town , gives us the town
     * @return postcode, gives us the postcode
     * 
     */
    public String getFullAddress()
    {
        return street +  "\n" + town + "\n" + postcode;
        
    }
    /**
     *  allows us to set a new postcode
     */
    public void setPostcode(String postcode)
    {
        this.postcode = postcode ;
    }
    /**
     *  allows us to set a new street
     */
    public void setStreet(String street)
    {
        this.street = street;
    }
    /**
     *  allows us to set a new town
     */
    public void setTown( String town) 
    {
        this.town = town ;
    }
    /**
     *  allows us to change the full address altogether
     * @param town the town wher customer lives
     * @param street street where customer lives
     * @param postcode postcode where customer lives
     */
    public void setFullAddress( String town, String street, String postcode)
    {
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }
    /**
     *  displays full address listed and organised 
     * 
     */
    public void printAddress()
    {
        System.out.println( getFullAddress());
    }
}
