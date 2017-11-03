

public class Hat
{
    // instance variables - replace the example below with your own
    private String color;
    private double price;
    public Hat(String clr, int prc)
    {
        this.color = clr;
        this.price = prc;
    }
    public String getColor(){
        return this.color;
        
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return "$ " + price + "color" + color;
    }
    public void sale(){
        
    }   
}
