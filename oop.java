class pen
{
    String type;  // global variable
    String colore;

    public void print()  // method
    {
        System.out.println("write samethink");
        System.out.println(" type="+this.type);
        System.out.println("colore="+this.colore);
    }
    pen(String type, String colore) //  parameterized constructor
    {
        this.type=type;
        this.colore=colore;
    }
    // public void  raj()
    // {
    //     System.out.println(this.colore);
    //     System.out.println(this.type);
    // }

}public class oop
{
    public static void main(String[] args)
    {
        pen t=new pen("gel", "red");
        t.print();
        // t.raj();
        System.out.println("--------------------");
        System.out.println("second pen");
        pen y=new pen("ball", "blue");
        y.print();
    }
}