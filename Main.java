public class Main{
    public static void main(String[] args)
        {
        // Construct 2 objects of your class using the constructor with different values
            Microwave m= new Microwave(1000,0.75,100);
            Microwave l= new Microwave(1,0.1,100);
        // call all of the objects methods to test them
            m.table("rocks",200,3000);
            l.table("stones",3141,5926);
            System.out.println(m);
            System.out.println(m.getWattage());
            m.setWattage(6565);
            m.setEfficiency(1);
            m.setTemp(5);
            System.out.println(m.getEfficiency());
            System.out.println(m.getTemp());
            System.out.println(m.getWattage());
            l.print();
            System.out.println();
            System.out.println(l);
            
        }
}