public class Main
{
        public static void main(String[] args) {
            //get Tissue factory
            AbstractFactory DollerFactory = FactoryProducer.getFactory();
       
        //get an object of FacialTissue
        Doller d1 = DollerFactory.getDoller("PAPER");
        
        //call print method of FacialTissue
        d1.print();
        
        //get an object of BathTissue 
        Doller d2 = DollerFactory.getDoller("COIN");
        
        //call print method of BathTissue
        d2.print();
        }
}
