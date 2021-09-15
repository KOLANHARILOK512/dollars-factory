public class DollerFactory extends AbstractFactory{
    @Override
    public Doller getDoller(String typeDoller){    
        if(typeDoller.equalsIgnoreCase("PAPER")){
            return new PaperMoney();         
        }
        else if(typeDoller.equalsIgnoreCase("COIN")){
            return new CoinMoney();
        }        
      return null;
    }
}