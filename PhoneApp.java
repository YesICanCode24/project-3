public class PhoneApp {
 
   public static void main(String[] argv) {
 
       Smartphone a = new Smartphone(342.21, "Apple", "XR", 
"iphone", "black", true);
       Smartphone b = new Smartphone(76.01, "Samsung", "A10e", 
"Galaxy", "black", false);
       Smartphone c = new Smartphone(189.99, "Motorola", "Power", 
"Moto", "black", false);
       
      a.show();		
      b.show();
      c.show();
 
 
       Phonestore store = new Phonestore("Phones, Tablets and Other Electronics", "627 NewCoder Drive, Prosperity, VA 22546");
       store.inventory[0] = a;
       store.inventory[1] = b;
       store.inventory[2] = c;
       store.show();	
