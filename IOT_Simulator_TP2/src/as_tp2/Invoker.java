package as_tp2;

import as_tp2.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stéphane
 */
public class Invoker{
    
   private List<Command> orderList = new ArrayList<Command>(); 

   public void takeOrder(Command order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Command order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}