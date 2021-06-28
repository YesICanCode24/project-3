public class Smartphone {
        public static String manufacturer;    // company
        public static String model;            // specific model
        public static String ShowCell() {
                return manufacturer + " | " + model;
        }


        /*String operatingSys;	// operating system android, ios, linux...
        int memory;			// memory in GB
        String color;			// primary color
        int camera_lenses;		// number of camera lenses
        double price;			// how much does it cost*/
        public Smartphone(String manufacturer, String model/*, String operatingSys,
                                        int memory, String color, int camera_lenses, double price*/) {
            this.manufacturer = manufacturer;
            this.model = model;
        }
}
