// Superclass Nigar
class Nigar{
    int school = 4000;    // Variable to store school fees
    int coaching = 3500;  // Variable to store coaching fees
}

// Subclass p6 which extends Nigar
public class p6 extends Nigar {
    int privateFees = 2000;  // Variable to store private fees

    // Constructor for p6
    public p6() {
        super();  // Call the constructor of the superclass Nigar
        this.privateFees = 2000;  // Use 'this' keyword to refer to the instance variable privateFees
    }

    public static void main(String[] args) {
        p6 t = new p6();  // Create an instance of the subclass p6

        // Accessing and printing the variables from both the superclass and subclass
        System.out.println("Nigar's school fees: " + t.school);
        System.out.println("Nigar's coaching fees: " + t.coaching);
        System.out.println("NIgar's private fees: " + t.privateFees);
    }
}