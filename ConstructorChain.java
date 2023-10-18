public class ConstructorChain
{
    //default constructor
    ConstructorChain()
    {

        System.out.println("Default constructor called.");
    }
    //parameterized constructor
    ConstructorChain(String str)
    {
//        this will the default contractor
        this();
        System.out.println("Parameterized constructor called");

    }

}