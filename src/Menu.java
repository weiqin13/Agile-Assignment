
public class Menu {

        private String foodID;
        private String foodName;
        private double price;
        
        public Menu(String foodID,String foodName,double price){
           this.foodID = foodID;
           this.foodName = foodName;
           this.price = price;
        }
        
        public void setFoodID(String foodID){
            this.foodID = foodID;
        }
        
        public String getFoodID(){
            return foodID;
        } 
        
        public void setFoodName(String foodName){
            this.foodName = foodName;
        }
        
        public String getFoodName(){
            return foodName;
        }
        
        public void setPrice(double price){
            this.price = price;
        }
        
        public double getPrice(){
            return price;
        }
        
        public String toString(){
            return String.format("%5s\t\t%-20s\t %.2f",foodID,foodName,price);
        }
}
