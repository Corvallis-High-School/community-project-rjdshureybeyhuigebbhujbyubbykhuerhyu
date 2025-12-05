public class Main{
    public static void main(String[] args)
        {
        // Construct 2 objects of your class using the constructor with different values
            Microwave m= new Microwave(1000,0.75,100);
            Microwave l= new Microwave(1,0.1,100);
        // call all of the objects methods to test them
            m.table();
            l.table();
    }
}