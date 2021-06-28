public class Phonestore {
   String company;
   String location;
   Smartphone[] availablephones;
 
   Phonestore(String name, String street) {
     company = name;
      location = street;
     Smartphone[3] = phonelist;      
   }
 
   void show() {
       System.out.println(name + "|" + street + "|");
       for (int i = 0; i < phonelist.length; i++) {
           phonelist[i].show();
       }
   }
