package pl.serj.creditcard;


import org.junit.Test;
import org.junit.Assert;

class CreditCardPool{
    private final static String number = "1234";
    
    @Test
    public void allowAddAndFindCArd(){
        CreditCardPool pool = new CreditCardPool();
        CreditCard c = new CreditCard();

        //pool.add(c);
        
      //  CreditCard loaded = pool.find(number);
        
       // Assert.assertTrue(loaded.getNumber().isEquals(number));
        
    }
    
}