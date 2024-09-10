public class U1T2 {
    public static void main(String[] args){
        //declare and initialize constant
        final double CM_PER_INCH = 2.54;

        // declare and initialize variables
        String name;
        name = "Cherine";
        int height = 63; // inches
        int age = 16;

        // prints information about person
        System.out.println(name + " is " + height + " inches tall and " + age + " years old.");
        double heightInCM = height * CM_PER_INCH;
        System.out.println("There are " + CM_PER_INCH + " centimeters in one inch.");
        System.out.println(name + " is " + heightInCM + " centimeters tall.");
        /* 
         * Determines whether or not person is average height or not.
         */
        if (height > 60 && height < 68) {
            boolean averageHeight = true;
            System.out.println("Is " + name + " average height?: " + averageHeight);
        } else {
            boolean averageHeight = false;
            System.out.println("Is " + name + " average height?: " + averageHeight);
        }

        // updating a variable
        age = 17;
        System.out.println("A year has passed! " + name + " is now " + age + " years old!");
    }
}
