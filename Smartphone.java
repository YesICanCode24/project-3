class Smartphone {
   double price;
   String brand;
   String model;
   String phoneType;
   String color;
  Boolean fiveG;
   
 public Smartphone (String cost, String brandname, String modelnumber, String phone, String modelcolor, Boolean dataspeed) {
       price = cost;
       brand = brandname;
       model = modelnumber;
       phoneType = phone;
       color = modelcolor;
       fiveG = dataspeed;
   }
   
  public void show(){
       System.out.println(cost + "|" +
               brandname + "|" +
               modelnumber + "|" +
               phone + "|" +
               modelcolor + "|" +
               dataspeed);
   }

 

   
 

   }


