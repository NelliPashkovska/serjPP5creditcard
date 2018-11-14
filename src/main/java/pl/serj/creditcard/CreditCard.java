package pl.serj.creditcard;

class CreditCard{
    private double balance; 
    private double cardLimit;
    private String number;
    
    public CreditCard(String number){
        this.number = number;
    }
    
    public CreditCard(){
        
    }
    
    public String getNumber(){
        return number;
    }
    
    private boolean status;
    
    public void assignLimit(double money){
    this.balance=money;
    this.cardLimit=money;
        
    }
    
    public double getLimit(){
        
        return 2000;
    }
    

    public void block(){
        this.status = true;
        
        
    }
    
    public boolean isBlocked(){
        return this.status;
        
    }

    public void withdraw(double money) throws ToMuchMoneyException, CardIsBlockedException {

        if(money > balance) {
            throw new ToMuchMoneyException();
        }
        if(isBlocked()){
            throw new CardIsBlockedException();
        }

        this.balance-=money;
    }
    
    public double getBalance(){
        return this.balance;

    }
    
   
}