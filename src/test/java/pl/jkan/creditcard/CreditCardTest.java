package pl.serj.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest{
    
    
    @Test
    public void allowAssignLimitToCard(){
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        
        Assert.assertTrue(card.getLimit() == 2000);
    }
    
    @Test

    public void canBlockCreditCard(){
        CreditCard card = new CreditCard();
        
        card.block();
        Assert.assertTrue(card.isBlocked());
    }

    public void withdrawDeacreaseAwolableFounds(){
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);

        try {
            card.withdraw(1000);
        } catch (ToMuchMoneyException e) {
            e.printStackTrace();
        } catch (CardIsBlockedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(card.getBalance() == 1000);
        

        
    }
}